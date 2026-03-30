// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class CleartextNetworkViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CleartextNetworkViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.CleartextNetworkViolation wrap(android.os.strictmode.CleartextNetworkViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.CleartextNetworkViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.CleartextNetworkViolation getReal() {
        return (android.os.strictmode.CleartextNetworkViolation) real;
    }

    public android.os.strictmode.CleartextNetworkViolation unwrap() {
        return getReal();
    }

}
