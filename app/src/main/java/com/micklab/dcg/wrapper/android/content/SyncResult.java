// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncResult {
    private final android.content.SyncResult real;

    public SyncResult(android.content.SyncResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncResult wrap(android.content.SyncResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncResult(real);
    }

    public android.content.SyncResult unwrap() {
        return real;
    }

    public SyncResult() {
        this(new android.content.SyncResult());
    }

    public void clear() {
        real.clear();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean hasError() {
        return real.hasError();
    }

    public boolean hasHardError() {
        return real.hasHardError();
    }

    public boolean hasSoftError() {
        return real.hasSoftError();
    }

    public boolean madeSomeProgress() {
        return real.madeSomeProgress();
    }

    public java.lang.String toDebugString() {
        return real.toDebugString();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.content.SyncResult ALREADY_IN_PROGRESS = com.micklab.dcg.wrapper.android.content.SyncResult.wrap(android.content.SyncResult.ALREADY_IN_PROGRESS);

}
