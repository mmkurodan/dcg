// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class NumberRangeFormatterSettings {
    private final android.icu.number.NumberRangeFormatterSettings real;

    public NumberRangeFormatterSettings(android.icu.number.NumberRangeFormatterSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatterSettings wrap(android.icu.number.NumberRangeFormatterSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatterSettings(real);
    }

    public android.icu.number.NumberRangeFormatterSettings unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

}
