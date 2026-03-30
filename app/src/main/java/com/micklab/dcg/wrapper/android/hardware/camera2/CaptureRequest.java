// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureRequest {
    private final android.hardware.camera2.CaptureRequest real;

    public CaptureRequest(android.hardware.camera2.CaptureRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest wrap(android.hardware.camera2.CaptureRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest(real);
    }

    public android.hardware.camera2.CaptureRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.Object getTag() {
        return real.getTag();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isReprocess() {
        return real.isReprocess();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.hardware.camera2.CaptureRequest.Builder real;

        public Builder(android.hardware.camera2.CaptureRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder wrap(android.hardware.camera2.CaptureRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder(real);
        }

        public android.hardware.camera2.CaptureRequest.Builder unwrap() {
            return real;
        }

        public void addTarget(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.addTarget(arg0 == null ? null : arg0.unwrap());
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(real.build());
        }

        public void removeTarget(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.removeTarget(arg0 == null ? null : arg0.unwrap());
        }

        public void setTag(java.lang.Object arg0) {
            real.setTag(arg0);
        }

    }
    public static final class Key {
        private final android.hardware.camera2.CaptureRequest.Key real;

        public Key(android.hardware.camera2.CaptureRequest.Key real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Key wrap(android.hardware.camera2.CaptureRequest.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Key(real);
        }

        public android.hardware.camera2.CaptureRequest.Key unwrap() {
            return real;
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CaptureRequest.Key(arg0, arg1));
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
