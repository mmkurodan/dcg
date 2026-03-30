// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SipException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipException wrap(android.net.sip.SipException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipException(real, (__DcgwBridgeToken) null);
    }

    public android.net.sip.SipException getReal() {
        return (android.net.sip.SipException) real;
    }

    public android.net.sip.SipException unwrap() {
        return getReal();
    }

    public SipException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipException#android.net.sip.SipException()");
    }

    public SipException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipException#android.net.sip.SipException(java.lang.String)");
    }

    public SipException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipException#android.net.sip.SipException(java.lang.String,java.lang.Throwable)");
    }

}
