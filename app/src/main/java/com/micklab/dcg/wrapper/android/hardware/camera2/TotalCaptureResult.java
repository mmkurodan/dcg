// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class TotalCaptureResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TotalCaptureResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult wrap(android.hardware.camera2.TotalCaptureResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.TotalCaptureResult getReal() {
        return (android.hardware.camera2.TotalCaptureResult) real;
    }

    public android.hardware.camera2.TotalCaptureResult unwrap() {
        return getReal();
    }

}
