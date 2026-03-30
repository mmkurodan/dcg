// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class BounceInterpolator {
    private final android.view.animation.BounceInterpolator real;

    public BounceInterpolator(android.view.animation.BounceInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.BounceInterpolator wrap(android.view.animation.BounceInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.BounceInterpolator(real);
    }

    public android.view.animation.BounceInterpolator unwrap() {
        return real;
    }

    public BounceInterpolator() {
        this(new android.view.animation.BounceInterpolator());
    }

    public BounceInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.BounceInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
