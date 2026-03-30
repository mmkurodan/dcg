// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class DecelerateInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DecelerateInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.DecelerateInterpolator wrap(android.view.animation.DecelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.DecelerateInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.DecelerateInterpolator getReal() {
        return (android.view.animation.DecelerateInterpolator) real;
    }

    public android.view.animation.DecelerateInterpolator unwrap() {
        return getReal();
    }

    public DecelerateInterpolator() {
        this(new android.view.animation.DecelerateInterpolator(), (__DcgwBridgeToken) null);
    }

    public DecelerateInterpolator(float arg0) {
        this(new android.view.animation.DecelerateInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public DecelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.DecelerateInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.DecelerateInterpolator) real).getInterpolation(arg0);
    }

}
