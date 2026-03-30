// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OrientationEventListener {
    private final android.view.OrientationEventListener real;

    public OrientationEventListener(android.view.OrientationEventListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OrientationEventListener wrap(android.view.OrientationEventListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OrientationEventListener(real);
    }

    public android.view.OrientationEventListener unwrap() {
        return real;
    }

    public boolean canDetectOrientation() {
        return real.canDetectOrientation();
    }

    public void disable() {
        real.disable();
    }

    public void enable() {
        real.enable();
    }

    public void onOrientationChanged(int arg0) {
        real.onOrientationChanged(arg0);
    }

    public static final int ORIENTATION_UNKNOWN = android.view.OrientationEventListener.ORIENTATION_UNKNOWN;

}
