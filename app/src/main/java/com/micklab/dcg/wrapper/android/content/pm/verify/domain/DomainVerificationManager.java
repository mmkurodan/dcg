// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm.verify.domain;

public final class DomainVerificationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DomainVerificationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationManager wrap(android.content.pm.verify.domain.DomainVerificationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationManager(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.verify.domain.DomainVerificationManager getReal() {
        return (android.content.pm.verify.domain.DomainVerificationManager) real;
    }

    public android.content.pm.verify.domain.DomainVerificationManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.verify.domain.DomainVerificationManager#getDomainVerificationUserState(java.lang.String)");
    }

}
