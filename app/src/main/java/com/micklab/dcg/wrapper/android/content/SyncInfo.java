// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncInfo {
    private final android.content.SyncInfo real;

    public SyncInfo(android.content.SyncInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncInfo wrap(android.content.SyncInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncInfo(real);
    }

    public android.content.SyncInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
