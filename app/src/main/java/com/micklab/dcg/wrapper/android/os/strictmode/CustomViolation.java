// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class CustomViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CustomViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.CustomViolation wrap(android.os.strictmode.CustomViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.CustomViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.CustomViolation getReal() {
        return (android.os.strictmode.CustomViolation) real;
    }

    public android.os.strictmode.CustomViolation unwrap() {
        return getReal();
    }

}
