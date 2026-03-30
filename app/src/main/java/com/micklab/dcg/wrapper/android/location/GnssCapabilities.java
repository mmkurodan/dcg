// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssCapabilities {
    private final android.location.GnssCapabilities real;

    public GnssCapabilities(android.location.GnssCapabilities real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssCapabilities wrap(android.location.GnssCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssCapabilities(real);
    }

    public android.location.GnssCapabilities unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hasAccumulatedDeltaRange() {
        return real.hasAccumulatedDeltaRange();
    }

    public boolean hasAntennaInfo() {
        return real.hasAntennaInfo();
    }

    public boolean hasGeofencing() {
        return real.hasGeofencing();
    }

    public boolean hasGnssAntennaInfo() {
        return real.hasGnssAntennaInfo();
    }

    public boolean hasLowPowerMode() {
        return real.hasLowPowerMode();
    }

    public boolean hasMeasurementCorrections() {
        return real.hasMeasurementCorrections();
    }

    public boolean hasMeasurementCorrectionsExcessPathLength() {
        return real.hasMeasurementCorrectionsExcessPathLength();
    }

    public boolean hasMeasurementCorrectionsForDriving() {
        return real.hasMeasurementCorrectionsForDriving();
    }

    public boolean hasMeasurementCorrectionsLosSats() {
        return real.hasMeasurementCorrectionsLosSats();
    }

    public boolean hasMeasurementCorrectionsReflectingPlane() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.GnssCapabilities#hasMeasurementCorrectionsReflectingPlane()");
    }

    public boolean hasMeasurementCorrelationVectors() {
        return real.hasMeasurementCorrelationVectors();
    }

    public boolean hasMeasurements() {
        return real.hasMeasurements();
    }

    public boolean hasMsa() {
        return real.hasMsa();
    }

    public boolean hasMsb() {
        return real.hasMsb();
    }

    public boolean hasNavigationMessages() {
        return real.hasNavigationMessages();
    }

    public boolean hasOnDemandTime() {
        return real.hasOnDemandTime();
    }

    public boolean hasPowerMultibandAcquisition() {
        return real.hasPowerMultibandAcquisition();
    }

    public boolean hasPowerMultibandTracking() {
        return real.hasPowerMultibandTracking();
    }

    public boolean hasPowerOtherModes() {
        return real.hasPowerOtherModes();
    }

    public boolean hasPowerSinglebandAcquisition() {
        return real.hasPowerSinglebandAcquisition();
    }

    public boolean hasPowerSinglebandTracking() {
        return real.hasPowerSinglebandTracking();
    }

    public boolean hasPowerTotal() {
        return real.hasPowerTotal();
    }

    public boolean hasSatelliteBlocklist() {
        return real.hasSatelliteBlocklist();
    }

    public boolean hasSatellitePvt() {
        return real.hasSatellitePvt();
    }

    public boolean hasScheduling() {
        return real.hasScheduling();
    }

    public boolean hasSingleShotFix() {
        return real.hasSingleShotFix();
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

    public static final int CAPABILITY_SUPPORTED = android.location.GnssCapabilities.CAPABILITY_SUPPORTED;
    public static final int CAPABILITY_UNKNOWN = android.location.GnssCapabilities.CAPABILITY_UNKNOWN;
    public static final int CAPABILITY_UNSUPPORTED = android.location.GnssCapabilities.CAPABILITY_UNSUPPORTED;

    public static final class Builder {
        private final android.location.GnssCapabilities.Builder real;

        public Builder(android.location.GnssCapabilities.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder wrap(android.location.GnssCapabilities.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder(real);
        }

        public android.location.GnssCapabilities.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssCapabilities.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssCapabilities arg0) {
            this(new android.location.GnssCapabilities.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities build() {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasAccumulatedDeltaRange(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasAccumulatedDeltaRange(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasAntennaInfo(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasAntennaInfo(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasGeofencing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasGeofencing(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasLowPowerMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasLowPowerMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrections(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurementCorrections(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsExcessPathLength(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurementCorrectionsExcessPathLength(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsForDriving(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurementCorrectionsForDriving(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsLosSats(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurementCorrectionsLosSats(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsReflectingPlane(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.GnssCapabilities$Builder#setHasMeasurementCorrectionsReflectingPlane(boolean)");
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurementCorrelationVectors(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurementCorrelationVectors(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMeasurements(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMeasurements(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMsa(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMsa(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasMsb(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasMsb(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasNavigationMessages(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasNavigationMessages(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasOnDemandTime(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasOnDemandTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerMultibandAcquisition(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerMultibandAcquisition(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerMultibandTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerMultibandTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerOtherModes(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerOtherModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerSinglebandAcquisition(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerSinglebandAcquisition(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerSinglebandTracking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerSinglebandTracking(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasPowerTotal(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasPowerTotal(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSatelliteBlocklist(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasSatelliteBlocklist(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSatellitePvt(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasSatellitePvt(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasScheduling(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasScheduling(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder setHasSingleShotFix(boolean arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssCapabilities.Builder.wrap(real.setHasSingleShotFix(arg0));
        }

    }
}
