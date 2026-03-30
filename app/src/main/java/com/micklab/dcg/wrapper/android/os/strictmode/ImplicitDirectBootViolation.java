// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ImplicitDirectBootViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImplicitDirectBootViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ImplicitDirectBootViolation wrap(android.os.strictmode.ImplicitDirectBootViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ImplicitDirectBootViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.ImplicitDirectBootViolation getReal() {
        return (android.os.strictmode.ImplicitDirectBootViolation) real;
    }

    public android.os.strictmode.ImplicitDirectBootViolation unwrap() {
        return getReal();
    }

}
