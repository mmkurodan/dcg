// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationRequest wrap(android.location.LocationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.location.LocationRequest getReal() {
        return (android.location.LocationRequest) real;
    }

    public android.location.LocationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.LocationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.LocationRequest) real).equals(arg0);
    }

    public long getDurationMillis() {
        return ((android.location.LocationRequest) real).getDurationMillis();
    }

    public long getIntervalMillis() {
        return ((android.location.LocationRequest) real).getIntervalMillis();
    }

    public long getMaxUpdateDelayMillis() {
        return ((android.location.LocationRequest) real).getMaxUpdateDelayMillis();
    }

    public int getMaxUpdates() {
        return ((android.location.LocationRequest) real).getMaxUpdates();
    }

    public float getMinUpdateDistanceMeters() {
        return ((android.location.LocationRequest) real).getMinUpdateDistanceMeters();
    }

    public long getMinUpdateIntervalMillis() {
        return ((android.location.LocationRequest) real).getMinUpdateIntervalMillis();
    }

    public int getQuality() {
        return ((android.location.LocationRequest) real).getQuality();
    }

    public int hashCode() {
        return ((android.location.LocationRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.LocationRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.LocationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long PASSIVE_INTERVAL = android.location.LocationRequest.PASSIVE_INTERVAL;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = android.location.LocationRequest.QUALITY_BALANCED_POWER_ACCURACY;
    public static final int QUALITY_HIGH_ACCURACY = android.location.LocationRequest.QUALITY_HIGH_ACCURACY;
    public static final int QUALITY_LOW_POWER = android.location.LocationRequest.QUALITY_LOW_POWER;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.LocationRequest.Builder wrap(android.location.LocationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.LocationRequest.Builder getReal() {
            return (android.location.LocationRequest.Builder) real;
        }

        public android.location.LocationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(long arg0) {
            this(new android.location.LocationRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.LocationRequest arg0) {
            this(new android.location.LocationRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest build() {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.wrap(((android.location.LocationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder clearMinUpdateIntervalMillis() {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).clearMinUpdateIntervalMillis());
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setDurationMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setDurationMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setIntervalMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setIntervalMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMaxUpdateDelayMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setMaxUpdateDelayMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMaxUpdates(int arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setMaxUpdates(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMinUpdateDistanceMeters(float arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setMinUpdateDistanceMeters(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setMinUpdateIntervalMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setMinUpdateIntervalMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.LocationRequest.Builder setQuality(int arg0) {
            return com.micklab.dcg.wrapper.android.location.LocationRequest.Builder.wrap(((android.location.LocationRequest.Builder) real).setQuality(arg0));
        }

    }
}
