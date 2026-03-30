// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class PropertyValuesHolder {
    private final android.animation.PropertyValuesHolder real;

    public PropertyValuesHolder(android.animation.PropertyValuesHolder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder wrap(android.animation.PropertyValuesHolder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder(real);
    }

    public android.animation.PropertyValuesHolder unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder clone() {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(real.clone());
    }

    public java.lang.String getPropertyName() {
        return real.getPropertyName();
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofFloat(java.lang.String arg0, float... arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofFloat(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofInt(java.lang.String arg0, int... arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofInt(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofKeyframe(java.lang.String arg0, android.animation.Keyframe... arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofKeyframe(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String arg0, float[][] arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiFloat(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiFloat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiInt(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiInt(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiInt(java.lang.String arg0, int[][] arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiInt(arg0, arg1));
    }

    public void setFloatValues(float... arg0) {
        real.setFloatValues(arg0);
    }

    public void setIntValues(int... arg0) {
        real.setIntValues(arg0);
    }

    public void setKeyframes(android.animation.Keyframe... arg0) {
        real.setKeyframes(arg0);
    }

    public void setObjectValues(java.lang.Object... arg0) {
        real.setObjectValues(arg0);
    }

    public void setPropertyName(java.lang.String arg0) {
        real.setPropertyName(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
