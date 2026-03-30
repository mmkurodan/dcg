// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJob {
    private final android.print.PrintJob real;

    public PrintJob(android.print.PrintJob real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJob wrap(android.print.PrintJob real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJob(real);
    }

    public android.print.PrintJob unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(real.getId());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(real.getInfo());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBlocked() {
        return real.isBlocked();
    }

    public boolean isCancelled() {
        return real.isCancelled();
    }

    public boolean isCompleted() {
        return real.isCompleted();
    }

    public boolean isFailed() {
        return real.isFailed();
    }

    public boolean isQueued() {
        return real.isQueued();
    }

    public boolean isStarted() {
        return real.isStarted();
    }

    public void restart() {
        real.restart();
    }

}
