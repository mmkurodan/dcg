// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64DataException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Base64DataException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64DataException wrap(android.util.Base64DataException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64DataException(real, (__DcgwBridgeToken) null);
    }

    public android.util.Base64DataException getReal() {
        return (android.util.Base64DataException) real;
    }

    public android.util.Base64DataException unwrap() {
        return getReal();
    }

    public Base64DataException(java.lang.String arg0) {
        this(new android.util.Base64DataException(arg0), (__DcgwBridgeToken) null);
    }

}
