// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageStats {
    private final android.app.usage.UsageStats real;

    public UsageStats(android.app.usage.UsageStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageStats wrap(android.app.usage.UsageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageStats(real);
    }

    public android.app.usage.UsageStats unwrap() {
        return real;
    }

    public UsageStats(com.micklab.dcg.wrapper.android.app.usage.UsageStats arg0) {
        this(new android.app.usage.UsageStats(arg0 == null ? null : arg0.unwrap()));
    }

    public void add(com.micklab.dcg.wrapper.android.app.usage.UsageStats arg0) {
        real.add(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getFirstTimeStamp() {
        return real.getFirstTimeStamp();
    }

    public long getLastTimeForegroundServiceUsed() {
        return real.getLastTimeForegroundServiceUsed();
    }

    public long getLastTimeStamp() {
        return real.getLastTimeStamp();
    }

    public long getLastTimeUsed() {
        return real.getLastTimeUsed();
    }

    public long getLastTimeVisible() {
        return real.getLastTimeVisible();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public long getTotalTimeForegroundServiceUsed() {
        return real.getTotalTimeForegroundServiceUsed();
    }

    public long getTotalTimeInForeground() {
        return real.getTotalTimeInForeground();
    }

    public long getTotalTimeVisible() {
        return real.getTotalTimeVisible();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
