// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.math;

public final class BigDecimal {
    private final android.icu.math.BigDecimal real;

    public BigDecimal(android.icu.math.BigDecimal real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal wrap(android.icu.math.BigDecimal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.math.BigDecimal(real);
    }

    public android.icu.math.BigDecimal unwrap() {
        return real;
    }

    public BigDecimal(double arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(int arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(long arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(java.lang.String arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(java.math.BigDecimal arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(java.math.BigInteger arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(char[] arg0) {
        this(new android.icu.math.BigDecimal(arg0));
    }

    public BigDecimal(java.math.BigInteger arg0, int arg1) {
        this(new android.icu.math.BigDecimal(arg0, arg1));
    }

    public BigDecimal(char[] arg0, int arg1, int arg2) {
        this(new android.icu.math.BigDecimal(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal abs() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.abs());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal abs(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.abs(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal add(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.add(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal add(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.add(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public byte byteValueExact() {
        return real.byteValueExact();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divide(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divide(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divide(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divide(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divideInteger(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divideInteger(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divideInteger(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.divideInteger(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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

    public java.lang.String format(int arg0, int arg1) {
        return real.format(arg0, arg1);
    }

    public java.lang.String format(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return real.format(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int intValue() {
        return real.intValue();
    }

    public int intValueExact() {
        return real.intValueExact();
    }

    public long longValue() {
        return real.longValue();
    }

    public long longValueExact() {
        return real.longValueExact();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal max(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.max(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal max(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.max(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal min(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.min(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal min(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.min(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal movePointLeft(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.movePointLeft(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal movePointRight(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.movePointRight(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal multiply(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.multiply(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal multiply(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.multiply(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal negate() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.negate());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal negate(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.negate(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal plus() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.plus());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal plus(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.plus(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal pow(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.pow(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal pow(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.pow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal remainder(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.remainder(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal remainder(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.remainder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int scale() {
        return real.scale();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal setScale(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.setScale(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal setScale(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.setScale(arg0, arg1));
    }

    public short shortValueExact() {
        return real.shortValueExact();
    }

    public int signum() {
        return real.signum();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal subtract(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.subtract(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal subtract(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(real.subtract(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.math.BigDecimal toBigDecimal() {
        return real.toBigDecimal();
    }

    public java.math.BigInteger toBigInteger() {
        return real.toBigInteger();
    }

    public java.math.BigInteger toBigIntegerExact() {
        return real.toBigIntegerExact();
    }

    public char[] toCharArray() {
        return real.toCharArray();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public java.math.BigInteger unscaledValue() {
        return real.unscaledValue();
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal valueOf(long arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal valueOf(double arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal valueOf(long arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.valueOf(arg0, arg1));
    }

    public static final com.micklab.dcg.wrapper.android.icu.math.BigDecimal ONE = com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.ONE);
    public static final int ROUND_CEILING = android.icu.math.BigDecimal.ROUND_CEILING;
    public static final int ROUND_DOWN = android.icu.math.BigDecimal.ROUND_DOWN;
    public static final int ROUND_FLOOR = android.icu.math.BigDecimal.ROUND_FLOOR;
    public static final int ROUND_HALF_DOWN = android.icu.math.BigDecimal.ROUND_HALF_DOWN;
    public static final int ROUND_HALF_EVEN = android.icu.math.BigDecimal.ROUND_HALF_EVEN;
    public static final int ROUND_HALF_UP = android.icu.math.BigDecimal.ROUND_HALF_UP;
    public static final int ROUND_UNNECESSARY = android.icu.math.BigDecimal.ROUND_UNNECESSARY;
    public static final int ROUND_UP = android.icu.math.BigDecimal.ROUND_UP;
    public static final com.micklab.dcg.wrapper.android.icu.math.BigDecimal TEN = com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.TEN);
    public static final com.micklab.dcg.wrapper.android.icu.math.BigDecimal ZERO = com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.ZERO);

}
