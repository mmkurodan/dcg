// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class ScientificNotation {
    private final android.icu.number.ScientificNotation real;

    public ScientificNotation(android.icu.number.ScientificNotation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.ScientificNotation wrap(android.icu.number.ScientificNotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.ScientificNotation(real);
    }

    public android.icu.number.ScientificNotation unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.ScientificNotation withExponentSignDisplay(com.micklab.dcg.wrapper.android.icu.number.NumberFormatter.SignDisplay arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(real.withExponentSignDisplay(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.number.ScientificNotation withMinExponentDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(real.withMinExponentDigits(arg0));
    }

}
