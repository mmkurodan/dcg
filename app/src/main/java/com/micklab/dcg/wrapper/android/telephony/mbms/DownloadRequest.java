// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class DownloadRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest wrap(android.telephony.mbms.DownloadRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.DownloadRequest getReal() {
        return (android.telephony.mbms.DownloadRequest) real;
    }

    public android.telephony.mbms.DownloadRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDestinationUri() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getDestinationUri()");
    }

    public java.lang.String getFileServiceId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getFileServiceId()");
    }

    public static int getMaxAppIntentSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getMaxAppIntentSize()");
    }

    public static int getMaxDestinationUriSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getMaxDestinationUriSize()");
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSourceUri() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getSourceUri()");
    }

    public int getSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#getSubscriptionId()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#hashCode()");
    }

    public byte[] toByteArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#toByteArray()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder wrap(android.telephony.mbms.DownloadRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.mbms.DownloadRequest.Builder getReal() {
            return (android.telephony.mbms.DownloadRequest.Builder) real;
        }

        public android.telephony.mbms.DownloadRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#android.telephony.mbms.DownloadRequest$Builder(android.net.Uri,android.net.Uri)");
        }

        public com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#build()");
        }

        public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder fromDownloadRequest(com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#fromDownloadRequest(android.telephony.mbms.DownloadRequest)");
        }

        public static com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder fromSerializedRequest(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#fromSerializedRequest([B)");
        }

        public com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder setAppIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#setAppIntent(android.content.Intent)");
        }

        public com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder setServiceInfo(com.micklab.dcg.wrapper.android.telephony.mbms.FileServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#setServiceInfo(android.telephony.mbms.FileServiceInfo)");
        }

        public com.micklab.dcg.wrapper.android.telephony.mbms.DownloadRequest.Builder setSubscriptionId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.DownloadRequest$Builder#setSubscriptionId(int)");
        }

    }
}
