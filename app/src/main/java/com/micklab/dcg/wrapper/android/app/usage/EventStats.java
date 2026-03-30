// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class EventStats {
    private final android.app.usage.EventStats real;

    public EventStats(android.app.usage.EventStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.EventStats wrap(android.app.usage.EventStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.EventStats(real);
    }

    public android.app.usage.EventStats unwrap() {
        return real;
    }

    public EventStats(com.micklab.dcg.wrapper.android.app.usage.EventStats arg0) {
        this(new android.app.usage.EventStats(arg0 == null ? null : arg0.unwrap()));
    }

    public void add(com.micklab.dcg.wrapper.android.app.usage.EventStats arg0) {
        real.add(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCount() {
        return real.getCount();
    }

    public int getEventType() {
        return real.getEventType();
    }

    public long getFirstTimeStamp() {
        return real.getFirstTimeStamp();
    }

    public long getLastEventTime() {
        return real.getLastEventTime();
    }

    public long getLastTimeStamp() {
        return real.getLastTimeStamp();
    }

    public long getTotalTime() {
        return real.getTotalTime();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
