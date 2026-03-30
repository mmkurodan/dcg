// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurementRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssMeasurementRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest wrap(android.location.GnssMeasurementRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssMeasurementRequest getReal() {
        return (android.location.GnssMeasurementRequest) real;
    }

    public android.location.GnssMeasurementRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssMeasurementRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssMeasurementRequest) real).equals(arg0);
    }

    public int getIntervalMillis() {
        return ((android.location.GnssMeasurementRequest) real).getIntervalMillis();
    }

    public int hashCode() {
        return ((android.location.GnssMeasurementRequest) real).hashCode();
    }

    public boolean isFullTracking() {
        return ((android.location.GnssMeasurementRequest) real).isFullTracking();
    }

    public java.lang.String toString() {
        return ((android.location.GnssMeasurementRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssMeasurementRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int PASSIVE_INTERVAL = android.location.GnssMeasurementRequest.PASSIVE_INTERVAL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder wrap(android.location.GnssMeasurementRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssMeasurementRequest.Builder getReal() {
            return (android.location.GnssMeasurementRequest.Builder) real;
        }

        public android.location.GnssMeasurementRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssMeasurementRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest arg0) {
            this(new android.location.GnssMeasurementRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest build() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.wrap(((android.location.GnssMeasurementRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder setFullTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder.wrap(((android.location.GnssMeasurementRequest.Builder) real).setFullTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder setIntervalMillis(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder.wrap(((android.location.GnssMeasurementRequest.Builder) real).setIntervalMillis(arg0));
        }

    }
}
