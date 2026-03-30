// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnticipateOvershootInterpolator {
    private final android.view.animation.AnticipateOvershootInterpolator real;

    public AnticipateOvershootInterpolator(android.view.animation.AnticipateOvershootInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnticipateOvershootInterpolator wrap(android.view.animation.AnticipateOvershootInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnticipateOvershootInterpolator(real);
    }

    public android.view.animation.AnticipateOvershootInterpolator unwrap() {
        return real;
    }

    public AnticipateOvershootInterpolator() {
        this(new android.view.animation.AnticipateOvershootInterpolator());
    }

    public AnticipateOvershootInterpolator(float arg0) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0));
    }

    public AnticipateOvershootInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AnticipateOvershootInterpolator(float arg0, float arg1) {
        this(new android.view.animation.AnticipateOvershootInterpolator(arg0, arg1));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
