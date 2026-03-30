// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnticipateInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnticipateInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnticipateInterpolator wrap(android.view.animation.AnticipateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnticipateInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AnticipateInterpolator getReal() {
        return (android.view.animation.AnticipateInterpolator) real;
    }

    public android.view.animation.AnticipateInterpolator unwrap() {
        return getReal();
    }

    public AnticipateInterpolator() {
        this(new android.view.animation.AnticipateInterpolator(), (__DcgwBridgeToken) null);
    }

    public AnticipateInterpolator(float arg0) {
        this(new android.view.animation.AnticipateInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public AnticipateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnticipateInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.AnticipateInterpolator) real).getInterpolation(arg0);
    }

}
