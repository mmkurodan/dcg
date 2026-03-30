// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TimelineRequest {
    private final android.media.tv.TimelineRequest real;

    public TimelineRequest(android.media.tv.TimelineRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TimelineRequest wrap(android.media.tv.TimelineRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TimelineRequest(real);
    }

    public android.media.tv.TimelineRequest unwrap() {
        return real;
    }

    public TimelineRequest(int arg0, int arg1, int arg2) {
        this(new android.media.tv.TimelineRequest(arg0, arg1, arg2));
    }

    public TimelineRequest(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.TimelineRequest(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getIntervalMillis() {
        return real.getIntervalMillis();
    }

    public java.lang.String getSelector() {
        return real.getSelector();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
