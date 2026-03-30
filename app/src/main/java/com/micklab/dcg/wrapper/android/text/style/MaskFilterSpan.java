// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class MaskFilterSpan {
    private final android.text.style.MaskFilterSpan real;

    public MaskFilterSpan(android.text.style.MaskFilterSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.MaskFilterSpan wrap(android.text.style.MaskFilterSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.MaskFilterSpan(real);
    }

    public android.text.style.MaskFilterSpan unwrap() {
        return real;
    }

    public MaskFilterSpan(com.micklab.dcg.wrapper.android.graphics.MaskFilter arg0) {
        this(new android.text.style.MaskFilterSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter getMaskFilter() {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(real.getMaskFilter());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

}
