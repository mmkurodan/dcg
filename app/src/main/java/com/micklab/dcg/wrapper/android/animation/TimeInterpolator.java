// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TimeInterpolator {
    private final android.animation.TimeInterpolator real;

    public TimeInterpolator(android.animation.TimeInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TimeInterpolator wrap(android.animation.TimeInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeInterpolator(real);
    }

    public android.animation.TimeInterpolator unwrap() {
        return real;
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
