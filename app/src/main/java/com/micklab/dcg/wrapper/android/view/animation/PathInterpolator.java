// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class PathInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.PathInterpolator wrap(android.view.animation.PathInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.PathInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.PathInterpolator getReal() {
        return (android.view.animation.PathInterpolator) real;
    }

    public android.view.animation.PathInterpolator unwrap() {
        return getReal();
    }

    public PathInterpolator(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.view.animation.PathInterpolator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PathInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.PathInterpolator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PathInterpolator(float arg0, float arg1) {
        this(new android.view.animation.PathInterpolator(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public PathInterpolator(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.PathInterpolator(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public float getInterpolation(float arg0) {
        return ((android.view.animation.PathInterpolator) real).getInterpolation(arg0);
    }

}
