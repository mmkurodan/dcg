// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CreateEntry {
    private final android.service.credentials.CreateEntry real;

    public CreateEntry(android.service.credentials.CreateEntry real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CreateEntry wrap(android.service.credentials.CreateEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CreateEntry(real);
    }

    public android.service.credentials.CreateEntry unwrap() {
        return real;
    }

    public CreateEntry(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.CreateEntry(arg0 == null ? null : arg0.unwrap()));
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
