// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class DsmccResponse {
    private final android.media.tv.DsmccResponse real;

    public DsmccResponse(android.media.tv.DsmccResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.DsmccResponse wrap(android.media.tv.DsmccResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.DsmccResponse(real);
    }

    public android.media.tv.DsmccResponse unwrap() {
        return real;
    }

    public DsmccResponse(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg3) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public DsmccResponse(int arg0, int arg1, int arg2, int[] arg3, java.lang.String[] arg4) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3, arg4));
    }

    public DsmccResponse(int arg0, int arg1, int arg2, boolean arg3, java.util.List arg4) {
        this(new android.media.tv.DsmccResponse(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getBiopMessageType() {
        return real.getBiopMessageType();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.DsmccResponse#getFile()");
    }

    public int[] getStreamEventIds() {
        return real.getStreamEventIds();
    }

    public java.lang.String[] getStreamEventNames() {
        return real.getStreamEventNames();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String BIOP_MESSAGE_TYPE_DIRECTORY = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_DIRECTORY;
    public static final java.lang.String BIOP_MESSAGE_TYPE_SERVICE_GATEWAY = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_SERVICE_GATEWAY;
    public static final java.lang.String BIOP_MESSAGE_TYPE_STREAM = android.media.tv.DsmccResponse.BIOP_MESSAGE_TYPE_STREAM;

}
