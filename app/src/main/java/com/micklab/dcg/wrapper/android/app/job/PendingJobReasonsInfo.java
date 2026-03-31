// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class PendingJobReasonsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PendingJobReasonsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.PendingJobReasonsInfo wrap(android.app.job.PendingJobReasonsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.PendingJobReasonsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.job.PendingJobReasonsInfo getReal() {
        return (android.app.job.PendingJobReasonsInfo) real;
    }

    public android.app.job.PendingJobReasonsInfo unwrap() {
        return getReal();
    }

    public PendingJobReasonsInfo(long arg0, int[] arg1) {
        this(new android.app.job.PendingJobReasonsInfo(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.job.PendingJobReasonsInfo) real).describeContents();
    }

    public int[] getPendingJobReasons() {
        return ((android.app.job.PendingJobReasonsInfo) real).getPendingJobReasons();
    }

    public long getTimestampMillis() {
        return ((android.app.job.PendingJobReasonsInfo) real).getTimestampMillis();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.job.PendingJobReasonsInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
