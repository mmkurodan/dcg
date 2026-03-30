// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControlInputReceiver {
    private final android.view.SurfaceControlInputReceiver real;

    public SurfaceControlInputReceiver(android.view.SurfaceControlInputReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver wrap(android.view.SurfaceControlInputReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver(real);
    }

    public android.view.SurfaceControlInputReceiver unwrap() {
        return real;
    }

    public boolean onInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return real.onInputEvent(arg0 == null ? null : arg0.unwrap());
    }

}
