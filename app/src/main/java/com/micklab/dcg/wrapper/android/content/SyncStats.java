// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncStats {
    private final android.content.SyncStats real;

    public SyncStats(android.content.SyncStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncStats wrap(android.content.SyncStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncStats(real);
    }

    public android.content.SyncStats unwrap() {
        return real;
    }

    public SyncStats() {
        this(new android.content.SyncStats());
    }

    public SyncStats(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.SyncStats(arg0 == null ? null : arg0.unwrap()));
    }

    public void clear() {
        real.clear();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
