// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class VpnManager {
    private final android.net.VpnManager real;

    public VpnManager(android.net.VpnManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.VpnManager wrap(android.net.VpnManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.VpnManager(real);
    }

    public android.net.VpnManager unwrap() {
        return real;
    }

    public void deleteProvisionedVpnProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#deleteProvisionedVpnProfile()");
    }

    public com.micklab.dcg.wrapper.android.net.VpnProfileState getProvisionedVpnProfileState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#getProvisionedVpnProfileState()");
    }

    public com.micklab.dcg.wrapper.android.content.Intent provisionVpnProfile(com.micklab.dcg.wrapper.android.net.PlatformVpnProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#provisionVpnProfile(android.net.PlatformVpnProfile)");
    }

    public void startProvisionedVpnProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#startProvisionedVpnProfile()");
    }

    public java.lang.String startProvisionedVpnProfileSession() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#startProvisionedVpnProfileSession()");
    }

    public void stopProvisionedVpnProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnManager#stopProvisionedVpnProfile()");
    }


}
