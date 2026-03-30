// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ObjectAnimator {
    private final android.animation.ObjectAnimator real;

    public ObjectAnimator(android.animation.ObjectAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator wrap(android.animation.ObjectAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ObjectAnimator(real);
    }

    public android.animation.ObjectAnimator unwrap() {
        return real;
    }

    public ObjectAnimator() {
        this(new android.animation.ObjectAnimator());
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(real.clone());
    }

    public java.lang.String getPropertyName() {
        return real.getPropertyName();
    }

    public java.lang.Object getTarget() {
        return real.getTarget();
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofArgb(java.lang.Object arg0, java.lang.String arg1, int... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofArgb(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofFloat(java.lang.Object arg0, java.lang.String arg1, float... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofFloat(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofFloat(java.lang.Object arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofFloat(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofInt(java.lang.Object arg0, java.lang.String arg1, int... arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofInt(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofInt(java.lang.Object arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.Path arg3) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofInt(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiFloat(java.lang.Object arg0, java.lang.String arg1, float[][] arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiFloat(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiFloat(java.lang.Object arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiFloat(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiInt(java.lang.Object arg0, java.lang.String arg1, int[][] arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiInt(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofMultiInt(java.lang.Object arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofMultiInt(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.animation.ObjectAnimator ofPropertyValuesHolder(java.lang.Object arg0, android.animation.PropertyValuesHolder... arg1) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(android.animation.ObjectAnimator.ofPropertyValuesHolder(arg0, arg1));
    }

    public void setAutoCancel(boolean arg0) {
        real.setAutoCancel(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.ObjectAnimator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.ObjectAnimator.wrap(real.setDuration(arg0));
    }

    public void setFloatValues(float... arg0) {
        real.setFloatValues(arg0);
    }

    public void setIntValues(int... arg0) {
        real.setIntValues(arg0);
    }

    public void setObjectValues(java.lang.Object... arg0) {
        real.setObjectValues(arg0);
    }

    public void setPropertyName(java.lang.String arg0) {
        real.setPropertyName(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        real.setTarget(arg0);
    }

    public void setupEndValues() {
        real.setupEndValues();
    }

    public void setupStartValues() {
        real.setupStartValues();
    }

    public void start() {
        real.start();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
