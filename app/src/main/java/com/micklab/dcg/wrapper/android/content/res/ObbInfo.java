// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class ObbInfo {
    private final android.content.res.ObbInfo real;

    public ObbInfo(android.content.res.ObbInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.ObbInfo wrap(android.content.res.ObbInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.ObbInfo(real);
    }

    public android.content.res.ObbInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int OBB_OVERLAY = android.content.res.ObbInfo.OBB_OVERLAY;

}
