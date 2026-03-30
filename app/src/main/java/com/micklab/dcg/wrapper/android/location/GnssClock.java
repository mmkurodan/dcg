// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssClock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssClock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssClock wrap(android.location.GnssClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssClock(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssClock getReal() {
        return (android.location.GnssClock) real;
    }

    public android.location.GnssClock unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssClock) real).describeContents();
    }

    public double getBiasNanos() {
        return ((android.location.GnssClock) real).getBiasNanos();
    }

    public double getBiasUncertaintyNanos() {
        return ((android.location.GnssClock) real).getBiasUncertaintyNanos();
    }

    public double getDriftNanosPerSecond() {
        return ((android.location.GnssClock) real).getDriftNanosPerSecond();
    }

    public double getDriftUncertaintyNanosPerSecond() {
        return ((android.location.GnssClock) real).getDriftUncertaintyNanosPerSecond();
    }

    public long getElapsedRealtimeNanos() {
        return ((android.location.GnssClock) real).getElapsedRealtimeNanos();
    }

    public double getElapsedRealtimeUncertaintyNanos() {
        return ((android.location.GnssClock) real).getElapsedRealtimeUncertaintyNanos();
    }

    public long getFullBiasNanos() {
        return ((android.location.GnssClock) real).getFullBiasNanos();
    }

    public int getHardwareClockDiscontinuityCount() {
        return ((android.location.GnssClock) real).getHardwareClockDiscontinuityCount();
    }

    public int getLeapSecond() {
        return ((android.location.GnssClock) real).getLeapSecond();
    }

    public double getReferenceCarrierFrequencyHzForIsb() {
        return ((android.location.GnssClock) real).getReferenceCarrierFrequencyHzForIsb();
    }

    public java.lang.String getReferenceCodeTypeForIsb() {
        return ((android.location.GnssClock) real).getReferenceCodeTypeForIsb();
    }

    public int getReferenceConstellationTypeForIsb() {
        return ((android.location.GnssClock) real).getReferenceConstellationTypeForIsb();
    }

    public long getTimeNanos() {
        return ((android.location.GnssClock) real).getTimeNanos();
    }

    public double getTimeUncertaintyNanos() {
        return ((android.location.GnssClock) real).getTimeUncertaintyNanos();
    }

    public boolean hasBiasNanos() {
        return ((android.location.GnssClock) real).hasBiasNanos();
    }

    public boolean hasBiasUncertaintyNanos() {
        return ((android.location.GnssClock) real).hasBiasUncertaintyNanos();
    }

    public boolean hasDriftNanosPerSecond() {
        return ((android.location.GnssClock) real).hasDriftNanosPerSecond();
    }

    public boolean hasDriftUncertaintyNanosPerSecond() {
        return ((android.location.GnssClock) real).hasDriftUncertaintyNanosPerSecond();
    }

    public boolean hasElapsedRealtimeNanos() {
        return ((android.location.GnssClock) real).hasElapsedRealtimeNanos();
    }

    public boolean hasElapsedRealtimeUncertaintyNanos() {
        return ((android.location.GnssClock) real).hasElapsedRealtimeUncertaintyNanos();
    }

    public boolean hasFullBiasNanos() {
        return ((android.location.GnssClock) real).hasFullBiasNanos();
    }

    public boolean hasLeapSecond() {
        return ((android.location.GnssClock) real).hasLeapSecond();
    }

    public boolean hasReferenceCarrierFrequencyHzForIsb() {
        return ((android.location.GnssClock) real).hasReferenceCarrierFrequencyHzForIsb();
    }

    public boolean hasReferenceCodeTypeForIsb() {
        return ((android.location.GnssClock) real).hasReferenceCodeTypeForIsb();
    }

    public boolean hasReferenceConstellationTypeForIsb() {
        return ((android.location.GnssClock) real).hasReferenceConstellationTypeForIsb();
    }

    public boolean hasTimeUncertaintyNanos() {
        return ((android.location.GnssClock) real).hasTimeUncertaintyNanos();
    }

    public java.lang.String toString() {
        return ((android.location.GnssClock) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssClock) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
