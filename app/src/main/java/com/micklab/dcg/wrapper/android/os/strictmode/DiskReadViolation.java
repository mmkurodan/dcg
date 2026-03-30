// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class DiskReadViolation {
    private final android.os.strictmode.DiskReadViolation real;

    public DiskReadViolation(android.os.strictmode.DiskReadViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.DiskReadViolation wrap(android.os.strictmode.DiskReadViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.DiskReadViolation(real);
    }

    public android.os.strictmode.DiskReadViolation unwrap() {
        return real;
    }

}
