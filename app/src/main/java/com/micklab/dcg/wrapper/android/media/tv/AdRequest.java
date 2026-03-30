// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AdRequest {
    private final android.media.tv.AdRequest real;

    public AdRequest(android.media.tv.AdRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AdRequest wrap(android.media.tv.AdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AdRequest(real);
    }

    public android.media.tv.AdRequest unwrap() {
        return real;
    }

    public AdRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, long arg3, long arg4, long arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        this(new android.media.tv.AdRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

    public AdRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2, long arg3, long arg4, long arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        this(new android.media.tv.AdRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getEchoIntervalMillis() {
        return real.getEchoIntervalMillis();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.AdRequest#getFileDescriptor()");
    }

    public int getId() {
        return real.getId();
    }

    public java.lang.String getMediaFileType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.tv.AdRequest#getMediaFileType()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetadata() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetadata());
    }

    public int getRequestType() {
        return real.getRequestType();
    }

    public long getStartTimeMillis() {
        return real.getStartTimeMillis();
    }

    public long getStopTimeMillis() {
        return real.getStopTimeMillis();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int REQUEST_TYPE_START = android.media.tv.AdRequest.REQUEST_TYPE_START;
    public static final int REQUEST_TYPE_STOP = android.media.tv.AdRequest.REQUEST_TYPE_STOP;

}
