// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TimelineRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimelineRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TimelineRequest wrap(android.media.tv.TimelineRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TimelineRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TimelineRequest getReal() {
        return (android.media.tv.TimelineRequest) real;
    }

    public android.media.tv.TimelineRequest unwrap() {
        return getReal();
    }

    public TimelineRequest(int arg0, int arg1, int arg2) {
        this(new android.media.tv.TimelineRequest(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public TimelineRequest(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.TimelineRequest(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TimelineRequest) real).describeContents();
    }

    public int getIntervalMillis() {
        return ((android.media.tv.TimelineRequest) real).getIntervalMillis();
    }

    public java.lang.String getSelector() {
        return ((android.media.tv.TimelineRequest) real).getSelector();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TimelineRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
