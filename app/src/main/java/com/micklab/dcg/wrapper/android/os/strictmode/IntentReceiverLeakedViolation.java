// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class IntentReceiverLeakedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntentReceiverLeakedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.IntentReceiverLeakedViolation wrap(android.os.strictmode.IntentReceiverLeakedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.IntentReceiverLeakedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.IntentReceiverLeakedViolation getReal() {
        return (android.os.strictmode.IntentReceiverLeakedViolation) real;
    }

    public android.os.strictmode.IntentReceiverLeakedViolation unwrap() {
        return getReal();
    }

}
