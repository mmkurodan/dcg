// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TypeEvaluator {
    private final android.animation.TypeEvaluator real;

    public TypeEvaluator(android.animation.TypeEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TypeEvaluator wrap(android.animation.TypeEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TypeEvaluator(real);
    }

    public android.animation.TypeEvaluator unwrap() {
        return real;
    }

    public java.lang.Object evaluate(float arg0, java.lang.Object arg1, java.lang.Object arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
