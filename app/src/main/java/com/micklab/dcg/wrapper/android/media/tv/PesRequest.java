// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class PesRequest {
    private final android.media.tv.PesRequest real;

    public PesRequest(android.media.tv.PesRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.PesRequest wrap(android.media.tv.PesRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.PesRequest(real);
    }

    public android.media.tv.PesRequest unwrap() {
        return real;
    }

    public PesRequest(int arg0, int arg1, int arg2, int arg3) {
        this(new android.media.tv.PesRequest(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getStreamId() {
        return real.getStreamId();
    }

    public int getTsPid() {
        return real.getTsPid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
