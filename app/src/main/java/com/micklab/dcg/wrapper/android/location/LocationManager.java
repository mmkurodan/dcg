// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationManager {
    private final android.location.LocationManager real;

    public LocationManager(android.location.LocationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationManager wrap(android.location.LocationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationManager(real);
    }

    public android.location.LocationManager unwrap() {
        return real;
    }

    public boolean addGpsStatusListener(com.micklab.dcg.wrapper.android.location.GpsStatus.Listener arg0) {
        return real.addGpsStatusListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener arg0) {
        return real.addNmeaListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0) {
        return real.addNmeaListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return real.addNmeaListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean addNmeaListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg1) {
        return real.addNmeaListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addProximityAlert(double arg0, double arg1, float arg2, long arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        real.addProximityAlert(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void addTestProvider(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.provider.ProviderProperties arg1) {
        real.addTestProvider(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addTestProvider(java.lang.String arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, int arg8, int arg9) {
        real.addTestProvider(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public void clearTestProviderEnabled(java.lang.String arg0) {
        real.clearTestProviderEnabled(arg0);
    }

    public void clearTestProviderLocation(java.lang.String arg0) {
        real.clearTestProviderLocation(arg0);
    }

    public void clearTestProviderStatus(java.lang.String arg0) {
        real.clearTestProviderStatus(arg0);
    }

    public java.lang.String getBestProvider(com.micklab.dcg.wrapper.android.location.Criteria arg0, boolean arg1) {
        return real.getBestProvider(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.location.GnssCapabilities getGnssCapabilities() {
        return com.micklab.dcg.wrapper.android.location.GnssCapabilities.wrap(real.getGnssCapabilities());
    }

    public java.lang.String getGnssHardwareModelName() {
        return real.getGnssHardwareModelName();
    }

    public int getGnssYearOfHardware() {
        return real.getGnssYearOfHardware();
    }

    public com.micklab.dcg.wrapper.android.location.GpsStatus getGpsStatus(com.micklab.dcg.wrapper.android.location.GpsStatus arg0) {
        return com.micklab.dcg.wrapper.android.location.GpsStatus.wrap(real.getGpsStatus(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.location.Location getLastKnownLocation(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.Location.wrap(real.getLastKnownLocation(arg0));
    }

    public com.micklab.dcg.wrapper.android.location.LocationProvider getProvider(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.LocationProvider.wrap(real.getProvider(arg0));
    }

    public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties getProviderProperties(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.wrap(real.getProviderProperties(arg0));
    }

    public boolean hasProvider(java.lang.String arg0) {
        return real.hasProvider(arg0);
    }

    public boolean isLocationEnabled() {
        return real.isLocationEnabled();
    }

    public boolean isProviderEnabled(java.lang.String arg0) {
        return real.isProviderEnabled(arg0);
    }

    public boolean registerAntennaInfoListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener arg1) {
        return real.registerAntennaInfoListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0) {
        return real.registerGnssMeasurementsCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return real.registerGnssMeasurementsCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssMeasurementsCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg1) {
        return real.registerGnssMeasurementsCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg2) {
        return real.registerGnssMeasurementsCallback(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean registerGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0) {
        return real.registerGnssNavigationMessageCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean registerGnssNavigationMessageCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg1) {
        return real.registerGnssNavigationMessageCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return real.registerGnssNavigationMessageCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0) {
        return real.registerGnssStatusCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean registerGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return real.registerGnssStatusCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean registerGnssStatusCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg1) {
        return real.registerGnssStatusCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void removeGpsStatusListener(com.micklab.dcg.wrapper.android.location.GpsStatus.Listener arg0) {
        real.removeGpsStatusListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0) {
        real.removeNmeaListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeNmeaListener(com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener arg0) {
        real.removeNmeaListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeProximityAlert(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.removeProximityAlert(arg0 == null ? null : arg0.unwrap());
    }

    public void removeTestProvider(java.lang.String arg0) {
        real.removeTestProvider(arg0);
    }

    public void removeUpdates(com.micklab.dcg.wrapper.android.location.LocationListener arg0) {
        real.removeUpdates(arg0 == null ? null : arg0.unwrap());
    }

    public void removeUpdates(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.removeUpdates(arg0 == null ? null : arg0.unwrap());
    }

    public void requestFlush(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, int arg2) {
        real.requestFlush(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void requestFlush(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, int arg2) {
        real.requestFlush(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void requestLocationUpdates(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationRequest arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        real.requestLocationUpdates(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        real.requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        real.requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void requestLocationUpdates(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationRequest arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3) {
        real.requestLocationUpdates(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3) {
        real.requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3, com.micklab.dcg.wrapper.android.os.Looper arg4) {
        real.requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.location.LocationListener arg4) {
        real.requestLocationUpdates(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3, com.micklab.dcg.wrapper.android.os.Looper arg4) {
        real.requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.location.LocationListener arg4) {
        real.requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void requestSingleUpdate(com.micklab.dcg.wrapper.android.location.Criteria arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.requestSingleUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void requestSingleUpdate(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.requestSingleUpdate(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void requestSingleUpdate(com.micklab.dcg.wrapper.android.location.Criteria arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) {
        real.requestSingleUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void requestSingleUpdate(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) {
        real.requestSingleUpdate(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean sendExtraCommand(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.sendExtraCommand(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setTestProviderEnabled(java.lang.String arg0, boolean arg1) {
        real.setTestProviderEnabled(arg0, arg1);
    }

    public void setTestProviderLocation(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.Location arg1) {
        real.setTestProviderLocation(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTestProviderStatus(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, long arg3) {
        real.setTestProviderStatus(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void unregisterAntennaInfoListener(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener arg0) {
        real.unregisterAntennaInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0) {
        real.unregisterGnssMeasurementsCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0) {
        real.unregisterGnssNavigationMessageCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0) {
        real.unregisterGnssStatusCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_GNSS_CAPABILITIES_CHANGED = android.location.LocationManager.ACTION_GNSS_CAPABILITIES_CHANGED;
    public static final java.lang.String EXTRA_GNSS_CAPABILITIES = android.location.LocationManager.EXTRA_GNSS_CAPABILITIES;
    public static final java.lang.String EXTRA_LOCATION_ENABLED = android.location.LocationManager.EXTRA_LOCATION_ENABLED;
    public static final java.lang.String EXTRA_PROVIDER_ENABLED = android.location.LocationManager.EXTRA_PROVIDER_ENABLED;
    public static final java.lang.String EXTRA_PROVIDER_NAME = android.location.LocationManager.EXTRA_PROVIDER_NAME;
    public static final java.lang.String FUSED_PROVIDER = android.location.LocationManager.FUSED_PROVIDER;
    public static final java.lang.String GPS_PROVIDER = android.location.LocationManager.GPS_PROVIDER;
    public static final java.lang.String KEY_FLUSH_COMPLETE = android.location.LocationManager.KEY_FLUSH_COMPLETE;
    public static final java.lang.String KEY_LOCATIONS = android.location.LocationManager.KEY_LOCATIONS;
    public static final java.lang.String KEY_LOCATION_CHANGED = android.location.LocationManager.KEY_LOCATION_CHANGED;
    public static final java.lang.String KEY_PROVIDER_ENABLED = android.location.LocationManager.KEY_PROVIDER_ENABLED;
    public static final java.lang.String KEY_PROXIMITY_ENTERING = android.location.LocationManager.KEY_PROXIMITY_ENTERING;
    public static final java.lang.String KEY_STATUS_CHANGED = android.location.LocationManager.KEY_STATUS_CHANGED;
    public static final java.lang.String MODE_CHANGED_ACTION = android.location.LocationManager.MODE_CHANGED_ACTION;
    public static final java.lang.String PASSIVE_PROVIDER = android.location.LocationManager.PASSIVE_PROVIDER;
    public static final java.lang.String PROVIDERS_CHANGED_ACTION = android.location.LocationManager.PROVIDERS_CHANGED_ACTION;

}
