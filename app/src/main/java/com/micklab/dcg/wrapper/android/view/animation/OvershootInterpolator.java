// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class OvershootInterpolator {
    private final android.view.animation.OvershootInterpolator real;

    public OvershootInterpolator(android.view.animation.OvershootInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.OvershootInterpolator wrap(android.view.animation.OvershootInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.OvershootInterpolator(real);
    }

    public android.view.animation.OvershootInterpolator unwrap() {
        return real;
    }

    public OvershootInterpolator() {
        this(new android.view.animation.OvershootInterpolator());
    }

    public OvershootInterpolator(float arg0) {
        this(new android.view.animation.OvershootInterpolator(arg0));
    }

    public OvershootInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.OvershootInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
