// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Rational {
    private final android.util.Rational real;

    public Rational(android.util.Rational real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Rational wrap(android.util.Rational real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Rational(real);
    }

    public android.util.Rational unwrap() {
        return real;
    }

    public Rational(int arg0, int arg1) {
        this(new android.util.Rational(arg0, arg1));
    }

    public int compareTo(com.micklab.dcg.wrapper.android.util.Rational arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public double doubleValue() {
        return real.doubleValue();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float floatValue() {
        return real.floatValue();
    }

    public int getDenominator() {
        return real.getDenominator();
    }

    public int getNumerator() {
        return real.getNumerator();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int intValue() {
        return real.intValue();
    }

    public boolean isFinite() {
        return real.isFinite();
    }

    public boolean isInfinite() {
        return real.isInfinite();
    }

    public boolean isNaN() {
        return real.isNaN();
    }

    public boolean isZero() {
        return real.isZero();
    }

    public long longValue() {
        return real.longValue();
    }

    public static com.micklab.dcg.wrapper.android.util.Rational parseRational(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.parseRational(arg0));
    }

    public short shortValue() {
        return real.shortValue();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.util.Rational NEGATIVE_INFINITY = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.NEGATIVE_INFINITY);
    public static final com.micklab.dcg.wrapper.android.util.Rational NaN = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.NaN);
    public static final com.micklab.dcg.wrapper.android.util.Rational POSITIVE_INFINITY = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.POSITIVE_INFINITY);
    public static final com.micklab.dcg.wrapper.android.util.Rational ZERO = com.micklab.dcg.wrapper.android.util.Rational.wrap(android.util.Rational.ZERO);

}
