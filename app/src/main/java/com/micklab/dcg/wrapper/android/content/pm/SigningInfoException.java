// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class SigningInfoException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SigningInfoException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.SigningInfoException wrap(android.content.pm.SigningInfoException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.SigningInfoException(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.SigningInfoException getReal() {
        return (android.content.pm.SigningInfoException) real;
    }

    public android.content.pm.SigningInfoException unwrap() {
        return getReal();
    }

    public int getCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfoException#getCode()");
    }

}
