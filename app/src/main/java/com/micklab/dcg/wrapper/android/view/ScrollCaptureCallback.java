// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureCallback {
    private final android.view.ScrollCaptureCallback real;

    public ScrollCaptureCallback(android.view.ScrollCaptureCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback wrap(android.view.ScrollCaptureCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback(real);
    }

    public android.view.ScrollCaptureCallback unwrap() {
        return real;
    }

    public void onScrollCaptureEnd(java.lang.Runnable arg0) {
        real.onScrollCaptureEnd(arg0);
    }

    public void onScrollCaptureStart(com.micklab.dcg.wrapper.android.view.ScrollCaptureSession arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, java.lang.Runnable arg2) {
        real.onScrollCaptureStart(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

}
