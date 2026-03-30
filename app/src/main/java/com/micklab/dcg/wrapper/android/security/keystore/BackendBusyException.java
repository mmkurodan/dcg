// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class BackendBusyException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackendBusyException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.BackendBusyException wrap(android.security.keystore.BackendBusyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.BackendBusyException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.BackendBusyException getReal() {
        return (android.security.keystore.BackendBusyException) real;
    }

    public android.security.keystore.BackendBusyException unwrap() {
        return getReal();
    }

    public BackendBusyException(long arg0) {
        this(new android.security.keystore.BackendBusyException(arg0), (__DcgwBridgeToken) null);
    }

    public BackendBusyException(long arg0, java.lang.String arg1) {
        this(new android.security.keystore.BackendBusyException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public BackendBusyException(long arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.security.keystore.BackendBusyException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public long getBackOffHintMillis() {
        return ((android.security.keystore.BackendBusyException) real).getBackOffHintMillis();
    }

}
