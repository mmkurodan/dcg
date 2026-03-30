// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobServiceEngine {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JobServiceEngine(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobServiceEngine wrap(android.app.job.JobServiceEngine real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobServiceEngine(real, (__DcgwBridgeToken) null);
    }

    public android.app.job.JobServiceEngine getReal() {
        return (android.app.job.JobServiceEngine) real;
    }

    public android.app.job.JobServiceEngine unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.job.JobServiceEngine) real).getBinder());
    }

    public void jobFinished(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, boolean arg1) {
        ((android.app.job.JobServiceEngine) real).jobFinished(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onNetworkChanged(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#onNetworkChanged(android.app.job.JobParameters)");
    }

    public boolean onStartJob(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        return ((android.app.job.JobServiceEngine) real).onStartJob(arg0 == null ? null : arg0.getReal());
    }

    public boolean onStopJob(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0) {
        return ((android.app.job.JobServiceEngine) real).onStopJob(arg0 == null ? null : arg0.getReal());
    }

    public void setNotification(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, int arg1, com.micklab.dcg.wrapper.android.app.Notification arg2, int arg3) {
        ((android.app.job.JobServiceEngine) real).setNotification(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void updateEstimatedNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#updateEstimatedNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

    public void updateTransferredNetworkBytes(com.micklab.dcg.wrapper.android.app.job.JobParameters arg0, com.micklab.dcg.wrapper.android.app.job.JobWorkItem arg1, long arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobServiceEngine#updateTransferredNetworkBytes(android.app.job.JobParameters,android.app.job.JobWorkItem,long,long)");
    }

}
