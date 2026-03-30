// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureResult {
    private final android.hardware.camera2.CaptureResult real;

    public CaptureResult(android.hardware.camera2.CaptureResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult wrap(android.hardware.camera2.CaptureResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult(real);
    }

    public android.hardware.camera2.CaptureResult unwrap() {
        return real;
    }

    public java.lang.String getCameraId() {
        return real.getCameraId();
    }

    public long getFrameNumber() {
        return real.getFrameNumber();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getRequest() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(real.getRequest());
    }

    public int getSequenceId() {
        return real.getSequenceId();
    }


    public static final class Key {
        private final android.hardware.camera2.CaptureResult.Key real;

        public Key(android.hardware.camera2.CaptureResult.Key real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult.Key wrap(android.hardware.camera2.CaptureResult.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult.Key(real);
        }

        public android.hardware.camera2.CaptureResult.Key unwrap() {
            return real;
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CaptureResult.Key(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
