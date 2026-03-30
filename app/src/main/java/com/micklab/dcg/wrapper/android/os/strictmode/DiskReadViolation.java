// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class DiskReadViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DiskReadViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.DiskReadViolation wrap(android.os.strictmode.DiskReadViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.DiskReadViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.DiskReadViolation getReal() {
        return (android.os.strictmode.DiskReadViolation) real;
    }

    public android.os.strictmode.DiskReadViolation unwrap() {
        return getReal();
    }

}
