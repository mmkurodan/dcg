// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobScheduler {
    private final android.app.job.JobScheduler real;

    public JobScheduler(android.app.job.JobScheduler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobScheduler wrap(android.app.job.JobScheduler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobScheduler(real);
    }

    public android.app.job.JobScheduler unwrap() {
        return real;
    }

    public boolean canRunUserInitiatedJobs() {
        return real.canRunUserInitiatedJobs();
    }

    public void cancel(int arg0) {
        real.cancel(arg0);
    }

    public void cancelAll() {
        real.cancelAll();
    }

    public void cancelInAllNamespaces() {
        real.cancelInAllNamespaces();
    }

    public int enqueue(com.micklab.dcg.wrapper.android.app.job.JobInfo arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1) {
        return real.enqueue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.job.JobScheduler forNamespace(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.job.JobScheduler.wrap(real.forNamespace(arg0));
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public com.micklab.dcg.wrapper.android.app.job.JobInfo getPendingJob(int arg0) {
        return com.micklab.dcg.wrapper.android.app.job.JobInfo.wrap(real.getPendingJob(arg0));
    }

    public int getPendingJobReason(int arg0) {
        return real.getPendingJobReason(arg0);
    }

    public int schedule(com.micklab.dcg.wrapper.android.app.job.JobInfo arg0) {
        return real.schedule(arg0 == null ? null : arg0.unwrap());
    }

    public static final int PENDING_JOB_REASON_APP = android.app.job.JobScheduler.PENDING_JOB_REASON_APP;
    public static final int PENDING_JOB_REASON_APP_STANDBY = android.app.job.JobScheduler.PENDING_JOB_REASON_APP_STANDBY;
    public static final int PENDING_JOB_REASON_BACKGROUND_RESTRICTION = android.app.job.JobScheduler.PENDING_JOB_REASON_BACKGROUND_RESTRICTION;
    public static final int PENDING_JOB_REASON_CONSTRAINT_BATTERY_NOT_LOW = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_BATTERY_NOT_LOW;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CHARGING = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_CHARGING;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONTENT_TRIGGER = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_CONTENT_TRIGGER;
    public static final int PENDING_JOB_REASON_CONSTRAINT_DEVICE_IDLE = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_DEVICE_IDLE;
    public static final int PENDING_JOB_REASON_CONSTRAINT_MINIMUM_LATENCY = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_MINIMUM_LATENCY;
    public static final int PENDING_JOB_REASON_CONSTRAINT_PREFETCH = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_PREFETCH;
    public static final int PENDING_JOB_REASON_CONSTRAINT_STORAGE_NOT_LOW = android.app.job.JobScheduler.PENDING_JOB_REASON_CONSTRAINT_STORAGE_NOT_LOW;
    public static final int PENDING_JOB_REASON_DEVICE_STATE = android.app.job.JobScheduler.PENDING_JOB_REASON_DEVICE_STATE;
    public static final int PENDING_JOB_REASON_EXECUTING = android.app.job.JobScheduler.PENDING_JOB_REASON_EXECUTING;
    public static final int PENDING_JOB_REASON_INVALID_JOB_ID = android.app.job.JobScheduler.PENDING_JOB_REASON_INVALID_JOB_ID;
    public static final int PENDING_JOB_REASON_JOB_SCHEDULER_OPTIMIZATION = android.app.job.JobScheduler.PENDING_JOB_REASON_JOB_SCHEDULER_OPTIMIZATION;
    public static final int PENDING_JOB_REASON_QUOTA = android.app.job.JobScheduler.PENDING_JOB_REASON_QUOTA;
    public static final int PENDING_JOB_REASON_UNDEFINED = android.app.job.JobScheduler.PENDING_JOB_REASON_UNDEFINED;
    public static final int PENDING_JOB_REASON_USER = android.app.job.JobScheduler.PENDING_JOB_REASON_USER;
    public static final int RESULT_FAILURE = android.app.job.JobScheduler.RESULT_FAILURE;
    public static final int RESULT_SUCCESS = android.app.job.JobScheduler.RESULT_SUCCESS;

}
