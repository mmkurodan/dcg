// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class FloatEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloatEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.FloatEvaluator wrap(android.animation.FloatEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.FloatEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.FloatEvaluator getReal() {
        return (android.animation.FloatEvaluator) real;
    }

    public android.animation.FloatEvaluator unwrap() {
        return getReal();
    }

    public FloatEvaluator() {
        this(new android.animation.FloatEvaluator(), (__DcgwBridgeToken) null);
    }

    public java.lang.Float evaluate(float arg0, java.lang.Number arg1, java.lang.Number arg2) {
        return ((android.animation.FloatEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
