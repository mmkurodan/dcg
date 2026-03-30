// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AccelerateInterpolator {
    private final android.view.animation.AccelerateInterpolator real;

    public AccelerateInterpolator(android.view.animation.AccelerateInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AccelerateInterpolator wrap(android.view.animation.AccelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AccelerateInterpolator(real);
    }

    public android.view.animation.AccelerateInterpolator unwrap() {
        return real;
    }

    public AccelerateInterpolator() {
        this(new android.view.animation.AccelerateInterpolator());
    }

    public AccelerateInterpolator(float arg0) {
        this(new android.view.animation.AccelerateInterpolator(arg0));
    }

    public AccelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AccelerateInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
