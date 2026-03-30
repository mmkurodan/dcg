// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ResourceMismatchViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResourceMismatchViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ResourceMismatchViolation wrap(android.os.strictmode.ResourceMismatchViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ResourceMismatchViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.ResourceMismatchViolation getReal() {
        return (android.os.strictmode.ResourceMismatchViolation) real;
    }

    public android.os.strictmode.ResourceMismatchViolation unwrap() {
        return getReal();
    }

}
