// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationRequest {
    private final android.location.LocationRequest real;

    public LocationRequest(android.location.LocationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationRequest wrap(android.location.LocationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationRequest(real);
    }

    public android.location.LocationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getDurationMillis() {
        return real.getDurationMillis();
    }

    public long getIntervalMillis() {
        return real.getIntervalMillis();
    }

    public long getMaxUpdateDelayMillis() {
        return real.getMaxUpdateDelayMillis();
    }

    public int getMaxUpdates() {
        return real.getMaxUpdates();
    }

    public float getMinUpdateDistanceMeters() {
        return real.getMinUpdateDistanceMeters();
    }

    public long getMinUpdateIntervalMillis() {
        return real.getMinUpdateIntervalMillis();
    }

    public int getQuality() {
        return real.getQuality();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long PASSIVE_INTERVAL = android.location.LocationRequest.PASSIVE_INTERVAL;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = android.location.LocationRequest.QUALITY_BALANCED_POWER_ACCURACY;
    public static final int QUALITY_HIGH_ACCURACY = android.location.LocationRequest.QUALITY_HIGH_ACCURACY;
    public static final int QUALITY_LOW_POWER = android.location.LocationRequest.QUALITY_LOW_POWER;

    public static final class Builder {
        private final android.location.LocationRequest.Builder real;

        public Builder(android.location.LocationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.LocationRequest.Builder wrap(android.location.LocationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationRequest.Builder(real);
        }

        public android.location.LocationRequest.Builder unwrap() {
            return real;
        }

        public Builder(long arg0) {
            this(new android.location.LocationRequest.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.location.LocationRequest arg0) {
            this(new android.location.LocationRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest build() {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder clearMinUpdateIntervalMillis() {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.clearMinUpdateIntervalMillis());
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setDurationMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setDurationMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setIntervalMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setIntervalMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMaxUpdateDelayMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setMaxUpdateDelayMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMaxUpdates(int arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setMaxUpdates(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMinUpdateDistanceMeters(float arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setMinUpdateDistanceMeters(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMinUpdateIntervalMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setMinUpdateIntervalMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setQuality(int arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(real.setQuality(arg0));
        }

    }
}
