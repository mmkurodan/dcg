// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AdBuffer {
    private final android.media.tv.AdBuffer real;

    public AdBuffer(android.media.tv.AdBuffer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AdBuffer wrap(android.media.tv.AdBuffer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AdBuffer(real);
    }

    public android.media.tv.AdBuffer unwrap() {
        return real;
    }

    public AdBuffer(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.SharedMemory arg2, int arg3, int arg4, long arg5, int arg6) {
        this(new android.media.tv.AdBuffer(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getFlags() {
        return real.getFlags();
    }

    public int getId() {
        return real.getId();
    }

    public int getLength() {
        return real.getLength();
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public int getOffset() {
        return real.getOffset();
    }

    public long getPresentationTimeUs() {
        return real.getPresentationTimeUs();
    }

    public com.micklab.dcg.wrapper.android.os.SharedMemory getSharedMemory() {
        return com.micklab.dcg.wrapper.android.os.SharedMemory.wrap(real.getSharedMemory());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
