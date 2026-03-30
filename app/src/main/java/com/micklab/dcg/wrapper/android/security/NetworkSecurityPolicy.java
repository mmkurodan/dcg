// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class NetworkSecurityPolicy {
    private final android.security.NetworkSecurityPolicy real;

    public NetworkSecurityPolicy(android.security.NetworkSecurityPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy wrap(android.security.NetworkSecurityPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy(real);
    }

    public android.security.NetworkSecurityPolicy unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy getInstance() {
        return com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy.wrap(android.security.NetworkSecurityPolicy.getInstance());
    }

    public boolean isCleartextTrafficPermitted() {
        return real.isCleartextTrafficPermitted();
    }

    public boolean isCleartextTrafficPermitted(java.lang.String arg0) {
        return real.isCleartextTrafficPermitted(arg0);
    }

}
