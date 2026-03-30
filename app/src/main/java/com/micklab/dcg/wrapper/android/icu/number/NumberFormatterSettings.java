// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class NumberFormatterSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberFormatterSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.NumberFormatterSettings wrap(android.icu.number.NumberFormatterSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.NumberFormatterSettings(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.NumberFormatterSettings getReal() {
        return (android.icu.number.NumberFormatterSettings) real;
    }

    public android.icu.number.NumberFormatterSettings unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.number.NumberFormatterSettings) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.icu.number.NumberFormatterSettings) real).hashCode();
    }

}
