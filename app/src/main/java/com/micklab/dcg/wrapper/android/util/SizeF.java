// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SizeF {
    private final android.util.SizeF real;

    public SizeF(android.util.SizeF real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SizeF wrap(android.util.SizeF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SizeF(real);
    }

    public android.util.SizeF unwrap() {
        return real;
    }

    public SizeF(float arg0, float arg1) {
        this(new android.util.SizeF(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getHeight() {
        return real.getHeight();
    }

    public float getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.util.SizeF parseSizeF(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.SizeF.wrap(android.util.SizeF.parseSizeF(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
