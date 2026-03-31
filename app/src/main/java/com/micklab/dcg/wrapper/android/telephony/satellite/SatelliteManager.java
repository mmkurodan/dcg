// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.satellite;

public final class SatelliteManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SatelliteManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteManager wrap(android.telephony.satellite.SatelliteManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.satellite.SatelliteManager getReal() {
        return (android.telephony.satellite.SatelliteManager) real;
    }

    public android.telephony.satellite.SatelliteManager unwrap() {
        return getReal();
    }

    public void registerStateChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteStateChangeListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.satellite.SatelliteManager#registerStateChangeListener(java.util.concurrent.Executor,android.telephony.satellite.SatelliteStateChangeListener)");
    }

    public void unregisterStateChangeListener(com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteStateChangeListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.satellite.SatelliteManager#unregisterStateChangeListener(android.telephony.satellite.SatelliteStateChangeListener)");
    }

}
