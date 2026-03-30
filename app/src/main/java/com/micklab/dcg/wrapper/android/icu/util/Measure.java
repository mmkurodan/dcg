// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Measure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Measure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Measure wrap(android.icu.util.Measure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Measure(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.Measure getReal() {
        return (android.icu.util.Measure) real;
    }

    public android.icu.util.Measure unwrap() {
        return getReal();
    }

    public Measure(java.lang.Number arg0, com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg1) {
        this(new android.icu.util.Measure(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.util.Measure) real).equals(arg0);
    }

    public java.lang.Number getNumber() {
        return ((android.icu.util.Measure) real).getNumber();
    }

    public com.micklab.dcg.wrapper.android.icu.util.MeasureUnit getUnit() {
        return com.micklab.dcg.wrapper.android.icu.util.MeasureUnit.wrap(((android.icu.util.Measure) real).getUnit());
    }

    public int hashCode() {
        return ((android.icu.util.Measure) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.icu.util.Measure) real).toString();
    }

}
