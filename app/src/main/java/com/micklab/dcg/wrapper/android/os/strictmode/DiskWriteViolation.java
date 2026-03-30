// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class DiskWriteViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DiskWriteViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.DiskWriteViolation wrap(android.os.strictmode.DiskWriteViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.DiskWriteViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.DiskWriteViolation getReal() {
        return (android.os.strictmode.DiskWriteViolation) real;
    }

    public android.os.strictmode.DiskWriteViolation unwrap() {
        return getReal();
    }

}
