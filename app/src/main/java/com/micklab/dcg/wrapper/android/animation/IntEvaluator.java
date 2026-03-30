// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class IntEvaluator {
    private final android.animation.IntEvaluator real;

    public IntEvaluator(android.animation.IntEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.IntEvaluator wrap(android.animation.IntEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.IntEvaluator(real);
    }

    public android.animation.IntEvaluator unwrap() {
        return real;
    }

    public IntEvaluator() {
        this(new android.animation.IntEvaluator());
    }

    public java.lang.Integer evaluate(float arg0, java.lang.Integer arg1, java.lang.Integer arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
