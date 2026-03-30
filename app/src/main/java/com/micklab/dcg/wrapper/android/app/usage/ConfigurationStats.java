// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class ConfigurationStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfigurationStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats wrap(android.app.usage.ConfigurationStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.ConfigurationStats getReal() {
        return (android.app.usage.ConfigurationStats) real;
    }

    public android.app.usage.ConfigurationStats unwrap() {
        return getReal();
    }

    public ConfigurationStats(com.micklab.dcg.wrapper.android.app.usage.ConfigurationStats arg0) {
        this(new android.app.usage.ConfigurationStats(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.usage.ConfigurationStats) real).describeContents();
    }

    public int getActivationCount() {
        return ((android.app.usage.ConfigurationStats) real).getActivationCount();
    }

    public com.micklab.dcg.wrapper.android.content.res.Configuration getConfiguration() {
        return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(((android.app.usage.ConfigurationStats) real).getConfiguration());
    }

    public long getFirstTimeStamp() {
        return ((android.app.usage.ConfigurationStats) real).getFirstTimeStamp();
    }

    public long getLastTimeActive() {
        return ((android.app.usage.ConfigurationStats) real).getLastTimeActive();
    }

    public long getLastTimeStamp() {
        return ((android.app.usage.ConfigurationStats) real).getLastTimeStamp();
    }

    public long getTotalTimeActive() {
        return ((android.app.usage.ConfigurationStats) real).getTotalTimeActive();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.ConfigurationStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
