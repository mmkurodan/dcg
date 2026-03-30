// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ParagraphStyle {
    private final android.text.style.ParagraphStyle real;

    public ParagraphStyle(android.text.style.ParagraphStyle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ParagraphStyle wrap(android.text.style.ParagraphStyle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ParagraphStyle(real);
    }

    public android.text.style.ParagraphStyle unwrap() {
        return real;
    }

}
