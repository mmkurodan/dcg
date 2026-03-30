// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class QuoteSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QuoteSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.QuoteSpan wrap(android.text.style.QuoteSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.QuoteSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.QuoteSpan getReal() {
        return (android.text.style.QuoteSpan) real;
    }

    public android.text.style.QuoteSpan unwrap() {
        return getReal();
    }

    public QuoteSpan() {
        this(new android.text.style.QuoteSpan(), (__DcgwBridgeToken) null);
    }

    public QuoteSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.QuoteSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public QuoteSpan(int arg0) {
        this(new android.text.style.QuoteSpan(arg0), (__DcgwBridgeToken) null);
    }

    public QuoteSpan(int arg0, int arg1, int arg2) {
        this(new android.text.style.QuoteSpan(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.QuoteSpan) real).describeContents();
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        ((android.text.style.QuoteSpan) real).drawLeadingMargin(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
    }

    public int getColor() {
        return ((android.text.style.QuoteSpan) real).getColor();
    }

    public int getGapWidth() {
        return ((android.text.style.QuoteSpan) real).getGapWidth();
    }

    public int getLeadingMargin(boolean arg0) {
        return ((android.text.style.QuoteSpan) real).getLeadingMargin(arg0);
    }

    public int getSpanTypeId() {
        return ((android.text.style.QuoteSpan) real).getSpanTypeId();
    }

    public int getStripeWidth() {
        return ((android.text.style.QuoteSpan) real).getStripeWidth();
    }

    public java.lang.String toString() {
        return ((android.text.style.QuoteSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.QuoteSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STANDARD_COLOR = android.text.style.QuoteSpan.STANDARD_COLOR;
    public static final int STANDARD_GAP_WIDTH_PX = android.text.style.QuoteSpan.STANDARD_GAP_WIDTH_PX;
    public static final int STANDARD_STRIPE_WIDTH_PX = android.text.style.QuoteSpan.STANDARD_STRIPE_WIDTH_PX;

}
