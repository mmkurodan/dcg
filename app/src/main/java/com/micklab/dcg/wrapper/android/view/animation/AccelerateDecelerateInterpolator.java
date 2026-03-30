// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AccelerateDecelerateInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccelerateDecelerateInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AccelerateDecelerateInterpolator wrap(android.view.animation.AccelerateDecelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AccelerateDecelerateInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AccelerateDecelerateInterpolator getReal() {
        return (android.view.animation.AccelerateDecelerateInterpolator) real;
    }

    public android.view.animation.AccelerateDecelerateInterpolator unwrap() {
        return getReal();
    }

    public AccelerateDecelerateInterpolator() {
        this(new android.view.animation.AccelerateDecelerateInterpolator(), (__DcgwBridgeToken) null);
    }

    public AccelerateDecelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AccelerateDecelerateInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.AccelerateDecelerateInterpolator) real).getInterpolation(arg0);
    }

}
