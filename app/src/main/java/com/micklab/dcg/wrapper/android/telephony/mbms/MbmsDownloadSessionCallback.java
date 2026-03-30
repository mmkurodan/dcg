// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class MbmsDownloadSessionCallback {
    private final android.telephony.mbms.MbmsDownloadSessionCallback real;

    public MbmsDownloadSessionCallback(android.telephony.mbms.MbmsDownloadSessionCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback wrap(android.telephony.mbms.MbmsDownloadSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback(real);
    }

    public android.telephony.mbms.MbmsDownloadSessionCallback unwrap() {
        return real;
    }

    public MbmsDownloadSessionCallback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsDownloadSessionCallback#android.telephony.mbms.MbmsDownloadSessionCallback()");
    }

    public void onError(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsDownloadSessionCallback#onError(int,java.lang.String)");
    }

    public void onMiddlewareReady() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsDownloadSessionCallback#onMiddlewareReady()");
    }

}
