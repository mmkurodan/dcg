// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class DecelerateInterpolator {
    private final android.view.animation.DecelerateInterpolator real;

    public DecelerateInterpolator(android.view.animation.DecelerateInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.DecelerateInterpolator wrap(android.view.animation.DecelerateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.DecelerateInterpolator(real);
    }

    public android.view.animation.DecelerateInterpolator unwrap() {
        return real;
    }

    public DecelerateInterpolator() {
        this(new android.view.animation.DecelerateInterpolator());
    }

    public DecelerateInterpolator(float arg0) {
        this(new android.view.animation.DecelerateInterpolator(arg0));
    }

    public DecelerateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.DecelerateInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
