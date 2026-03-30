// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.math;

public final class MathContext {
    private final android.icu.math.MathContext real;

    public MathContext(android.icu.math.MathContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.math.MathContext wrap(android.icu.math.MathContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.math.MathContext(real);
    }

    public android.icu.math.MathContext unwrap() {
        return real;
    }

    public MathContext(int arg0) {
        this(new android.icu.math.MathContext(arg0));
    }

    public MathContext(int arg0, int arg1) {
        this(new android.icu.math.MathContext(arg0, arg1));
    }

    public MathContext(int arg0, int arg1, boolean arg2) {
        this(new android.icu.math.MathContext(arg0, arg1, arg2));
    }

    public MathContext(int arg0, int arg1, boolean arg2, int arg3) {
        this(new android.icu.math.MathContext(arg0, arg1, arg2, arg3));
    }

    public int getDigits() {
        return real.getDigits();
    }

    public int getForm() {
        return real.getForm();
    }

    public boolean getLostDigits() {
        return real.getLostDigits();
    }

    public int getRoundingMode() {
        return real.getRoundingMode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.icu.math.MathContext DEFAULT = com.micklab.dcg.wrapper.android.icu.math.MathContext.wrap(android.icu.math.MathContext.DEFAULT);
    public static final int ENGINEERING = android.icu.math.MathContext.ENGINEERING;
    public static final int PLAIN = android.icu.math.MathContext.PLAIN;
    public static final int ROUND_CEILING = android.icu.math.MathContext.ROUND_CEILING;
    public static final int ROUND_DOWN = android.icu.math.MathContext.ROUND_DOWN;
    public static final int ROUND_FLOOR = android.icu.math.MathContext.ROUND_FLOOR;
    public static final int ROUND_HALF_DOWN = android.icu.math.MathContext.ROUND_HALF_DOWN;
    public static final int ROUND_HALF_EVEN = android.icu.math.MathContext.ROUND_HALF_EVEN;
    public static final int ROUND_HALF_UP = android.icu.math.MathContext.ROUND_HALF_UP;
    public static final int ROUND_UNNECESSARY = android.icu.math.MathContext.ROUND_UNNECESSARY;
    public static final int ROUND_UP = android.icu.math.MathContext.ROUND_UP;
    public static final int SCIENTIFIC = android.icu.math.MathContext.SCIENTIFIC;

}
