// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GpsSatellite {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GpsSatellite(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GpsSatellite wrap(android.location.GpsSatellite real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsSatellite(real, (__DcgwBridgeToken) null);
    }

    public android.location.GpsSatellite getReal() {
        return (android.location.GpsSatellite) real;
    }

    public android.location.GpsSatellite unwrap() {
        return getReal();
    }

    public float getAzimuth() {
        return ((android.location.GpsSatellite) real).getAzimuth();
    }

    public float getElevation() {
        return ((android.location.GpsSatellite) real).getElevation();
    }

    public int getPrn() {
        return ((android.location.GpsSatellite) real).getPrn();
    }

    public float getSnr() {
        return ((android.location.GpsSatellite) real).getSnr();
    }

    public boolean hasAlmanac() {
        return ((android.location.GpsSatellite) real).hasAlmanac();
    }

    public boolean hasEphemeris() {
        return ((android.location.GpsSatellite) real).hasEphemeris();
    }

    public boolean usedInFix() {
        return ((android.location.GpsSatellite) real).usedInFix();
    }

}
