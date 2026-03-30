// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ArgbEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArgbEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ArgbEvaluator wrap(android.animation.ArgbEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ArgbEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.ArgbEvaluator getReal() {
        return (android.animation.ArgbEvaluator) real;
    }

    public android.animation.ArgbEvaluator unwrap() {
        return getReal();
    }

    public ArgbEvaluator() {
        this(new android.animation.ArgbEvaluator(), (__DcgwBridgeToken) null);
    }

    public java.lang.Object evaluate(float arg0, java.lang.Object arg1, java.lang.Object arg2) {
        return ((android.animation.ArgbEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
