// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipRegistrationListener {
    private final android.net.sip.SipRegistrationListener real;

    public SipRegistrationListener(android.net.sip.SipRegistrationListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener wrap(android.net.sip.SipRegistrationListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener(real);
    }

    public android.net.sip.SipRegistrationListener unwrap() {
        return real;
    }

    public void onRegistering(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipRegistrationListener#onRegistering(java.lang.String)");
    }

    public void onRegistrationDone(java.lang.String arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipRegistrationListener#onRegistrationDone(java.lang.String,long)");
    }

    public void onRegistrationFailed(java.lang.String arg0, int arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipRegistrationListener#onRegistrationFailed(java.lang.String,int,java.lang.String)");
    }

}
