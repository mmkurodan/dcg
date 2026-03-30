// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class PathInterpolator {
    private final android.view.animation.PathInterpolator real;

    public PathInterpolator(android.view.animation.PathInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.PathInterpolator wrap(android.view.animation.PathInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.PathInterpolator(real);
    }

    public android.view.animation.PathInterpolator unwrap() {
        return real;
    }

    public PathInterpolator(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.view.animation.PathInterpolator(arg0 == null ? null : arg0.unwrap()));
    }

    public PathInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.PathInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PathInterpolator(float arg0, float arg1) {
        this(new android.view.animation.PathInterpolator(arg0, arg1));
    }

    public PathInterpolator(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.PathInterpolator(arg0, arg1, arg2, arg3));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
