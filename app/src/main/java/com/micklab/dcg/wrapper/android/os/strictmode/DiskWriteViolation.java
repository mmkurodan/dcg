// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class DiskWriteViolation {
    private final android.os.strictmode.DiskWriteViolation real;

    public DiskWriteViolation(android.os.strictmode.DiskWriteViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.DiskWriteViolation wrap(android.os.strictmode.DiskWriteViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.DiskWriteViolation(real);
    }

    public android.os.strictmode.DiskWriteViolation unwrap() {
        return real;
    }

}
