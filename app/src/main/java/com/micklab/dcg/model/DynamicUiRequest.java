package com.micklab.dcg.model;

public final class DynamicUiRequest {
    public enum Mode {
        DECLARATIVE_SPEC,
        VIEW_FACTORY
    }

    private static final String PSEUDO_OUTPUT_MODEL_JSON_METHOD = "__dcgGetPseudoOutputModelJson";

    private final Mode mode;
    private final Class<?> dynamicClass;
    private final Object spec;
    private final String factoryMethodName;
    private final boolean requiresWrapperContext;

    private DynamicUiRequest(
            Mode mode,
            Class<?> dynamicClass,
            Object spec,
            String factoryMethodName,
            boolean requiresWrapperContext) {
        this.mode = mode == null ? Mode.DECLARATIVE_SPEC : mode;
        this.dynamicClass = dynamicClass;
        this.spec = spec;
        this.factoryMethodName = factoryMethodName == null ? "" : factoryMethodName;
        this.requiresWrapperContext = requiresWrapperContext;
    }

    public static DynamicUiRequest declarative(Class<?> dynamicClass, Object spec) {
        return new DynamicUiRequest(Mode.DECLARATIVE_SPEC, dynamicClass, spec, "", false);
    }

    public static DynamicUiRequest viewFactory(Class<?> dynamicClass, String factoryMethodName, boolean requiresWrapperContext) {
        return new DynamicUiRequest(Mode.VIEW_FACTORY, dynamicClass, null, factoryMethodName, requiresWrapperContext);
    }

    public Mode getMode() {
        return mode;
    }

    public Class<?> getDynamicClass() {
        return dynamicClass;
    }

    public Object getSpec() {
        return spec;
    }

    public String getFactoryMethodName() {
        return factoryMethodName;
    }

    public boolean requiresWrapperContext() {
        return requiresWrapperContext;
    }

    public boolean isPseudoMainActivityRequest() {
        if (dynamicClass == null) {
            return false;
        }
        try {
            dynamicClass.getDeclaredMethod(PSEUDO_OUTPUT_MODEL_JSON_METHOD);
            return true;
        } catch (NoSuchMethodException ignored) {
            return false;
        }
    }
}
