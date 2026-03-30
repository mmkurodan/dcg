// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OrientationListener {
    private final android.view.OrientationListener real;

    public OrientationListener(android.view.OrientationListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OrientationListener wrap(android.view.OrientationListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OrientationListener(real);
    }

    public android.view.OrientationListener unwrap() {
        return real;
    }

    public void disable() {
        real.disable();
    }

    public void enable() {
        real.enable();
    }

    public void onAccuracyChanged(int arg0, int arg1) {
        real.onAccuracyChanged(arg0, arg1);
    }

    public void onOrientationChanged(int arg0) {
        real.onOrientationChanged(arg0);
    }

    public void onSensorChanged(int arg0, float[] arg1) {
        real.onSensorChanged(arg0, arg1);
    }

    public static final int ORIENTATION_UNKNOWN = android.view.OrientationListener.ORIENTATION_UNKNOWN;

}
