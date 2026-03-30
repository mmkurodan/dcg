// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JobInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobInfo wrap(android.app.job.JobInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.job.JobInfo getReal() {
        return (android.app.job.JobInfo) real;
    }

    public android.app.job.JobInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.job.JobInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.job.JobInfo) real).equals(arg0);
    }

    public int getBackoffPolicy() {
        return ((android.app.job.JobInfo) real).getBackoffPolicy();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(((android.app.job.JobInfo) real).getClipData());
    }

    public int getClipGrantFlags() {
        return ((android.app.job.JobInfo) real).getClipGrantFlags();
    }

    public long getEstimatedNetworkDownloadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo#getEstimatedNetworkDownloadBytes()");
    }

    public long getEstimatedNetworkUploadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo#getEstimatedNetworkUploadBytes()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.app.job.JobInfo) real).getExtras());
    }

    public long getFlexMillis() {
        return ((android.app.job.JobInfo) real).getFlexMillis();
    }

    public int getId() {
        return ((android.app.job.JobInfo) real).getId();
    }

    public long getInitialBackoffMillis() {
        return ((android.app.job.JobInfo) real).getInitialBackoffMillis();
    }

    public long getIntervalMillis() {
        return ((android.app.job.JobInfo) real).getIntervalMillis();
    }

    public long getMaxExecutionDelayMillis() {
        return ((android.app.job.JobInfo) real).getMaxExecutionDelayMillis();
    }

    public static long getMinFlexMillis() {
        return android.app.job.JobInfo.getMinFlexMillis();
    }

    public long getMinLatencyMillis() {
        return ((android.app.job.JobInfo) real).getMinLatencyMillis();
    }

    public static long getMinPeriodMillis() {
        return android.app.job.JobInfo.getMinPeriodMillis();
    }

    public long getMinimumNetworkChunkBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo#getMinimumNetworkChunkBytes()");
    }

    public int getNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo#getNetworkType()");
    }

    public int getPriority() {
        return ((android.app.job.JobInfo) real).getPriority();
    }

    public com.micklab.dcg.wrapper.android.net.NetworkRequest getRequiredNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo#getRequiredNetwork()");
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getService() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.job.JobInfo) real).getService());
    }

    public java.lang.String getTraceTag() {
        return ((android.app.job.JobInfo) real).getTraceTag();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getTransientExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.job.JobInfo) real).getTransientExtras());
    }

    public long getTriggerContentMaxDelay() {
        return ((android.app.job.JobInfo) real).getTriggerContentMaxDelay();
    }

    public long getTriggerContentUpdateDelay() {
        return ((android.app.job.JobInfo) real).getTriggerContentUpdateDelay();
    }

    public android.app.job.JobInfo.TriggerContentUri[] getTriggerContentUris() {
        return ((android.app.job.JobInfo) real).getTriggerContentUris();
    }

    public int hashCode() {
        return ((android.app.job.JobInfo) real).hashCode();
    }

    public boolean isExpedited() {
        return ((android.app.job.JobInfo) real).isExpedited();
    }

    public boolean isImportantWhileForeground() {
        return ((android.app.job.JobInfo) real).isImportantWhileForeground();
    }

    public boolean isPeriodic() {
        return ((android.app.job.JobInfo) real).isPeriodic();
    }

    public boolean isPersisted() {
        return ((android.app.job.JobInfo) real).isPersisted();
    }

    public boolean isPrefetch() {
        return ((android.app.job.JobInfo) real).isPrefetch();
    }

    public boolean isRequireBatteryNotLow() {
        return ((android.app.job.JobInfo) real).isRequireBatteryNotLow();
    }

    public boolean isRequireCharging() {
        return ((android.app.job.JobInfo) real).isRequireCharging();
    }

    public boolean isRequireDeviceIdle() {
        return ((android.app.job.JobInfo) real).isRequireDeviceIdle();
    }

    public boolean isRequireStorageNotLow() {
        return ((android.app.job.JobInfo) real).isRequireStorageNotLow();
    }

    public boolean isUserInitiated() {
        return ((android.app.job.JobInfo) real).isUserInitiated();
    }

    public java.lang.String toString() {
        return ((android.app.job.JobInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.job.JobInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int BACKOFF_POLICY_EXPONENTIAL = android.app.job.JobInfo.BACKOFF_POLICY_EXPONENTIAL;
    public static final int BACKOFF_POLICY_LINEAR = android.app.job.JobInfo.BACKOFF_POLICY_LINEAR;
    public static final long DEFAULT_INITIAL_BACKOFF_MILLIS = android.app.job.JobInfo.DEFAULT_INITIAL_BACKOFF_MILLIS;
    public static final long MAX_BACKOFF_DELAY_MILLIS = android.app.job.JobInfo.MAX_BACKOFF_DELAY_MILLIS;
    public static final int PRIORITY_DEFAULT = android.app.job.JobInfo.PRIORITY_DEFAULT;
    public static final int PRIORITY_HIGH = android.app.job.JobInfo.PRIORITY_HIGH;
    public static final int PRIORITY_LOW = android.app.job.JobInfo.PRIORITY_LOW;
    public static final int PRIORITY_MAX = android.app.job.JobInfo.PRIORITY_MAX;
    public static final int PRIORITY_MIN = android.app.job.JobInfo.PRIORITY_MIN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder wrap(android.app.job.JobInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.job.JobInfo.Builder getReal() {
            return (android.app.job.JobInfo.Builder) real;
        }

        public android.app.job.JobInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
            this(new android.app.job.JobInfo.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder addDebugTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).addDebugTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder addTriggerContentUri(com.micklab.dcg.wrapper.android.app.job.JobInfo.TriggerContentUri arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).addTriggerContentUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo build() {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.wrap(((android.app.job.JobInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder removeDebugTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).removeDebugTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setBackoffCriteria(long arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setBackoffCriteria(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setClipData(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setEstimatedNetworkBytes(long arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo$Builder#setEstimatedNetworkBytes(long,long)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setExpedited(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setExpedited(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setImportantWhileForeground(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setImportantWhileForeground(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setMinimumLatency(long arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setMinimumLatency(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setMinimumNetworkChunkBytes(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo$Builder#setMinimumNetworkChunkBytes(long)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setOverrideDeadline(long arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setOverrideDeadline(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setPeriodic(long arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setPeriodic(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setPeriodic(long arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setPeriodic(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setPersisted(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setPersisted(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setPrefetch(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setPrefetch(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiredNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo$Builder#setRequiredNetwork(android.net.NetworkRequest)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiredNetworkType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobInfo$Builder#setRequiredNetworkType(int)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiresBatteryNotLow(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setRequiresBatteryNotLow(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiresCharging(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setRequiresCharging(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiresDeviceIdle(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setRequiresDeviceIdle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setRequiresStorageNotLow(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setRequiresStorageNotLow(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setTraceTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setTraceTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setTransientExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setTransientExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setTriggerContentMaxDelay(long arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setTriggerContentMaxDelay(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setTriggerContentUpdateDelay(long arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setTriggerContentUpdateDelay(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder setUserInitiated(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobInfo.Builder.wrap(((android.app.job.JobInfo.Builder) real).setUserInitiated(arg0));
        }

    }
    public static final class TriggerContentUri {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TriggerContentUri(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.job.JobInfo.TriggerContentUri wrap(android.app.job.JobInfo.TriggerContentUri real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobInfo.TriggerContentUri(real, (__DcgwBridgeToken) null);
        }

        public android.app.job.JobInfo.TriggerContentUri getReal() {
            return (android.app.job.JobInfo.TriggerContentUri) real;
        }

        public android.app.job.JobInfo.TriggerContentUri unwrap() {
            return getReal();
        }

        public TriggerContentUri(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
            this(new android.app.job.JobInfo.TriggerContentUri(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.job.JobInfo.TriggerContentUri) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.app.job.JobInfo.TriggerContentUri) real).equals(arg0);
        }

        public int getFlags() {
            return ((android.app.job.JobInfo.TriggerContentUri) real).getFlags();
        }

        public com.micklab.dcg.wrapper.android.net.Uri getUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.job.JobInfo.TriggerContentUri) real).getUri());
        }

        public int hashCode() {
            return ((android.app.job.JobInfo.TriggerContentUri) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.job.JobInfo.TriggerContentUri) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int FLAG_NOTIFY_FOR_DESCENDANTS = android.app.job.JobInfo.TriggerContentUri.FLAG_NOTIFY_FOR_DESCENDANTS;

    }
}
