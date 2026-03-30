// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class FloatEvaluator {
    private final android.animation.FloatEvaluator real;

    public FloatEvaluator(android.animation.FloatEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.FloatEvaluator wrap(android.animation.FloatEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.FloatEvaluator(real);
    }

    public android.animation.FloatEvaluator unwrap() {
        return real;
    }

    public FloatEvaluator() {
        this(new android.animation.FloatEvaluator());
    }

    public java.lang.Float evaluate(float arg0, java.lang.Number arg1, java.lang.Number arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
