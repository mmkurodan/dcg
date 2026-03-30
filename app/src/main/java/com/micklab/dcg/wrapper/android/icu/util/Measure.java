// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Measure {
    private final android.icu.util.Measure real;

    public Measure(android.icu.util.Measure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Measure wrap(android.icu.util.Measure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Measure(real);
    }

    public android.icu.util.Measure unwrap() {
        return real;
    }

    public Measure(java.lang.Number arg0, com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg1) {
        this(new android.icu.util.Measure(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.Number getNumber() {
        return real.getNumber();
    }

    public com.micklab.dcg.wrapper.android.icu.util.MeasureUnit getUnit() {
        return com.micklab.dcg.wrapper.android.icu.util.MeasureUnit.wrap(real.getUnit());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
