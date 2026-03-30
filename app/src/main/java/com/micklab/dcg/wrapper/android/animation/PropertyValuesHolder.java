// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class PropertyValuesHolder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PropertyValuesHolder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder wrap(android.animation.PropertyValuesHolder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder(real, (__DcgwBridgeToken) null);
    }

    public android.animation.PropertyValuesHolder getReal() {
        return (android.animation.PropertyValuesHolder) real;
    }

    public android.animation.PropertyValuesHolder unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder clone() {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(((android.animation.PropertyValuesHolder) real).clone());
    }

    public java.lang.String getPropertyName() {
        return ((android.animation.PropertyValuesHolder) real).getPropertyName();
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
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiFloat(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiInt(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiInt(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder ofMultiInt(java.lang.String arg0, int[][] arg1) {
        return com.micklab.dcg.wrapper.android.animation.PropertyValuesHolder.wrap(android.animation.PropertyValuesHolder.ofMultiInt(arg0, arg1));
    }

    public void setFloatValues(float... arg0) {
        ((android.animation.PropertyValuesHolder) real).setFloatValues(arg0);
    }

    public void setIntValues(int... arg0) {
        ((android.animation.PropertyValuesHolder) real).setIntValues(arg0);
    }

    public void setKeyframes(android.animation.Keyframe... arg0) {
        ((android.animation.PropertyValuesHolder) real).setKeyframes(arg0);
    }

    public void setObjectValues(java.lang.Object... arg0) {
        ((android.animation.PropertyValuesHolder) real).setObjectValues(arg0);
    }

    public void setPropertyName(java.lang.String arg0) {
        ((android.animation.PropertyValuesHolder) real).setPropertyName(arg0);
    }

    public java.lang.String toString() {
        return ((android.animation.PropertyValuesHolder) real).toString();
    }

}
