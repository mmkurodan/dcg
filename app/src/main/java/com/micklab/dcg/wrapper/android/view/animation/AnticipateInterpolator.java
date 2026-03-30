// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnticipateInterpolator {
    private final android.view.animation.AnticipateInterpolator real;

    public AnticipateInterpolator(android.view.animation.AnticipateInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnticipateInterpolator wrap(android.view.animation.AnticipateInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnticipateInterpolator(real);
    }

    public android.view.animation.AnticipateInterpolator unwrap() {
        return real;
    }

    public AnticipateInterpolator() {
        this(new android.view.animation.AnticipateInterpolator());
    }

    public AnticipateInterpolator(float arg0) {
        this(new android.view.animation.AnticipateInterpolator(arg0));
    }

    public AnticipateInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnticipateInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
