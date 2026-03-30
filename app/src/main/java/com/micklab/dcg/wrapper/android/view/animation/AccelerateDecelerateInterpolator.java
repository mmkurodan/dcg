// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AccelerateDecelerateInterpolator {
    private final android.view.animation.AccelerateDecelerateInterpolator real;

    public AccelerateDecelerateInterpolator(android.view.animation.AccelerateDecelerateInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AccelerateDecelerateInterpolator wrap(android.view.animation.AccelerateDecelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AccelerateDecelerateInterpolator(real);
    }

    public android.view.animation.AccelerateDecelerateInterpolator unwrap() {
        return real;
    }

    public AccelerateDecelerateInterpolator() {
        this(new android.view.animation.AccelerateDecelerateInterpolator());
    }

    public AccelerateDecelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AccelerateDecelerateInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
