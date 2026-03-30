// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ExplicitGcViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExplicitGcViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ExplicitGcViolation wrap(android.os.strictmode.ExplicitGcViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ExplicitGcViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.ExplicitGcViolation getReal() {
        return (android.os.strictmode.ExplicitGcViolation) real;
    }

    public android.os.strictmode.ExplicitGcViolation unwrap() {
        return getReal();
    }

}
