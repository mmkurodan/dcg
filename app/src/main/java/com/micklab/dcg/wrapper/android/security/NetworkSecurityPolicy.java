// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class NetworkSecurityPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkSecurityPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy wrap(android.security.NetworkSecurityPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.security.NetworkSecurityPolicy getReal() {
        return (android.security.NetworkSecurityPolicy) real;
    }

    public android.security.NetworkSecurityPolicy unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy getInstance() {
        return com.micklab.dcg.wrapper.android.security.NetworkSecurityPolicy.wrap(android.security.NetworkSecurityPolicy.getInstance());
    }

    public boolean isCertificateTransparencyVerificationRequired(java.lang.String arg0) {
        return ((android.security.NetworkSecurityPolicy) real).isCertificateTransparencyVerificationRequired(arg0);
    }

    public boolean isCleartextTrafficPermitted() {
        return ((android.security.NetworkSecurityPolicy) real).isCleartextTrafficPermitted();
    }

    public boolean isCleartextTrafficPermitted(java.lang.String arg0) {
        return ((android.security.NetworkSecurityPolicy) real).isCleartextTrafficPermitted(arg0);
    }

}
