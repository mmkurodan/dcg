package com.micklab.dcg.build.wrapper;

import org.gradle.api.logging.Logger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

final class AndroidWrapperGenerator {
    private static final String JAVA_EXTENSION = ".java";
    private static final String POLICY_FILE = "forbidden-members.txt";
    private static final String SOURCE_HEADER = "// AUTO-GENERATED. DO NOT EDIT.\n";
    private static final List<String> SAFE_PACKAGE_PREFIXES = Arrays.asList(
            "android.");

    private final File androidJar;
    private final File outputDirectory;
    private final String wrapperRootPackage;
    private final String securityPolicyPrefix;
    private final Logger logger;

    private final Map<String, String> wrapperTypeByAndroidType = new LinkedHashMap<>();
    private final Set<String> forbiddenMembers = new TreeSet<>();

    AndroidWrapperGenerator(
            File androidJar,
            File outputDirectory,
            String wrapperRootPackage,
            String securityPolicyPrefix,
            Logger logger) {
        this.androidJar = Objects.requireNonNull(androidJar, "androidJar");
        this.outputDirectory = Objects.requireNonNull(outputDirectory, "outputDirectory");
        this.wrapperRootPackage = Objects.requireNonNull(wrapperRootPackage, "wrapperRootPackage");
        this.securityPolicyPrefix = Objects.requireNonNull(securityPolicyPrefix, "securityPolicyPrefix");
        this.logger = logger;
    }

    void generate() {
        if (!androidJar.isFile()) {
            throw new IllegalStateException("android.jar not found: " + androidJar.getAbsolutePath());
        }
        try {
            recreateDirectory(outputDirectory.toPath());
            List<String> topLevelClassNames = discoverTopLevelSafeClasses();
            URL[] classpath = new URL[]{androidJar.toURI().toURL()};
            try (URLClassLoader classLoader = new URLClassLoader(classpath, getClass().getClassLoader())) {
                List<Class<?>> topLevelClasses = loadTopLevelClasses(topLevelClassNames, classLoader);
                buildWrapperTypeIndex(topLevelClasses);
                for (String className : topLevelClassNames) {
                    wrapperTypeByAndroidType.putIfAbsent(className, toWrapperTypeName(className));
                }
                generateWrapperSources(topLevelClasses);
                generateOpaqueWrapperSources(topLevelClassNames, topLevelClasses);
            }
            writeForbiddenPolicy();
            logger.lifecycle("Generated {} wrapper types into {}", wrapperTypeByAndroidType.size(), outputDirectory.getAbsolutePath());
        } catch (IOException exception) {
            throw new IllegalStateException("Failed to generate Android wrappers", exception);
        }
    }

