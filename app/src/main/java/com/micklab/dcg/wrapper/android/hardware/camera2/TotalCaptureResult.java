// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class TotalCaptureResult {
    private final android.hardware.camera2.TotalCaptureResult real;

    public TotalCaptureResult(android.hardware.camera2.TotalCaptureResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult wrap(android.hardware.camera2.TotalCaptureResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult(real);
    }

    public android.hardware.camera2.TotalCaptureResult unwrap() {
        return real;
    }

}
