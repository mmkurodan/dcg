// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class Action {
    private final android.service.credentials.Action real;

    public Action(android.service.credentials.Action real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.Action wrap(android.service.credentials.Action real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.Action(real);
    }

    public android.service.credentials.Action unwrap() {
        return real;
    }

    public Action(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.Action(arg0 == null ? null : arg0.unwrap()));
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
