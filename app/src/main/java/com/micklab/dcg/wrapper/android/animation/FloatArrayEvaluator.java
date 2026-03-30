// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class FloatArrayEvaluator {
    private final android.animation.FloatArrayEvaluator real;

    public FloatArrayEvaluator(android.animation.FloatArrayEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.FloatArrayEvaluator wrap(android.animation.FloatArrayEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.FloatArrayEvaluator(real);
    }

    public android.animation.FloatArrayEvaluator unwrap() {
        return real;
    }

    public FloatArrayEvaluator() {
        this(new android.animation.FloatArrayEvaluator());
    }

    public FloatArrayEvaluator(float[] arg0) {
        this(new android.animation.FloatArrayEvaluator(arg0));
    }

    public float[] evaluate(float arg0, float[] arg1, float[] arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
