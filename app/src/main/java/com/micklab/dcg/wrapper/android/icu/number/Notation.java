// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class Notation {
    private final android.icu.number.Notation real;

    public Notation(android.icu.number.Notation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Notation wrap(android.icu.number.Notation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.Notation(real);
    }

    public android.icu.number.Notation unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CompactNotation compactLong() {
        return com.micklab.dcg.wrapper.android.icu.number.CompactNotation.wrap(android.icu.number.Notation.compactLong());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CompactNotation compactShort() {
        return com.micklab.dcg.wrapper.android.icu.number.CompactNotation.wrap(android.icu.number.Notation.compactShort());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.ScientificNotation engineering() {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(android.icu.number.Notation.engineering());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.ScientificNotation scientific() {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(android.icu.number.Notation.scientific());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.SimpleNotation simple() {
        return com.micklab.dcg.wrapper.android.icu.number.SimpleNotation.wrap(android.icu.number.Notation.simple());
    }

}
