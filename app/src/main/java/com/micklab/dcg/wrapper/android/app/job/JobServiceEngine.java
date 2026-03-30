// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobServiceEngine {
    private final android.app.job.JobServiceEngine real;

    public JobServiceEngine(android.app.job.JobServiceEngine real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobServiceEngine wrap(android.app.job.JobServiceEngine real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobServiceEngine(real);
    }

    public android.app.job.JobServiceEngine unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getBinder());
    }

    public void jobFinished(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, boolean arg1) {
        real.jobFinished(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onNetworkChanged(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#onNetworkChanged(android.app.job.JobParameters)");
    }

    public boolean onStartJob(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        return real.onStartJob(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onStopJob(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        return real.onStopJob(arg0 == null ? null : arg0.unwrap());
    }

    public void setNotification(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, int arg1, com.micklab.dcg.wrapper.android.app.Notification arg2, int arg3) {
        real.setNotification(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void updateEstimatedNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#updateEstimatedNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

    public void updateTransferredNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#updateTransferredNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

}
