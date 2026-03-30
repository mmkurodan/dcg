// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssCapabilities wrap(android.location.GnssCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssCapabilities getReal() {
        return (android.location.GnssCapabilities) real;
    }

    public android.location.GnssCapabilities unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssCapabilities) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssCapabilities) real).equals(arg0);
    }

    public int hasAccumulatedDeltaRange() {
        return ((android.location.GnssCapabilities) real).hasAccumulatedDeltaRange();
    }

    public boolean hasAntennaInfo() {
        return ((android.location.GnssCapabilities) real).hasAntennaInfo();
    }

    public boolean hasGeofencing() {
        return ((android.location.GnssCapabilities) real).hasGeofencing();
    }

    public boolean hasGnssAntennaInfo() {
        return ((android.location.GnssCapabilities) real).hasGnssAntennaInfo();
    }

    public boolean hasLowPowerMode() {
        return ((android.location.GnssCapabilities) real).hasLowPowerMode();
    }

    public boolean hasMeasurementCorrections() {
        return ((android.location.GnssCapabilities) real).hasMeasurementCorrections();
    }

    public boolean hasMeasurementCorrectionsExcessPathLength() {
        return ((android.location.GnssCapabilities) real).hasMeasurementCorrectionsExcessPathLength();
    }

    public boolean hasMeasurementCorrectionsForDriving() {
        return ((android.location.GnssCapabilities) real).hasMeasurementCorrectionsForDriving();
    }

    public boolean hasMeasurementCorrectionsLosSats() {
        return ((android.location.GnssCapabilities) real).hasMeasurementCorrectionsLosSats();
    }

    public boolean hasMeasurementCorrectionsReflectingPlane() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.GnssCapabilities#hasMeasurementCorrectionsReflectingPlane()");
    }

    public boolean hasMeasurementCorrelationVectors() {
        return ((android.location.GnssCapabilities) real).hasMeasurementCorrelationVectors();
    }

    public boolean hasMeasurements() {
        return ((android.location.GnssCapabilities) real).hasMeasurements();
    }

    public boolean hasMsa() {
        return ((android.location.GnssCapabilities) real).hasMsa();
    }

    public boolean hasMsb() {
        return ((android.location.GnssCapabilities) real).hasMsb();
    }

    public boolean hasNavigationMessages() {
        return ((android.location.GnssCapabilities) real).hasNavigationMessages();
    }

    public boolean hasOnDemandTime() {
        return ((android.location.GnssCapabilities) real).hasOnDemandTime();
    }

    public boolean hasPowerMultibandAcquisition() {
        return ((android.location.GnssCapabilities) real).hasPowerMultibandAcquisition();
    }

    public boolean hasPowerMultibandTracking() {
        return ((android.location.GnssCapabilities) real).hasPowerMultibandTracking();
    }

    public boolean hasPowerOtherModes() {
        return ((android.location.GnssCapabilities) real).hasPowerOtherModes();
    }

    public boolean hasPowerSinglebandAcquisition() {
        return ((android.location.GnssCapabilities) real).hasPowerSinglebandAcquisition();
    }

    public boolean hasPowerSinglebandTracking() {
        return ((android.location.GnssCapabilities) real).hasPowerSinglebandTracking();
    }

    public boolean hasPowerTotal() {
        return ((android.location.GnssCapabilities) real).hasPowerTotal();
    }

    public boolean hasSatelliteBlocklist() {
        return ((android.location.GnssCapabilities) real).hasSatelliteBlocklist();
    }

    public boolean hasSatellitePvt() {
        return ((android.location.GnssCapabilities) real).hasSatellitePvt();
    }

    public boolean hasScheduling() {
        return ((android.location.GnssCapabilities) real).hasScheduling();
    }

    public boolean hasSingleShotFix() {
        return ((android.location.GnssCapabilities) real).hasSingleShotFix();
    }

    public int hashCode() {
        return ((android.location.GnssCapabilities) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.GnssCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CAPABILITY_SUPPORTED = android.location.GnssCapabilities.CAPABILITY_SUPPORTED;
    public static final int CAPABILITY_UNKNOWN = android.location.GnssCapabilities.CAPABILITY_UNKNOWN;
    public static final int CAPABILITY_UNSUPPORTED = android.location.GnssCapabilities.CAPABILITY_UNSUPPORTED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder wrap(android.location.GnssCapabilities.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssCapabilities.Builder getReal() {
            return (android.location.GnssCapabilities.Builder) real;
        }

        public android.location.GnssCapabilities.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssCapabilities.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssCapabilities arg0) {
            this(new android.location.GnssCapabilities.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities build() {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.wrap(((android.location.GnssCapabilities.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasAccumulatedDeltaRange(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasAccumulatedDeltaRange(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasAntennaInfo(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasAntennaInfo(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasGeofencing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasGeofencing(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasLowPowerMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasLowPowerMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrections(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurementCorrections(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsExcessPathLength(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurementCorrectionsExcessPathLength(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsForDriving(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurementCorrectionsForDriving(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsLosSats(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurementCorrectionsLosSats(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsReflectingPlane(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.GnssCapabilities$Builder#setHasMeasurementCorrectionsReflectingPlane(boolean)");
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrelationVectors(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurementCorrelationVectors(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurements(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMeasurements(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMsa(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMsa(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMsb(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasMsb(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasNavigationMessages(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasNavigationMessages(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasOnDemandTime(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasOnDemandTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerMultibandAcquisition(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerMultibandAcquisition(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerMultibandTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerMultibandTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerOtherModes(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerOtherModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerSinglebandAcquisition(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerSinglebandAcquisition(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerSinglebandTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerSinglebandTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerTotal(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasPowerTotal(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSatelliteBlocklist(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasSatelliteBlocklist(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSatellitePvt(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasSatellitePvt(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasScheduling(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasScheduling(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSingleShotFix(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(((android.location.GnssCapabilities.Builder) real).setHasSingleShotFix(arg0));
        }

    }
}
