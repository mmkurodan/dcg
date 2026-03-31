// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.satellite;

public final class SatelliteStateChangeListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SatelliteStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteStateChangeListener wrap(android.telephony.satellite.SatelliteStateChangeListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.satellite.SatelliteStateChangeListener(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.satellite.SatelliteStateChangeListener getReal() {
        return (android.telephony.satellite.SatelliteStateChangeListener) real;
    }

    public android.telephony.satellite.SatelliteStateChangeListener unwrap() {
        return getReal();
    }

    public void onEnabledStateChanged(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.satellite.SatelliteStateChangeListener#onEnabledStateChanged(boolean)");
    }

}
