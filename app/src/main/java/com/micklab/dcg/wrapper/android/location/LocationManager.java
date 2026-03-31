// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class LocationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.LocationManager wrap(android.location.LocationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.LocationManager(real, (__DcgwBridgeToken) null);
    }

    public android.location.LocationManager getReal() {
        return (android.location.LocationManager) real;
    }

    public android.location.LocationManager unwrap() {
        return getReal();
    }

    public boolean addGpsStatusListener(com.micklab.dcg.wrapper.android.location.GpsStatus.Listener arg0) {
        return ((android.location.LocationManager) real).addGpsStatusListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener arg0) {
        return ((android.location.LocationManager) real).addNmeaListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0) {
        return ((android.location.LocationManager) real).addNmeaListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean addNmeaListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg1) {
        return ((android.location.LocationManager) real).addNmeaListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean addNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return ((android.location.LocationManager) real).addNmeaListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addProximityAlert(double arg0, double arg1, float arg2, long arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        ((android.location.LocationManager) real).addProximityAlert(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void addTestProvider(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.provider.ProviderProperties arg1) {
        ((android.location.LocationManager) real).addTestProvider(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addTestProvider(java.lang.String arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, int arg8, int arg9) {
        ((android.location.LocationManager) real).addTestProvider(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public void clearTestProviderEnabled(java.lang.String arg0) {
        ((android.location.LocationManager) real).clearTestProviderEnabled(arg0);
    }

    public void clearTestProviderLocation(java.lang.String arg0) {
        ((android.location.LocationManager) real).clearTestProviderLocation(arg0);
    }

    public void clearTestProviderStatus(java.lang.String arg0) {
        ((android.location.LocationManager) real).clearTestProviderStatus(arg0);
    }

    public java.lang.String getBestProvider(com.micklab.dcg.wrapper.android.location.Criteria arg0, boolean arg1) {
        return ((android.location.LocationManager) real).getBestProvider(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.location.GnssCapabilities getGnssCapabilities() {
        return com.micklab.dcg.wrapper.android.location.GnssCapabilities.wrap(((android.location.LocationManager) real).getGnssCapabilities());
    }

    public java.lang.String getGnssHardwareModelName() {
        return ((android.location.LocationManager) real).getGnssHardwareModelName();
    }

    public int getGnssYearOfHardware() {
        return ((android.location.LocationManager) real).getGnssYearOfHardware();
    }

    public com.micklab.dcg.wrapper.android.location.GpsStatus getGpsStatus(com.micklab.dcg.wrapper.android.location.GpsStatus arg0) {
        return com.micklab.dcg.wrapper.android.location.GpsStatus.wrap(((android.location.LocationManager) real).getGpsStatus(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.location.Location getLastKnownLocation(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.Location.wrap(((android.location.LocationManager) real).getLastKnownLocation(arg0));
    }

    public com.micklab.dcg.wrapper.android.location.LocationProvider getProvider(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.LocationProvider.wrap(((android.location.LocationManager) real).getProvider(arg0));
    }

    public com.micklab.dcg.wrapper.android.location.provider.ProviderProperties getProviderProperties(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.location.provider.ProviderProperties.wrap(((android.location.LocationManager) real).getProviderProperties(arg0));
    }

    public boolean hasProvider(java.lang.String arg0) {
        return ((android.location.LocationManager) real).hasProvider(arg0);
    }

    public boolean isLocationEnabled() {
        return ((android.location.LocationManager) real).isLocationEnabled();
    }

    public boolean isProviderEnabled(java.lang.String arg0) {
        return ((android.location.LocationManager) real).isProviderEnabled(arg0);
    }

    public boolean registerAntennaInfoListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener arg1) {
        return ((android.location.LocationManager) real).registerAntennaInfoListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0) {
        return ((android.location.LocationManager) real).registerGnssMeasurementsCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return ((android.location.LocationManager) real).registerGnssMeasurementsCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssMeasurementsCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg1) {
        return ((android.location.LocationManager) real).registerGnssMeasurementsCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg2) {
        return ((android.location.LocationManager) real).registerGnssMeasurementsCallback(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean registerGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0) {
        return ((android.location.LocationManager) real).registerGnssNavigationMessageCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean registerGnssNavigationMessageCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg1) {
        return ((android.location.LocationManager) real).registerGnssNavigationMessageCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return ((android.location.LocationManager) real).registerGnssNavigationMessageCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0) {
        return ((android.location.LocationManager) real).registerGnssStatusCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean registerGnssStatusCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg1) {
        return ((android.location.LocationManager) real).registerGnssStatusCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean registerGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        return ((android.location.LocationManager) real).registerGnssStatusCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void removeGpsStatusListener(com.micklab.dcg.wrapper.android.location.GpsStatus.Listener arg0) {
        ((android.location.LocationManager) real).removeGpsStatusListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeNmeaListener(com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener arg0) {
        ((android.location.LocationManager) real).removeNmeaListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeNmeaListener(com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener arg0) {
        ((android.location.LocationManager) real).removeNmeaListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeProximityAlert(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.location.LocationManager) real).removeProximityAlert(arg0 == null ? null : arg0.getReal());
    }

    public void removeTestProvider(java.lang.String arg0) {
        ((android.location.LocationManager) real).removeTestProvider(arg0);
    }

    public void removeUpdates(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.location.LocationManager) real).removeUpdates(arg0 == null ? null : arg0.getReal());
    }

    public void removeUpdates(com.micklab.dcg.wrapper.android.location.LocationListener arg0) {
        ((android.location.LocationManager) real).removeUpdates(arg0 == null ? null : arg0.getReal());
    }

    public void requestFlush(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, int arg2) {
        ((android.location.LocationManager) real).requestFlush(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void requestFlush(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, int arg2) {
        ((android.location.LocationManager) real).requestFlush(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void requestLocationUpdates(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationRequest arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void requestLocationUpdates(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationRequest arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3, com.micklab.dcg.wrapper.android.os.Looper arg4) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void requestLocationUpdates(java.lang.String arg0, long arg1, float arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.location.LocationListener arg4) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.location.LocationListener arg4) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void requestLocationUpdates(long arg0, float arg1, com.micklab.dcg.wrapper.android.location.Criteria arg2, com.micklab.dcg.wrapper.android.location.LocationListener arg3, com.micklab.dcg.wrapper.android.os.Looper arg4) {
        ((android.location.LocationManager) real).requestLocationUpdates(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void requestSingleUpdate(com.micklab.dcg.wrapper.android.location.Criteria arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        ((android.location.LocationManager) real).requestSingleUpdate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void requestSingleUpdate(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        ((android.location.LocationManager) real).requestSingleUpdate(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void requestSingleUpdate(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) {
        ((android.location.LocationManager) real).requestSingleUpdate(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void requestSingleUpdate(com.micklab.dcg.wrapper.android.location.Criteria arg0, com.micklab.dcg.wrapper.android.location.LocationListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) {
        ((android.location.LocationManager) real).requestSingleUpdate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean sendExtraCommand(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.location.LocationManager) real).sendExtraCommand(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setTestProviderEnabled(java.lang.String arg0, boolean arg1) {
        ((android.location.LocationManager) real).setTestProviderEnabled(arg0, arg1);
    }

    public void setTestProviderLocation(java.lang.String arg0, com.micklab.dcg.wrapper.android.location.Location arg1) {
        ((android.location.LocationManager) real).setTestProviderLocation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTestProviderStatus(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, long arg3) {
        ((android.location.LocationManager) real).setTestProviderStatus(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void unregisterAntennaInfoListener(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener arg0) {
        ((android.location.LocationManager) real).unregisterAntennaInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterGnssMeasurementsCallback(com.micklab.dcg.wrapper.android.location.GnssMeasurementsEvent.Callback arg0) {
        ((android.location.LocationManager) real).unregisterGnssMeasurementsCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterGnssNavigationMessageCallback(com.micklab.dcg.wrapper.android.location.GnssNavigationMessage.Callback arg0) {
        ((android.location.LocationManager) real).unregisterGnssNavigationMessageCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterGnssStatusCallback(com.micklab.dcg.wrapper.android.location.GnssStatus.Callback arg0) {
        ((android.location.LocationManager) real).unregisterGnssStatusCallback(arg0 == null ? null : arg0.getReal());
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
