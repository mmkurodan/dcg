// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class DownloadProgressListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadProgressListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener wrap(android.telephony.mbms.DownloadProgressListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.DownloadProgressListener getReal() {
        return (android.telephony.mbms.DownloadProgressListener) real;
    }

    public android.telephony.mbms.DownloadProgressListener unwrap() {
        return getReal();
    }

    public DownloadProgressListener() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadProgressListener#android.telephony.mbms.DownloadProgressListener()");
    }

    public void onProgressUpdated(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.FileInfo arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadProgressListener#onProgressUpdated(android.telephony.mbms.DownloadRequest,android.telephony.mbms.FileInfo,int,int,int,int)");
    }

}
