// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaptureResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult wrap(android.hardware.camera2.CaptureResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CaptureResult getReal() {
        return (android.hardware.camera2.CaptureResult) real;
    }

    public android.hardware.camera2.CaptureResult unwrap() {
        return getReal();
    }

    public java.lang.String getCameraId() {
        return ((android.hardware.camera2.CaptureResult) real).getCameraId();
    }

    public long getFrameNumber() {
        return ((android.hardware.camera2.CaptureResult) real).getFrameNumber();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getRequest() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(((android.hardware.camera2.CaptureResult) real).getRequest());
    }

    public int getSequenceId() {
        return ((android.hardware.camera2.CaptureResult) real).getSequenceId();
    }


    public static final class Key {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Key(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult.Key wrap(android.hardware.camera2.CaptureResult.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult.Key(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CaptureResult.Key getReal() {
            return (android.hardware.camera2.CaptureResult.Key) real;
        }

        public android.hardware.camera2.CaptureResult.Key unwrap() {
            return getReal();
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CaptureResult.Key(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.camera2.CaptureResult.Key) real).equals(arg0);
        }

        public java.lang.String getName() {
            return ((android.hardware.camera2.CaptureResult.Key) real).getName();
        }

        public int hashCode() {
            return ((android.hardware.camera2.CaptureResult.Key) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.hardware.camera2.CaptureResult.Key) real).toString();
        }

    }
}
