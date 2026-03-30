// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextPaint {
    private final android.text.TextPaint real;

    public TextPaint(android.text.TextPaint real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextPaint wrap(android.text.TextPaint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextPaint(real);
    }

    public android.text.TextPaint unwrap() {
        return real;
    }

    public TextPaint() {
        this(new android.text.TextPaint());
    }

    public TextPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        this(new android.text.TextPaint(arg0 == null ? null : arg0.unwrap()));
    }

    public TextPaint(int arg0) {
        this(new android.text.TextPaint(arg0));
    }

    public float getUnderlineThickness() {
        return real.getUnderlineThickness();
    }

    public void set(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }


}
