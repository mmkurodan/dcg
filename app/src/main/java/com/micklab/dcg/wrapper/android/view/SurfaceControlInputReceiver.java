// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControlInputReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceControlInputReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver wrap(android.view.SurfaceControlInputReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.view.SurfaceControlInputReceiver getReal() {
        return (android.view.SurfaceControlInputReceiver) real;
    }

    public android.view.SurfaceControlInputReceiver unwrap() {
        return getReal();
    }

    public boolean onInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.view.SurfaceControlInputReceiver) real).onInputEvent(arg0 == null ? null : arg0.getReal());
    }

}
