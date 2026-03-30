// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VelocityTracker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VelocityTracker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VelocityTracker wrap(android.view.VelocityTracker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VelocityTracker(real, (__DcgwBridgeToken) null);
    }

    public android.view.VelocityTracker getReal() {
        return (android.view.VelocityTracker) real;
    }

    public android.view.VelocityTracker unwrap() {
        return getReal();
    }

    public void addMovement(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.view.VelocityTracker) real).addMovement(arg0 == null ? null : arg0.getReal());
    }

    public void clear() {
        ((android.view.VelocityTracker) real).clear();
    }

    public void computeCurrentVelocity(int arg0) {
        ((android.view.VelocityTracker) real).computeCurrentVelocity(arg0);
    }

    public void computeCurrentVelocity(int arg0, float arg1) {
        ((android.view.VelocityTracker) real).computeCurrentVelocity(arg0, arg1);
    }

    public float getAxisVelocity(int arg0) {
        return ((android.view.VelocityTracker) real).getAxisVelocity(arg0);
    }

    public float getAxisVelocity(int arg0, int arg1) {
        return ((android.view.VelocityTracker) real).getAxisVelocity(arg0, arg1);
    }

    public float getXVelocity() {
        return ((android.view.VelocityTracker) real).getXVelocity();
    }

    public float getXVelocity(int arg0) {
        return ((android.view.VelocityTracker) real).getXVelocity(arg0);
    }

    public float getYVelocity() {
        return ((android.view.VelocityTracker) real).getYVelocity();
    }

    public float getYVelocity(int arg0) {
        return ((android.view.VelocityTracker) real).getYVelocity(arg0);
    }

    public boolean isAxisSupported(int arg0) {
        return ((android.view.VelocityTracker) real).isAxisSupported(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.VelocityTracker obtain() {
        return com.micklab.dcg.wrapper.android.view.VelocityTracker.wrap(android.view.VelocityTracker.obtain());
    }

    public void recycle() {
        ((android.view.VelocityTracker) real).recycle();
    }

}
