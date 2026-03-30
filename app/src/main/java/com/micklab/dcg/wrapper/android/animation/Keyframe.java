// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class Keyframe {
    private final android.animation.Keyframe real;

    public Keyframe(android.animation.Keyframe real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe wrap(android.animation.Keyframe real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Keyframe(real);
    }

    public android.animation.Keyframe unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.animation.Keyframe clone() {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(real.clone());
    }

    public float getFraction() {
        return real.getFraction();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator());
    }

    public java.lang.Object getValue() {
        return real.getValue();
    }

    public boolean hasValue() {
        return real.hasValue();
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofFloat(float arg0) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofFloat(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofFloat(float arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofFloat(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofInt(float arg0) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofInt(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofInt(float arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofInt(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofObject(float arg0) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofObject(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe ofObject(float arg0, java.lang.Object arg1) {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(android.animation.Keyframe.ofObject(arg0, arg1));
    }

    public void setFraction(float arg0) {
        real.setFraction(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setValue(java.lang.Object arg0) {
        real.setValue(arg0);
    }

}
