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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JavaSourceParser {
    private static final Pattern PACKAGE_PATTERN = Pattern.compile("(?m)^\\s*package\\s+([A-Za-z_][A-Za-z0-9_\\.]*)\\s*;");
    private static final Pattern TYPE_PATTERN = Pattern.compile("(?m)^\\s*(?:public\\s+)?(?:final\\s+|abstract\\s+)?(?:class|interface|enum)\\s+([A-Za-z_][A-Za-z0-9_]*)");
    private static final String ANDROID_PREFIX = "android.";
    private static final String WRAPPER_PREFIX = "com.micklab.dcg.wrapper.";
    private static final String WRAPPER_ANDROID_PREFIX = WRAPPER_PREFIX + "android.";
    private static final String GRAPHICS_IMPORT_PREFIX = "android.graphics.";
    private static final String WRAPPER_GRAPHICS_IMPORT_PREFIX = "com.micklab.dcg.wrapper.android.graphics.";
    private static final String WRAPPER_GRAPHICS_WILDCARD_IMPORT = "import com.micklab.dcg.wrapper.android.graphics.*;";
    private static final String PARSER_FILE_NAME = "Snippet.java";
    private static final String PARSER_ENCODING = "UTF-8";

    private JavaSourceParser() {
    }

    public static PreparedJavaSource prepareForCompilation(String source, String fallbackTitle) {
        String normalized = source == null ? "" : source;
        RewriteResult rewriteResult = rewriteAndroidReferences(normalized);
        ParsedJavaSource parsed = parse(rewriteResult.rewrittenSource, fallbackTitle);
        return new PreparedJavaSource(
                parsed,
                rewriteResult.rewrittenSource,
                rewriteResult.replacementCount,
                rewriteResult.hadAndroidReferences);
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
    }

    public static final class PreparedJavaSource {
        private final ParsedJavaSource parsedSource;
        private final String rewrittenSource;
        private final int rewriteCount;
        private final boolean hadAndroidReferences;

        PreparedJavaSource(
                ParsedJavaSource parsedSource,
                String rewrittenSource,
                int rewriteCount,
                boolean hadAndroidReferences) {
            this.parsedSource = parsedSource;
            this.rewrittenSource = rewrittenSource == null ? "" : rewrittenSource;
            this.rewriteCount = Math.max(0, rewriteCount);
            this.hadAndroidReferences = hadAndroidReferences;
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
    }

    private static RewriteResult rewriteAndroidReferences(String source) {
        if (source == null || source.isEmpty() || !source.contains(ANDROID_PREFIX)) {
            return new RewriteResult(source == null ? "" : source, 0, false);
        }
        CompilationUnitDeclaration compilationUnit = parseEcjCompilationUnit(source);
        if (compilationUnit == null) {
            return new RewriteResult(source, 0, true);
        }

        List<Replacement> replacements = new ArrayList<>();
        collectImportReplacements(source, compilationUnit, replacements);
        collectQualifiedReferenceReplacements(source, compilationUnit, replacements);
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
            List<Replacement> replacements) {
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
            String rewritten = rewriteImportStatement(original);
            if (!original.equals(rewritten)) {
                addReplacement(replacements, start, endExclusive, rewritten);
            }
        }
    }

    private static String rewriteImportStatement(String statement) {
        if (isAndroidGraphicsWildcardImport(statement)) {
            return WRAPPER_GRAPHICS_WILDCARD_IMPORT;
        }
        int androidIndex = statement.indexOf(ANDROID_PREFIX);
        if (androidIndex < 0) {
            return statement;
        }
        return statement.substring(0, androidIndex)
                + WRAPPER_ANDROID_PREFIX
                + statement.substring(androidIndex + ANDROID_PREFIX.length());
    }

    private static boolean isAndroidGraphicsWildcardImport(String statement) {
        if (statement == null) {
            return false;
        }
        String trimmed = statement.trim();
        if (!trimmed.startsWith("import")) {
            return false;
        }
        if (trimmed.startsWith("import static")) {
            return false;
        }
        if (trimmed.endsWith(WRAPPER_GRAPHICS_IMPORT_PREFIX + "*;")) {
            return true;
        }
        return trimmed.endsWith(GRAPHICS_IMPORT_PREFIX + "*;");
    }

    private static void collectQualifiedReferenceReplacements(
            String source,
            CompilationUnitDeclaration compilationUnit,
            List<Replacement> replacements) {
        compilationUnit.traverse(new AndroidReferenceCollector(source, replacements), null, true);
    }

    private static final class AndroidReferenceCollector extends ASTVisitor {
        private final String source;
        private final List<Replacement> replacements;

        private AndroidReferenceCollector(String source, List<Replacement> replacements) {
            this.source = source;
            this.replacements = replacements;
        }

        @Override
        public boolean visit(ImportReference importReference, CompilationUnitScope scope) {
            return true;
        }

        @Override
        public boolean visit(QualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(QualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(ArrayQualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(ArrayQualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(ParameterizedQualifiedTypeReference typeReference, BlockScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(ParameterizedQualifiedTypeReference typeReference, ClassScope scope) {
            replaceQualifiedTokens(typeReference.sourcePositions, typeReference.tokens);
            return true;
        }

        @Override
        public boolean visit(QualifiedNameReference nameReference, BlockScope scope) {
            replaceQualifiedTokens(nameReference.sourcePositions, nameReference.tokens);
            return true;
        }

        @Override
        public boolean visit(QualifiedNameReference nameReference, ClassScope scope) {
            replaceQualifiedTokens(nameReference.sourcePositions, nameReference.tokens);
            return true;
        }

        private void replaceQualifiedTokens(long[] sourcePositions, char[][] tokens) {
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
            String replacement = WRAPPER_PREFIX + joinTokens(tokens);
            addReplacement(replacements, start, endExclusive, replacement);
        }
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
}
