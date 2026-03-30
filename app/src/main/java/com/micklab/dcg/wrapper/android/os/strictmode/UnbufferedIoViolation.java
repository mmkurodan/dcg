// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class UnbufferedIoViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnbufferedIoViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.UnbufferedIoViolation wrap(android.os.strictmode.UnbufferedIoViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.UnbufferedIoViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.UnbufferedIoViolation getReal() {
        return (android.os.strictmode.UnbufferedIoViolation) real;
    }

    public android.os.strictmode.UnbufferedIoViolation unwrap() {
        return getReal();
    }

}
