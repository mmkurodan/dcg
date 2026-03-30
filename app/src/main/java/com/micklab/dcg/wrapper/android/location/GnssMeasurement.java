// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurement {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssMeasurement(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurement wrap(android.location.GnssMeasurement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurement(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssMeasurement getReal() {
        return (android.location.GnssMeasurement) real;
    }

    public android.location.GnssMeasurement unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssMeasurement) real).describeContents();
    }

    public double getAccumulatedDeltaRangeMeters() {
        return ((android.location.GnssMeasurement) real).getAccumulatedDeltaRangeMeters();
    }

    public int getAccumulatedDeltaRangeState() {
        return ((android.location.GnssMeasurement) real).getAccumulatedDeltaRangeState();
    }

    public double getAccumulatedDeltaRangeUncertaintyMeters() {
        return ((android.location.GnssMeasurement) real).getAccumulatedDeltaRangeUncertaintyMeters();
    }

    public double getAutomaticGainControlLevelDb() {
        return ((android.location.GnssMeasurement) real).getAutomaticGainControlLevelDb();
    }

    public double getBasebandCn0DbHz() {
        return ((android.location.GnssMeasurement) real).getBasebandCn0DbHz();
    }

    public long getCarrierCycles() {
        return ((android.location.GnssMeasurement) real).getCarrierCycles();
    }

    public float getCarrierFrequencyHz() {
        return ((android.location.GnssMeasurement) real).getCarrierFrequencyHz();
    }

    public double getCarrierPhase() {
        return ((android.location.GnssMeasurement) real).getCarrierPhase();
    }

    public double getCarrierPhaseUncertainty() {
        return ((android.location.GnssMeasurement) real).getCarrierPhaseUncertainty();
    }

    public double getCn0DbHz() {
        return ((android.location.GnssMeasurement) real).getCn0DbHz();
    }

    public java.lang.String getCodeType() {
        return ((android.location.GnssMeasurement) real).getCodeType();
    }

    public int getConstellationType() {
        return ((android.location.GnssMeasurement) real).getConstellationType();
    }

    public double getFullInterSignalBiasNanos() {
        return ((android.location.GnssMeasurement) real).getFullInterSignalBiasNanos();
    }

    public double getFullInterSignalBiasUncertaintyNanos() {
        return ((android.location.GnssMeasurement) real).getFullInterSignalBiasUncertaintyNanos();
    }

    public int getMultipathIndicator() {
        return ((android.location.GnssMeasurement) real).getMultipathIndicator();
    }

    public double getPseudorangeRateMetersPerSecond() {
        return ((android.location.GnssMeasurement) real).getPseudorangeRateMetersPerSecond();
    }

    public double getPseudorangeRateUncertaintyMetersPerSecond() {
        return ((android.location.GnssMeasurement) real).getPseudorangeRateUncertaintyMetersPerSecond();
    }

    public long getReceivedSvTimeNanos() {
        return ((android.location.GnssMeasurement) real).getReceivedSvTimeNanos();
    }

    public long getReceivedSvTimeUncertaintyNanos() {
        return ((android.location.GnssMeasurement) real).getReceivedSvTimeUncertaintyNanos();
    }

    public double getSatelliteInterSignalBiasNanos() {
        return ((android.location.GnssMeasurement) real).getSatelliteInterSignalBiasNanos();
    }

    public double getSatelliteInterSignalBiasUncertaintyNanos() {
        return ((android.location.GnssMeasurement) real).getSatelliteInterSignalBiasUncertaintyNanos();
    }

    public double getSnrInDb() {
        return ((android.location.GnssMeasurement) real).getSnrInDb();
    }

    public int getState() {
        return ((android.location.GnssMeasurement) real).getState();
    }

    public int getSvid() {
        return ((android.location.GnssMeasurement) real).getSvid();
    }

    public double getTimeOffsetNanos() {
        return ((android.location.GnssMeasurement) real).getTimeOffsetNanos();
    }

    public boolean hasAutomaticGainControlLevelDb() {
        return ((android.location.GnssMeasurement) real).hasAutomaticGainControlLevelDb();
    }

    public boolean hasBasebandCn0DbHz() {
        return ((android.location.GnssMeasurement) real).hasBasebandCn0DbHz();
    }

    public boolean hasCarrierCycles() {
        return ((android.location.GnssMeasurement) real).hasCarrierCycles();
    }

    public boolean hasCarrierFrequencyHz() {
        return ((android.location.GnssMeasurement) real).hasCarrierFrequencyHz();
    }

    public boolean hasCarrierPhase() {
        return ((android.location.GnssMeasurement) real).hasCarrierPhase();
    }

    public boolean hasCarrierPhaseUncertainty() {
        return ((android.location.GnssMeasurement) real).hasCarrierPhaseUncertainty();
    }

    public boolean hasCodeType() {
        return ((android.location.GnssMeasurement) real).hasCodeType();
    }

    public boolean hasFullInterSignalBiasNanos() {
        return ((android.location.GnssMeasurement) real).hasFullInterSignalBiasNanos();
    }

    public boolean hasFullInterSignalBiasUncertaintyNanos() {
        return ((android.location.GnssMeasurement) real).hasFullInterSignalBiasUncertaintyNanos();
    }

    public boolean hasSatelliteInterSignalBiasNanos() {
        return ((android.location.GnssMeasurement) real).hasSatelliteInterSignalBiasNanos();
    }

    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() {
        return ((android.location.GnssMeasurement) real).hasSatelliteInterSignalBiasUncertaintyNanos();
    }

    public boolean hasSnrInDb() {
        return ((android.location.GnssMeasurement) real).hasSnrInDb();
    }

    public java.lang.String toString() {
        return ((android.location.GnssMeasurement) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssMeasurement) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ADR_STATE_CYCLE_SLIP = android.location.GnssMeasurement.ADR_STATE_CYCLE_SLIP;
    public static final int ADR_STATE_HALF_CYCLE_REPORTED = android.location.GnssMeasurement.ADR_STATE_HALF_CYCLE_REPORTED;
    public static final int ADR_STATE_HALF_CYCLE_RESOLVED = android.location.GnssMeasurement.ADR_STATE_HALF_CYCLE_RESOLVED;
    public static final int ADR_STATE_RESET = android.location.GnssMeasurement.ADR_STATE_RESET;
    public static final int ADR_STATE_UNKNOWN = android.location.GnssMeasurement.ADR_STATE_UNKNOWN;
    public static final int ADR_STATE_VALID = android.location.GnssMeasurement.ADR_STATE_VALID;
    public static final int MULTIPATH_INDICATOR_DETECTED = android.location.GnssMeasurement.MULTIPATH_INDICATOR_DETECTED;
    public static final int MULTIPATH_INDICATOR_NOT_DETECTED = android.location.GnssMeasurement.MULTIPATH_INDICATOR_NOT_DETECTED;
    public static final int MULTIPATH_INDICATOR_UNKNOWN = android.location.GnssMeasurement.MULTIPATH_INDICATOR_UNKNOWN;
    public static final int STATE_2ND_CODE_LOCK = android.location.GnssMeasurement.STATE_2ND_CODE_LOCK;
    public static final int STATE_BDS_D2_BIT_SYNC = android.location.GnssMeasurement.STATE_BDS_D2_BIT_SYNC;
    public static final int STATE_BDS_D2_SUBFRAME_SYNC = android.location.GnssMeasurement.STATE_BDS_D2_SUBFRAME_SYNC;
    public static final int STATE_BIT_SYNC = android.location.GnssMeasurement.STATE_BIT_SYNC;
    public static final int STATE_CODE_LOCK = android.location.GnssMeasurement.STATE_CODE_LOCK;
    public static final int STATE_GAL_E1BC_CODE_LOCK = android.location.GnssMeasurement.STATE_GAL_E1BC_CODE_LOCK;
    public static final int STATE_GAL_E1B_PAGE_SYNC = android.location.GnssMeasurement.STATE_GAL_E1B_PAGE_SYNC;
    public static final int STATE_GAL_E1C_2ND_CODE_LOCK = android.location.GnssMeasurement.STATE_GAL_E1C_2ND_CODE_LOCK;
    public static final int STATE_GLO_STRING_SYNC = android.location.GnssMeasurement.STATE_GLO_STRING_SYNC;
    public static final int STATE_GLO_TOD_DECODED = android.location.GnssMeasurement.STATE_GLO_TOD_DECODED;
    public static final int STATE_GLO_TOD_KNOWN = android.location.GnssMeasurement.STATE_GLO_TOD_KNOWN;
    public static final int STATE_MSEC_AMBIGUOUS = android.location.GnssMeasurement.STATE_MSEC_AMBIGUOUS;
    public static final int STATE_SBAS_SYNC = android.location.GnssMeasurement.STATE_SBAS_SYNC;
    public static final int STATE_SUBFRAME_SYNC = android.location.GnssMeasurement.STATE_SUBFRAME_SYNC;
    public static final int STATE_SYMBOL_SYNC = android.location.GnssMeasurement.STATE_SYMBOL_SYNC;
    public static final int STATE_TOW_DECODED = android.location.GnssMeasurement.STATE_TOW_DECODED;
    public static final int STATE_TOW_KNOWN = android.location.GnssMeasurement.STATE_TOW_KNOWN;
    public static final int STATE_UNKNOWN = android.location.GnssMeasurement.STATE_UNKNOWN;

}
