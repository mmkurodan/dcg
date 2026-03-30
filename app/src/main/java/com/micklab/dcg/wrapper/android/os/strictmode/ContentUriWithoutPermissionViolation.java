// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ContentUriWithoutPermissionViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentUriWithoutPermissionViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ContentUriWithoutPermissionViolation wrap(android.os.strictmode.ContentUriWithoutPermissionViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ContentUriWithoutPermissionViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.ContentUriWithoutPermissionViolation getReal() {
        return (android.os.strictmode.ContentUriWithoutPermissionViolation) real;
    }

    public android.os.strictmode.ContentUriWithoutPermissionViolation unwrap() {
        return getReal();
    }

}
