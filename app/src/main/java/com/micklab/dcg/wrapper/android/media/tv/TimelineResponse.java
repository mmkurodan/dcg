// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TimelineResponse {
    private final android.media.tv.TimelineResponse real;

    public TimelineResponse(android.media.tv.TimelineResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TimelineResponse wrap(android.media.tv.TimelineResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TimelineResponse(real);
    }

    public android.media.tv.TimelineResponse unwrap() {
        return real;
    }

    public TimelineResponse(int arg0, int arg1, int arg2, java.lang.String arg3, int arg4, int arg5, long arg6, long arg7) {
        this(new android.media.tv.TimelineResponse(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSelector() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getSelector());
    }

    public long getTicks() {
        return real.getTicks();
    }

    public int getUnitsPerSecond() {
        return real.getUnitsPerSecond();
    }

    public int getUnitsPerTick() {
        return real.getUnitsPerTick();
    }

    public long getWallClock() {
        return real.getWallClock();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
