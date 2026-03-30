// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaptureRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest wrap(android.hardware.camera2.CaptureRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CaptureRequest getReal() {
        return (android.hardware.camera2.CaptureRequest) real;
    }

    public android.hardware.camera2.CaptureRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.camera2.CaptureRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.CaptureRequest) real).equals(arg0);
    }

    public java.lang.Object getTag() {
        return ((android.hardware.camera2.CaptureRequest) real).getTag();
    }

    public int hashCode() {
        return ((android.hardware.camera2.CaptureRequest) real).hashCode();
    }

    public boolean isReprocess() {
        return ((android.hardware.camera2.CaptureRequest) real).isReprocess();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.camera2.CaptureRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder wrap(android.hardware.camera2.CaptureRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CaptureRequest.Builder getReal() {
            return (android.hardware.camera2.CaptureRequest.Builder) real;
        }

        public android.hardware.camera2.CaptureRequest.Builder unwrap() {
            return getReal();
        }

        public void addTarget(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.hardware.camera2.CaptureRequest.Builder) real).addTarget(arg0 == null ? null : arg0.getReal());
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(((android.hardware.camera2.CaptureRequest.Builder) real).build());
        }

        public void removeTarget(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.hardware.camera2.CaptureRequest.Builder) real).removeTarget(arg0 == null ? null : arg0.getReal());
        }

        public void setTag(java.lang.Object arg0) {
            ((android.hardware.camera2.CaptureRequest.Builder) real).setTag(arg0);
        }

    }
    public static final class Key {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Key(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Key wrap(android.hardware.camera2.CaptureRequest.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Key(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CaptureRequest.Key getReal() {
            return (android.hardware.camera2.CaptureRequest.Key) real;
        }

        public android.hardware.camera2.CaptureRequest.Key unwrap() {
            return getReal();
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CaptureRequest.Key(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.camera2.CaptureRequest.Key) real).equals(arg0);
        }

        public java.lang.String getName() {
            return ((android.hardware.camera2.CaptureRequest.Key) real).getName();
        }

        public int hashCode() {
            return ((android.hardware.camera2.CaptureRequest.Key) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.hardware.camera2.CaptureRequest.Key) real).toString();
        }

    }
}
