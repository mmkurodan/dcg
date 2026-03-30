// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Rational {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Rational(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Rational wrap(android.util.Rational real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Rational(real, (__DcgwBridgeToken) null);
    }

    public android.util.Rational getReal() {
        return (android.util.Rational) real;
    }

    public android.util.Rational unwrap() {
        return getReal();
    }

    public Rational(int arg0, int arg1) {
        this(new android.util.Rational(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int compareTo(com.micklab.dcg.wrapper.android.util.Rational arg0) {
        return ((android.util.Rational) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public double doubleValue() {
        return ((android.util.Rational) real).doubleValue();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.Rational) real).equals(arg0);
    }

    public float floatValue() {
        return ((android.util.Rational) real).floatValue();
    }

    public int getDenominator() {
        return ((android.util.Rational) real).getDenominator();
    }

    public int getNumerator() {
        return ((android.util.Rational) real).getNumerator();
    }

    public int hashCode() {
        return ((android.util.Rational) real).hashCode();
    }

    public int intValue() {
        return ((android.util.Rational) real).intValue();
    }

    public boolean isFinite() {
        return ((android.util.Rational) real).isFinite();
    }

    public boolean isInfinite() {
        return ((android.util.Rational) real).isInfinite();
    }

    public boolean isNaN() {
        return ((android.util.Rational) real).isNaN();
    }

    public boolean isZero() {
        return ((android.util.Rational) real).isZero();
    }

    public long longValue() {
        return ((android.util.Rational) real).longValue();
    }

    public static com.micklab.dcg.wrapper.android.util.Rational parseRational(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.parseRational(arg0));
    }

    public short shortValue() {
        return ((android.util.Rational) real).shortValue();
    }

    public java.lang.String toString() {
        return ((android.util.Rational) real).toString();
    }

    public static final com.micklab.dcg.wrapper.android.util.Rational NEGATIVE_INFINITY = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.NEGATIVE_INFINITY);
    public static final com.micklab.dcg.wrapper.android.util.Rational NaN = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.NaN);
    public static final com.micklab.dcg.wrapper.android.util.Rational POSITIVE_INFINITY = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.POSITIVE_INFINITY);
    public static final com.micklab.dcg.wrapper.android.util.Rational ZERO = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.ZERO);

}
