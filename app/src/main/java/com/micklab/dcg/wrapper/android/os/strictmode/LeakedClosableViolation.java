// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class LeakedClosableViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LeakedClosableViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.LeakedClosableViolation wrap(android.os.strictmode.LeakedClosableViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.LeakedClosableViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.LeakedClosableViolation getReal() {
        return (android.os.strictmode.LeakedClosableViolation) real;
    }

    public android.os.strictmode.LeakedClosableViolation unwrap() {
        return getReal();
    }

}
