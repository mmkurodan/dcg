// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.util;

public final class Rfc822Tokenizer {
    private final android.text.util.Rfc822Tokenizer real;

    public Rfc822Tokenizer(android.text.util.Rfc822Tokenizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.util.Rfc822Tokenizer wrap(android.text.util.Rfc822Tokenizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Rfc822Tokenizer(real);
    }

    public android.text.util.Rfc822Tokenizer unwrap() {
        return real;
    }

    public Rfc822Tokenizer() {
        this(new android.text.util.Rfc822Tokenizer());
    }

    public int findTokenEnd(java.lang.CharSequence arg0, int arg1) {
        return real.findTokenEnd(arg0, arg1);
    }

    public int findTokenStart(java.lang.CharSequence arg0, int arg1) {
        return real.findTokenStart(arg0, arg1);
    }

    public java.lang.CharSequence terminateToken(java.lang.CharSequence arg0) {
        return real.terminateToken(arg0);
    }

    public static android.text.util.Rfc822Token[] tokenize(java.lang.CharSequence arg0) {
        return android.text.util.Rfc822Tokenizer.tokenize(arg0);
    }

}
