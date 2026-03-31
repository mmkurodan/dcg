// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Half {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Half(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Half wrap(android.util.Half real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Half(real, (__DcgwBridgeToken) null);
    }

    public android.util.Half getReal() {
        return (android.util.Half) real;
    }

    public android.util.Half unwrap() {
        return getReal();
    }

    public Half(short arg0) {
        this(new android.util.Half(arg0), (__DcgwBridgeToken) null);
    }

    public Half(java.lang.String arg0) throws java.lang.NumberFormatException {
        this(new android.util.Half(arg0), (__DcgwBridgeToken) null);
    }

    public Half(float arg0) {
        this(new android.util.Half(arg0), (__DcgwBridgeToken) null);
    }

    public Half(double arg0) {
        this(new android.util.Half(arg0), (__DcgwBridgeToken) null);
    }

    public static short abs(short arg0) {
        return android.util.Half.abs(arg0);
    }

    public byte byteValue() {
        return ((android.util.Half) real).byteValue();
    }

    public static short ceil(short arg0) {
        return android.util.Half.ceil(arg0);
    }

    public static int compare(short arg0, short arg1) {
        return android.util.Half.compare(arg0, arg1);
    }

    public int compareTo(com.micklab.dcg.wrapper.android.util.Half arg0) {
        return ((android.util.Half) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public static short copySign(short arg0, short arg1) {
        return android.util.Half.copySign(arg0, arg1);
    }

    public double doubleValue() {
        return ((android.util.Half) real).doubleValue();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.Half) real).equals(arg0);
    }

    public static boolean equals(short arg0, short arg1) {
        return android.util.Half.equals(arg0, arg1);
    }

    public float floatValue() {
        return ((android.util.Half) real).floatValue();
    }

    public static short floor(short arg0) {
        return android.util.Half.floor(arg0);
    }

    public static int getExponent(short arg0) {
        return android.util.Half.getExponent(arg0);
    }

    public static int getSign(short arg0) {
        return android.util.Half.getSign(arg0);
    }

    public static int getSignificand(short arg0) {
        return android.util.Half.getSignificand(arg0);
    }

    public static boolean greater(short arg0, short arg1) {
        return android.util.Half.greater(arg0, arg1);
    }

    public static boolean greaterEquals(short arg0, short arg1) {
        return android.util.Half.greaterEquals(arg0, arg1);
    }

    public static int halfToIntBits(short arg0) {
        return android.util.Half.halfToIntBits(arg0);
    }

    public static int halfToRawIntBits(short arg0) {
        return android.util.Half.halfToRawIntBits(arg0);
    }

    public static short halfToShortBits(short arg0) {
        return android.util.Half.halfToShortBits(arg0);
    }

    public short halfValue() {
        return ((android.util.Half) real).halfValue();
    }

    public int hashCode() {
        return ((android.util.Half) real).hashCode();
    }

    public static int hashCode(short arg0) {
        return android.util.Half.hashCode(arg0);
    }

    public static short intBitsToHalf(int arg0) {
        return android.util.Half.intBitsToHalf(arg0);
    }

    public int intValue() {
        return ((android.util.Half) real).intValue();
    }

    public static boolean isInfinite(short arg0) {
        return android.util.Half.isInfinite(arg0);
    }

    public boolean isNaN() {
        return ((android.util.Half) real).isNaN();
    }

    public static boolean isNaN(short arg0) {
        return android.util.Half.isNaN(arg0);
    }

    public static boolean isNormalized(short arg0) {
        return android.util.Half.isNormalized(arg0);
    }

    public static boolean less(short arg0, short arg1) {
        return android.util.Half.less(arg0, arg1);
    }

    public static boolean lessEquals(short arg0, short arg1) {
        return android.util.Half.lessEquals(arg0, arg1);
    }

    public long longValue() {
        return ((android.util.Half) real).longValue();
    }

    public static short max(short arg0, short arg1) {
        return android.util.Half.max(arg0, arg1);
    }

    public static short min(short arg0, short arg1) {
        return android.util.Half.min(arg0, arg1);
    }

    public static short parseHalf(java.lang.String arg0) throws java.lang.NumberFormatException {
        return android.util.Half.parseHalf(arg0);
    }

    public static short round(short arg0) {
        return android.util.Half.round(arg0);
    }

    public short shortValue() {
        return ((android.util.Half) real).shortValue();
    }

    public static float toFloat(short arg0) {
        return android.util.Half.toFloat(arg0);
    }

    public static short toHalf(float arg0) {
        return android.util.Half.toHalf(arg0);
    }

    public static java.lang.String toHexString(short arg0) {
        return android.util.Half.toHexString(arg0);
    }

    public java.lang.String toString() {
        return ((android.util.Half) real).toString();
    }

    public static java.lang.String toString(short arg0) {
        return android.util.Half.toString(arg0);
    }

    public static short trunc(short arg0) {
        return android.util.Half.trunc(arg0);
    }

    public static com.micklab.dcg.wrapper.android.util.Half valueOf(short arg0) {
        return com.micklab.dcg.wrapper.android.util.Half.wrap(android.util.Half.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.util.Half valueOf(float arg0) {
        return com.micklab.dcg.wrapper.android.util.Half.wrap(android.util.Half.valueOf(arg0));
    }

    public static com.micklab.dcg.wrapper.android.util.Half valueOf(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.util.Half.wrap(android.util.Half.valueOf(arg0));
    }

    public static final short EPSILON = android.util.Half.EPSILON;
    public static final short LOWEST_VALUE = android.util.Half.LOWEST_VALUE;
    public static final int MAX_EXPONENT = android.util.Half.MAX_EXPONENT;
    public static final short MAX_VALUE = android.util.Half.MAX_VALUE;
    public static final int MIN_EXPONENT = android.util.Half.MIN_EXPONENT;
    public static final short MIN_NORMAL = android.util.Half.MIN_NORMAL;
    public static final short MIN_VALUE = android.util.Half.MIN_VALUE;
    public static final short NEGATIVE_INFINITY = android.util.Half.NEGATIVE_INFINITY;
    public static final short NEGATIVE_ZERO = android.util.Half.NEGATIVE_ZERO;
    public static final short NaN = android.util.Half.NaN;
    public static final short POSITIVE_INFINITY = android.util.Half.POSITIVE_INFINITY;
    public static final short POSITIVE_ZERO = android.util.Half.POSITIVE_ZERO;
    public static final int SIZE = android.util.Half.SIZE;

}
