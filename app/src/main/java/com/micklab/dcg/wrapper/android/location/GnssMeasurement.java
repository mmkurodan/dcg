// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssMeasurement {
    private final android.location.GnssMeasurement real;

    public GnssMeasurement(android.location.GnssMeasurement real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssMeasurement wrap(android.location.GnssMeasurement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssMeasurement(real);
    }

    public android.location.GnssMeasurement unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public double getAccumulatedDeltaRangeMeters() {
        return real.getAccumulatedDeltaRangeMeters();
    }

    public int getAccumulatedDeltaRangeState() {
        return real.getAccumulatedDeltaRangeState();
    }

    public double getAccumulatedDeltaRangeUncertaintyMeters() {
        return real.getAccumulatedDeltaRangeUncertaintyMeters();
    }

    public double getAutomaticGainControlLevelDb() {
        return real.getAutomaticGainControlLevelDb();
    }

    public double getBasebandCn0DbHz() {
        return real.getBasebandCn0DbHz();
    }

    public long getCarrierCycles() {
        return real.getCarrierCycles();
    }

    public float getCarrierFrequencyHz() {
        return real.getCarrierFrequencyHz();
    }

    public double getCarrierPhase() {
        return real.getCarrierPhase();
    }

    public double getCarrierPhaseUncertainty() {
        return real.getCarrierPhaseUncertainty();
    }

    public double getCn0DbHz() {
        return real.getCn0DbHz();
    }

    public java.lang.String getCodeType() {
        return real.getCodeType();
    }

    public int getConstellationType() {
        return real.getConstellationType();
    }

    public double getFullInterSignalBiasNanos() {
        return real.getFullInterSignalBiasNanos();
    }

    public double getFullInterSignalBiasUncertaintyNanos() {
        return real.getFullInterSignalBiasUncertaintyNanos();
    }

    public int getMultipathIndicator() {
        return real.getMultipathIndicator();
    }

    public double getPseudorangeRateMetersPerSecond() {
        return real.getPseudorangeRateMetersPerSecond();
    }

    public double getPseudorangeRateUncertaintyMetersPerSecond() {
        return real.getPseudorangeRateUncertaintyMetersPerSecond();
    }

    public long getReceivedSvTimeNanos() {
        return real.getReceivedSvTimeNanos();
    }

    public long getReceivedSvTimeUncertaintyNanos() {
        return real.getReceivedSvTimeUncertaintyNanos();
    }

    public double getSatelliteInterSignalBiasNanos() {
        return real.getSatelliteInterSignalBiasNanos();
    }

    public double getSatelliteInterSignalBiasUncertaintyNanos() {
        return real.getSatelliteInterSignalBiasUncertaintyNanos();
    }

    public double getSnrInDb() {
        return real.getSnrInDb();
    }

    public int getState() {
        return real.getState();
    }

    public int getSvid() {
        return real.getSvid();
    }

    public double getTimeOffsetNanos() {
        return real.getTimeOffsetNanos();
    }

    public boolean hasAutomaticGainControlLevelDb() {
        return real.hasAutomaticGainControlLevelDb();
    }

    public boolean hasBasebandCn0DbHz() {
        return real.hasBasebandCn0DbHz();
    }

    public boolean hasCarrierCycles() {
        return real.hasCarrierCycles();
    }

    public boolean hasCarrierFrequencyHz() {
        return real.hasCarrierFrequencyHz();
    }

    public boolean hasCarrierPhase() {
        return real.hasCarrierPhase();
    }

    public boolean hasCarrierPhaseUncertainty() {
        return real.hasCarrierPhaseUncertainty();
    }

    public boolean hasCodeType() {
        return real.hasCodeType();
    }

    public boolean hasFullInterSignalBiasNanos() {
        return real.hasFullInterSignalBiasNanos();
    }

    public boolean hasFullInterSignalBiasUncertaintyNanos() {
        return real.hasFullInterSignalBiasUncertaintyNanos();
    }

    public boolean hasSatelliteInterSignalBiasNanos() {
        return real.hasSatelliteInterSignalBiasNanos();
    }

    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() {
        return real.hasSatelliteInterSignalBiasUncertaintyNanos();
    }

    public boolean hasSnrInDb() {
        return real.hasSnrInDb();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
