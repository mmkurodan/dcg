// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class TextElementListener {
    private final android.sax.TextElementListener real;

    public TextElementListener(android.sax.TextElementListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.TextElementListener wrap(android.sax.TextElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.TextElementListener(real);
    }

    public android.sax.TextElementListener unwrap() {
        return real;
    }

}
