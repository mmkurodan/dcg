// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class PlatformVpnProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlatformVpnProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.PlatformVpnProfile wrap(android.net.PlatformVpnProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.PlatformVpnProfile(real, (__DcgwBridgeToken) null);
    }

    public android.net.PlatformVpnProfile getReal() {
        return (android.net.PlatformVpnProfile) real;
    }

    public android.net.PlatformVpnProfile unwrap() {
        return getReal();
    }

    public boolean areLocalRoutesExcluded() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.PlatformVpnProfile#areLocalRoutesExcluded()");
    }

    public int getType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.PlatformVpnProfile#getType()");
    }

    public java.lang.String getTypeString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.PlatformVpnProfile#getTypeString()");
    }

    public boolean isInternetValidationRequired() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.PlatformVpnProfile#isInternetValidationRequired()");
    }


}
