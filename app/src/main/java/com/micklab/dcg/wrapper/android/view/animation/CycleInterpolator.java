// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class CycleInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CycleInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.CycleInterpolator wrap(android.view.animation.CycleInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.CycleInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.CycleInterpolator getReal() {
        return (android.view.animation.CycleInterpolator) real;
    }

    public android.view.animation.CycleInterpolator unwrap() {
        return getReal();
    }

    public CycleInterpolator(float arg0) {
        this(new android.view.animation.CycleInterpolator(arg0), (__DcgwBridgeToken) null);
    }

    public CycleInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.CycleInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.CycleInterpolator) real).getInterpolation(arg0);
    }

}
