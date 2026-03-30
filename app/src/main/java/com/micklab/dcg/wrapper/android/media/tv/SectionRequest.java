// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SectionRequest {
    private final android.media.tv.SectionRequest real;

    public SectionRequest(android.media.tv.SectionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SectionRequest wrap(android.media.tv.SectionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SectionRequest(real);
    }

    public android.media.tv.SectionRequest unwrap() {
        return real;
    }

    public SectionRequest(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.media.tv.SectionRequest(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getTableId() {
        return real.getTableId();
    }

    public int getTsPid() {
        return real.getTsPid();
    }

    public int getVersion() {
        return real.getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
