// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class BounceInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BounceInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.BounceInterpolator wrap(android.view.animation.BounceInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.BounceInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.BounceInterpolator getReal() {
        return (android.view.animation.BounceInterpolator) real;
    }

    public android.view.animation.BounceInterpolator unwrap() {
        return getReal();
    }

    public BounceInterpolator() {
        this(new android.view.animation.BounceInterpolator(), (__DcgwBridgeToken) null);
    }

    public BounceInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.BounceInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.BounceInterpolator) real).getInterpolation(arg0);
    }

}
