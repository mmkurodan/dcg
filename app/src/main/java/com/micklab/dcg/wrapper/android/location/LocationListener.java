// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationListener {
    private final android.location.LocationListener real;

    public LocationListener(android.location.LocationListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationListener wrap(android.location.LocationListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationListener(real);
    }

    public android.location.LocationListener unwrap() {
        return real;
    }

    public void onFlushComplete(int arg0) {
        real.onFlushComplete(arg0);
    }

    public void onLocationChanged(com.micklab.dcg.wrapper.android.location.Location arg0) {
        real.onLocationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onProviderDisabled(java.lang.String arg0) {
        real.onProviderDisabled(arg0);
    }

    public void onProviderEnabled(java.lang.String arg0) {
        real.onProviderEnabled(arg0);
    }

    public void onStatusChanged(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.onStatusChanged(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

}
