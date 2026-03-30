// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class CredentialProtectedWhileLockedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialProtectedWhileLockedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.CredentialProtectedWhileLockedViolation wrap(android.os.strictmode.CredentialProtectedWhileLockedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.CredentialProtectedWhileLockedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.CredentialProtectedWhileLockedViolation getReal() {
        return (android.os.strictmode.CredentialProtectedWhileLockedViolation) real;
    }

    public android.os.strictmode.CredentialProtectedWhileLockedViolation unwrap() {
        return getReal();
    }

}
