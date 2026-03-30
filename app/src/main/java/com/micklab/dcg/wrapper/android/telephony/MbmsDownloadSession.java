// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class MbmsDownloadSession {
    private final android.telephony.MbmsDownloadSession real;

    public MbmsDownloadSession(android.telephony.MbmsDownloadSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsDownloadSession wrap(android.telephony.MbmsDownloadSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.MbmsDownloadSession(real);
    }

    public android.telephony.MbmsDownloadSession unwrap() {
        return real;
    }

    public void addProgressListener(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#addProgressListener(android.telephony.mbms.DownloadRequest,java.util.concurrent.Executor,android.telephony.mbms.DownloadProgressListener)");
    }

    public void addServiceAnnouncement(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#addServiceAnnouncement([B)");
    }

    public void addStatusListener(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.DownloadStatusListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#addStatusListener(android.telephony.mbms.DownloadRequest,java.util.concurrent.Executor,android.telephony.mbms.DownloadStatusListener)");
    }

    public void cancelDownload(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#cancelDownload(android.telephony.mbms.DownloadRequest)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#close()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsDownloadSession create(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#create(android.content.Context,java.util.concurrent.Executor,android.telephony.mbms.MbmsDownloadSessionCallback)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsDownloadSession create(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, int arg2, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsDownloadSessionCallback arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#create(android.content.Context,java.util.concurrent.Executor,int,android.telephony.mbms.MbmsDownloadSessionCallback)");
    }

    public void download(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#download(android.telephony.mbms.DownloadRequest)");
    }

    public static int getMaximumServiceAnnouncementSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#getMaximumServiceAnnouncementSize()");
    }

    public java.io.File getTempFileRootDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#getTempFileRootDirectory()");
    }

    public void removeProgressListener(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.DownloadProgressListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#removeProgressListener(android.telephony.mbms.DownloadRequest,android.telephony.mbms.DownloadProgressListener)");
    }

    public void removeStatusListener(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.DownloadStatusListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#removeStatusListener(android.telephony.mbms.DownloadRequest,android.telephony.mbms.DownloadStatusListener)");
    }

    public void requestDownloadState(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0, com.micklab.dcg.wrapper.android.telephony.mbms.FileInfo arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#requestDownloadState(android.telephony.mbms.DownloadRequest,android.telephony.mbms.FileInfo)");
    }

    public void resetDownloadKnowledge(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#resetDownloadKnowledge(android.telephony.mbms.DownloadRequest)");
    }

    public void setTempFileRootDirectory(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsDownloadSession#setTempFileRootDirectory(java.io.File)");
    }


}
