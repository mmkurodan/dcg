// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OrientationListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OrientationListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OrientationListener wrap(android.view.OrientationListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OrientationListener(real, (__DcgwBridgeToken) null);
    }

    public android.view.OrientationListener getReal() {
        return (android.view.OrientationListener) real;
    }

    public android.view.OrientationListener unwrap() {
        return getReal();
    }

    public void disable() {
        ((android.view.OrientationListener) real).disable();
    }

    public void enable() {
        ((android.view.OrientationListener) real).enable();
    }

    public void onAccuracyChanged(int arg0, int arg1) {
        ((android.view.OrientationListener) real).onAccuracyChanged(arg0, arg1);
    }

    public void onOrientationChanged(int arg0) {
        ((android.view.OrientationListener) real).onOrientationChanged(arg0);
    }

    public void onSensorChanged(int arg0, float[] arg1) {
        ((android.view.OrientationListener) real).onSensorChanged(arg0, arg1);
    }

    public static final int ORIENTATION_UNKNOWN = android.view.OrientationListener.ORIENTATION_UNKNOWN;

}
