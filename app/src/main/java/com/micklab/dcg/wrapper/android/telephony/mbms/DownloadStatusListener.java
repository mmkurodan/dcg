// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class DownloadStatusListener {
    private final android.telephony.mbms.DownloadStatusListener real;

    public DownloadStatusListener(android.telephony.mbms.DownloadStatusListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadStatusListener wrap(android.telephony.mbms.DownloadStatusListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.DownloadStatusListener(real);
    }

    public android.telephony.mbms.DownloadStatusListener unwrap() {
        return real;
    }

    public DownloadStatusListener() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadStatusListener#android.telephony.mbms.DownloadStatusListener()");
    }

    public void onStatusUpdated(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.FileInfo arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadStatusListener#onStatusUpdated(android.telephony.mbms.DownloadRequest,android.telephony.mbms.FileInfo,int)");
    }

}
