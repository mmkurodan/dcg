// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.hotspot2;

public final class ConfigParser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfigParser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.hotspot2.ConfigParser wrap(android.net.wifi.hotspot2.ConfigParser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.hotspot2.ConfigParser(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.hotspot2.ConfigParser getReal() {
        return (android.net.wifi.hotspot2.ConfigParser) real;
    }

    public android.net.wifi.hotspot2.ConfigParser unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.hotspot2.PasspointConfiguration parsePasspointConfig(java.lang.String arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.hotspot2.ConfigParser#parsePasspointConfig(java.lang.String,[B)");
    }

}
