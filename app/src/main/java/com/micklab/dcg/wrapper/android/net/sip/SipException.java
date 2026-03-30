// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipException {
    private final android.net.sip.SipException real;

    public SipException(android.net.sip.SipException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipException wrap(android.net.sip.SipException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipException(real);
    }

    public android.net.sip.SipException unwrap() {
        return real;
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
