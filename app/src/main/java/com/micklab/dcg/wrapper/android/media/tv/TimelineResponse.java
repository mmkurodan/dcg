// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TimelineResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimelineResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TimelineResponse wrap(android.media.tv.TimelineResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TimelineResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TimelineResponse getReal() {
        return (android.media.tv.TimelineResponse) real;
    }

    public android.media.tv.TimelineResponse unwrap() {
        return getReal();
    }

    public TimelineResponse(int arg0, int arg1, int arg2, java.lang.String arg3, int arg4, int arg5, long arg6, long arg7) {
        this(new android.media.tv.TimelineResponse(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TimelineResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSelector() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.TimelineResponse) real).getSelector());
    }

    public long getTicks() {
        return ((android.media.tv.TimelineResponse) real).getTicks();
    }

    public int getUnitsPerSecond() {
        return ((android.media.tv.TimelineResponse) real).getUnitsPerSecond();
    }

    public int getUnitsPerTick() {
        return ((android.media.tv.TimelineResponse) real).getUnitsPerTick();
    }

    public long getWallClock() {
        return ((android.media.tv.TimelineResponse) real).getWallClock();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TimelineResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
