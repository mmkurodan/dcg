// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GpsSatellite {
    private final android.location.GpsSatellite real;

    public GpsSatellite(android.location.GpsSatellite real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GpsSatellite wrap(android.location.GpsSatellite real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsSatellite(real);
    }

    public android.location.GpsSatellite unwrap() {
        return real;
    }

    public float getAzimuth() {
        return real.getAzimuth();
    }

    public float getElevation() {
        return real.getElevation();
    }

    public int getPrn() {
        return real.getPrn();
    }

    public float getSnr() {
        return real.getSnr();
    }

    public boolean hasAlmanac() {
        return real.hasAlmanac();
    }

    public boolean hasEphemeris() {
        return real.hasEphemeris();
    }

    public boolean usedInFix() {
        return real.usedInFix();
    }

}
