// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class CycleInterpolator {
    private final android.view.animation.CycleInterpolator real;

    public CycleInterpolator(android.view.animation.CycleInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.CycleInterpolator wrap(android.view.animation.CycleInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.CycleInterpolator(real);
    }

    public android.view.animation.CycleInterpolator unwrap() {
        return real;
    }

    public CycleInterpolator(float arg0) {
        this(new android.view.animation.CycleInterpolator(arg0));
    }

    public CycleInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.CycleInterpolator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getInterpolation(float arg0) {
        return real.getInterpolation(arg0);
    }

}
