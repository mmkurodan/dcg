// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class MbmsDownloadReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MbmsDownloadReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadReceiver wrap(android.telephony.mbms.MbmsDownloadReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.MbmsDownloadReceiver getReal() {
        return (android.telephony.mbms.MbmsDownloadReceiver) real;
    }

    public android.telephony.mbms.MbmsDownloadReceiver unwrap() {
        return getReal();
    }

    public MbmsDownloadReceiver() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsDownloadReceiver#android.telephony.mbms.MbmsDownloadReceiver()");
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.MbmsDownloadReceiver#onReceive(android.content.Context,android.content.Intent)");
    }

}
