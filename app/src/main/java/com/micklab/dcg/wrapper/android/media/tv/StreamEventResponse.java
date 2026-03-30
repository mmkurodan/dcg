// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class StreamEventResponse {
    private final android.media.tv.StreamEventResponse real;

    public StreamEventResponse(android.media.tv.StreamEventResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.StreamEventResponse wrap(android.media.tv.StreamEventResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.StreamEventResponse(real);
    }

    public android.media.tv.StreamEventResponse unwrap() {
        return real;
    }

    public StreamEventResponse(int arg0, int arg1, int arg2, int arg3, long arg4, byte[] arg5) {
        this(new android.media.tv.StreamEventResponse(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public byte[] getData() {
        return real.getData();
    }

    public int getEventId() {
        return real.getEventId();
    }

    public long getNptMillis() {
        return real.getNptMillis();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
