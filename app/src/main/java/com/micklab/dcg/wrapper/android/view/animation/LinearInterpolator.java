// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class LinearInterpolator {
    private final android.view.animation.LinearInterpolator real;

    public LinearInterpolator(android.view.animation.LinearInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.LinearInterpolator wrap(android.view.animation.LinearInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LinearInterpolator(real);
    }

    public android.view.animation.LinearInterpolator unwrap() {
        return real;
    }

    public LinearInterpolator() {
        this(new android.view.animation.LinearInterpolator());
    }

    public LinearInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.LinearInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
