// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ArcMotion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArcMotion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ArcMotion wrap(android.transition.ArcMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ArcMotion(real, (__DcgwBridgeToken) null);
    }

    public android.transition.ArcMotion getReal() {
        return (android.transition.ArcMotion) real;
    }

    public android.transition.ArcMotion unwrap() {
        return getReal();
    }

    public ArcMotion() {
        this(new android.transition.ArcMotion(), (__DcgwBridgeToken) null);
    }

    public ArcMotion(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ArcMotion(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public float getMaximumAngle() {
        return ((android.transition.ArcMotion) real).getMaximumAngle();
    }

    public float getMinimumHorizontalAngle() {
        return ((android.transition.ArcMotion) real).getMinimumHorizontalAngle();
    }

    public float getMinimumVerticalAngle() {
        return ((android.transition.ArcMotion) real).getMinimumVerticalAngle();
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.transition.ArcMotion) real).getPath(arg0, arg1, arg2, arg3));
    }

    public void setMaximumAngle(float arg0) {
        ((android.transition.ArcMotion) real).setMaximumAngle(arg0);
    }

    public void setMinimumHorizontalAngle(float arg0) {
        ((android.transition.ArcMotion) real).setMinimumHorizontalAngle(arg0);
    }

    public void setMinimumVerticalAngle(float arg0) {
        ((android.transition.ArcMotion) real).setMinimumVerticalAngle(arg0);
    }

}
