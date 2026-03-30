// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsageStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageStats wrap(android.app.usage.UsageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.UsageStats getReal() {
        return (android.app.usage.UsageStats) real;
    }

    public android.app.usage.UsageStats unwrap() {
        return getReal();
    }

    public UsageStats(com.micklab.dcg.wrapper.android.app.usage.UsageStats arg0) {
        this(new android.app.usage.UsageStats(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void add(com.micklab.dcg.wrapper.android.app.usage.UsageStats arg0) {
        ((android.app.usage.UsageStats) real).add(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.app.usage.UsageStats) real).describeContents();
    }

    public long getFirstTimeStamp() {
        return ((android.app.usage.UsageStats) real).getFirstTimeStamp();
    }

    public long getLastTimeForegroundServiceUsed() {
        return ((android.app.usage.UsageStats) real).getLastTimeForegroundServiceUsed();
    }

    public long getLastTimeStamp() {
        return ((android.app.usage.UsageStats) real).getLastTimeStamp();
    }

    public long getLastTimeUsed() {
        return ((android.app.usage.UsageStats) real).getLastTimeUsed();
    }

    public long getLastTimeVisible() {
        return ((android.app.usage.UsageStats) real).getLastTimeVisible();
    }

    public java.lang.String getPackageName() {
        return ((android.app.usage.UsageStats) real).getPackageName();
    }

    public long getTotalTimeForegroundServiceUsed() {
        return ((android.app.usage.UsageStats) real).getTotalTimeForegroundServiceUsed();
    }

    public long getTotalTimeInForeground() {
        return ((android.app.usage.UsageStats) real).getTotalTimeInForeground();
    }

    public long getTotalTimeVisible() {
        return ((android.app.usage.UsageStats) real).getTotalTimeVisible();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.UsageStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
