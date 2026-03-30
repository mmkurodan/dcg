// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncResult wrap(android.content.SyncResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncResult(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncResult getReal() {
        return (android.content.SyncResult) real;
    }

    public android.content.SyncResult unwrap() {
        return getReal();
    }

    public SyncResult() {
        this(new android.content.SyncResult(), (__DcgwBridgeToken) null);
    }

    public void clear() {
        ((android.content.SyncResult) real).clear();
    }

    public int describeContents() {
        return ((android.content.SyncResult) real).describeContents();
    }

    public boolean hasError() {
        return ((android.content.SyncResult) real).hasError();
    }

    public boolean hasHardError() {
        return ((android.content.SyncResult) real).hasHardError();
    }

    public boolean hasSoftError() {
        return ((android.content.SyncResult) real).hasSoftError();
    }

    public boolean madeSomeProgress() {
        return ((android.content.SyncResult) real).madeSomeProgress();
    }

    public java.lang.String toDebugString() {
        return ((android.content.SyncResult) real).toDebugString();
    }

    public java.lang.String toString() {
        return ((android.content.SyncResult) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.SyncResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.content.SyncResult ALREADY_IN_PROGRESS = com.micklab.dcg.wrapper.android.content.SyncResult.wrap(android.content.SyncResult.ALREADY_IN_PROGRESS);

}
