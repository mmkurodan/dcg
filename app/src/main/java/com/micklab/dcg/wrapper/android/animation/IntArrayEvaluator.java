// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class IntArrayEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntArrayEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.IntArrayEvaluator wrap(android.animation.IntArrayEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.IntArrayEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.IntArrayEvaluator getReal() {
        return (android.animation.IntArrayEvaluator) real;
    }

    public android.animation.IntArrayEvaluator unwrap() {
        return getReal();
    }

    public IntArrayEvaluator() {
        this(new android.animation.IntArrayEvaluator(), (__DcgwBridgeToken) null);
    }

    public IntArrayEvaluator(int[] arg0) {
        this(new android.animation.IntArrayEvaluator(arg0), (__DcgwBridgeToken) null);
    }

    public int[] evaluate(float arg0, int[] arg1, int[] arg2) {
        return ((android.animation.IntArrayEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