    private List<String> discoverTopLevelSafeClasses() throws IOException {
        List<String> classNames = new ArrayList<>();
        try (JarFile jarFile = new JarFile(androidJar)) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.isDirectory()) {
                    continue;
                }
                String name = entry.getName();
                if (!name.endsWith(".class") || name.contains("module-info")) {
                    continue;
                }
                String className = name.substring(0, name.length() - ".class".length()).replace('/', '.');
                if (!isSafeClassPrefix(className)) {
                    continue;
                }
                if (className.contains("$")) {
                    continue;
                }
                classNames.add(className);
            }
        }
        Collections.sort(classNames);
        return classNames;
    }

    private boolean isSafeClassPrefix(String className) {
        for (String prefix : SAFE_PACKAGE_PREFIXES) {
            if (className.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    private List<Class<?>> loadTopLevelClasses(List<String> classNames, ClassLoader classLoader) {
        List<Class<?>> classes = new ArrayList<>();
        for (String className : classNames) {
            try {
                Class<?> clazz = Class.forName(className, false, classLoader);
                if (!Modifier.isPublic(clazz.getModifiers())) {
                    continue;
                }
                if (clazz.isPrimitive() || clazz.isArray()) {
                    continue;
                }
                classes.add(clazz);
            } catch (ClassNotFoundException | LinkageError ignored) {
                // Some classes in android.jar require optional internals.
            }
        }
        classes.sort(Comparator.comparing(Class::getName));
        return classes;
    }

    private void buildWrapperTypeIndex(List<Class<?>> topLevelClasses) {
        for (Class<?> topLevelClass : topLevelClasses) {
            indexType(topLevelClass);
        }
    }

    private void indexType(Class<?> type) {
        if (type == null || !Modifier.isPublic(type.getModifiers())) {
            return;
        }
        wrapperTypeByAndroidType.put(type.getName(), toWrapperTypeName(type.getName()));
        Class<?>[] nestedTypes = type.getDeclaredClasses();
        Arrays.sort(nestedTypes, Comparator.comparing(Class::getName));
        for (Class<?> nestedType : nestedTypes) {
            if (!isSupportedNestedType(nestedType)) {
                continue;
            }
            indexType(nestedType);
        }
    }

    private boolean isSupportedNestedType(Class<?> nestedType) {
        if (nestedType == null || !Modifier.isPublic(nestedType.getModifiers())) {
            return false;
        }
        int modifiers = nestedType.getModifiers();
        return Modifier.isStatic(modifiers) || nestedType.isInterface() || nestedType.isEnum();
    }

    private void generateWrapperSources(List<Class<?>> topLevelClasses) throws IOException {
        for (Class<?> clazz : topLevelClasses) {
            WrapperSourceBuilder sourceBuilder = new WrapperSourceBuilder(
                    clazz,
                    wrapperRootPackage,
                    wrapperTypeByAndroidType,
                    forbiddenMembers,
                    securityPolicyPrefix);
            String source = sourceBuilder.build();
            String wrapperPackageName = wrapperPackageOf(clazz.getName());
            Path packagePath = packagePathWithinOutput(wrapperPackageName);
            Path sourceFile = outputDirectory.toPath()
                    .resolve(packagePath)
                    .resolve(simpleTopLevelName(clazz.getName()) + JAVA_EXTENSION);
            ensureDirectory(sourceFile.getParent());
            Files.write(sourceFile, source.getBytes(StandardCharsets.UTF_8));
        }
    }

    private void generateOpaqueWrapperSources(List<String> topLevelClassNames, List<Class<?>> generatedClasses) throws IOException {
        Set<String> generatedNames = new LinkedHashSet<>();
        for (Class<?> generatedClass : generatedClasses) {
            generatedNames.add(generatedClass.getName());
        }
        for (String className : topLevelClassNames) {
            if (generatedNames.contains(className)) {
                continue;
            }
            String source = buildOpaqueWrapperSource(className);
            String wrapperPackageName = wrapperPackageOf(className);
            Path packagePath = packagePathWithinOutput(wrapperPackageName);
            Path sourceFile = outputDirectory.toPath()
                    .resolve(packagePath)
                    .resolve(simpleTopLevelName(className) + JAVA_EXTENSION);
            ensureDirectory(sourceFile.getParent());
            Files.write(sourceFile, source.getBytes(StandardCharsets.UTF_8));
        }
    }

    private String buildOpaqueWrapperSource(String androidTypeName) {
        String wrapperPackageName = wrapperPackageOf(androidTypeName);
        String wrapperSimpleName = simpleTopLevelName(androidTypeName);
        String wrapperTypeName = toWrapperTypeName(androidTypeName);
        return SOURCE_HEADER
                + "package " + wrapperPackageName + ";\n\n"
                + "public final class " + wrapperSimpleName + " {\n"
                + "    private static final class __DcgwBridgeToken {\n"
                + "    }\n\n"
                + "    private final java.lang.Object real;\n\n"
                + "    private " + wrapperSimpleName + "(java.lang.Object real, __DcgwBridgeToken token) {\n"
                + "        this.real = real;\n"
                + "    }\n\n"
                + "    public static " + wrapperTypeName + " wrap(java.lang.Object real) {\n"
                + "        return real == null ? null : new " + wrapperTypeName + "(real, (__DcgwBridgeToken) null);\n"
                + "    }\n\n"
                + "    public java.lang.Object getReal() {\n"
                + "        return real;\n"
                + "    }\n\n"
                + "    public java.lang.Object unwrap() {\n"
                + "        return getReal();\n"
                + "    }\n"
                + "}\n";
    }

    private void writeForbiddenPolicy() throws IOException {
        Path policyFile = outputDirectory.toPath().resolve(POLICY_FILE);
        ensureDirectory(policyFile.getParent());
        Files.write(policyFile, forbiddenMembers, StandardCharsets.UTF_8);
    }

    private static String toPackagePath(String packageName) {
        return packageName.replace('.', '/');
    }

    private Path packagePathWithinOutput(String wrapperPackageName) {
        if (wrapperPackageName == null || wrapperPackageName.trim().isEmpty()) {
            return Paths.get("");
        }
        if (wrapperPackageName.equals(wrapperRootPackage)) {
            return Paths.get("");
        }
        String prefix = wrapperRootPackage + ".";
        if (wrapperPackageName.startsWith(prefix)) {
            String suffix = wrapperPackageName.substring(prefix.length());
            return Paths.get(toPackagePath(suffix));
        }
        return Paths.get(toPackagePath(wrapperPackageName));
    }

    private static String simpleTopLevelName(String androidTypeName) {
        int lastDot = androidTypeName.lastIndexOf('.');
        return lastDot < 0 ? androidTypeName : androidTypeName.substring(lastDot + 1);
    }

    private String wrapperPackageOf(String androidTypeName) {
        int dollar = androidTypeName.indexOf('$');
        String topLevelName = dollar >= 0 ? androidTypeName.substring(0, dollar) : androidTypeName;
        int lastDot = topLevelName.lastIndexOf('.');
        String packageName = lastDot < 0 ? "android" : topLevelName.substring(0, lastDot);
        String suffix = packageName.substring("android".length());
        return wrapperRootPackage + suffix;
    }

    private String toWrapperTypeName(String androidTypeName) {
        String wrapperPackage = wrapperPackageOf(androidTypeName);
        int dollar = androidTypeName.indexOf('$');
        String topLevelAndNested = dollar >= 0
                ? androidTypeName.substring(androidTypeName.lastIndexOf('.', dollar) + 1)
                : simpleTopLevelName(androidTypeName);
        return wrapperPackage + "." + topLevelAndNested.replace('$', '.');
    }

    private static void recreateDirectory(Path directory) throws IOException {
        if (Files.exists(directory)) {
            try (java.util.stream.Stream<Path> stream = Files.walk(directory)) {
                stream.sorted(Comparator.reverseOrder())
                        .filter(path -> !path.equals(directory))
                        .forEach(path -> {
                            try {
                                Files.deleteIfExists(path);
                            } catch (IOException exception) {
                                throw new RuntimeException(exception);
                            }
                        });
            } catch (RuntimeException runtimeException) {
                if (runtimeException.getCause() instanceof IOException) {
                    throw (IOException) runtimeException.getCause();
                }
                throw runtimeException;
            }
        }
        ensureDirectory(directory);
    }

    private static void ensureDirectory(Path directory) throws IOException {
        if (directory == null) {
            return;
        }
        if (Files.isDirectory(directory)) {
            return;
        }
        Files.createDirectories(directory);
    }

    private static final class WrapperSourceBuilder {
        private final Class<?> topLevelClass;
        private final String wrapperRootPackage;
        private final Map<String, String> wrapperTypeByAndroidType;
        private final Set<String> forbiddenMembers;
        private final String securityPolicyPrefix;

        private final StringBuilder source = new StringBuilder();

        private WrapperSourceBuilder(
                Class<?> topLevelClass,
                String wrapperRootPackage,
                Map<String, String> wrapperTypeByAndroidType,
                Set<String> forbiddenMembers,
                String securityPolicyPrefix) {
            this.topLevelClass = topLevelClass;
            this.wrapperRootPackage = wrapperRootPackage;
            this.wrapperTypeByAndroidType = wrapperTypeByAndroidType;
            this.forbiddenMembers = forbiddenMembers;
            this.securityPolicyPrefix = securityPolicyPrefix;
        }

        private String build() {
            source.append(SOURCE_HEADER);
            source.append("package ").append(wrapperPackageName(topLevelClass)).append(";\n\n");
            appendClass(topLevelClass, 0, false);
            return source.toString();
        }

        private void appendClass(Class<?> clazz, int indentLevel, boolean nested) {
            String indent = indent(indentLevel);
            source.append(indent)
                    .append(nested ? "public static final class " : "public final class ")
                    .append(simpleName(clazz))
                    .append(" {\n");

            String innerIndent = indent(indentLevel + 1);
            source.append(innerIndent)
                    .append("private static final class __DcgwBridgeToken {\n")
                    .append(innerIndent)
                    .append("}\n\n");

            source.append(innerIndent)
                    .append("private final ")
                    .append("java.lang.Object")
                    .append(" real;\n\n");

            source.append(innerIndent)
                    .append("private ")
                    .append(simpleName(clazz))
                    .append('(')
                    .append("java.lang.Object")
                    .append(" real, __DcgwBridgeToken token) {\n")
                    .append(indent(indentLevel + 2))
                    .append("this.real = real;\n")
                    .append(innerIndent)
                    .append("}\n\n");

            source.append(innerIndent)
                    .append("public static ")
                    .append(mappedTypeName(clazz))
                    .append(" wrap(")
                    .append(readableTypeName(clazz))
                    .append(" real) {\n")
                    .append(indent(indentLevel + 2))
                    .append("return real == null ? null : new ")
                    .append(mappedTypeName(clazz))
                    .append("(real, (__DcgwBridgeToken) null);\n")
                    .append(innerIndent)
                    .append("}\n\n");

            source.append(innerIndent)
                    .append("public ")
                    .append(readableTypeName(clazz))
                    .append(" getReal() {\n")
                    .append(indent(indentLevel + 2))
                    .append("return (")
                    .append(readableTypeName(clazz))
                    .append(") real;\n")
                    .append(innerIndent)
                    .append("}\n\n");

            source.append(innerIndent)
                    .append("public ")
                    .append(readableTypeName(clazz))
                    .append(" unwrap() {\n")
                    .append(indent(indentLevel + 2))
                    .append("return getReal();\n")
                    .append(innerIndent)
                    .append("}\n\n");

            appendConstructors(clazz, indentLevel);
            appendMethods(clazz, indentLevel);
            appendFields(clazz, indentLevel);
            appendNestedClasses(clazz, indentLevel);

            source.append(indent).append("}\n");
        }

        private void appendConstructors(Class<?> clazz, int indentLevel) {
            if (clazz.isInterface() || clazz.isEnum() || Modifier.isAbstract(clazz.getModifiers())) {
                return;
            }
            Constructor<?>[] constructors = clazz.getConstructors();
            Arrays.sort(constructors, Comparator.comparingInt(Constructor::getParameterCount));
            Set<String> emitted = new LinkedHashSet<>();
            boolean delegationAllowed = isDelegationAllowed(clazz);
            for (Constructor<?> constructor : constructors) {
                if (!Modifier.isPublic(constructor.getModifiers())) {
                    continue;
                }
                String signature = constructorSignature(constructor);
                if (!emitted.add(signature)) {
                    continue;
                }
                if (!delegationAllowed || isForbidden(constructor)) {
                    forbiddenMembers.add(securityPolicyPrefix + describe(constructor));
                    appendForbiddenConstructor(constructor, indentLevel);
                    continue;
                }
                appendConstructor(constructor, indentLevel);
            }
        }

        private void appendConstructor(Constructor<?> constructor, int indentLevel) {
            String indent = indent(indentLevel + 1);
            Class<?> owner = constructor.getDeclaringClass();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            source.append(indent)
                    .append("public ")
                    .append(simpleName(owner))
                    .append('(')
                    .append(parameterList(parameterTypes, constructor.isVarArgs()))
                    .append(')');
            appendThrows(constructor.getExceptionTypes());
            source.append(" {")
                    .append('\n')
                    .append(indent(indentLevel + 2))
                    .append("this(new ")
                    .append(readableTypeName(owner))
                    .append('(')
                    .append(argumentUnwrapList(parameterTypes))
                    .append("), (__DcgwBridgeToken) null);\n")
                    .append(indent)
                    .append("}\n\n");
        }

        private void appendForbiddenConstructor(Constructor<?> constructor, int indentLevel) {
            String indent = indent(indentLevel + 1);
            Class<?> owner = constructor.getDeclaringClass();
            source.append(indent)
                    .append("public ")
                    .append(simpleName(owner))
                    .append('(')
                    .append(parameterList(constructor.getParameterTypes(), constructor.isVarArgs()))
                    .append(')');
            appendThrows(constructor.getExceptionTypes());
            source.append(" {\n")
                    .append(indent(indentLevel + 2))
                    .append("throw new UnsupportedOperationException(\"Blocked by wrapper security policy: ")
                    .append(escape(describe(constructor)))
                    .append("\");\n")
                    .append(indent)
                    .append("}\n\n");
        }

        private void appendMethods(Class<?> clazz, int indentLevel) {
            Method[] methods = clazz.getDeclaredMethods();
            Arrays.sort(methods, Comparator
                    .comparing(Method::getName)
                    .thenComparingInt(Method::getParameterCount)
                    .thenComparing(method -> readableTypeName(method.getReturnType())));
            Set<String> emitted = new LinkedHashSet<>();
            boolean delegationAllowed = isDelegationAllowed(clazz);
            for (Method method : methods) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    continue;
                }
                if (method.isSynthetic() || method.isBridge()) {
                    continue;
                }
                if (method.getTypeParameters() != null && method.getTypeParameters().length > 0) {
                    continue;
                }
                if (!hasAccessibleSignature(method.getReturnType(), method.getParameterTypes(), method.getExceptionTypes())) {
                    continue;
                }
                String signature = methodSignature(method);
                if (!emitted.add(signature)) {
                    continue;
                }
                if (!delegationAllowed || isForbidden(method)) {
                    forbiddenMembers.add(securityPolicyPrefix + describe(method));
                    appendForbiddenMethod(method, indentLevel);
                    continue;
                }
                appendMethod(method, indentLevel);
            }
        }

        private void appendMethod(Method method, int indentLevel) {
            String indent = indent(indentLevel + 1);
            Class<?>[] parameterTypes = method.getParameterTypes();
            source.append(indent)
                    .append("public ")
                    .append(Modifier.isStatic(method.getModifiers()) ? "static " : "")
                    .append(mappedTypeName(method.getReturnType()))
                    .append(' ')
                    .append(method.getName())
                    .append('(')
                    .append(parameterList(parameterTypes, method.isVarArgs()))
                    .append(')');
            appendThrows(method.getExceptionTypes());
            source.append(" {\n");

            String target = Modifier.isStatic(method.getModifiers())
                    ? readableTypeName(method.getDeclaringClass())
                    : "((" + readableTypeName(method.getDeclaringClass()) + ") real)";
            String invocation = target + "." + method.getName() + "(" + argumentUnwrapList(parameterTypes) + ")";

            if (method.getReturnType() == Void.TYPE) {
                source.append(indent(indentLevel + 2))
                        .append(invocation)
                        .append(";\n");
            } else if (isWrappableType(method.getReturnType())) {
                source.append(indent(indentLevel + 2))
                        .append("return ")
                        .append(mappedTypeName(method.getReturnType()))
                        .append(".wrap(")
                        .append(invocation)
                        .append(");\n");
            } else {
                source.append(indent(indentLevel + 2))
                        .append("return ")
                        .append(invocation)
                        .append(";\n");
            }
            source.append(indent).append("}\n\n");
        }

        private void appendForbiddenMethod(Method method, int indentLevel) {
            String indent = indent(indentLevel + 1);
            source.append(indent)
                    .append("public ")
                    .append(Modifier.isStatic(method.getModifiers()) ? "static " : "")
                    .append(mappedTypeName(method.getReturnType()))
                    .append(' ')
                    .append(method.getName())
                    .append('(')
                    .append(parameterList(method.getParameterTypes(), method.isVarArgs()))
                    .append(')');
            appendThrows(method.getExceptionTypes());
            source.append(" {\n")
                    .append(indent(indentLevel + 2))
                    .append("throw new UnsupportedOperationException(\"Blocked by wrapper security policy: ")
                    .append(escape(describe(method)))
                    .append("\");\n")
                    .append(indent)
                    .append("}\n\n");
        }

        private void appendFields(Class<?> clazz, int indentLevel) {
            Field[] fields = clazz.getDeclaredFields();
            Arrays.sort(fields, Comparator.comparing(Field::getName));
            String indent = indent(indentLevel + 1);
            Set<String> emitted = new LinkedHashSet<>();
            for (Field field : fields) {
                if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                if (field.isSynthetic()) {
                    continue;
                }
                if (!emitted.add(field.getName())) {
                    continue;
                }
                if (!isAccessibleType(field.getType())) {
                    continue;
                }
                if (isForbidden(field)) {
                    forbiddenMembers.add(securityPolicyPrefix + describe(field));
                    continue;
                }
                source.append(indent)
                        .append("public static final ")
                        .append(mappedTypeName(field.getType()))
                        .append(' ')
                        .append(field.getName())
                        .append(" = ");
                if (isWrappableType(field.getType())) {
                    source.append(mappedTypeName(field.getType()))
                            .append(".wrap(")
                            .append(readableTypeName(field.getDeclaringClass()))
                            .append('.')
                            .append(field.getName())
                            .append(')');
                } else {
                    source.append(readableTypeName(field.getDeclaringClass()))
                            .append('.')
                            .append(field.getName());
                }
                source.append(";\n");
            }
            if (fields.length > 0) {
                source.append('\n');
            }
        }

        private void appendNestedClasses(Class<?> clazz, int indentLevel) {
            Class<?>[] nested = clazz.getDeclaredClasses();
            Arrays.sort(nested, Comparator.comparing(Class::getName));
            for (Class<?> nestedClass : nested) {
                if (!Modifier.isPublic(nestedClass.getModifiers())) {
                    continue;
                }
                int modifiers = nestedClass.getModifiers();
                if (!(Modifier.isStatic(modifiers) || nestedClass.isInterface() || nestedClass.isEnum())) {
                    continue;
                }
                appendClass(nestedClass, indentLevel + 1, true);
            }
        }

        private boolean isWrappableType(Class<?> type) {
            if (type == null || type.isPrimitive() || type.isArray()) {
                return false;
            }
            return wrapperTypeByAndroidType.containsKey(type.getName());
        }

        private String mappedTypeName(Class<?> type) {
            if (type == null) {
                return "void";
            }
            if (type.isPrimitive()) {
                return type.getName();
            }
            if (type.isArray()) {
                return readableTypeName(type);
            }
            if (Enum.class.isAssignableFrom(type)) {
                String wrapperName = wrapperTypeByAndroidType.get(type.getName());
                return wrapperName == null ? readableTypeName(type) : wrapperName;
            }
            String wrapperName = wrapperTypeByAndroidType.get(type.getName());
            if (wrapperName != null) {
                return wrapperName;
            }
            return readableTypeName(type);
        }

        private String parameterList(Class<?>[] parameterTypes, boolean varArgs) {
            List<String> parameters = new ArrayList<>();
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> type = parameterTypes[i];
                String typeName = mappedTypeName(type);
                if (varArgs && i == parameterTypes.length - 1 && type.isArray()) {
                    typeName = readableTypeName(type.getComponentType()) + "...";
                }
                parameters.add(typeName + " arg" + i);
            }
            return String.join(", ", parameters);
        }

        private String argumentUnwrapList(Class<?>[] parameterTypes) {
            List<String> args = new ArrayList<>();
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> type = parameterTypes[i];
                if (isWrappableType(type)) {
                    args.add("arg" + i + " == null ? null : arg" + i + ".getReal()");
                } else {
                    args.add("arg" + i);
                }
            }
            return String.join(", ", args);
        }

        private boolean hasAccessibleSignature(Class<?> returnType, Class<?>[] parameterTypes, Class<?>[] exceptionTypes) {
            if (!isAccessibleType(returnType)) {
                return false;
            }
            if (parameterTypes != null) {
                for (Class<?> parameterType : parameterTypes) {
                    if (!isAccessibleType(parameterType)) {
                        return false;
                    }
                }
            }
            if (exceptionTypes != null) {
                for (Class<?> exceptionType : exceptionTypes) {
                    if (!isAccessibleType(exceptionType)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean isAccessibleType(Class<?> type) {
            if (type == null || type.isPrimitive()) {
                return true;
            }
            if (type.isArray()) {
                return isAccessibleType(type.getComponentType());
            }
            if (type.getTypeParameters() != null && type.getTypeParameters().length > 0) {
                return false;
            }
            if (type.getPackage() == null) {
                return true;
            }
            int modifiers = type.getModifiers();
            return Modifier.isPublic(modifiers);
        }

        private void appendThrows(Class<?>[] exceptionTypes) {
            if (exceptionTypes == null || exceptionTypes.length == 0) {
                return;
            }
            source.append(" throws ");
            for (int i = 0; i < exceptionTypes.length; i++) {
                if (i > 0) {
                    source.append(", ");
                }
                source.append(readableTypeName(exceptionTypes[i]));
            }
        }

        private boolean isForbidden(Member member) {
            String owner = member.getDeclaringClass().getName();
            String name = member.getName().toLowerCase();
            if (owner.startsWith("java.")
                    || owner.startsWith("javax.")
                    || owner.startsWith("kotlin.")
                    || owner.startsWith("sun.")) {
                return true;
            }
            if (owner.startsWith("android.os.")
                    || owner.startsWith("android.system.")
                    || owner.startsWith("android.net.")
                    || owner.startsWith("android.database.")
                    || owner.startsWith("android.content.pm.")
                    || owner.startsWith("android.telephony.")) {
                return true;
            }
            return name.contains("file")
                    || name.contains("socket")
                    || name.contains("network")
                    || name.contains("reflect")
                    || name.contains("classloader");
        }

        private boolean isDelegationAllowed(Class<?> ownerType) {
            String owner = ownerType == null ? "" : ownerType.getName();
            for (String prefix : SAFE_PACKAGE_PREFIXES) {
                if (owner.startsWith(prefix)) {
                    return true;
                }
            }
            return false;
        }

        private String constructorSignature(Constructor<?> constructor) {
            return "<init>(" + mappedParameterSignature(constructor.getParameterTypes()) + ")";
        }

        private String methodSignature(Method method) {
            return method.getName() + "(" + mappedParameterSignature(method.getParameterTypes()) + ")";
        }

        private String mappedParameterSignature(Class<?>[] parameterTypes) {
            List<String> segments = new ArrayList<>();
            for (Class<?> parameterType : parameterTypes) {
                segments.add(mappedTypeName(parameterType));
            }
            return String.join(",", segments);
        }

        private String describe(Member member) {
            StringBuilder descriptor = new StringBuilder();
            descriptor.append(member.getDeclaringClass().getName()).append('#').append(member.getName());
            if (member instanceof Method) {
                Method method = (Method) member;
                descriptor.append('(');
                Class<?>[] params = method.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    if (i > 0) {
                        descriptor.append(',');
                    }
                    descriptor.append(params[i].getName());
                }
                descriptor.append(')');
            } else if (member instanceof Constructor) {
                Constructor<?> constructor = (Constructor<?>) member;
                descriptor.append('(');
                Class<?>[] params = constructor.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    if (i > 0) {
                        descriptor.append(',');
                    }
                    descriptor.append(params[i].getName());
                }
                descriptor.append(')');
            }
            return descriptor.toString();
        }

        private String escape(String value) {
            return value.replace("\\", "\\\\").replace("\"", "\\\"");
        }

        private String wrapperPackageName(Class<?> clazz) {
            String className = clazz.getName();
            int dollar = className.indexOf('$');
            String topLevel = dollar < 0 ? className : className.substring(0, dollar);
            int lastDot = topLevel.lastIndexOf('.');
            String packageName = lastDot < 0 ? "android" : topLevel.substring(0, lastDot);
            String suffix = packageName.substring("android".length());
            return wrapperRootPackage + suffix;
        }

        private String simpleName(Class<?> clazz) {
            String binary = clazz.getName();
            int dollar = binary.lastIndexOf('$');
            if (dollar >= 0) {
                return binary.substring(dollar + 1);
            }
            int lastDot = binary.lastIndexOf('.');
            return lastDot < 0 ? binary : binary.substring(lastDot + 1);
        }

        private String readableTypeName(Class<?> type) {
            if (type.isArray()) {
                return readableTypeName(type.getComponentType()) + "[]";
            }
            return type.getName().replace('$', '.');
        }

        private String indent(int level) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < level; i++) {
                builder.append("    ");
            }
            return builder.toString();
        }
    }
}
