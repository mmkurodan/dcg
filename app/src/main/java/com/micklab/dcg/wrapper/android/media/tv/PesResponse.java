// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class PesResponse {
    private final android.media.tv.PesResponse real;

    public PesResponse(android.media.tv.PesResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.PesResponse wrap(android.media.tv.PesResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.PesResponse(real);
    }

    public android.media.tv.PesResponse unwrap() {
        return real;
    }

    public PesResponse(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.PesResponse(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getSharedFilterToken() {
        return real.getSharedFilterToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
