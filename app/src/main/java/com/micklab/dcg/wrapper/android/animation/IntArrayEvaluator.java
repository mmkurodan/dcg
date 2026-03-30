// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class IntArrayEvaluator {
    private final android.animation.IntArrayEvaluator real;

    public IntArrayEvaluator(android.animation.IntArrayEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.IntArrayEvaluator wrap(android.animation.IntArrayEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.IntArrayEvaluator(real);
    }

    public android.animation.IntArrayEvaluator unwrap() {
        return real;
    }

    public IntArrayEvaluator() {
        this(new android.animation.IntArrayEvaluator());
    }

    public IntArrayEvaluator(int[] arg0) {
        this(new android.animation.IntArrayEvaluator(arg0));
    }

    public int[] evaluate(float arg0, int[] arg1, int[] arg2) {
        return real.evaluate(arg0, arg1, arg2);
    }

}
