// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class NumberRangeFormatterSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberRangeFormatterSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatterSettings wrap(android.icu.number.NumberRangeFormatterSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatterSettings(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.NumberRangeFormatterSettings getReal() {
        return (android.icu.number.NumberRangeFormatterSettings) real;
    }

    public android.icu.number.NumberRangeFormatterSettings unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.number.NumberRangeFormatterSettings) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.icu.number.NumberRangeFormatterSettings) real).hashCode();
    }

}
