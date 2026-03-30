// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class NetworkViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.NetworkViolation wrap(android.os.strictmode.NetworkViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.NetworkViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.NetworkViolation getReal() {
        return (android.os.strictmode.NetworkViolation) real;
    }

    public android.os.strictmode.NetworkViolation unwrap() {
        return getReal();
    }

}
