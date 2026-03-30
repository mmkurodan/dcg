// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class SecurityStateManager {
    private final android.os.SecurityStateManager real;

    public SecurityStateManager(android.os.SecurityStateManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.SecurityStateManager wrap(android.os.SecurityStateManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.SecurityStateManager(real);
    }

    public android.os.SecurityStateManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getGlobalSecurityState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SecurityStateManager#getGlobalSecurityState()");
    }


}
