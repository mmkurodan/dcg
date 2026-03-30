// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location.provider;

public final class ProviderProperties {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProviderProperties(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.provider.ProviderProperties wrap(android.location.provider.ProviderProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.provider.ProviderProperties(real, (__DcgwBridgeToken) null);
    }

    public android.location.provider.ProviderProperties getReal() {
        return (android.location.provider.ProviderProperties) real;
    }

    public android.location.provider.ProviderProperties unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.provider.ProviderProperties) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.provider.ProviderProperties) real).equals(arg0);
    }

    public int getAccuracy() {
        return ((android.location.provider.ProviderProperties) real).getAccuracy();
    }

    public int getPowerUsage() {
        return ((android.location.provider.ProviderProperties) real).getPowerUsage();
    }

    public boolean hasAltitudeSupport() {
        return ((android.location.provider.ProviderProperties) real).hasAltitudeSupport();
    }

    public boolean hasBearingSupport() {
        return ((android.location.provider.ProviderProperties) real).hasBearingSupport();
    }

    public boolean hasCellRequirement() {
        return ((android.location.provider.ProviderProperties) real).hasCellRequirement();
    }

    public boolean hasMonetaryCost() {
        return ((android.location.provider.ProviderProperties) real).hasMonetaryCost();
    }

    public boolean hasNetworkRequirement() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.provider.ProviderProperties#hasNetworkRequirement()");
    }

    public boolean hasSatelliteRequirement() {
        return ((android.location.provider.ProviderProperties) real).hasSatelliteRequirement();
    }

    public boolean hasSpeedSupport() {
        return ((android.location.provider.ProviderProperties) real).hasSpeedSupport();
    }

    public int hashCode() {
        return ((android.location.provider.ProviderProperties) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.provider.ProviderProperties) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.provider.ProviderProperties) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACCURACY_COARSE = android.location.provider.ProviderProperties.ACCURACY_COARSE;
    public static final int ACCURACY_FINE = android.location.provider.ProviderProperties.ACCURACY_FINE;
    public static final int POWER_USAGE_HIGH = android.location.provider.ProviderProperties.POWER_USAGE_HIGH;
    public static final int POWER_USAGE_LOW = android.location.provider.ProviderProperties.POWER_USAGE_LOW;
    public static final int POWER_USAGE_MEDIUM = android.location.provider.ProviderProperties.POWER_USAGE_MEDIUM;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder wrap(android.location.provider.ProviderProperties.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.provider.ProviderProperties.Builder getReal() {
            return (android.location.provider.ProviderProperties.Builder) real;
        }

        public android.location.provider.ProviderProperties.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.provider.ProviderProperties.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.provider.ProviderProperties arg0) {
            this(new android.location.provider.ProviderProperties.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties build() {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.wrap(((android.location.provider.ProviderProperties.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setAccuracy(int arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setAccuracy(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasAltitudeSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasAltitudeSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasBearingSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasBearingSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasCellRequirement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasCellRequirement(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasMonetaryCost(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasMonetaryCost(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasNetworkRequirement(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.provider.ProviderProperties$Builder#setHasNetworkRequirement(boolean)");
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasSatelliteRequirement(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasSatelliteRequirement(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setHasSpeedSupport(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setHasSpeedSupport(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder setPowerUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.Builder.wrap(((android.location.provider.ProviderProperties.Builder) real).setPowerUsage(arg0));
        }

    }
}
