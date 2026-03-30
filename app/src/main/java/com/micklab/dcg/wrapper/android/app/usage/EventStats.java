// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class EventStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.EventStats wrap(android.app.usage.EventStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.EventStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.EventStats getReal() {
        return (android.app.usage.EventStats) real;
    }

    public android.app.usage.EventStats unwrap() {
        return getReal();
    }

    public EventStats(com.micklab.dcg.wrapper.android.app.usage.EventStats arg0) {
        this(new android.app.usage.EventStats(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void add(com.micklab.dcg.wrapper.android.app.usage.EventStats arg0) {
        ((android.app.usage.EventStats) real).add(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.app.usage.EventStats) real).describeContents();
    }

    public int getCount() {
        return ((android.app.usage.EventStats) real).getCount();
    }

    public int getEventType() {
        return ((android.app.usage.EventStats) real).getEventType();
    }

    public long getFirstTimeStamp() {
        return ((android.app.usage.EventStats) real).getFirstTimeStamp();
    }

    public long getLastEventTime() {
        return ((android.app.usage.EventStats) real).getLastEventTime();
    }

    public long getLastTimeStamp() {
        return ((android.app.usage.EventStats) real).getLastTimeStamp();
    }

    public long getTotalTime() {
        return ((android.app.usage.EventStats) real).getTotalTime();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.EventStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
