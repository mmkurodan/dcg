// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class UniversalTimeScale {
    private final android.icu.util.UniversalTimeScale real;

    public UniversalTimeScale(android.icu.util.UniversalTimeScale real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.UniversalTimeScale wrap(android.icu.util.UniversalTimeScale real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.UniversalTimeScale(real);
    }

    public android.icu.util.UniversalTimeScale unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal bigDecimalFrom(long arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.util.UniversalTimeScale.bigDecimalFrom(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal bigDecimalFrom(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.util.UniversalTimeScale.bigDecimalFrom(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal bigDecimalFrom(double arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.util.UniversalTimeScale.bigDecimalFrom(arg0, arg1));
    }

    public static long from(long arg0, int arg1) {
        return android.icu.util.UniversalTimeScale.from(arg0, arg1);
    }

    public static long getTimeScaleValue(int arg0, int arg1) {
        return android.icu.util.UniversalTimeScale.getTimeScaleValue(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal toBigDecimal(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.util.UniversalTimeScale.toBigDecimal(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.math.BigDecimal toBigDecimal(long arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.math.BigDecimal.wrap(android.icu.util.UniversalTimeScale.toBigDecimal(arg0, arg1));
    }

    public static long toLong(long arg0, int arg1) {
        return android.icu.util.UniversalTimeScale.toLong(arg0, arg1);
    }

    public static final int DB2_TIME = android.icu.util.UniversalTimeScale.DB2_TIME;
    public static final int DOTNET_DATE_TIME = android.icu.util.UniversalTimeScale.DOTNET_DATE_TIME;
    public static final int EPOCH_OFFSET_PLUS_1_VALUE = android.icu.util.UniversalTimeScale.EPOCH_OFFSET_PLUS_1_VALUE;
    public static final int EPOCH_OFFSET_VALUE = android.icu.util.UniversalTimeScale.EPOCH_OFFSET_VALUE;
    public static final int EXCEL_TIME = android.icu.util.UniversalTimeScale.EXCEL_TIME;
    public static final int FROM_MAX_VALUE = android.icu.util.UniversalTimeScale.FROM_MAX_VALUE;
    public static final int FROM_MIN_VALUE = android.icu.util.UniversalTimeScale.FROM_MIN_VALUE;
    public static final int ICU4C_TIME = android.icu.util.UniversalTimeScale.ICU4C_TIME;
    public static final int JAVA_TIME = android.icu.util.UniversalTimeScale.JAVA_TIME;
    public static final int MAC_OLD_TIME = android.icu.util.UniversalTimeScale.MAC_OLD_TIME;
    public static final int MAC_TIME = android.icu.util.UniversalTimeScale.MAC_TIME;
    public static final int MAX_SCALE = android.icu.util.UniversalTimeScale.MAX_SCALE;
    public static final int TO_MAX_VALUE = android.icu.util.UniversalTimeScale.TO_MAX_VALUE;
    public static final int TO_MIN_VALUE = android.icu.util.UniversalTimeScale.TO_MIN_VALUE;
    public static final int UNITS_VALUE = android.icu.util.UniversalTimeScale.UNITS_VALUE;
    public static final int UNIX_MICROSECONDS_TIME = android.icu.util.UniversalTimeScale.UNIX_MICROSECONDS_TIME;
    public static final int UNIX_TIME = android.icu.util.UniversalTimeScale.UNIX_TIME;

}
