// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class MbmsStreamingSessionCallback {
    private final android.telephony.mbms.MbmsStreamingSessionCallback real;

    public MbmsStreamingSessionCallback(android.telephony.mbms.MbmsStreamingSessionCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.MbmsStreamingSessionCallback wrap(android.telephony.mbms.MbmsStreamingSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.MbmsStreamingSessionCallback(real);
    }

    public android.telephony.mbms.MbmsStreamingSessionCallback unwrap() {
        return real;
    }

    public MbmsStreamingSessionCallback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsStreamingSessionCallback#android.telephony.mbms.MbmsStreamingSessionCallback()");
    }

    public void onError(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsStreamingSessionCallback#onError(int,java.lang.String)");
    }

    public void onMiddlewareReady() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsStreamingSessionCallback#onMiddlewareReady()");
    }

}
