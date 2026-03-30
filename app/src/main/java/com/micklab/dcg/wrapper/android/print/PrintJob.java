// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJob {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintJob(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJob wrap(android.print.PrintJob real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJob(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintJob getReal() {
        return (android.print.PrintJob) real;
    }

    public android.print.PrintJob unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.print.PrintJob) real).cancel();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrintJob) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(((android.print.PrintJob) real).getId());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(((android.print.PrintJob) real).getInfo());
    }

    public int hashCode() {
        return ((android.print.PrintJob) real).hashCode();
    }

    public boolean isBlocked() {
        return ((android.print.PrintJob) real).isBlocked();
    }

    public boolean isCancelled() {
        return ((android.print.PrintJob) real).isCancelled();
    }

    public boolean isCompleted() {
        return ((android.print.PrintJob) real).isCompleted();
    }

    public boolean isFailed() {
        return ((android.print.PrintJob) real).isFailed();
    }

    public boolean isQueued() {
        return ((android.print.PrintJob) real).isQueued();
    }

    public boolean isStarted() {
        return ((android.print.PrintJob) real).isStarted();
    }

    public void restart() {
        ((android.print.PrintJob) real).restart();
    }

}
