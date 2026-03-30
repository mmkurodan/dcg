// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class NonSdkApiUsedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NonSdkApiUsedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.NonSdkApiUsedViolation wrap(android.os.strictmode.NonSdkApiUsedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.NonSdkApiUsedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.NonSdkApiUsedViolation getReal() {
        return (android.os.strictmode.NonSdkApiUsedViolation) real;
    }

    public android.os.strictmode.NonSdkApiUsedViolation unwrap() {
        return getReal();
    }

}
