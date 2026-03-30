// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TsResponse {
    private final android.media.tv.TsResponse real;

    public TsResponse(android.media.tv.TsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TsResponse wrap(android.media.tv.TsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TsResponse(real);
    }

    public android.media.tv.TsResponse unwrap() {
        return real;
    }

    public TsResponse(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.TsResponse(arg0, arg1, arg2, arg3));
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
