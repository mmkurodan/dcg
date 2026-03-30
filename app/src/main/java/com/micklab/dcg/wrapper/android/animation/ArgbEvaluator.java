// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ArgbEvaluator {
    private final android.animation.ArgbEvaluator real;

    public ArgbEvaluator(android.animation.ArgbEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ArgbEvaluator wrap(android.animation.ArgbEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ArgbEvaluator(real);
    }

    public android.animation.ArgbEvaluator unwrap() {
        return real;
    }

    public ArgbEvaluator() {
        this(new android.animation.ArgbEvaluator());
    }

    public java.lang.Object evaluate(float arg0, java.lang.Object arg1, java.lang.Object arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
