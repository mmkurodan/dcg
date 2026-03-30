// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VelocityTracker {
    private final android.view.VelocityTracker real;

    public VelocityTracker(android.view.VelocityTracker real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VelocityTracker wrap(android.view.VelocityTracker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VelocityTracker(real);
    }

    public android.view.VelocityTracker unwrap() {
        return real;
    }

    public void addMovement(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.addMovement(arg0 == null ? null : arg0.unwrap());
    }

    public void clear() {
        real.clear();
    }

    public void computeCurrentVelocity(int arg0) {
        real.computeCurrentVelocity(arg0);
    }

    public void computeCurrentVelocity(int arg0, float arg1) {
        real.computeCurrentVelocity(arg0, arg1);
    }

    public float getAxisVelocity(int arg0) {
        return real.getAxisVelocity(arg0);
    }

    public float getAxisVelocity(int arg0, int arg1) {
        return real.getAxisVelocity(arg0, arg1);
    }

    public float getXVelocity() {
        return real.getXVelocity();
    }

    public float getXVelocity(int arg0) {
        return real.getXVelocity(arg0);
    }

    public float getYVelocity() {
        return real.getYVelocity();
    }

    public float getYVelocity(int arg0) {
        return real.getYVelocity(arg0);
    }

    public boolean isAxisSupported(int arg0) {
        return real.isAxisSupported(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.VelocityTracker obtain() {
        return com.micklab.dcg.wrapper.android.view.VelocityTracker.wrap(android.view.VelocityTracker.obtain());
    }

    public void recycle() {
        real.recycle();
    }

}
