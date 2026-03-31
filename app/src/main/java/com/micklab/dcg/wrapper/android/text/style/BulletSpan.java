// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class BulletSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BulletSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.BulletSpan wrap(android.text.style.BulletSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.BulletSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.BulletSpan getReal() {
        return (android.text.style.BulletSpan) real;
    }

    public android.text.style.BulletSpan unwrap() {
        return getReal();
    }

    public BulletSpan() {
        this(new android.text.style.BulletSpan(), (__DcgwBridgeToken) null);
    }

    public BulletSpan(int arg0) {
        this(new android.text.style.BulletSpan(arg0), (__DcgwBridgeToken) null);
    }

    public BulletSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.BulletSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BulletSpan(int arg0, int arg1) {
        this(new android.text.style.BulletSpan(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public BulletSpan(int arg0, int arg1, int arg2) {
        this(new android.text.style.BulletSpan(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.BulletSpan) real).describeContents();
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        ((android.text.style.BulletSpan) real).drawLeadingMargin(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
    }

    public int getBulletRadius() {
        return ((android.text.style.BulletSpan) real).getBulletRadius();
    }

    public int getColor() {
        return ((android.text.style.BulletSpan) real).getColor();
    }

    public int getGapWidth() {
        return ((android.text.style.BulletSpan) real).getGapWidth();
    }

    public int getLeadingMargin(boolean arg0) {
        return ((android.text.style.BulletSpan) real).getLeadingMargin(arg0);
    }

    public int getSpanTypeId() {
        return ((android.text.style.BulletSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.BulletSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.BulletSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STANDARD_GAP_WIDTH = android.text.style.BulletSpan.STANDARD_GAP_WIDTH;

}
