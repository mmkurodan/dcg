// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class StrongBoxUnavailableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StrongBoxUnavailableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.StrongBoxUnavailableException wrap(android.security.keystore.StrongBoxUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.StrongBoxUnavailableException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.StrongBoxUnavailableException getReal() {
        return (android.security.keystore.StrongBoxUnavailableException) real;
    }

    public android.security.keystore.StrongBoxUnavailableException unwrap() {
        return getReal();
    }

    public StrongBoxUnavailableException() {
        this(new android.security.keystore.StrongBoxUnavailableException(), (__DcgwBridgeToken) null);
    }

    public StrongBoxUnavailableException(java.lang.Throwable arg0) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0), (__DcgwBridgeToken) null);
    }

    public StrongBoxUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0), (__DcgwBridgeToken) null);
    }

    public StrongBoxUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
