// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class FileUriExposedViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileUriExposedViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.FileUriExposedViolation wrap(android.os.strictmode.FileUriExposedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.FileUriExposedViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.FileUriExposedViolation getReal() {
        return (android.os.strictmode.FileUriExposedViolation) real;
    }

    public android.os.strictmode.FileUriExposedViolation unwrap() {
        return getReal();
    }

}
