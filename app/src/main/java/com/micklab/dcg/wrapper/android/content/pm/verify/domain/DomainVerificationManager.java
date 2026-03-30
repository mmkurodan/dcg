// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm.verify.domain;

public final class DomainVerificationManager {
    private final android.content.pm.verify.domain.DomainVerificationManager real;

    public DomainVerificationManager(android.content.pm.verify.domain.DomainVerificationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationManager wrap(android.content.pm.verify.domain.DomainVerificationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationManager(real);
    }

    public android.content.pm.verify.domain.DomainVerificationManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.verify.domain.DomainVerificationManager#getDomainVerificationUserState(java.lang.String)");
    }

}
