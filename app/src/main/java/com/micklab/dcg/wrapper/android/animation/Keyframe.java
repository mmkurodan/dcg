// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class Keyframe {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Keyframe(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.Keyframe wrap(android.animation.Keyframe real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Keyframe(real, (__DcgwBridgeToken) null);
    }

    public android.animation.Keyframe getReal() {
        return (android.animation.Keyframe) real;
    }

    public android.animation.Keyframe unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.animation.Keyframe clone() {
        return com.micklab.dcg.wrapper.android.animation.Keyframe.wrap(((android.animation.Keyframe) real).clone());
    }

    public float getFraction() {
        return ((android.animation.Keyframe) real).getFraction();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.animation.Keyframe) real).getInterpolator());
    }

    public java.lang.Object getValue() {
        return ((android.animation.Keyframe) real).getValue();
    }

    public boolean hasValue() {
        return ((android.animation.Keyframe) real).hasValue();
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
        ((android.animation.Keyframe) real).setFraction(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        ((android.animation.Keyframe) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setValue(java.lang.Object arg0) {
        ((android.animation.Keyframe) real).setValue(arg0);
    }

}
