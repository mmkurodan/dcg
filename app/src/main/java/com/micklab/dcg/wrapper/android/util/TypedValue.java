// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TypedValue {
    private final android.util.TypedValue real;

    public TypedValue(android.util.TypedValue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TypedValue wrap(android.util.TypedValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TypedValue(real);
    }

    public android.util.TypedValue unwrap() {
        return real;
    }

    public TypedValue() {
        this(new android.util.TypedValue());
    }

    public static float applyDimension(int arg0, float arg1, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg2) {
        return android.util.TypedValue.applyDimension(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence coerceToString() {
        return real.coerceToString();
    }

    public static java.lang.String coerceToString(int arg0, int arg1) {
        return android.util.TypedValue.coerceToString(arg0, arg1);
    }

    public static float complexToDimension(int arg0, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg1) {
        return android.util.TypedValue.complexToDimension(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static int complexToDimensionPixelOffset(int arg0, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg1) {
        return android.util.TypedValue.complexToDimensionPixelOffset(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static int complexToDimensionPixelSize(int arg0, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg1) {
        return android.util.TypedValue.complexToDimensionPixelSize(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static float complexToFloat(int arg0) {
        return android.util.TypedValue.complexToFloat(arg0);
    }

    public static float complexToFraction(int arg0, float arg1, float arg2) {
        return android.util.TypedValue.complexToFraction(arg0, arg1, arg2);
    }

    public static float convertDimensionToPixels(int arg0, float arg1, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg2) {
        return android.util.TypedValue.convertDimensionToPixels(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static float convertPixelsToDimension(int arg0, float arg1, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg2) {
        return android.util.TypedValue.convertPixelsToDimension(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static float deriveDimension(int arg0, float arg1, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg2) {
        return android.util.TypedValue.deriveDimension(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public int getComplexUnit() {
        return real.getComplexUnit();
    }

    public float getDimension(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return real.getDimension(arg0 == null ? null : arg0.unwrap());
    }

    public float getFloat() {
        return real.getFloat();
    }

    public float getFraction(float arg0, float arg1) {
        return real.getFraction(arg0, arg1);
    }

    public boolean isColorType() {
        return real.isColorType();
    }

    public void setTo(com.micklab.dcg.wrapper.android.util.TypedValue arg0) {
        real.setTo(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int COMPLEX_MANTISSA_MASK = android.util.TypedValue.COMPLEX_MANTISSA_MASK;
    public static final int COMPLEX_MANTISSA_SHIFT = android.util.TypedValue.COMPLEX_MANTISSA_SHIFT;
    public static final int COMPLEX_RADIX_0p23 = android.util.TypedValue.COMPLEX_RADIX_0p23;
    public static final int COMPLEX_RADIX_16p7 = android.util.TypedValue.COMPLEX_RADIX_16p7;
    public static final int COMPLEX_RADIX_23p0 = android.util.TypedValue.COMPLEX_RADIX_23p0;
    public static final int COMPLEX_RADIX_8p15 = android.util.TypedValue.COMPLEX_RADIX_8p15;
    public static final int COMPLEX_RADIX_MASK = android.util.TypedValue.COMPLEX_RADIX_MASK;
    public static final int COMPLEX_RADIX_SHIFT = android.util.TypedValue.COMPLEX_RADIX_SHIFT;
    public static final int COMPLEX_UNIT_DIP = android.util.TypedValue.COMPLEX_UNIT_DIP;
    public static final int COMPLEX_UNIT_FRACTION = android.util.TypedValue.COMPLEX_UNIT_FRACTION;
    public static final int COMPLEX_UNIT_FRACTION_PARENT = android.util.TypedValue.COMPLEX_UNIT_FRACTION_PARENT;
    public static final int COMPLEX_UNIT_IN = android.util.TypedValue.COMPLEX_UNIT_IN;
    public static final int COMPLEX_UNIT_MASK = android.util.TypedValue.COMPLEX_UNIT_MASK;
    public static final int COMPLEX_UNIT_MM = android.util.TypedValue.COMPLEX_UNIT_MM;
    public static final int COMPLEX_UNIT_PT = android.util.TypedValue.COMPLEX_UNIT_PT;
    public static final int COMPLEX_UNIT_PX = android.util.TypedValue.COMPLEX_UNIT_PX;
    public static final int COMPLEX_UNIT_SHIFT = android.util.TypedValue.COMPLEX_UNIT_SHIFT;
    public static final int COMPLEX_UNIT_SP = android.util.TypedValue.COMPLEX_UNIT_SP;
    public static final int DATA_NULL_EMPTY = android.util.TypedValue.DATA_NULL_EMPTY;
    public static final int DATA_NULL_UNDEFINED = android.util.TypedValue.DATA_NULL_UNDEFINED;
    public static final int DENSITY_DEFAULT = android.util.TypedValue.DENSITY_DEFAULT;
    public static final int DENSITY_NONE = android.util.TypedValue.DENSITY_NONE;
    public static final int TYPE_ATTRIBUTE = android.util.TypedValue.TYPE_ATTRIBUTE;
    public static final int TYPE_DIMENSION = android.util.TypedValue.TYPE_DIMENSION;
    public static final int TYPE_FIRST_COLOR_INT = android.util.TypedValue.TYPE_FIRST_COLOR_INT;
    public static final int TYPE_FIRST_INT = android.util.TypedValue.TYPE_FIRST_INT;
    public static final int TYPE_FLOAT = android.util.TypedValue.TYPE_FLOAT;
    public static final int TYPE_FRACTION = android.util.TypedValue.TYPE_FRACTION;
    public static final int TYPE_INT_BOOLEAN = android.util.TypedValue.TYPE_INT_BOOLEAN;
    public static final int TYPE_INT_COLOR_ARGB4 = android.util.TypedValue.TYPE_INT_COLOR_ARGB4;
    public static final int TYPE_INT_COLOR_ARGB8 = android.util.TypedValue.TYPE_INT_COLOR_ARGB8;
    public static final int TYPE_INT_COLOR_RGB4 = android.util.TypedValue.TYPE_INT_COLOR_RGB4;
    public static final int TYPE_INT_COLOR_RGB8 = android.util.TypedValue.TYPE_INT_COLOR_RGB8;
    public static final int TYPE_INT_DEC = android.util.TypedValue.TYPE_INT_DEC;
    public static final int TYPE_INT_HEX = android.util.TypedValue.TYPE_INT_HEX;
    public static final int TYPE_LAST_COLOR_INT = android.util.TypedValue.TYPE_LAST_COLOR_INT;
    public static final int TYPE_LAST_INT = android.util.TypedValue.TYPE_LAST_INT;
    public static final int TYPE_NULL = android.util.TypedValue.TYPE_NULL;
    public static final int TYPE_REFERENCE = android.util.TypedValue.TYPE_REFERENCE;
    public static final int TYPE_STRING = android.util.TypedValue.TYPE_STRING;

}
