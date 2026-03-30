// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class ParseException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParseException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ParseException wrap(android.net.ParseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ParseException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ParseException getReal() {
        return (android.net.ParseException) real;
    }

    public android.net.ParseException unwrap() {
        return getReal();
    }

    public ParseException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ParseException#android.net.ParseException(java.lang.String)");
    }

    public ParseException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ParseException#android.net.ParseException(java.lang.String,java.lang.Throwable)");
    }


}
