// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SizeF {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SizeF(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SizeF wrap(android.util.SizeF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SizeF(real, (__DcgwBridgeToken) null);
    }

    public android.util.SizeF getReal() {
        return (android.util.SizeF) real;
    }

    public android.util.SizeF unwrap() {
        return getReal();
    }

    public SizeF(float arg0, float arg1) {
        this(new android.util.SizeF(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.util.SizeF) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.SizeF) real).equals(arg0);
    }

    public float getHeight() {
        return ((android.util.SizeF) real).getHeight();
    }

    public float getWidth() {
        return ((android.util.SizeF) real).getWidth();
    }

    public int hashCode() {
        return ((android.util.SizeF) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.util.SizeF parseSizeF(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.SizeF.wrap(android.util.SizeF.parseSizeF(arg0));
    }

    public java.lang.String toString() {
        return ((android.util.SizeF) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.util.SizeF) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
