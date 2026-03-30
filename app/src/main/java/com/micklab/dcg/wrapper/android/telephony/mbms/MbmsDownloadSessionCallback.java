// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class MbmsDownloadSessionCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MbmsDownloadSessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback wrap(android.telephony.mbms.MbmsDownloadSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.MbmsDownloadSessionCallback getReal() {
        return (android.telephony.mbms.MbmsDownloadSessionCallback) real;
    }

    public android.telephony.mbms.MbmsDownloadSessionCallback unwrap() {
        return getReal();
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
