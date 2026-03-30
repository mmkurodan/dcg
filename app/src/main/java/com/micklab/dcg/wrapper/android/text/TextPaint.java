// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextPaint {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextPaint(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextPaint wrap(android.text.TextPaint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextPaint(real, (__DcgwBridgeToken) null);
    }

    public android.text.TextPaint getReal() {
        return (android.text.TextPaint) real;
    }

    public android.text.TextPaint unwrap() {
        return getReal();
    }

    public TextPaint() {
        this(new android.text.TextPaint(), (__DcgwBridgeToken) null);
    }

    public TextPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        this(new android.text.TextPaint(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextPaint(int arg0) {
        this(new android.text.TextPaint(arg0), (__DcgwBridgeToken) null);
    }

    public float getUnderlineThickness() {
        return ((android.text.TextPaint) real).getUnderlineThickness();
    }

    public void set(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.TextPaint) real).set(arg0 == null ? null : arg0.getReal());
    }


}
