// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocationListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationListener wrap(android.location.LocationListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationListener(real, (__DcgwBridgeToken) null);
    }

    public android.location.LocationListener getReal() {
        return (android.location.LocationListener) real;
    }

    public android.location.LocationListener unwrap() {
        return getReal();
    }

    public void onFlushComplete(int arg0) {
        ((android.location.LocationListener) real).onFlushComplete(arg0);
    }

    public void onLocationChanged(com.micklab.dcg.wrapper.android.location.Location arg0) {
        ((android.location.LocationListener) real).onLocationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onProviderDisabled(java.lang.String arg0) {
        ((android.location.LocationListener) real).onProviderDisabled(arg0);
    }

    public void onProviderEnabled(java.lang.String arg0) {
        ((android.location.LocationListener) real).onProviderEnabled(arg0);
    }

    public void onStatusChanged(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.location.LocationListener) real).onStatusChanged(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

}
