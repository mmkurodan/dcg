// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class UnbufferedIoViolation {
    private final android.os.strictmode.UnbufferedIoViolation real;

    public UnbufferedIoViolation(android.os.strictmode.UnbufferedIoViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.UnbufferedIoViolation wrap(android.os.strictmode.UnbufferedIoViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.UnbufferedIoViolation(real);
    }

    public android.os.strictmode.UnbufferedIoViolation unwrap() {
        return real;
    }

}
