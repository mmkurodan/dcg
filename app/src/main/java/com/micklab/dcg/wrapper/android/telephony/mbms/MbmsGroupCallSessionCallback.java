// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class MbmsGroupCallSessionCallback {
    private final android.telephony.mbms.MbmsGroupCallSessionCallback real;

    public MbmsGroupCallSessionCallback(android.telephony.mbms.MbmsGroupCallSessionCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.MbmsGroupCallSessionCallback wrap(android.telephony.mbms.MbmsGroupCallSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.MbmsGroupCallSessionCallback(real);
    }

    public android.telephony.mbms.MbmsGroupCallSessionCallback unwrap() {
        return real;
    }

    public void onError(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsGroupCallSessionCallback#onError(int,java.lang.String)");
    }

    public void onMiddlewareReady() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsGroupCallSessionCallback#onMiddlewareReady()");
    }

    public void onServiceInterfaceAvailable(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsGroupCallSessionCallback#onServiceInterfaceAvailable(java.lang.String,int)");
    }

}
