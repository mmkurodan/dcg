// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ParcelableColorSpace {
    private final android.graphics.ParcelableColorSpace real;

    public ParcelableColorSpace(android.graphics.ParcelableColorSpace real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ParcelableColorSpace wrap(android.graphics.ParcelableColorSpace real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ParcelableColorSpace(real);
    }

    public android.graphics.ParcelableColorSpace unwrap() {
        return real;
    }

    public ParcelableColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        this(new android.graphics.ParcelableColorSpace(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static boolean isParcelable(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        return android.graphics.ParcelableColorSpace.isParcelable(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
