// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class FloatArrayEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloatArrayEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.FloatArrayEvaluator wrap(android.animation.FloatArrayEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.FloatArrayEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.FloatArrayEvaluator getReal() {
        return (android.animation.FloatArrayEvaluator) real;
    }

    public android.animation.FloatArrayEvaluator unwrap() {
        return getReal();
    }

    public FloatArrayEvaluator() {
        this(new android.animation.FloatArrayEvaluator(), (__DcgwBridgeToken) null);
    }

    public FloatArrayEvaluator(float[] arg0) {
        this(new android.animation.FloatArrayEvaluator(arg0), (__DcgwBridgeToken) null);
    }

    public float[] evaluate(float arg0, float[] arg1, float[] arg2) {
        return ((android.animation.FloatArrayEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
