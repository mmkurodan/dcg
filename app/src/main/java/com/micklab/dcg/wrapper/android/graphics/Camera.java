// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Camera {
    private final android.graphics.Camera real;

    public Camera(android.graphics.Camera real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Camera wrap(android.graphics.Camera real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Camera(real);
    }

    public android.graphics.Camera unwrap() {
        return real;
    }

    public Camera() {
        this(new android.graphics.Camera());
    }

    public void applyToCanvas(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.applyToCanvas(arg0 == null ? null : arg0.unwrap());
    }

    public float dotWithNormal(float arg0, float arg1, float arg2) {
        return real.dotWithNormal(arg0, arg1, arg2);
    }

    public float getLocationX() {
        return real.getLocationX();
    }

    public float getLocationY() {
        return real.getLocationY();
    }

    public float getLocationZ() {
        return real.getLocationZ();
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.getMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void restore() {
        real.restore();
    }

    public void rotate(float arg0, float arg1, float arg2) {
        real.rotate(arg0, arg1, arg2);
    }

    public void rotateX(float arg0) {
        real.rotateX(arg0);
    }

    public void rotateY(float arg0) {
        real.rotateY(arg0);
    }

    public void rotateZ(float arg0) {
        real.rotateZ(arg0);
    }

    public void save() {
        real.save();
    }

    public void setLocation(float arg0, float arg1, float arg2) {
        real.setLocation(arg0, arg1, arg2);
    }

    public void translate(float arg0, float arg1, float arg2) {
        real.translate(arg0, arg1, arg2);
    }

}
