// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ArcMotion {
    private final android.transition.ArcMotion real;

    public ArcMotion(android.transition.ArcMotion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ArcMotion wrap(android.transition.ArcMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ArcMotion(real);
    }

    public android.transition.ArcMotion unwrap() {
        return real;
    }

    public ArcMotion() {
        this(new android.transition.ArcMotion());
    }

    public ArcMotion(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ArcMotion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public float getMaximumAngle() {
        return real.getMaximumAngle();
    }

    public float getMinimumHorizontalAngle() {
        return real.getMinimumHorizontalAngle();
    }

    public float getMinimumVerticalAngle() {
        return real.getMinimumVerticalAngle();
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath(arg0, arg1, arg2, arg3));
    }

    public void setMaximumAngle(float arg0) {
        real.setMaximumAngle(arg0);
    }

    public void setMinimumHorizontalAngle(float arg0) {
        real.setMinimumHorizontalAngle(arg0);
    }

    public void setMinimumVerticalAngle(float arg0) {
        real.setMinimumVerticalAngle(arg0);
    }

}
