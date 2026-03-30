// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OrientationEventListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OrientationEventListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OrientationEventListener wrap(android.view.OrientationEventListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OrientationEventListener(real, (__DcgwBridgeToken) null);
    }

    public android.view.OrientationEventListener getReal() {
        return (android.view.OrientationEventListener) real;
    }

    public android.view.OrientationEventListener unwrap() {
        return getReal();
    }

    public boolean canDetectOrientation() {
        return ((android.view.OrientationEventListener) real).canDetectOrientation();
    }

    public void disable() {
        ((android.view.OrientationEventListener) real).disable();
    }

    public void enable() {
        ((android.view.OrientationEventListener) real).enable();
    }

    public void onOrientationChanged(int arg0) {
        ((android.view.OrientationEventListener) real).onOrientationChanged(arg0);
    }

    public static final int ORIENTATION_UNKNOWN = android.view.OrientationEventListener.ORIENTATION_UNKNOWN;

}
