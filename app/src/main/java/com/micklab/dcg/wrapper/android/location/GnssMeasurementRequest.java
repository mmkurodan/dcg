// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurementRequest {
    private final android.location.GnssMeasurementRequest real;

    public GnssMeasurementRequest(android.location.GnssMeasurementRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest wrap(android.location.GnssMeasurementRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest(real);
    }

    public android.location.GnssMeasurementRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getIntervalMillis() {
        return real.getIntervalMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isFullTracking() {
        return real.isFullTracking();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int PASSIVE_INTERVAL = android.location.GnssMeasurementRequest.PASSIVE_INTERVAL;

    public static final class Builder {
        private final android.location.GnssMeasurementRequest.Builder real;

        public Builder(android.location.GnssMeasurementRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder wrap(android.location.GnssMeasurementRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder(real);
        }

        public android.location.GnssMeasurementRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssMeasurementRequest.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest arg0) {
            this(new android.location.GnssMeasurementRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest build() {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder setFullTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder.wrap(real.setFullTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder setIntervalMillis(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest.Builder.wrap(real.setIntervalMillis(arg0));
        }

    }
}
