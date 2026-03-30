// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class TranslateAnimation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslateAnimation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.TranslateAnimation wrap(android.view.animation.TranslateAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.TranslateAnimation(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.TranslateAnimation getReal() {
        return (android.view.animation.TranslateAnimation) real;
    }

    public android.view.animation.TranslateAnimation unwrap() {
        return getReal();
    }

    public TranslateAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.TranslateAnimation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TranslateAnimation(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.TranslateAnimation(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public TranslateAnimation(int arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, float arg7) {
        this(new android.view.animation.TranslateAnimation(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.animation.TranslateAnimation) real).initialize(arg0, arg1, arg2, arg3);
    }

}
