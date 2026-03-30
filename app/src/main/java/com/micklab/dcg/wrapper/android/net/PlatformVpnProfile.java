// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class PlatformVpnProfile {
    private final android.net.PlatformVpnProfile real;

    public PlatformVpnProfile(android.net.PlatformVpnProfile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.PlatformVpnProfile wrap(android.net.PlatformVpnProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.PlatformVpnProfile(real);
    }

    public android.net.PlatformVpnProfile unwrap() {
        return real;
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
