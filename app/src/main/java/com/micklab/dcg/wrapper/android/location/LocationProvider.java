// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationProvider {
    private final android.location.LocationProvider real;

    public LocationProvider(android.location.LocationProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationProvider wrap(android.location.LocationProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationProvider(real);
    }

    public android.location.LocationProvider unwrap() {
        return real;
    }

    public int getAccuracy() {
        return real.getAccuracy();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getPowerRequirement() {
        return real.getPowerRequirement();
    }

    public boolean hasMonetaryCost() {
        return real.hasMonetaryCost();
    }

    public boolean meetsCriteria(com.micklab.dcg.wrapper.android.location.Criteria arg0) {
        return real.meetsCriteria(arg0 == null ? null : arg0.unwrap());
    }

    public boolean requiresCell() {
        return real.requiresCell();
    }

    public boolean requiresNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.location.LocationProvider#requiresNetwork()");
    }

    public boolean requiresSatellite() {
        return real.requiresSatellite();
    }

    public boolean supportsAltitude() {
        return real.supportsAltitude();
    }

    public boolean supportsBearing() {
        return real.supportsBearing();
    }

    public boolean supportsSpeed() {
        return real.supportsSpeed();
    }

    public static final int AVAILABLE = android.location.LocationProvider.AVAILABLE;
    public static final int OUT_OF_SERVICE = android.location.LocationProvider.OUT_OF_SERVICE;
    public static final int TEMPORARILY_UNAVAILABLE = android.location.LocationProvider.TEMPORARILY_UNAVAILABLE;

}
