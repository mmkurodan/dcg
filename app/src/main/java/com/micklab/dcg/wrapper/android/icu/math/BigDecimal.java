// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.math;

public final class BigDecimal {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BigDecimal(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal wrap(android.icu.math.BigDecimal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.math.BigDecimal(real, (__DcgwBridgeToken) null);
    }

    public android.icu.math.BigDecimal getReal() {
        return (android.icu.math.BigDecimal) real;
    }

    public android.icu.math.BigDecimal unwrap() {
        return getReal();
    }

    public BigDecimal(java.lang.String arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(java.math.BigDecimal arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(java.math.BigInteger arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(long arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(char[] arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(double arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(int arg0) {
        this(new android.icu.math.BigDecimal(arg0), (__DcgwBridgeToken) null);
    }

    public BigDecimal(java.math.BigInteger arg0, int arg1) {
        this(new android.icu.math.BigDecimal(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public BigDecimal(char[] arg0, int arg1, int arg2) {
        this(new android.icu.math.BigDecimal(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal abs() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).abs());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal abs(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).abs(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal add(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).add(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal add(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).add(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public byte byteValueExact() {
        return ((android.icu.math.BigDecimal) real).byteValueExact();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return ((android.icu.math.BigDecimal) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return ((android.icu.math.BigDecimal) real).compareTo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divide(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divide(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divide(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divide(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divide(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divideInteger(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divideInteger(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal divideInteger(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).divideInteger(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public double doubleValue() {
        return ((android.icu.math.BigDecimal) real).doubleValue();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.math.BigDecimal) real).equals(arg0);
    }

    public float floatValue() {
        return ((android.icu.math.BigDecimal) real).floatValue();
    }

    public java.lang.String format(int arg0, int arg1) {
        return ((android.icu.math.BigDecimal) real).format(arg0, arg1);
    }

    public java.lang.String format(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return ((android.icu.math.BigDecimal) real).format(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int hashCode() {
        return ((android.icu.math.BigDecimal) real).hashCode();
    }

    public int intValue() {
        return ((android.icu.math.BigDecimal) real).intValue();
    }

    public int intValueExact() {
        return ((android.icu.math.BigDecimal) real).intValueExact();
    }

    public long longValue() {
        return ((android.icu.math.BigDecimal) real).longValue();
    }

    public long longValueExact() {
        return ((android.icu.math.BigDecimal) real).longValueExact();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal max(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).max(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal max(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).max(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal min(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).min(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal min(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).min(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal movePointLeft(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).movePointLeft(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal movePointRight(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).movePointRight(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal multiply(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).multiply(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal multiply(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).multiply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal negate() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).negate());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal negate(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).negate(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal plus() {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).plus());
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal plus(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).plus(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal pow(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).pow(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal pow(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).pow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal remainder(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).remainder(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal remainder(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).remainder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int scale() {
        return ((android.icu.math.BigDecimal) real).scale();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal setScale(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).setScale(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal setScale(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).setScale(arg0, arg1));
    }

    public short shortValueExact() {
        return ((android.icu.math.BigDecimal) real).shortValueExact();
    }

    public int signum() {
        return ((android.icu.math.BigDecimal) real).signum();
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal subtract(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).subtract(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.math.BigDecimal subtract(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, com.micklab.dcg.wrapper.android.icu.math.MathContext arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(((android.icu.math.BigDecimal) real).subtract(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public java.math.BigDecimal toBigDecimal() {
        return ((android.icu.math.BigDecimal) real).toBigDecimal();
    }

    public java.math.BigInteger toBigInteger() {
        return ((android.icu.math.BigDecimal) real).toBigInteger();
    }

    public java.math.BigInteger toBigIntegerExact() {
        return ((android.icu.math.BigDecimal) real).toBigIntegerExact();
    }

    public char[] toCharArray() {
        return ((android.icu.math.BigDecimal) real).toCharArray();
    }

    public java.lang.String toString() {
        return ((android.icu.math.BigDecimal) real).toString();
    }

    public java.math.BigInteger unscaledValue() {
        return ((android.icu.math.BigDecimal) real).unscaledValue();
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal valueOf(double arg0) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.math.BigDecimal.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal valueOf(long arg0) {
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
