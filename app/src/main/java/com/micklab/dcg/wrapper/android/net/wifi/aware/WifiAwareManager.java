// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class WifiAwareManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiAwareManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareManager wrap(android.net.wifi.aware.WifiAwareManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.WifiAwareManager getReal() {
        return (android.net.wifi.aware.WifiAwareManager) real;
    }

    public android.net.wifi.aware.WifiAwareManager unwrap() {
        return getReal();
    }

    public void attach(com.micklab.dcg.wrapper.android.net.wifi.aware.AttachCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#attach(android.net.wifi.aware.AttachCallback,android.os.Handler)");
    }

    public void attach(com.micklab.dcg.wrapper.android.net.wifi.aware.AttachCallback arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.IdentityChangedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#attach(android.net.wifi.aware.AttachCallback,android.net.wifi.aware.IdentityChangedListener,android.os.Handler)");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.aware.AwareResources getAvailableAwareResources() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#getAvailableAwareResources()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.aware.Characteristics getCharacteristics() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#getCharacteristics()");
    }

    public boolean isAvailable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#isAvailable()");
    }

    public boolean isDeviceAttached() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#isDeviceAttached()");
    }

    public boolean isInstantCommunicationModeEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#isInstantCommunicationModeEnabled()");
    }

    public boolean isSetChannelOnDataPathSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#isSetChannelOnDataPathSupported()");
    }

    public void removePairedDevice(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#removePairedDevice(java.lang.String)");
    }

    public void resetPairedDevices() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#resetPairedDevices()");
    }

    public void setOpportunisticModeEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareManager#setOpportunisticModeEnabled(boolean)");
    }


}
