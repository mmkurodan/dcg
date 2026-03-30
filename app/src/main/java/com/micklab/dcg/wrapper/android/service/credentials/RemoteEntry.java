// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class RemoteEntry {
    private final android.service.credentials.RemoteEntry real;

    public RemoteEntry(android.service.credentials.RemoteEntry real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry wrap(android.service.credentials.RemoteEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry(real);
    }

    public android.service.credentials.RemoteEntry unwrap() {
        return real;
    }

    public RemoteEntry(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.RemoteEntry(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(real.getSlice());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
