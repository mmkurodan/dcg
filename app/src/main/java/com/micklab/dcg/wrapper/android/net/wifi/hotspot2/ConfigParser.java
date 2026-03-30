// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.hotspot2;

public final class ConfigParser {
    private final android.net.wifi.hotspot2.ConfigParser real;

    public ConfigParser(android.net.wifi.hotspot2.ConfigParser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.hotspot2.ConfigParser wrap(android.net.wifi.hotspot2.ConfigParser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.hotspot2.ConfigParser(real);
    }

    public android.net.wifi.hotspot2.ConfigParser unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.hotspot2.PasspointConfiguration parsePasspointConfig(java.lang.String arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.hotspot2.ConfigParser#parsePasspointConfig(java.lang.String,[B)");
    }

}
