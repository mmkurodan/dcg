// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class DsmccResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DsmccResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.DsmccResponse wrap(android.media.tv.DsmccResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.DsmccResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.DsmccResponse getReal() {
        return (android.media.tv.DsmccResponse) real;
    }

    public android.media.tv.DsmccResponse unwrap() {
        return getReal();
    }

    public DsmccResponse(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg3) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public DsmccResponse(int arg0, int arg1, int arg2, int[] arg3, java.lang.String[] arg4) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public DsmccResponse(int arg0, int arg1, int arg2, boolean arg3, java.util.List arg4) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.DsmccResponse) real).describeContents();
    }

    public java.lang.String getBiopMessageType() {
        return ((android.media.tv.DsmccResponse) real).getBiopMessageType();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.DsmccResponse#getFile()");
    }

    public int[] getStreamEventIds() {
        return ((android.media.tv.DsmccResponse) real).getStreamEventIds();
    }

    public java.lang.String[] getStreamEventNames() {
        return ((android.media.tv.DsmccResponse) real).getStreamEventNames();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.DsmccResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String BIOP_MESSAGE_TYPE_DIRECTORY = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_DIRECTORY;
    public static final java.lang.String BIOP_MESSAGE_TYPE_SERVICE_GATEWAY = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_SERVICE_GATEWAY;
    public static final java.lang.String BIOP_MESSAGE_TYPE_STREAM = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_STREAM;

}
