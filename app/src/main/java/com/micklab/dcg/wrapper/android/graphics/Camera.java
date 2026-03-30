// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Camera {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Camera(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Camera wrap(android.graphics.Camera real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Camera(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Camera getReal() {
        return (android.graphics.Camera) real;
    }

    public android.graphics.Camera unwrap() {
        return getReal();
    }

    public Camera() {
        this(new android.graphics.Camera(), (__DcgwBridgeToken) null);
    }

    public void applyToCanvas(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.Camera) real).applyToCanvas(arg0 == null ? null : arg0.getReal());
    }

    public float dotWithNormal(float arg0, float arg1, float arg2) {
        return ((android.graphics.Camera) real).dotWithNormal(arg0, arg1, arg2);
    }

    public float getLocationX() {
        return ((android.graphics.Camera) real).getLocationX();
    }

    public float getLocationY() {
        return ((android.graphics.Camera) real).getLocationY();
    }

    public float getLocationZ() {
        return ((android.graphics.Camera) real).getLocationZ();
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Camera) real).getMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void restore() {
        ((android.graphics.Camera) real).restore();
    }

    public void rotate(float arg0, float arg1, float arg2) {
        ((android.graphics.Camera) real).rotate(arg0, arg1, arg2);
    }

    public void rotateX(float arg0) {
        ((android.graphics.Camera) real).rotateX(arg0);
    }

    public void rotateY(float arg0) {
        ((android.graphics.Camera) real).rotateY(arg0);
    }

    public void rotateZ(float arg0) {
        ((android.graphics.Camera) real).rotateZ(arg0);
    }

    public void save() {
        ((android.graphics.Camera) real).save();
    }

    public void setLocation(float arg0, float arg1, float arg2) {
        ((android.graphics.Camera) real).setLocation(arg0, arg1, arg2);
    }

    public void translate(float arg0, float arg1, float arg2) {
        ((android.graphics.Camera) real).translate(arg0, arg1, arg2);
    }

}
