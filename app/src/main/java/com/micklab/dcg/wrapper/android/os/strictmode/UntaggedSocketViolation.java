// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class UntaggedSocketViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UntaggedSocketViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.UntaggedSocketViolation wrap(android.os.strictmode.UntaggedSocketViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.UntaggedSocketViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.UntaggedSocketViolation getReal() {
        return (android.os.strictmode.UntaggedSocketViolation) real;
    }

    public android.os.strictmode.UntaggedSocketViolation unwrap() {
        return getReal();
    }

}
