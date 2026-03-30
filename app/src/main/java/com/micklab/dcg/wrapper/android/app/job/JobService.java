// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobService {
    private final android.app.job.JobService real;

    public JobService(android.app.job.JobService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobService wrap(android.app.job.JobService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobService(real);
    }

    public android.app.job.JobService unwrap() {
        return real;
    }

    public void jobFinished(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, boolean arg1) {
        real.jobFinished(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onNetworkChanged(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobService#onNetworkChanged(android.app.job.JobParameters)");
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

    public void updateEstimatedNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, long arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobService#updateEstimatedNetworkBytes(android.app.job.JobParameters,long,long)");
    }

    public void updateEstimatedNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobService#updateEstimatedNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

    public void updateTransferredNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, long arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobService#updateTransferredNetworkBytes(android.app.job.JobParameters,long,long)");
    }

    public void updateTransferredNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobService#updateTransferredNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

    public static final int JOB_END_NOTIFICATION_POLICY_DETACH = android.app.job.JobService.JOB_END_NOTIFICATION_POLICY_DETACH;
    public static final int JOB_END_NOTIFICATION_POLICY_REMOVE = android.app.job.JobService.JOB_END_NOTIFICATION_POLICY_REMOVE;
    public static final java.lang.String PERMISSION_BIND = android.app.job.JobService.PERMISSION_BIND;

}
