// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class IntEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.IntEvaluator wrap(android.animation.IntEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.IntEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.IntEvaluator getReal() {
        return (android.animation.IntEvaluator) real;
    }

    public android.animation.IntEvaluator unwrap() {
        return getReal();
    }

    public IntEvaluator() {
        this(new android.animation.IntEvaluator(), (__DcgwBridgeToken) null);
    }

    public java.lang.Integer evaluate(float arg0, java.lang.Integer arg1, java.lang.Integer arg2) {
        return ((android.animation.IntEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
