// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class StreamEventResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StreamEventResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.StreamEventResponse wrap(android.media.tv.StreamEventResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.StreamEventResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.StreamEventResponse getReal() {
        return (android.media.tv.StreamEventResponse) real;
    }

    public android.media.tv.StreamEventResponse unwrap() {
        return getReal();
    }

    public StreamEventResponse(int arg0, int arg1, int arg2, int arg3, long arg4, byte[] arg5) {
        this(new android.media.tv.StreamEventResponse(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.StreamEventResponse) real).describeContents();
    }

    public byte[] getData() {
        return ((android.media.tv.StreamEventResponse) real).getData();
    }

    public int getEventId() {
        return ((android.media.tv.StreamEventResponse) real).getEventId();
    }

    public long getNptMillis() {
        return ((android.media.tv.StreamEventResponse) real).getNptMillis();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.StreamEventResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
