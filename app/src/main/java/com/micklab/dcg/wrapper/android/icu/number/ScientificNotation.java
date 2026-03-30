// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class ScientificNotation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScientificNotation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.ScientificNotation wrap(android.icu.number.ScientificNotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.ScientificNotation(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.ScientificNotation getReal() {
        return (android.icu.number.ScientificNotation) real;
    }

    public android.icu.number.ScientificNotation unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.ScientificNotation withExponentSignDisplay(com.micklab.dcg.wrapper.android.icu.number.NumberFormatter.SignDisplay arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(((android.icu.number.ScientificNotation) real).withExponentSignDisplay(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.number.ScientificNotation withMinExponentDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.ScientificNotation.wrap(((android.icu.number.ScientificNotation) real).withMinExponentDigits(arg0));
    }

}
