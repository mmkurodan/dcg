// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TimeInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TimeInterpolator wrap(android.animation.TimeInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.TimeInterpolator getReal() {
        return (android.animation.TimeInterpolator) real;
    }

    public android.animation.TimeInterpolator unwrap() {
        return getReal();
    }

    public float getInterpolation(float arg0) {
        return ((android.animation.TimeInterpolator) real).getInterpolation(arg0);
    }

}
