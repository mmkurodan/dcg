// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AdRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AdRequest wrap(android.media.tv.AdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AdRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.AdRequest getReal() {
        return (android.media.tv.AdRequest) real;
    }

    public android.media.tv.AdRequest unwrap() {
        return getReal();
    }

    public AdRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, long arg3, long arg4, long arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        this(new android.media.tv.AdRequest(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6 == null ? null : arg6.getReal()), (__DcgwBridgeToken) null);
    }

    public AdRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2, long arg3, long arg4, long arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        this(new android.media.tv.AdRequest(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.AdRequest) real).describeContents();
    }

    public long getEchoIntervalMillis() {
        return ((android.media.tv.AdRequest) real).getEchoIntervalMillis();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.AdRequest#getFileDescriptor()");
    }

    public int getId() {
        return ((android.media.tv.AdRequest) real).getId();
    }

    public java.lang.String getMediaFileType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.AdRequest#getMediaFileType()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetadata() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.tv.AdRequest) real).getMetadata());
    }

    public int getRequestType() {
        return ((android.media.tv.AdRequest) real).getRequestType();
    }

    public long getStartTimeMillis() {
        return ((android.media.tv.AdRequest) real).getStartTimeMillis();
    }

    public long getStopTimeMillis() {
        return ((android.media.tv.AdRequest) real).getStopTimeMillis();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.AdRequest) real).getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.AdRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int REQUEST_TYPE_START = android.media.tv.AdRequest.REQUEST_TYPE_START;
    public static final int REQUEST_TYPE_STOP = android.media.tv.AdRequest.REQUEST_TYPE_STOP;

}
