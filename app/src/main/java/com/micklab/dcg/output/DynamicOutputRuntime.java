package com.micklab.dcg.output;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

import com.micklab.dcg.executor.java.AndroidBuildPropertyBridge;
import com.micklab.dcg.model.DynamicUiRequest;
import com.micklab.dcg.model.ExecutionOutputItem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DynamicOutputRuntime {
    private static final String BUILD_OUTPUT_METHOD = "buildOutput";
    private static final String VIEW_FACTORY_METHOD = "createOutputView";
    private static final String WRAPPER_CONTEXT_CLASS = "com.micklab.dcg.wrapper.android.content.Context";
    private static final String OUTPUT_MODEL_JSON_METHOD = "__dcgGetOutputModelJson";
    private static final String PSEUDO_OUTPUT_MODEL_JSON_METHOD = "__dcgGetPseudoOutputModelJson";

    private DynamicOutputRuntime() {
    }

    public static StructuredOutput extractStructuredOutput(Class<?> dynamicClass, Object mainReturnValue) throws Exception {
        ParseOutcome primaryOutcome = parseTopLevelValue(mainReturnValue, dynamicClass, false);
        List<ExecutionOutputItem> items = new ArrayList<>(primaryOutcome.items);
        String additionalStdout = "";
        String additionalStderr = "";

        Method buildOutputMethod = findZeroArgStaticMethod(dynamicClass, BUILD_OUTPUT_METHOD);
        if (buildOutputMethod != null) {
            CapturedInvocation invocation = captureInvocation(
                    buildOutputMethod,
                    new Object[0],
                    "public static Object " + BUILD_OUTPUT_METHOD + "()");
            additionalStdout = invocation.stdout;
            additionalStderr = invocation.stderr;
            ParseOutcome supplementalOutcome = parseTopLevelValue(invocation.returnValue, dynamicClass, true);
            items.addAll(supplementalOutcome.items);
            if (!supplementalOutcome.returnValueText.isEmpty()) {
                items.add(ExecutionOutputItem.text("Output", supplementalOutcome.returnValueText));
            }
        }

        DynamicUiRequest viewFactoryRequest = findViewFactoryRequest(dynamicClass);
        if (viewFactoryRequest != null) {
            items.add(ExecutionOutputItem.interactive("Interactive UI", viewFactoryRequest));
        }

        return new StructuredOutput(
                primaryOutcome.returnValueText,
                items,
                additionalStdout,
                additionalStderr,
                extractOutputModelJson(dynamicClass));
    }

    public static View createOutputView(Context context, DynamicUiRequest request) throws Exception {
        if (request == null || request.getMode() != DynamicUiRequest.Mode.VIEW_FACTORY || request.getDynamicClass() == null) {
            throw new IllegalArgumentException("No interactive view factory is available for this output.");
        }
        Method method = findViewFactoryMethod(request.getDynamicClass());
        if (method == null) {
            throw new NoSuchMethodException("createOutputView(Context) was not found on " + request.getDynamicClass().getName());
        }
        Object contextArgument = request.requiresWrapperContext() ? wrapContext(context) : context;
        Object value = method.invoke(null, contextArgument);
        View view = toAndroidView(value);
        if (view == null) {
            throw new IllegalStateException("createOutputView(Context) must return an Android View.");
        }
        return view;
    }

    public static ActionOutput invokeAction(
            DynamicUiRequest request,
            String methodName,
            Map<String, String> inputs,
            Context context) throws Exception {
        if (request == null || request.getDynamicClass() == null) {
            throw new IllegalArgumentException("Interactive output is missing its dynamic class handle.");
        }
        Method actionMethod = resolveActionMethod(request.getDynamicClass(), methodName);
        Object[] arguments = buildActionArguments(actionMethod, inputs, context);
        CapturedInvocation invocation = captureInvocation(
                actionMethod,
                arguments,
                "public static Object " + methodName + "(...)");
        ParseOutcome parsedOutcome = parseTopLevelValue(invocation.returnValue, request.getDynamicClass(), true);
        List<ExecutionOutputItem> items = new ArrayList<>(parsedOutcome.items);
        if (!parsedOutcome.returnValueText.isEmpty()) {
            items.add(ExecutionOutputItem.text("Output", parsedOutcome.returnValueText));
        }
        return new ActionOutput(items, invocation.stdout, invocation.stderr);
    }

    public static Object invokeImageClickHandler(
            DynamicUiRequest request,
            String methodName,
            Map<String, String> inputs) throws Exception {
        if (request == null || request.getDynamicClass() == null) {
            throw new IllegalArgumentException("Interactive output is missing its dynamic class handle.");
        }
        Method handlerMethod = resolveImageClickHandlerMethod(request.getDynamicClass(), methodName);
        Map<String, String> safeInputs = inputs == null ? new LinkedHashMap<>() : new LinkedHashMap<>(inputs);
        CapturedInvocation invocation = captureInvocation(
                handlerMethod,
                new Object[]{safeInputs},
                "public static Object " + methodName + "(java.util.Map<java.lang.String, java.lang.String>)");
        return invocation.returnValue;
    }

    private static Method findZeroArgStaticMethod(Class<?> dynamicClass, String methodName) {
        if (dynamicClass == null || methodName == null || methodName.isEmpty()) {
            return null;
        }
        for (Method method : dynamicClass.getDeclaredMethods()) {
            if (methodName.equals(method.getName())
                    && Modifier.isStatic(method.getModifiers())
                    && method.getParameterTypes().length == 0) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    private static Method findViewFactoryMethod(Class<?> dynamicClass) {
        if (dynamicClass == null) {
            return null;
        }
        for (Method method : dynamicClass.getDeclaredMethods()) {
            if (!VIEW_FACTORY_METHOD.equals(method.getName())
                    || !Modifier.isStatic(method.getModifiers())
                    || method.getParameterTypes().length != 1) {
                continue;
            }
            Class<?> parameterType = method.getParameterTypes()[0];
            if (Context.class.isAssignableFrom(parameterType) || isWrapperContextType(parameterType)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    private static DynamicUiRequest findViewFactoryRequest(Class<?> dynamicClass) {
        Method method = findViewFactoryMethod(dynamicClass);
        if (method == null) {
            return null;
        }
        return DynamicUiRequest.viewFactory(
                dynamicClass,
                method.getName(),
                isWrapperContextType(method.getParameterTypes()[0]));
    }

    private static String extractOutputModelJson(Class<?> dynamicClass) throws Exception {
        Method method = findZeroArgStaticMethod(dynamicClass, PSEUDO_OUTPUT_MODEL_JSON_METHOD);
        if (method == null) {
            method = findZeroArgStaticMethod(dynamicClass, OUTPUT_MODEL_JSON_METHOD);
        }
        if (method == null) {
            return "";
        }
        CapturedInvocation invocation = captureInvocation(
                method,
                new Object[0],
                "public static String " + method.getName() + "()");
        if (invocation.returnValue == null) {
            return "";
        }
        return String.valueOf(invocation.returnValue);
    }

    private static Method resolveActionMethod(Class<?> dynamicClass, String methodName) throws NoSuchMethodException {
        if (dynamicClass == null || methodName == null || methodName.trim().isEmpty()) {
            throw new NoSuchMethodException("Interactive action name is missing.");
        }
        for (Method method : dynamicClass.getDeclaredMethods()) {
            if (!methodName.equals(method.getName()) || !Modifier.isStatic(method.getModifiers())) {
                continue;
            }
            if (supportsActionSignature(method.getParameterTypes())) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new NoSuchMethodException("No supported static action method named " + methodName + " was found on " + dynamicClass.getName());
    }

    private static Method resolveImageClickHandlerMethod(Class<?> dynamicClass, String methodName) throws NoSuchMethodException {
        if (dynamicClass == null || methodName == null || methodName.trim().isEmpty()) {
            throw new NoSuchMethodException("Image click handler name is missing.");
        }
        for (Method method : dynamicClass.getDeclaredMethods()) {
            if (!methodName.equals(method.getName()) || !Modifier.isStatic(method.getModifiers())) {
                continue;
            }
            if (supportsImageClickHandlerSignature(method.getParameterTypes())) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new NoSuchMethodException("No supported static image click handler named " + methodName
                + " was found on " + dynamicClass.getName());
    }

    private static boolean supportsActionSignature(Class<?>[] parameterTypes) {
        if (parameterTypes == null || parameterTypes.length > 2) {
            return false;
        }
        for (Class<?> parameterType : parameterTypes) {
            if (Map.class.isAssignableFrom(parameterType)) {
                continue;
            }
            if (Context.class.isAssignableFrom(parameterType) || isWrapperContextType(parameterType)) {
                continue;
            }
            return false;
        }
        return true;
    }

    private static boolean supportsImageClickHandlerSignature(Class<?>[] parameterTypes) {
        return parameterTypes != null
                && parameterTypes.length == 1
                && Map.class.isAssignableFrom(parameterTypes[0]);
    }

    private static Object[] buildActionArguments(
            Method method,
            Map<String, String> inputs,
            Context context) throws Exception {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Object[] arguments = new Object[parameterTypes.length];
        Map<String, String> safeInputs = inputs == null ? new LinkedHashMap<>() : new LinkedHashMap<>(inputs);
        for (int index = 0; index < parameterTypes.length; index++) {
            Class<?> parameterType = parameterTypes[index];
            if (Map.class.isAssignableFrom(parameterType)) {
                arguments[index] = safeInputs;
            } else if (Context.class.isAssignableFrom(parameterType)) {
                arguments[index] = context;
            } else if (isWrapperContextType(parameterType)) {
                arguments[index] = wrapContext(context);
            } else {
                throw new IllegalArgumentException("Unsupported interactive action parameter type: " + parameterType.getName());
            }
        }
        return arguments;
    }

    private static Object wrapContext(Context context) throws Exception {
        Class<?> wrapperContextClass = Class.forName(WRAPPER_CONTEXT_CLASS, true, DynamicOutputRuntime.class.getClassLoader());
        Method wrapMethod = wrapperContextClass.getDeclaredMethod("wrap", Context.class);
        return wrapMethod.invoke(null, context);
    }

    private static boolean isWrapperContextType(Class<?> parameterType) {
        return parameterType != null && WRAPPER_CONTEXT_CLASS.equals(parameterType.getName());
    }

    private static ParseOutcome parseTopLevelValue(
            Object value,
            Class<?> dynamicClass,
            boolean treatTopLevelScalarAsText) {
        List<ExecutionOutputItem> items = new ArrayList<>();
        if (value == null) {
            return new ParseOutcome(items, "");
        }

        Bitmap bitmap = toAndroidBitmap(value);
        if (bitmap != null) {
            items.add(ExecutionOutputItem.image("Image output", encodeBitmap(bitmap)));
            return new ParseOutcome(items, "");
        }

        if (isUiNodeMap(value) || isUiNodeCollection(value)) {
            items.add(ExecutionOutputItem.interactive("Interactive UI", DynamicUiRequest.declarative(dynamicClass, value)));
            return new ParseOutcome(items, "");
        }

        List<?> values = asList(value);
        if (values != null) {
            boolean addedAny = false;
            for (Object entry : values) {
                addedAny |= appendCollectionEntry(items, entry, dynamicClass);
            }
            if (addedAny) {
                return new ParseOutcome(items, "");
            }
        }

        String fallbackText = String.valueOf(value);
        if (treatTopLevelScalarAsText) {
            items.add(ExecutionOutputItem.text("Output", fallbackText));
            return new ParseOutcome(items, "");
        }
        return new ParseOutcome(items, fallbackText);
    }

    private static boolean appendCollectionEntry(
            List<ExecutionOutputItem> items,
            Object value,
            Class<?> dynamicClass) {
        if (value == null) {
            return false;
        }

        Bitmap bitmap = toAndroidBitmap(value);
        if (bitmap != null) {
            items.add(ExecutionOutputItem.image("Image output", encodeBitmap(bitmap)));
            return true;
        }

        if (isUiNodeMap(value) || isUiNodeCollection(value)) {
            items.add(ExecutionOutputItem.interactive("Interactive UI", DynamicUiRequest.declarative(dynamicClass, value)));
            return true;
        }

        List<?> nestedValues = asList(value);
        if (nestedValues != null) {
            boolean addedAny = false;
            for (Object nestedValue : nestedValues) {
                addedAny |= appendCollectionEntry(items, nestedValue, dynamicClass);
            }
            if (addedAny) {
                return true;
            }
        }

        items.add(ExecutionOutputItem.text("Output", String.valueOf(value)));
        return true;
    }

    private static List<?> asList(Object value) {
        if (value instanceof Collection<?>) {
            return new ArrayList<>((Collection<?>) value);
        }
        if (value == null || !value.getClass().isArray() || value.getClass().getComponentType().isPrimitive()) {
            return null;
        }
        int length = Array.getLength(value);
        List<Object> values = new ArrayList<>(length);
        for (int index = 0; index < length; index++) {
            values.add(Array.get(value, index));
        }
        return values;
    }

    private static boolean isUiNodeCollection(Object value) {
        List<?> values = asList(value);
        if (values == null || values.isEmpty()) {
            return false;
        }
        for (Object entry : values) {
            if (!isUiNodeMap(entry)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUiNodeMap(Object value) {
        if (!(value instanceof Map<?, ?>)) {
            return false;
        }
        Object type = ((Map<?, ?>) value).get("type");
        if (!(type instanceof String)) {
            return false;
        }
        String normalizedType = ((String) type).trim().toLowerCase();
        return "text".equals(normalizedType)
                || "image".equals(normalizedType)
                || "label".equals(normalizedType)
                || "title".equals(normalizedType)
                || "spacer".equals(normalizedType)
                || "input".equals(normalizedType)
                || "button".equals(normalizedType)
                || "row".equals(normalizedType)
                || "column".equals(normalizedType);
    }

    private static Bitmap toAndroidBitmap(Object value) {
        if (value instanceof Bitmap) {
            return (Bitmap) value;
        }
        Object unwrapped = unwrapRealObject(value);
        if (unwrapped instanceof Bitmap) {
            return (Bitmap) unwrapped;
        }
        return null;
    }

    public static View toAndroidView(Object value) {
        if (value instanceof View) {
            return (View) value;
        }
        Object unwrapped = unwrapRealObject(value);
        if (unwrapped instanceof View) {
            return (View) unwrapped;
        }
        return null;
    }

    private static Object unwrapRealObject(Object value) {
        if (value == null) {
            return null;
        }
        Object unwrapped = invokeNoArgMethod(value, "unwrap");
        if (unwrapped == null || unwrapped == value) {
            unwrapped = invokeNoArgMethod(value, "getReal");
        }
        return unwrapped;
    }

    private static Object invokeNoArgMethod(Object target, String methodName) {
        if (target == null) {
            return null;
        }
        try {
            Method method = target.getClass().getMethod(methodName);
            return method.invoke(target);
        } catch (Exception ignored) {
            return null;
        }
    }

    private static String encodeBitmap(Bitmap bitmap) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        boolean compressed = bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        if (!compressed) {
            throw new IllegalStateException("Bitmap compression failed.");
        }
        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }

    private static CapturedInvocation captureInvocation(Method method, Object[] arguments, String entrypoint) throws Exception {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream stdoutCapture = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrCapture = new ByteArrayOutputStream();
        Throwable failure = null;
        Object returnValue = null;

        try (PrintStream stdoutInterceptor = new PrintStream(stdoutCapture, true, StandardCharsets.UTF_8.name());
             PrintStream stderrInterceptor = new PrintStream(stderrCapture, true, StandardCharsets.UTF_8.name())) {
            AndroidBuildPropertyBridge.install();
            System.setOut(stdoutInterceptor);
            System.setErr(stderrInterceptor);
            try {
                returnValue = method.invoke(null, arguments);
            } catch (InvocationTargetException exception) {
                failure = exception.getTargetException();
            } catch (Throwable throwable) {
                failure = throwable;
            }
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }

        String stdout = normalizeCapture(stdoutCapture);
        String stderr = normalizeCapture(stderrCapture);
        if (failure != null) {
            throw new InvocationFailureException(entrypoint, stdout, stderr, failure);
        }
        return new CapturedInvocation(entrypoint, stdout, stderr, returnValue);
    }

    private static String normalizeCapture(ByteArrayOutputStream capture) {
        return new String(capture.toByteArray(), StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    }

    public static final class StructuredOutput {
        private final String returnValueText;
        private final List<ExecutionOutputItem> outputItems;
        private final String stdout;
        private final String stderr;
        private final String outputModelJson;

        private StructuredOutput(
                String returnValueText,
                List<ExecutionOutputItem> outputItems,
                String stdout,
                String stderr,
                String outputModelJson) {
            this.returnValueText = returnValueText == null ? "" : returnValueText;
            this.outputItems = outputItems == null ? new ArrayList<>() : new ArrayList<>(outputItems);
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
            this.outputModelJson = outputModelJson == null ? "" : outputModelJson;
        }

        public String getReturnValueText() {
            return returnValueText;
        }

        public List<ExecutionOutputItem> getOutputItems() {
            return new ArrayList<>(outputItems);
        }

        public String getStdout() {
            return stdout;
        }

        public String getStderr() {
            return stderr;
        }

        public String getOutputModelJson() {
            return outputModelJson;
        }
    }

    public static final class ActionOutput {
        private final List<ExecutionOutputItem> outputItems;
        private final String stdout;
        private final String stderr;

        private ActionOutput(List<ExecutionOutputItem> outputItems, String stdout, String stderr) {
            this.outputItems = outputItems == null ? new ArrayList<>() : new ArrayList<>(outputItems);
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
        }

        public List<ExecutionOutputItem> getOutputItems() {
            return new ArrayList<>(outputItems);
        }

        public String getStdout() {
            return stdout;
        }

        public String getStderr() {
            return stderr;
        }
    }

    public static final class InvocationFailureException extends Exception {
        private final String entrypoint;
        private final String stdout;
        private final String stderr;

        private InvocationFailureException(String entrypoint, String stdout, String stderr, Throwable cause) {
            super(cause);
            this.entrypoint = entrypoint == null ? "" : entrypoint;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
        }

        public String getEntrypoint() {
            return entrypoint;
        }

        public String getStdout() {
            return stdout;
        }

        public String getStderr() {
            return stderr;
        }
    }

    private static final class ParseOutcome {
        private final List<ExecutionOutputItem> items;
        private final String returnValueText;

        private ParseOutcome(List<ExecutionOutputItem> items, String returnValueText) {
            this.items = items == null ? new ArrayList<>() : items;
            this.returnValueText = returnValueText == null ? "" : returnValueText;
        }
    }

    private static final class CapturedInvocation {
        private final String entrypoint;
        private final String stdout;
        private final String stderr;
        private final Object returnValue;

        private CapturedInvocation(String entrypoint, String stdout, String stderr, Object returnValue) {
            this.entrypoint = entrypoint == null ? "" : entrypoint;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
            this.returnValue = returnValue;
        }
    }
}
