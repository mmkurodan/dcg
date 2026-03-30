// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Outline {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Outline(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Outline wrap(android.graphics.Outline real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Outline(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Outline getReal() {
        return (android.graphics.Outline) real;
    }

    public android.graphics.Outline unwrap() {
        return getReal();
    }

    public Outline() {
        this(new android.graphics.Outline(), (__DcgwBridgeToken) null);
    }

    public Outline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        this(new android.graphics.Outline(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean canClip() {
        return ((android.graphics.Outline) real).canClip();
    }

    public float getAlpha() {
        return ((android.graphics.Outline) real).getAlpha();
    }

    public float getRadius() {
        return ((android.graphics.Outline) real).getRadius();
    }

    public boolean getRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Outline) real).getRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean isEmpty() {
        return ((android.graphics.Outline) real).isEmpty();
    }

    public void offset(int arg0, int arg1) {
        ((android.graphics.Outline) real).offset(arg0, arg1);
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.Outline) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void setAlpha(float arg0) {
        ((android.graphics.Outline) real).setAlpha(arg0);
    }

    public void setConvexPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        ((android.graphics.Outline) real).setConvexPath(arg0 == null ? null : arg0.getReal());
    }

    public void setEmpty() {
        ((android.graphics.Outline) real).setEmpty();
    }

    public void setOval(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.Outline) real).setOval(arg0 == null ? null : arg0.getReal());
    }

    public void setOval(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Outline) real).setOval(arg0, arg1, arg2, arg3);
    }

    public void setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        ((android.graphics.Outline) real).setPath(arg0 == null ? null : arg0.getReal());
    }

    public void setRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.Outline) real).setRect(arg0 == null ? null : arg0.getReal());
    }

    public void setRect(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Outline) real).setRect(arg0, arg1, arg2, arg3);
    }

    public void setRoundRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, float arg1) {
        ((android.graphics.Outline) real).setRoundRect(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setRoundRect(int arg0, int arg1, int arg2, int arg3, float arg4) {
        ((android.graphics.Outline) real).setRoundRect(arg0, arg1, arg2, arg3, arg4);
    }

}
