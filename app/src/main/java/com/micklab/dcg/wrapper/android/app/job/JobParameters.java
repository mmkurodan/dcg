// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobParameters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JobParameters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobParameters wrap(android.app.job.JobParameters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobParameters(real, (__DcgwBridgeToken) null);
    }

    public android.app.job.JobParameters getReal() {
        return (android.app.job.JobParameters) real;
    }

    public android.app.job.JobParameters unwrap() {
        return getReal();
    }

    public void completeWork(com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg0) {
        ((android.app.job.JobParameters) real).completeWork(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.job.JobWorkItem dequeueWork() {
        return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.wrap(((android.app.job.JobParameters) real).dequeueWork());
    }

    public int describeContents() {
        return ((android.app.job.JobParameters) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(((android.app.job.JobParameters) real).getClipData());
    }

    public int getClipGrantFlags() {
        return ((android.app.job.JobParameters) real).getClipGrantFlags();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.app.job.JobParameters) real).getExtras());
    }

    public int getJobId() {
        return ((android.app.job.JobParameters) real).getJobId();
    }

    public java.lang.String getJobNamespace() {
        return ((android.app.job.JobParameters) real).getJobNamespace();
    }

    public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobParameters#getNetwork()");
    }

    public int getStopReason() {
        return ((android.app.job.JobParameters) real).getStopReason();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getTransientExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.job.JobParameters) real).getTransientExtras());
    }

    public java.lang.String[] getTriggeredContentAuthorities() {
        return ((android.app.job.JobParameters) real).getTriggeredContentAuthorities();
    }

    public android.net.Uri[] getTriggeredContentUris() {
        return ((android.app.job.JobParameters) real).getTriggeredContentUris();
    }

    public boolean isExpeditedJob() {
        return ((android.app.job.JobParameters) real).isExpeditedJob();
    }

    public boolean isOverrideDeadlineExpired() {
        return ((android.app.job.JobParameters) real).isOverrideDeadlineExpired();
    }

    public boolean isUserInitiatedJob() {
        return ((android.app.job.JobParameters) real).isUserInitiatedJob();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.job.JobParameters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STOP_REASON_APP_STANDBY = android.app.job.JobParameters.STOP_REASON_APP_STANDBY;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = android.app.job.JobParameters.STOP_REASON_BACKGROUND_RESTRICTION;
    public static final int STOP_REASON_CANCELLED_BY_APP = android.app.job.JobParameters.STOP_REASON_CANCELLED_BY_APP;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = android.app.job.JobParameters.STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = android.app.job.JobParameters.STOP_REASON_CONSTRAINT_CHARGING;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = android.app.job.JobParameters.STOP_REASON_CONSTRAINT_CONNECTIVITY;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = android.app.job.JobParameters.STOP_REASON_CONSTRAINT_DEVICE_IDLE;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = android.app.job.JobParameters.STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW;
    public static final int STOP_REASON_DEVICE_STATE = android.app.job.JobParameters.STOP_REASON_DEVICE_STATE;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = android.app.job.JobParameters.STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED;
    public static final int STOP_REASON_PREEMPT = android.app.job.JobParameters.STOP_REASON_PREEMPT;
    public static final int STOP_REASON_QUOTA = android.app.job.JobParameters.STOP_REASON_QUOTA;
    public static final int STOP_REASON_SYSTEM_PROCESSING = android.app.job.JobParameters.STOP_REASON_SYSTEM_PROCESSING;
    public static final int STOP_REASON_TIMEOUT = android.app.job.JobParameters.STOP_REASON_TIMEOUT;
    public static final int STOP_REASON_UNDEFINED = android.app.job.JobParameters.STOP_REASON_UNDEFINED;
    public static final int STOP_REASON_USER = android.app.job.JobParameters.STOP_REASON_USER;

}
