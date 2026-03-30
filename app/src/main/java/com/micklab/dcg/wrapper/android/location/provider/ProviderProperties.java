// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location.provider;

public final class ProviderProperties {
    private final android.location.provider.ProviderProperties real;

    public ProviderProperties(android.location.provider.ProviderProperties real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.provider.ProviderProperties wrap(android.location.provider.ProviderProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.provider.ProviderProperties(real);
    }

    public android.location.provider.ProviderProperties unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAccuracy() {
        return real.getAccuracy();
    }

    public int getPowerUsage() {
        return real.getPowerUsage();
    }

    public boolean hasAltitudeSupport() {
        return real.hasAltitudeSupport();
    }

    public boolean hasBearingSupport() {
        return real.hasBearingSupport();
    }

    public boolean hasCellRequirement() {
        return real.hasCellRequirement();
    }

    public boolean hasMonetaryCost() {
        return real.hasMonetaryCost();
    }

    public boolean hasNetworkRequirement() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.provider.ProviderProperties#hasNetworkRequirement()");
    }

    public boolean hasSatelliteRequirement() {
        return real.hasSatelliteRequirement();
    }

    public boolean hasSpeedSupport() {
        return real.hasSpeedSupport();
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

    public static final int ACCURACY_COARSE = android.location.provider.ProviderProperties.ACCURACY_COARSE;
    public static final int ACCURACY_FINE = android.location.provider.ProviderProperties.ACCURACY_FINE;
    public static final int POWER_USAGE_HIGH = android.location.provider.ProviderProperties.POWER_USAGE_HIGH;
    public static final int POWER_USAGE_LOW = android.location.provider.ProviderProperties.POWER_USAGE_LOW;
    public static final int POWER_USAGE_MEDIUM = android.location.provider.ProviderProperties.POWER_USAGE_MEDIUM;

    public static final class Builder {
        private final android.location.provider.ProviderProperties.Builder real;

        public Builder(android.location.provider.ProviderProperties.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder wrap(android.location.provider.ProviderProperties.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder(real);
        }

        public android.location.provider.ProviderProperties.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.provider.ProviderProperties.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.provider.ProviderProperties arg0) {
            this(new android.location.provider.ProviderProperties.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties build() {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setAccuracy(int arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setAccuracy(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasAltitudeSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasAltitudeSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasBearingSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasBearingSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasCellRequirement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasCellRequirement(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasMonetaryCost(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasMonetaryCost(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasNetworkRequirement(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.provider.ProviderProperties$Builder#setHasNetworkRequirement(boolean)");
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasSatelliteRequirement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasSatelliteRequirement(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasSpeedSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setHasSpeedSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setPowerUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(real.setPowerUsage(arg0));
        }

    }
}
