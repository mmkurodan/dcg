// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AitInfo {
    private final android.media.tv.AitInfo real;

    public AitInfo(android.media.tv.AitInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AitInfo wrap(android.media.tv.AitInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AitInfo(real);
    }

    public android.media.tv.AitInfo unwrap() {
        return real;
    }

    public AitInfo(int arg0, int arg1) {
        this(new android.media.tv.AitInfo(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getType() {
        return real.getType();
    }

    public int getVersion() {
        return real.getVersion();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
