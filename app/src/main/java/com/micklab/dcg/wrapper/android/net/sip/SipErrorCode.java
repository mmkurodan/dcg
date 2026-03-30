// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipErrorCode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SipErrorCode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipErrorCode wrap(android.net.sip.SipErrorCode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipErrorCode(real, (__DcgwBridgeToken) null);
    }

    public android.net.sip.SipErrorCode getReal() {
        return (android.net.sip.SipErrorCode) real;
    }

    public android.net.sip.SipErrorCode unwrap() {
        return getReal();
    }

    public static java.lang.String toString(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipErrorCode#toString(int)");
    }


}
