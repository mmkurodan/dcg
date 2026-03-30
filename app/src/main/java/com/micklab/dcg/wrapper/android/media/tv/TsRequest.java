// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TsRequest {
    private final android.media.tv.TsRequest real;

    public TsRequest(android.media.tv.TsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TsRequest wrap(android.media.tv.TsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TsRequest(real);
    }

    public android.media.tv.TsRequest unwrap() {
        return real;
    }

    public TsRequest(int arg0, int arg1, int arg2) {
        this(new android.media.tv.TsRequest(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getTsPid() {
        return real.getTsPid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
