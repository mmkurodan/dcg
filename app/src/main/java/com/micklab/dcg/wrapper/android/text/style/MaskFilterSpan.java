// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class MaskFilterSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MaskFilterSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.MaskFilterSpan wrap(android.text.style.MaskFilterSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.MaskFilterSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.MaskFilterSpan getReal() {
        return (android.text.style.MaskFilterSpan) real;
    }

    public android.text.style.MaskFilterSpan unwrap() {
        return getReal();
    }

    public MaskFilterSpan(com.micklab.dcg.wrapper.android.graphics.MaskFilter arg0) {
        this(new android.text.style.MaskFilterSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter getMaskFilter() {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(((android.text.style.MaskFilterSpan) real).getMaskFilter());
    }

    public java.lang.String toString() {
        return ((android.text.style.MaskFilterSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.MaskFilterSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

}
