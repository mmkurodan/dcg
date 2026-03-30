// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TypeEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TypeEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TypeEvaluator wrap(android.animation.TypeEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TypeEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.TypeEvaluator getReal() {
        return (android.animation.TypeEvaluator) real;
    }

    public android.animation.TypeEvaluator unwrap() {
        return getReal();
    }

    public java.lang.Object evaluate(float arg0, java.lang.Object arg1, java.lang.Object arg2) {
        return ((android.animation.TypeEvaluator) real).evaluate(arg0, arg1, arg2);
    }

}
