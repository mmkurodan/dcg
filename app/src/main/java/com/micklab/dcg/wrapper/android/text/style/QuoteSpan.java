// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class QuoteSpan {
    private final android.text.style.QuoteSpan real;

    public QuoteSpan(android.text.style.QuoteSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.QuoteSpan wrap(android.text.style.QuoteSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.QuoteSpan(real);
    }

    public android.text.style.QuoteSpan unwrap() {
        return real;
    }

    public QuoteSpan() {
        this(new android.text.style.QuoteSpan());
    }

    public QuoteSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.QuoteSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public QuoteSpan(int arg0) {
        this(new android.text.style.QuoteSpan(arg0));
    }

    public QuoteSpan(int arg0, int arg1, int arg2) {
        this(new android.text.style.QuoteSpan(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        real.drawLeadingMargin(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
    }

    public int getColor() {
        return real.getColor();
    }

    public int getGapWidth() {
        return real.getGapWidth();
    }

    public int getLeadingMargin(boolean arg0) {
        return real.getLeadingMargin(arg0);
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public int getStripeWidth() {
        return real.getStripeWidth();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STANDARD_COLOR = android.text.style.QuoteSpan.STANDARD_COLOR;
    public static final int STANDARD_GAP_WIDTH_PX = android.text.style.QuoteSpan.STANDARD_GAP_WIDTH_PX;
    public static final int STANDARD_STRIPE_WIDTH_PX = android.text.style.QuoteSpan.STANDARD_STRIPE_WIDTH_PX;

}
