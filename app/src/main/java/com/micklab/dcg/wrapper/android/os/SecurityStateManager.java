// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class SecurityStateManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SecurityStateManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.SecurityStateManager wrap(android.os.SecurityStateManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.SecurityStateManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.SecurityStateManager getReal() {
        return (android.os.SecurityStateManager) real;
    }

    public android.os.SecurityStateManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getGlobalSecurityState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SecurityStateManager#getGlobalSecurityState()");
    }


}
