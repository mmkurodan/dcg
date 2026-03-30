// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class ConfigurationStats {
    private final android.app.usage.ConfigurationStats real;

    public ConfigurationStats(android.app.usage.ConfigurationStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats wrap(android.app.usage.ConfigurationStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats(real);
    }

    public android.app.usage.ConfigurationStats unwrap() {
        return real;
    }

    public ConfigurationStats(com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats arg0) {
        this(new android.app.usage.ConfigurationStats(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getActivationCount() {
        return real.getActivationCount();
    }

    public com.micklab.dcg.wrapper.android.content.res.Configuration getConfiguration() {
        return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(real.getConfiguration());
    }

    public long getFirstTimeStamp() {
        return real.getFirstTimeStamp();
    }

    public long getLastTimeActive() {
        return real.getLastTimeActive();
    }

    public long getLastTimeStamp() {
        return real.getLastTimeStamp();
    }

    public long getTotalTimeActive() {
        return real.getTotalTimeActive();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
