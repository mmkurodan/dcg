// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class NumberFormatterSettings {
    private final android.icu.number.NumberFormatterSettings real;

    public NumberFormatterSettings(android.icu.number.NumberFormatterSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.NumberFormatterSettings wrap(android.icu.number.NumberFormatterSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.NumberFormatterSettings(real);
    }

    public android.icu.number.NumberFormatterSettings unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

}
