// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.printservice;

public final class PrintJob {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintJob(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.printservice.PrintJob wrap(android.printservice.PrintJob real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.printservice.PrintJob(real, (__DcgwBridgeToken) null);
    }

    public android.printservice.PrintJob getReal() {
        return (android.printservice.PrintJob) real;
    }

    public android.printservice.PrintJob unwrap() {
        return getReal();
    }

    public boolean block(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).block(arg0);
    }

    public boolean cancel() {
        return ((android.printservice.PrintJob) real).cancel();
    }

    public boolean complete() {
        return ((android.printservice.PrintJob) real).complete();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.printservice.PrintJob) real).equals(arg0);
    }

    public boolean fail(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).fail(arg0);
    }

    public int getAdvancedIntOption(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).getAdvancedIntOption(arg0);
    }

    public java.lang.String getAdvancedStringOption(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).getAdvancedStringOption(arg0);
    }

    public com.micklab.dcg.wrapper.android.printservice.PrintDocument getDocument() {
        return com.micklab.dcg.wrapper.android.printservice.PrintDocument.wrap(((android.printservice.PrintJob) real).getDocument());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(((android.printservice.PrintJob) real).getId());
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobInfo getInfo() {
        return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(((android.printservice.PrintJob) real).getInfo());
    }

    public java.lang.String getTag() {
        return ((android.printservice.PrintJob) real).getTag();
    }

    public boolean hasAdvancedOption(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).hasAdvancedOption(arg0);
    }

    public int hashCode() {
        return ((android.printservice.PrintJob) real).hashCode();
    }

    public boolean isBlocked() {
        return ((android.printservice.PrintJob) real).isBlocked();
    }

    public boolean isCancelled() {
        return ((android.printservice.PrintJob) real).isCancelled();
    }

    public boolean isCompleted() {
        return ((android.printservice.PrintJob) real).isCompleted();
    }

    public boolean isFailed() {
        return ((android.printservice.PrintJob) real).isFailed();
    }

    public boolean isQueued() {
        return ((android.printservice.PrintJob) real).isQueued();
    }

    public boolean isStarted() {
        return ((android.printservice.PrintJob) real).isStarted();
    }

    public void setProgress(float arg0) {
        ((android.printservice.PrintJob) real).setProgress(arg0);
    }

    public void setStatus(java.lang.CharSequence arg0) {
        ((android.printservice.PrintJob) real).setStatus(arg0);
    }

    public void setStatus(int arg0) {
        ((android.printservice.PrintJob) real).setStatus(arg0);
    }

    public boolean setTag(java.lang.String arg0) {
        return ((android.printservice.PrintJob) real).setTag(arg0);
    }

    public boolean start() {
        return ((android.printservice.PrintJob) real).start();
    }

}
