// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssClock {
    private final android.location.GnssClock real;

    public GnssClock(android.location.GnssClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssClock wrap(android.location.GnssClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssClock(real);
    }

    public android.location.GnssClock unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public double getBiasNanos() {
        return real.getBiasNanos();
    }

    public double getBiasUncertaintyNanos() {
        return real.getBiasUncertaintyNanos();
    }

    public double getDriftNanosPerSecond() {
        return real.getDriftNanosPerSecond();
    }

    public double getDriftUncertaintyNanosPerSecond() {
        return real.getDriftUncertaintyNanosPerSecond();
    }

    public long getElapsedRealtimeNanos() {
        return real.getElapsedRealtimeNanos();
    }

    public double getElapsedRealtimeUncertaintyNanos() {
        return real.getElapsedRealtimeUncertaintyNanos();
    }

    public long getFullBiasNanos() {
        return real.getFullBiasNanos();
    }

    public int getHardwareClockDiscontinuityCount() {
        return real.getHardwareClockDiscontinuityCount();
    }

    public int getLeapSecond() {
        return real.getLeapSecond();
    }

    public double getReferenceCarrierFrequencyHzForIsb() {
        return real.getReferenceCarrierFrequencyHzForIsb();
    }

    public java.lang.String getReferenceCodeTypeForIsb() {
        return real.getReferenceCodeTypeForIsb();
    }

    public int getReferenceConstellationTypeForIsb() {
        return real.getReferenceConstellationTypeForIsb();
    }

    public long getTimeNanos() {
        return real.getTimeNanos();
    }

    public double getTimeUncertaintyNanos() {
        return real.getTimeUncertaintyNanos();
    }

    public boolean hasBiasNanos() {
        return real.hasBiasNanos();
    }

    public boolean hasBiasUncertaintyNanos() {
        return real.hasBiasUncertaintyNanos();
    }

    public boolean hasDriftNanosPerSecond() {
        return real.hasDriftNanosPerSecond();
    }

    public boolean hasDriftUncertaintyNanosPerSecond() {
        return real.hasDriftUncertaintyNanosPerSecond();
    }

    public boolean hasElapsedRealtimeNanos() {
        return real.hasElapsedRealtimeNanos();
    }

    public boolean hasElapsedRealtimeUncertaintyNanos() {
        return real.hasElapsedRealtimeUncertaintyNanos();
    }

    public boolean hasFullBiasNanos() {
        return real.hasFullBiasNanos();
    }

    public boolean hasLeapSecond() {
        return real.hasLeapSecond();
    }

    public boolean hasReferenceCarrierFrequencyHzForIsb() {
        return real.hasReferenceCarrierFrequencyHzForIsb();
    }

    public boolean hasReferenceCodeTypeForIsb() {
        return real.hasReferenceCodeTypeForIsb();
    }

    public boolean hasReferenceConstellationTypeForIsb() {
        return real.hasReferenceConstellationTypeForIsb();
    }

    public boolean hasTimeUncertaintyNanos() {
        return real.hasTimeUncertaintyNanos();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
