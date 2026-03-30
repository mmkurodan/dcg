// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class StreamEventRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StreamEventRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.StreamEventRequest wrap(android.media.tv.StreamEventRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.StreamEventRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.StreamEventRequest getReal() {
        return (android.media.tv.StreamEventRequest) real;
    }

    public android.media.tv.StreamEventRequest unwrap() {
        return getReal();
    }

    public StreamEventRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String arg3) {
        this(new android.media.tv.StreamEventRequest(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.StreamEventRequest) real).describeContents();
    }

    public java.lang.String getEventName() {
        return ((android.media.tv.StreamEventRequest) real).getEventName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTargetUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.StreamEventRequest) real).getTargetUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.StreamEventRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
