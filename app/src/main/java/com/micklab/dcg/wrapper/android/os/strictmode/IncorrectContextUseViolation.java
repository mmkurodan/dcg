// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class IncorrectContextUseViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IncorrectContextUseViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.IncorrectContextUseViolation wrap(android.os.strictmode.IncorrectContextUseViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.IncorrectContextUseViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.IncorrectContextUseViolation getReal() {
        return (android.os.strictmode.IncorrectContextUseViolation) real;
    }

    public android.os.strictmode.IncorrectContextUseViolation unwrap() {
        return getReal();
    }

    public IncorrectContextUseViolation(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.IncorrectContextUseViolation#android.os.strictmode.IncorrectContextUseViolation(java.lang.String,java.lang.Throwable)");
    }

}
