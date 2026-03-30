// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ServiceConnectionLeakedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceConnectionLeakedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ServiceConnectionLeakedViolation wrap(android.os.strictmode.ServiceConnectionLeakedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ServiceConnectionLeakedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.ServiceConnectionLeakedViolation getReal() {
        return (android.os.strictmode.ServiceConnectionLeakedViolation) real;
    }

    public android.os.strictmode.ServiceConnectionLeakedViolation unwrap() {
        return getReal();
    }

}
