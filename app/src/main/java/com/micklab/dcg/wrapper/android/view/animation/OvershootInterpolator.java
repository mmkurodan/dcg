// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class OvershootInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OvershootInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.OvershootInterpolator wrap(android.view.animation.OvershootInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.OvershootInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.OvershootInterpolator getReal() {
        return (android.view.animation.OvershootInterpolator) real;
    }

    public android.view.animation.OvershootInterpolator unwrap() {
        return getReal();
    }

    public OvershootInterpolator() {
        this(new android.view.animation.OvershootInterpolator(), (__DcgwBridgeToken) null);
    }

    public OvershootInterpolator(float arg0) {
        this(new android.view.animation.OvershootInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public OvershootInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.OvershootInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.OvershootInterpolator) real).getInterpolation(arg0);
    }

}
