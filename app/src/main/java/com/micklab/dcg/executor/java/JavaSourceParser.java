package com.micklab.dcg.executor.java;

import com.micklab.dcg.model.SupportedLanguage;

import org.eclipse.jdt.internal.compiler.ASTVisitor;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.DefaultErrorHandlingPolicies;
import org.eclipse.jdt.internal.compiler.ast.ArrayQualifiedTypeReference;
import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.jdt.internal.compiler.ast.ImportReference;
import org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference;
import org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference;
import org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.eclipse.jdt.internal.compiler.lookup.BlockScope;
import org.eclipse.jdt.internal.compiler.lookup.ClassScope;
import org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope;
import org.eclipse.jdt.internal.compiler.parser.Parser;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblemFactory;
import org.eclipse.jdt.internal.compiler.problem.ProblemReporter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JavaSourceParser {
    private static final Pattern PACKAGE_PATTERN = Pattern.compile("(?m)^\\s*package\\s+([A-Za-z_][A-Za-z0-9_\\.]*)\\s*;");
    private static final Pattern TYPE_PATTERN = Pattern.compile("(?m)^\\s*(?:public\\s+)?(?:final\\s+|abstract\\s+)?(?:class|interface|enum)\\s+([A-Za-z_][A-Za-z0-9_]*)");
    private static final Pattern ON_CREATE_PATTERN = Pattern.compile("\\bonCreate\\s*\\(");
    private static final Pattern ANDROIDX_IMPORT_PATTERN = Pattern.compile("(?m)^\\s*import\\s+androidx\\.[^;]+;\\s*\\n?");
    private static final String ANDROID_PREFIX = "android.";
    private static final String WRAPPER_PREFIX = "com.micklab.dcg.wrapper.";
    private static final String WRAPPER_ANDROID_PREFIX = WRAPPER_PREFIX + "android.";
    private static final String ANDROIDX_PREFIX = "androidx.";
    private static final String PSEUDO_IMPORT_PREFIX = "com.micklab.dcg.wrapper.pseudo.";
    private static final String PSEUDO_GRAPHICS_IMPORT = "import com.micklab.dcg.wrapper.android.graphics.*;\n";
    private static final String PSEUDO_MAIN_ACTIVITY = "com.micklab.dcg.wrapper.pseudo.PseudoMainActivity";
    private static final String PSEUDO_RESULT = "com.micklab.dcg.wrapper.pseudo.PseudoResult";
    private static final String BUILD_OUTPUT_METHOD = "buildOutput";
    private static final String PSEUDO_OUTPUT_MODEL_JSON_METHOD = "__dcgGetPseudoOutputModelJson";
    private static final String PSEUDO_HELPER_METHOD = "__dcgCreatePseudoResult";
    private static final String PSEUDO_CACHE_FIELD = "__dcgPseudoResultCache";
    private static final String PARSER_FILE_NAME = "Snippet.java";
    private static final String PARSER_ENCODING = "UTF-8";
    private static final Map<String, String> PSEUDO_ANDROID_TYPE_OVERRIDES = buildPseudoAndroidTypeOverrides();
    private static final List<String> PSEUDO_REQUIRED_IMPORTS = buildPseudoRequiredImports();

    private JavaSourceParser() {
    }

    public static PreparedJavaSource prepareForCompilation(String source, String fallbackTitle) {
        String normalized = source == null ? "" : source;
        ParsedJavaSource initialParsed = parse(normalized, fallbackTitle);
        boolean pseudoMainActivity = isPseudoMainActivitySource(normalized, initialParsed.getClassName());

        int pseudoRewriteCount = 0;
        String pseudoRewritten = normalized;
        if (pseudoMainActivity) {
            PseudoRewriteResult pseudoRewrite = rewritePseudoMainActivitySource(normalized, initialParsed.getClassName());
            pseudoRewritten = pseudoRewrite.rewrittenSource;
            pseudoRewriteCount = pseudoRewrite.rewriteCount;
        }

        RewriteResult rewriteResult = rewriteAndroidReferences(
                pseudoRewritten,
                pseudoMainActivity ? PSEUDO_ANDROID_TYPE_OVERRIDES : null);
        String rewrittenSource = rewriteResult.rewrittenSource;
        int fallbackRewriteCount = 0;
        RewriteResult buildFallback = rewriteRemainingBuildReferences(rewrittenSource);
        rewrittenSource = buildFallback.rewrittenSource;
        fallbackRewriteCount += buildFallback.replacementCount;
        if (pseudoMainActivity) {
            RewriteResult pseudoBundleFallback = rewriteRemainingPseudoBundleReferences(rewrittenSource);
            rewrittenSource = pseudoBundleFallback.rewrittenSource;
            pseudoRewriteCount += pseudoBundleFallback.replacementCount;
            ImportInsertionResult pseudoImports = ensureImports(rewrittenSource, PSEUDO_REQUIRED_IMPORTS);
            rewrittenSource = pseudoImports.rewrittenSource;
            pseudoRewriteCount += pseudoImports.addedImportCount;
            String withGraphicsImport = ensureImport(rewrittenSource, PSEUDO_GRAPHICS_IMPORT);
            if (!withGraphicsImport.equals(rewrittenSource)) {
                rewrittenSource = withGraphicsImport;
                pseudoRewriteCount++;
            }
            rewrittenSource = injectPseudoHelpers(rewrittenSource, initialParsed.getClassName());
        }
        ParsedJavaSource parsed = parse(rewrittenSource, fallbackTitle);
        return new PreparedJavaSource(
                parsed,
                rewrittenSource,
                rewriteResult.replacementCount + fallbackRewriteCount + pseudoRewriteCount,
                rewriteResult.hadAndroidReferences || fallbackRewriteCount > 0 || pseudoRewriteCount > 0,
                pseudoMainActivity);
    }

    public static ParsedJavaSource parse(String source, String fallbackTitle) {
        String packageName = detectPackageName(source);
        String className = tryDetectPrimaryTypeName(source);
        if (className == null || className.trim().isEmpty()) {
            throw new IllegalArgumentException("The Java source must declare a class, interface, or enum before it can be compiled.");
        }
        return new ParsedJavaSource(packageName, className, fallbackTitle);
    }

    public static String tryDetectPrimaryTypeName(String source) {
        if (source == null) {
            return null;
        }
        Matcher matcher = TYPE_PATTERN.matcher(source);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean isPseudoMainActivitySource(String source, String className) {
        if (source == null || source.trim().isEmpty()) {
            return false;
        }
        String superclass = detectPrimaryTypeSuperclass(source, className);
        if (isPseudoMainActivitySuperclass(superclass)
                || isAndroidActivitySuperclass(source, superclass)) {
            return true;
        }
        boolean hasOnCreate = ON_CREATE_PATTERN.matcher(source).find();
        if (className != null && "MainActivity".equals(className) && hasOnCreate) {
            return true;
        }
        if (!hasOnCreate) {
            return false;
        }
        return source.contains("setContentView(")
                || source.contains("println(")
                || source.contains("addLabel(")
                || source.contains("addImage(")
                || source.contains("saveBitmap(")
                || source.contains("onImageClick(")
                || source.contains("addTitle(")
                || source.contains("drawBitmap(")
                || source.contains("beginRow(")
                || source.contains("endRow(")
                || source.contains("addButton(")
                || source.contains("addInput(")
                || source.contains("setInputEditable(")
                || source.contains("addSpacer(")
                || source.contains("new ImageView(this)")
                || source.contains("new TextView(this)")
                || source.contains("new Button(this)")
                || source.contains("new EditText(this)")
                || source.contains("new LinearLayout(this)");
    }

    private static String detectPackageName(String source) {
        if (source == null) {
            return "";
        }
        Matcher matcher = PACKAGE_PATTERN.matcher(source);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public static final class ParsedJavaSource {
        private final String packageName;
        private final String className;
        private final String fallbackTitle;

        ParsedJavaSource(String packageName, String className, String fallbackTitle) {
            this.packageName = packageName == null ? "" : packageName;
            this.className = className;
            this.fallbackTitle = fallbackTitle == null ? "Snippet" : fallbackTitle;
        }

        public String getQualifiedClassName() {
            return packageName.isEmpty() ? className : packageName + "." + className;
        }

        public String getDisplayFileName() {
            return className + SupportedLanguage.JAVA.getExtension();
        }

        public String getRelativeSourcePath() {
            String fileName = getDisplayFileName();
            if (packageName.isEmpty()) {
                return fileName;
            }
            return packageName.replace('.', '/') + "/" + fileName;
        }

        public String getFallbackTitle() {
            return fallbackTitle;
        }

        public String getClassName() {
            return className;
        }
    }

    public static final class PreparedJavaSource {
        private final ParsedJavaSource parsedSource;
        private final String rewrittenSource;
        private final int rewriteCount;
        private final boolean hadAndroidReferences;
        private final boolean pseudoMainActivity;

        PreparedJavaSource(
                ParsedJavaSource parsedSource,
                String rewrittenSource,
                int rewriteCount,
                boolean hadAndroidReferences,
                boolean pseudoMainActivity) {
            this.parsedSource = parsedSource;
            this.rewrittenSource = rewrittenSource == null ? "" : rewrittenSource;
            this.rewriteCount = Math.max(0, rewriteCount);
            this.hadAndroidReferences = hadAndroidReferences;
            this.pseudoMainActivity = pseudoMainActivity;
        }

        public ParsedJavaSource getParsedSource() {
            return parsedSource;
        }

        public String getRewrittenSource() {
            return rewrittenSource;
        }

        public int getRewriteCount() {
            return rewriteCount;
        }

        public boolean hadAndroidReferences() {
            return hadAndroidReferences;
        }

        public boolean isPseudoMainActivity() {
            return pseudoMainActivity;
        }
    }

    private static PseudoRewriteResult rewritePseudoMainActivitySource(String source, String className) {
        String rewritten = source == null ? "" : source;
        int rewriteCount = 0;

        Matcher androidxMatcher = ANDROIDX_IMPORT_PATTERN.matcher(rewritten);
        int androidxCount = countMatches(androidxMatcher);
        if (androidxCount > 0) {
            rewritten = ANDROIDX_IMPORT_PATTERN.matcher(rewritten).replaceAll("");
            rewriteCount += androidxCount;
        }

        String declarationRewritten = rewritePrimaryTypeDeclaration(rewritten, className);
        if (!declarationRewritten.equals(rewritten)) {
            rewritten = declarationRewritten;
            rewriteCount++;
        }

        return new PseudoRewriteResult(rewritten, rewriteCount);
    }

    private static String ensureImport(String source, String importStatement) {
        if (source == null) {
            return "";
        }
        if (importStatement == null || importStatement.isEmpty()) {
            return source;
        }
        String trimmedImport = importStatement.trim();
        if (source.contains(trimmedImport)) {
            return source;
        }
        Matcher packageMatcher = PACKAGE_PATTERN.matcher(source);
        if (packageMatcher.find()) {
            int insertPosition = packageMatcher.end();
            return source.substring(0, insertPosition) + "\n" + importStatement + source.substring(insertPosition);
        }
        return importStatement + source;
    }

    private static ImportInsertionResult ensureImports(String source, List<String> importStatements) {
        String rewritten = source == null ? "" : source;
        int addedImportCount = 0;
        if (importStatements == null) {
            return new ImportInsertionResult(rewritten, 0);
        }
        for (String importStatement : importStatements) {
            String withImport = ensureImport(rewritten, importStatement);
            if (!withImport.equals(rewritten)) {
                rewritten = withImport;
                addedImportCount++;
            }
        }
        return new ImportInsertionResult(rewritten, addedImportCount);
    }

    private static String rewritePrimaryTypeDeclaration(String source, String className) {
        if (source == null || className == null || className.trim().isEmpty()) {
            return source == null ? "" : source;
        }
        Pattern declarationPattern = Pattern.compile(
                "(?s)(\\bclass\\s+" + Pattern.quote(className) + "\\b)([^\\{]*)\\{");
        Matcher matcher = declarationPattern.matcher(source);
        if (!matcher.find()) {
            return source;
        }
        String suffix = matcher.group(2);
        String sanitizedSuffix = suffix == null ? "" : suffix;
        sanitizedSuffix = sanitizedSuffix.replaceAll("\\bextends\\s+[A-Za-z_][A-Za-z0-9_\\.]*\\s*", "");
        sanitizedSuffix = sanitizedSuffix.trim();
        StringBuilder replacement = new StringBuilder();
        replacement.append(matcher.group(1))
                .append(" extends ")
                .append(PSEUDO_MAIN_ACTIVITY);
        if (!sanitizedSuffix.isEmpty()) {
            replacement.append(" ").append(sanitizedSuffix);
        }
        replacement.append(" {");
        return source.substring(0, matcher.start()) + replacement + source.substring(matcher.end());
    }

    private static RewriteResult rewriteAndroidReferences(String source, Map<String, String> typeOverrides) {
        if (source == null || source.isEmpty() || !source.contains(ANDROID_PREFIX)) {
            return new RewriteResult(source == null ? "" : source, 0, false);
        }
        CompilationUnitDeclaration compilationUnit = parseEcjCompilationUnit(source);
        if (compilationUnit == null) {
            return new RewriteResult(source, 0, true);
        }

        List<Replacement> replacements = new ArrayList<>();
        collectImportReplacements(source, compilationUnit, replacements, typeOverrides);
        collectQualifiedReferenceReplacements(source, compilationUnit, replacements, typeOverrides);
        if (replacements.isEmpty()) {
            return new RewriteResult(source, 0, true);
        }
        String rewritten = applyReplacements(source, replacements);
        return new RewriteResult(rewritten, replacements.size(), true);
    }

    private static CompilationUnitDeclaration parseEcjCompilationUnit(String source) {
        CompilerOptions compilerOptions = new CompilerOptions();
        ProblemReporter reporter = new ProblemReporter(
                DefaultErrorHandlingPolicies.proceedWithAllProblems(),
                compilerOptions,
                new DefaultProblemFactory());
        Parser parser = new Parser(reporter, true);
        CompilationUnit unit = new CompilationUnit(
                source.toCharArray(),
                PARSER_FILE_NAME,
                PARSER_ENCODING);
        CompilationResult result = new CompilationResult(unit, 0, 1, 50);
        return parser.parse(unit, result);
    }

    private static void collectImportReplacements(
            String source,
            CompilationUnitDeclaration compilationUnit,
            List<Replacement> replacements,
            Map<String, String> typeOverrides) {
        ImportReference[] imports = compilationUnit.imports;
        if (imports == null || imports.length == 0) {
            return;
        }
        for (ImportReference importReference : imports) {
            int start = importReference.declarationSourceStart;
            int endExclusive = importReference.declarationSourceEnd + 1;
            if (!isValidRange(source, start, endExclusive)) {
                continue;
            }
            String original = source.substring(start, endExclusive);
            String rewritten = rewriteImportStatement(original, typeOverrides);
            if (!original.equals(rewritten)) {
                addReplacement(replacements, start, endExclusive, rewritten);
            }
        }
    }

    private static String rewriteImportStatement(String statement, Map<String, String> typeOverrides) {
        if (statement == null) {
            return "";
        }
        if (statement.contains(WRAPPER_ANDROID_PREFIX) || statement.contains(PSEUDO_IMPORT_PREFIX)) {
            return statement;
        }
        String importedReference = extractImportReference(statement);
        if (importedReference != null
                && !importedReference.endsWith(".*")
                && !statement.trim().startsWith("import static ")) {
            String override = overrideTypeName(importedReference, typeOverrides);
            if (override != null) {
                return statement.replace(importedReference, override);
            }
        }
        int androidIndex = statement.indexOf(ANDROID_PREFIX);
        if (androidIndex < 0) {
            return statement;
        }
        return statement.substring(0, androidIndex)
                + WRAPPER_ANDROID_PREFIX
                + statement.substring(androidIndex + ANDROID_PREFIX.length());
    }

    private static void collectQualifiedReferenceReplacements(
            String source,
            CompilationUnitDeclaration compilationUnit,
            List<Replacement> replacements,
            Map<String, String> typeOverrides) {
        compilationUnit.traverse(new AndroidReferenceCollector(source, replacements, typeOverrides), null, true);
    }

    private static final class AndroidReferenceCollector extends ASTVisitor {
        private final String source;
        private final List<Replacement> replacements;
        private final Map<String, String> typeOverrides;

        private AndroidReferenceCollector(
                String source,
                List<Replacement> replacements,
                Map<String, String> typeOverrides) {
            this.source = source;
            this.replacements = replacements;
            this.typeOverrides = typeOverrides;
        }

        @Override
        public boolean visit(ImportReference importReference, CompilationUnitScope scope) {
            return true;
        }

        @Override
        public boolean visit(QualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(QualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(ArrayQualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(ArrayQualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(ParameterizedQualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(ParameterizedQualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens, true);
            return true;
        }

        @Override
        public boolean visit(QualifiedNameReference nameReference, BlockScope scope) {
            replaceQualifiedTokens(nameReference.sourcePositions, nameReference.tokens, false);
            return true;
        }

        @Override
        public boolean visit(QualifiedNameReference nameReference, ClassScope scope) {
            replaceQualifiedTokens(nameReference.sourcePositions, nameReference.tokens, false);
            return true;
        }

        private void replaceQualifiedTokens(long[] sourcePositions, char[][] tokens, boolean allowOverrides) {
            if (sourcePositions == null || tokens == null || sourcePositions.length == 0 || tokens.length == 0) {
                return;
            }
            if (!"android".contentEquals(new String(tokens[0]))) {
                return;
            }
            int start = tokenStart(sourcePositions[0]);
            int endExclusive = tokenEnd(sourcePositions[sourcePositions.length - 1]) + 1;
            if (!isValidRange(source, start, endExclusive)) {
                return;
            }
            String qualifiedName = joinTokens(tokens);
            String replacement = rewriteAndroidTypeName(
                    qualifiedName,
                    allowOverrides ? typeOverrides : null);
            addReplacement(replacements, start, endExclusive, replacement);
        }
    }

    private static String injectPseudoHelpers(String source, String className) {
        int lastBrace = source == null ? -1 : source.lastIndexOf('}');
        if (lastBrace < 0 || className == null || className.trim().isEmpty()) {
            return source == null ? "" : source;
        }
        String helper = buildPseudoHelperMethods(className);
        return source.substring(0, lastBrace) + helper + "\n}\n";
    }

    private static RewriteResult rewriteRemainingPseudoBundleReferences(String source) {
        return rewriteQualifiedTypeOutsideCommentsAndStrings(
                source,
                "android.os.Bundle",
                WRAPPER_ANDROID_PREFIX + "os.Bundle");
    }

    private static RewriteResult rewriteRemainingBuildReferences(String source) {
        return rewriteQualifiedTypeOutsideCommentsAndStrings(
                source,
                "android.os.Build",
                WRAPPER_ANDROID_PREFIX + "os.Build");
    }

    private static String buildPseudoHelperMethods(String className) {
        return "\n\n"
                + "    private static " + PSEUDO_RESULT + " " + PSEUDO_CACHE_FIELD + ";\n\n"
                + "    private static " + PSEUDO_RESULT + " " + PSEUDO_HELPER_METHOD + "() {\n"
                + "        " + className + " __dcgActivity = new " + className + "();\n"
                + "        __dcgActivity.__dcgRunOnCreateLifecycle();\n"
                + "        return new " + PSEUDO_RESULT + "(\n"
                + "                __dcgActivity.__dcgBuildOutputSpec(),\n"
                + "                __dcgActivity.__dcgGetOutputModelJson());\n"
                + "    }\n\n"
                + "    public static Object " + BUILD_OUTPUT_METHOD + "() {\n"
                + "        " + PSEUDO_CACHE_FIELD + " = " + PSEUDO_HELPER_METHOD + "();\n"
                + "        return " + PSEUDO_CACHE_FIELD + ".getSpec();\n"
                + "    }\n\n"
                + "    public static String " + PSEUDO_OUTPUT_MODEL_JSON_METHOD + "() {\n"
                + "        if (" + PSEUDO_CACHE_FIELD + " == null) {\n"
                + "            " + PSEUDO_CACHE_FIELD + " = " + PSEUDO_HELPER_METHOD + "();\n"
                + "        }\n"
                + "        return " + PSEUDO_CACHE_FIELD + ".getOutputModelJson();\n"
                + "    }\n";
    }

    private static int tokenStart(long sourcePosition) {
        return (int) (sourcePosition >>> 32);
    }

    private static int tokenEnd(long sourcePosition) {
        return (int) sourcePosition;
    }

    private static String joinTokens(char[][] tokens) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < tokens.length; index++) {
            if (index > 0) {
                builder.append('.');
            }
            builder.append(tokens[index]);
        }
        return builder.toString();
    }

    private static boolean isValidRange(String source, int start, int endExclusive) {
        return start >= 0
                && endExclusive > start
                && source != null
                && endExclusive <= source.length();
    }

    private static void addReplacement(List<Replacement> replacements, int start, int endExclusive, String replacementText) {
        for (Iterator<Replacement> iterator = replacements.iterator(); iterator.hasNext(); ) {
            Replacement existing = iterator.next();
            if (existing.start == start && existing.endExclusive == endExclusive) {
                return;
            }
            if (!rangesOverlap(start, endExclusive, existing.start, existing.endExclusive)) {
                continue;
            }
            if (start <= existing.start && endExclusive >= existing.endExclusive) {
                iterator.remove();
                continue;
            }
            return;
        }
        replacements.add(new Replacement(start, endExclusive, replacementText));
    }

    private static boolean rangesOverlap(int leftStart, int leftEnd, int rightStart, int rightEnd) {
        return leftStart < rightEnd && rightStart < leftEnd;
    }

    private static String applyReplacements(String source, List<Replacement> replacements) {
        replacements.sort(Comparator.comparingInt((Replacement replacement) -> replacement.start).reversed());
        StringBuilder builder = new StringBuilder(source);
        for (Replacement replacement : replacements) {
            builder.replace(replacement.start, replacement.endExclusive, replacement.replacementText);
        }
        return builder.toString();
    }

    private static int countMatches(Matcher matcher) {
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static int countLiteralOccurrences(String source, String target) {
        if (source == null || target == null || target.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (true) {
            index = source.indexOf(target, index);
            if (index < 0) {
                return count;
            }
            count++;
            index += target.length();
        }
    }

    private static String detectPrimaryTypeSuperclass(String source, String className) {
        if (source == null || className == null || className.trim().isEmpty()) {
            return null;
        }
        Pattern declarationPattern = Pattern.compile(
                "(?s)\\bclass\\s+" + Pattern.quote(className) + "\\b([^\\{]*)\\{");
        Matcher declarationMatcher = declarationPattern.matcher(source);
        if (!declarationMatcher.find()) {
            return null;
        }
        Matcher extendsMatcher = Pattern.compile("\\bextends\\s+([A-Za-z_][A-Za-z0-9_\\.]*)")
                .matcher(declarationMatcher.group(1));
        if (!extendsMatcher.find()) {
            return null;
        }
        return extendsMatcher.group(1);
    }

    private static boolean isPseudoMainActivitySuperclass(String superclass) {
        if (superclass == null || superclass.trim().isEmpty()) {
            return false;
        }
        return "PseudoMainActivity".equals(simpleNameOf(superclass))
                || PSEUDO_MAIN_ACTIVITY.equals(superclass);
    }

    private static boolean isAndroidActivitySuperclass(String source, String superclass) {
        if (superclass == null || superclass.trim().isEmpty()) {
            return false;
        }
        String simpleName = simpleNameOf(superclass);
        if (!simpleName.endsWith("Activity")) {
            return false;
        }
        if (superclass.startsWith(ANDROID_PREFIX) || superclass.startsWith(ANDROIDX_PREFIX)) {
            return true;
        }
        return "Activity".equals(simpleName)
                || hasImportedType(source, simpleName, ANDROID_PREFIX)
                || hasImportedType(source, simpleName, ANDROIDX_PREFIX);
    }

    private static boolean hasImportedType(String source, String simpleName, String packagePrefix) {
        if (source == null || simpleName == null || simpleName.isEmpty() || packagePrefix == null) {
            return false;
        }
        Pattern importPattern = Pattern.compile(
                "(?m)^\\s*import\\s+"
                        + Pattern.quote(packagePrefix)
                        + "[A-Za-z0-9_\\.]*\\."
                        + Pattern.quote(simpleName)
                        + "\\s*;");
        return importPattern.matcher(source).find();
    }

    private static String simpleNameOf(String typeName) {
        if (typeName == null || typeName.isEmpty()) {
            return "";
        }
        int lastDot = typeName.lastIndexOf('.');
        return lastDot < 0 ? typeName : typeName.substring(lastDot + 1);
    }

    private static String extractImportReference(String statement) {
        if (statement == null) {
            return null;
        }
        String trimmed = statement.trim();
        if (!trimmed.startsWith("import ")) {
            return null;
        }
        String body = trimmed.substring("import ".length()).trim();
        if (body.startsWith("static ")) {
            body = body.substring("static ".length()).trim();
        }
        if (body.endsWith(";")) {
            body = body.substring(0, body.length() - 1).trim();
        }
        return body.isEmpty() ? null : body;
    }

    private static String overrideTypeName(String androidTypeName, Map<String, String> typeOverrides) {
        if (androidTypeName == null || typeOverrides == null || typeOverrides.isEmpty()) {
            return null;
        }
        return typeOverrides.get(androidTypeName);
    }

    private static String rewriteAndroidTypeName(String androidTypeName, Map<String, String> typeOverrides) {
        String override = overrideTypeName(androidTypeName, typeOverrides);
        if (override != null) {
            return override;
        }
        if (androidTypeName == null || !androidTypeName.startsWith(ANDROID_PREFIX)) {
            return androidTypeName == null ? "" : androidTypeName;
        }
        return WRAPPER_PREFIX + androidTypeName;
    }

    private static RewriteResult rewriteQualifiedTypeOutsideCommentsAndStrings(
            String source,
            String target,
            String replacement) {
        if (source == null || source.isEmpty()
                || target == null || target.isEmpty()
                || replacement == null || replacement.isEmpty()
                || !source.contains(target)) {
            return new RewriteResult(source == null ? "" : source, 0, false);
        }

        StringBuilder builder = new StringBuilder(source.length() + 32);
        int replacementCount = 0;
        boolean inLineComment = false;
        boolean inBlockComment = false;
        boolean inDoubleQuote = false;
        boolean inSingleQuote = false;
        boolean escaped = false;
        int index = 0;
        while (index < source.length()) {
            char current = source.charAt(index);
            if (inLineComment) {
                builder.append(current);
                index++;
                if (current == '\n') {
                    inLineComment = false;
                }
                continue;
            }
            if (inBlockComment) {
                builder.append(current);
                index++;
                if (current == '*' && index < source.length() && source.charAt(index) == '/') {
                    builder.append(source.charAt(index));
                    index++;
                    inBlockComment = false;
                }
                continue;
            }
            if (inDoubleQuote) {
                builder.append(current);
                index++;
                if (escaped) {
                    escaped = false;
                } else if (current == '\\') {
                    escaped = true;
                } else if (current == '"') {
                    inDoubleQuote = false;
                }
                continue;
            }
            if (inSingleQuote) {
                builder.append(current);
                index++;
                if (escaped) {
                    escaped = false;
                } else if (current == '\\') {
                    escaped = true;
                } else if (current == '\'') {
                    inSingleQuote = false;
                }
                continue;
            }
            if (current == '/' && index + 1 < source.length()) {
                char next = source.charAt(index + 1);
                if (next == '/') {
                    builder.append(current).append(next);
                    index += 2;
                    inLineComment = true;
                    continue;
                }
                if (next == '*') {
                    builder.append(current).append(next);
                    index += 2;
                    inBlockComment = true;
                    continue;
                }
            }
            if (current == '"') {
                builder.append(current);
                index++;
                inDoubleQuote = true;
                escaped = false;
                continue;
            }
            if (current == '\'') {
                builder.append(current);
                index++;
                inSingleQuote = true;
                escaped = false;
                continue;
            }
            if (matchesExactQualifiedType(source, index, target)) {
                builder.append(replacement);
                index += target.length();
                replacementCount++;
                continue;
            }
            builder.append(current);
            index++;
        }
        if (replacementCount == 0) {
            return new RewriteResult(source, 0, false);
        }
        return new RewriteResult(builder.toString(), replacementCount, true);
    }

    private static boolean matchesExactQualifiedType(String source, int index, String target) {
        if (source == null || target == null || index < 0 || index + target.length() > source.length()) {
            return false;
        }
        if (!source.regionMatches(index, target, 0, target.length())) {
            return false;
        }
        if (index > 0) {
            char previous = source.charAt(index - 1);
            if (previous == '.' || Character.isJavaIdentifierPart(previous)) {
                return false;
            }
            if (index >= WRAPPER_PREFIX.length()
                    && source.regionMatches(index - WRAPPER_PREFIX.length(), WRAPPER_PREFIX, 0, WRAPPER_PREFIX.length())) {
                return false;
            }
        }
        int end = index + target.length();
        return end >= source.length() || !Character.isJavaIdentifierPart(source.charAt(end));
    }

    private static Map<String, String> buildPseudoAndroidTypeOverrides() {
        LinkedHashMap<String, String> replacements = new LinkedHashMap<>();
        replacements.put("android.widget.TextView", "com.micklab.dcg.wrapper.pseudo.TextView");
        replacements.put("android.widget.Button", "com.micklab.dcg.wrapper.pseudo.Button");
        replacements.put("android.widget.EditText", "com.micklab.dcg.wrapper.pseudo.EditText");
        replacements.put("android.widget.ImageView", "com.micklab.dcg.wrapper.pseudo.ImageView");
        replacements.put("android.widget.LinearLayout", "com.micklab.dcg.wrapper.pseudo.LinearLayout");
        replacements.put("android.view.View", "com.micklab.dcg.wrapper.pseudo.View");
        return replacements;
    }

    private static List<String> buildPseudoRequiredImports() {
        List<String> imports = new ArrayList<>();
        imports.add("import " + PSEUDO_MAIN_ACTIVITY + ";\n");
        imports.add("import " + WRAPPER_ANDROID_PREFIX + "os.Bundle;\n");
        for (String overrideType : PSEUDO_ANDROID_TYPE_OVERRIDES.values()) {
            imports.add("import " + overrideType + ";\n");
        }
        return imports;
    }

    private static final class RewriteResult {
        private final String rewrittenSource;
        private final int replacementCount;
        private final boolean hadAndroidReferences;

        private RewriteResult(String rewrittenSource, int replacementCount, boolean hadAndroidReferences) {
            this.rewrittenSource = rewrittenSource == null ? "" : rewrittenSource;
            this.replacementCount = replacementCount;
            this.hadAndroidReferences = hadAndroidReferences;
        }
    }

    private static final class Replacement {
        private final int start;
        private final int endExclusive;
        private final String replacementText;

        private Replacement(int start, int endExclusive, String replacementText) {
            this.start = start;
            this.endExclusive = endExclusive;
            this.replacementText = replacementText;
        }
    }

    private static final class ImportInsertionResult {
        private final String rewrittenSource;
        private final int addedImportCount;

        private ImportInsertionResult(String rewrittenSource, int addedImportCount) {
            this.rewrittenSource = rewrittenSource == null ? "" : rewrittenSource;
            this.addedImportCount = Math.max(0, addedImportCount);
        }
    }

    private static final class PseudoRewriteResult {
        private final String rewrittenSource;
        private final int rewriteCount;

        private PseudoRewriteResult(String rewrittenSource, int rewriteCount) {
            this.rewrittenSource = rewrittenSource == null ? "" : rewrittenSource;
            this.rewriteCount = Math.max(0, rewriteCount);
        }
    }
}
