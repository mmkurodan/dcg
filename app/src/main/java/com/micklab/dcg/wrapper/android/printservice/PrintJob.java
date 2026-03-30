// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrintJob {
    private final android.printservice.PrintJob real;

    public PrintJob(android.printservice.PrintJob real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrintJob wrap(android.printservice.PrintJob real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrintJob(real);
    }

    public android.printservice.PrintJob unwrap() {
        return real;
    }

    public boolean block(java.lang.String arg0) {
        return real.block(arg0);
    }

    public boolean cancel() {
        return real.cancel();
    }

    public boolean complete() {
        return real.complete();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean fail(java.lang.String arg0) {
        return real.fail(arg0);
    }

    public int getAdvancedIntOption(java.lang.String arg0) {
        return real.getAdvancedIntOption(arg0);
    }

    public java.lang.String getAdvancedStringOption(java.lang.String arg0) {
        return real.getAdvancedStringOption(arg0);
    }

    public com.micklab.dcg.wrapper.android.printservice.PrintDocument getDocument() {
        return com.micklab.dcg.wrapper.android.printservice.PrintDocument.wrap(real.getDocument());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(real.getId());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(real.getInfo());
    }

    public java.lang.String getTag() {
        return real.getTag();
    }

    public boolean hasAdvancedOption(java.lang.String arg0) {
        return real.hasAdvancedOption(arg0);
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

    public void setProgress(float arg0) {
        real.setProgress(arg0);
    }

    public void setStatus(int arg0) {
        real.setStatus(arg0);
    }

    public void setStatus(java.lang.CharSequence arg0) {
        real.setStatus(arg0);
    }

    public boolean setTag(java.lang.String arg0) {
        return real.setTag(arg0);
    }

    public boolean start() {
        return real.start();
    }

}
