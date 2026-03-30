// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ObjectAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObjectAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator wrap(android.animation.ObjectAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ObjectAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.ObjectAnimator getReal() {
        return (android.animation.ObjectAnimator) real;
    }

    public android.animation.ObjectAnimator unwrap() {
        return getReal();
    }

    public ObjectAnimator() {
        this(new android.animation.ObjectAnimator(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(((android.animation.ObjectAnimator) real).clone());
    }

    public java.lang.String getPropertyName() {
        return ((android.animation.ObjectAnimator) real).getPropertyName();
    }

    public java.lang.Object getTarget() {
        return ((android.animation.ObjectAnimator) real).getTarget();
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofArgb(java.lang.Object arg0, java.lang.String arg1, int... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofArgb(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofFloat(java.lang.Object arg0, java.lang.String arg1, float... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofFloat(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofFloat(java.lang.Object arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofFloat(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofInt(java.lang.Object arg0, java.lang.String arg1, int... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofInt(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofInt(java.lang.Object arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofInt(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiFloat(java.lang.Object arg0, java.lang.String arg1, float[][] arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiFloat(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiFloat(java.lang.Object arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiFloat(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiInt(java.lang.Object arg0, java.lang.String arg1, int[][] arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiInt(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiInt(java.lang.Object arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiInt(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofPropertyValuesHolder(java.lang.Object arg0, android.animation.PropertyValuesHolder... arg1) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofPropertyValuesHolder(arg0, arg1));
    }

    public void setAutoCancel(boolean arg0) {
        ((android.animation.ObjectAnimator) real).setAutoCancel(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(((android.animation.ObjectAnimator) real).setDuration(arg0));
    }

    public void setFloatValues(float... arg0) {
        ((android.animation.ObjectAnimator) real).setFloatValues(arg0);
    }

    public void setIntValues(int... arg0) {
        ((android.animation.ObjectAnimator) real).setIntValues(arg0);
    }

    public void setObjectValues(java.lang.Object... arg0) {
        ((android.animation.ObjectAnimator) real).setObjectValues(arg0);
    }

    public void setPropertyName(java.lang.String arg0) {
        ((android.animation.ObjectAnimator) real).setPropertyName(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        ((android.animation.ObjectAnimator) real).setTarget(arg0);
    }

    public void setupEndValues() {
        ((android.animation.ObjectAnimator) real).setupEndValues();
    }

    public void setupStartValues() {
        ((android.animation.ObjectAnimator) real).setupStartValues();
    }

    public void start() {
        ((android.animation.ObjectAnimator) real).start();
    }

    public java.lang.String toString() {
        return ((android.animation.ObjectAnimator) real).toString();
    }

}
