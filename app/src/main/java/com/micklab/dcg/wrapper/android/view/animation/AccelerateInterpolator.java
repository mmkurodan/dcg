// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AccelerateInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccelerateInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AccelerateInterpolator wrap(android.view.animation.AccelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AccelerateInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AccelerateInterpolator getReal() {
        return (android.view.animation.AccelerateInterpolator) real;
    }

    public android.view.animation.AccelerateInterpolator unwrap() {
        return getReal();
    }

    public AccelerateInterpolator() {
        this(new android.view.animation.AccelerateInterpolator(), (__DcgwBridgeToken) null);
    }

    public AccelerateInterpolator(float arg0) {
        this(new android.view.animation.AccelerateInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public AccelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AccelerateInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.AccelerateInterpolator) real).getInterpolation(arg0);
    }

}
