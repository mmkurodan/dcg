// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class DsmccRequest {
    private final android.media.tv.DsmccRequest real;

    public DsmccRequest(android.media.tv.DsmccRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.DsmccRequest wrap(android.media.tv.DsmccRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.DsmccRequest(real);
    }

    public android.media.tv.DsmccRequest unwrap() {
        return real;
    }

    public DsmccRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.media.tv.DsmccRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
