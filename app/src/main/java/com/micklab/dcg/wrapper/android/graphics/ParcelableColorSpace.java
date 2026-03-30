// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ParcelableColorSpace {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParcelableColorSpace(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ParcelableColorSpace wrap(android.graphics.ParcelableColorSpace real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ParcelableColorSpace(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ParcelableColorSpace getReal() {
        return (android.graphics.ParcelableColorSpace) real;
    }

    public android.graphics.ParcelableColorSpace unwrap() {
        return getReal();
    }

    public ParcelableColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        this(new android.graphics.ParcelableColorSpace(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.ParcelableColorSpace) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.ParcelableColorSpace) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.ParcelableColorSpace) real).getColorSpace());
    }

    public int hashCode() {
        return ((android.graphics.ParcelableColorSpace) real).hashCode();
    }

    public static boolean isParcelable(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        return android.graphics.ParcelableColorSpace.isParcelable(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.ParcelableColorSpace) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
