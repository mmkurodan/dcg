// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipErrorCode {
    private final android.net.sip.SipErrorCode real;

    public SipErrorCode(android.net.sip.SipErrorCode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipErrorCode wrap(android.net.sip.SipErrorCode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipErrorCode(real);
    }

    public android.net.sip.SipErrorCode unwrap() {
        return real;
    }

    public static java.lang.String toString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipErrorCode#toString(int)");
    }


}
