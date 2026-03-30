// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollCaptureCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback wrap(android.view.ScrollCaptureCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback(real, (__DcgwBridgeToken) null);
    }

    public android.view.ScrollCaptureCallback getReal() {
        return (android.view.ScrollCaptureCallback) real;
    }

    public android.view.ScrollCaptureCallback unwrap() {
        return getReal();
    }

    public void onScrollCaptureEnd(java.lang.Runnable arg0) {
        ((android.view.ScrollCaptureCallback) real).onScrollCaptureEnd(arg0);
    }

    public void onScrollCaptureStart(com.micklab.dcg.wrapper.android.view.ScrollCaptureSession arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, java.lang.Runnable arg2) {
        ((android.view.ScrollCaptureCallback) real).onScrollCaptureStart(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

}
