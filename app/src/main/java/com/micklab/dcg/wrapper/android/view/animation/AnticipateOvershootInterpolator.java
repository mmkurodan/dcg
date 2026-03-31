// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnticipateOvershootInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnticipateOvershootInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnticipateOvershootInterpolator wrap(android.view.animation.AnticipateOvershootInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnticipateOvershootInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AnticipateOvershootInterpolator getReal() {
        return (android.view.animation.AnticipateOvershootInterpolator) real;
    }

    public android.view.animation.AnticipateOvershootInterpolator unwrap() {
        return getReal();
    }

    public AnticipateOvershootInterpolator() {
        this(new android.view.animation.AnticipateOvershootInterpolator(), (__DcgwBridgeToken) null);
    }

    public AnticipateOvershootInterpolator(float arg0) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public AnticipateOvershootInterpolator(float arg0, float arg1) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public AnticipateOvershootInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.AnticipateOvershootInterpolator) real).getInterpolation(arg0);
    }

}
