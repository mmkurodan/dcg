// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AdBuffer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdBuffer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AdBuffer wrap(android.media.tv.AdBuffer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AdBuffer(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.AdBuffer getReal() {
        return (android.media.tv.AdBuffer) real;
    }

    public android.media.tv.AdBuffer unwrap() {
        return getReal();
    }

    public AdBuffer(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.SharedMemory arg2, int arg3, int arg4, long arg5, int arg6) {
        this(new android.media.tv.AdBuffer(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.AdBuffer) real).describeContents();
    }

    public int getFlags() {
        return ((android.media.tv.AdBuffer) real).getFlags();
    }

    public int getId() {
        return ((android.media.tv.AdBuffer) real).getId();
    }

    public int getLength() {
        return ((android.media.tv.AdBuffer) real).getLength();
    }

    public java.lang.String getMimeType() {
        return ((android.media.tv.AdBuffer) real).getMimeType();
    }

    public int getOffset() {
        return ((android.media.tv.AdBuffer) real).getOffset();
    }

    public long getPresentationTimeUs() {
        return ((android.media.tv.AdBuffer) real).getPresentationTimeUs();
    }

    public com.micklab.dcg.wrapper.android.os.SharedMemory getSharedMemory() {
        return com.micklab.dcg.wrapper.android.os.SharedMemory.wrap(((android.media.tv.AdBuffer) real).getSharedMemory());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.AdBuffer) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
