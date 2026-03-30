// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocationProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationProvider wrap(android.location.LocationProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationProvider(real, (__DcgwBridgeToken) null);
    }

    public android.location.LocationProvider getReal() {
        return (android.location.LocationProvider) real;
    }

    public android.location.LocationProvider unwrap() {
        return getReal();
    }

    public int getAccuracy() {
        return ((android.location.LocationProvider) real).getAccuracy();
    }

    public java.lang.String getName() {
        return ((android.location.LocationProvider) real).getName();
    }

    public int getPowerRequirement() {
        return ((android.location.LocationProvider) real).getPowerRequirement();
    }

    public boolean hasMonetaryCost() {
        return ((android.location.LocationProvider) real).hasMonetaryCost();
    }

    public boolean meetsCriteria(com.micklab.dcg.wrapper.android.location.Criteria arg0) {
        return ((android.location.LocationProvider) real).meetsCriteria(arg0 == null ? null : arg0.getReal());
    }

    public boolean requiresCell() {
        return ((android.location.LocationProvider) real).requiresCell();
    }

    public boolean requiresNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.LocationProvider#requiresNetwork()");
    }

    public boolean requiresSatellite() {
        return ((android.location.LocationProvider) real).requiresSatellite();
    }

    public boolean supportsAltitude() {
        return ((android.location.LocationProvider) real).supportsAltitude();
    }

    public boolean supportsBearing() {
        return ((android.location.LocationProvider) real).supportsBearing();
    }

    public boolean supportsSpeed() {
        return ((android.location.LocationProvider) real).supportsSpeed();
    }

    public static final int AVAILABLE = android.location.LocationProvider.AVAILABLE;
    public static final int OUT_OF_SERVICE = android.location.LocationProvider.OUT_OF_SERVICE;
    public static final int TEMPORARILY_UNAVAILABLE = android.location.LocationProvider.TEMPORARILY_UNAVAILABLE;

}
