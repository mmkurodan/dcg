// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class LinearInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LinearInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.LinearInterpolator wrap(android.view.animation.LinearInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LinearInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.LinearInterpolator getReal() {
        return (android.view.animation.LinearInterpolator) real;
    }

    public android.view.animation.LinearInterpolator unwrap() {
        return getReal();
    }

    public LinearInterpolator() {
        this(new android.view.animation.LinearInterpolator(), (__DcgwBridgeToken) null);
    }

    public LinearInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.LinearInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.LinearInterpolator) real).getInterpolation(arg0);
    }

}
