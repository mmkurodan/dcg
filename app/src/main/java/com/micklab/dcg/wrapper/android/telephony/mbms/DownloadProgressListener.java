// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class DownloadProgressListener {
    private final android.telephony.mbms.DownloadProgressListener real;

    public DownloadProgressListener(android.telephony.mbms.DownloadProgressListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener wrap(android.telephony.mbms.DownloadProgressListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener(real);
    }

    public android.telephony.mbms.DownloadProgressListener unwrap() {
        return real;
    }

    public DownloadProgressListener() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadProgressListener#android.telephony.mbms.DownloadProgressListener()");
    }

    public void onProgressUpdated(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.FileInfo arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadProgressListener#onProgressUpdated(android.telephony.mbms.DownloadRequest,android.telephony.mbms.FileInfo,int,int,int,int)");
    }

}
