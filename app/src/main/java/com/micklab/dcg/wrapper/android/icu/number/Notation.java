// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class Notation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Notation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Notation wrap(android.icu.number.Notation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.Notation(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.Notation getReal() {
        return (android.icu.number.Notation) real;
    }

    public android.icu.number.Notation unwrap() {
        return getReal();
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
