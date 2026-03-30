// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class HebrewCalendar {
    private final android.icu.util.HebrewCalendar real;

    public HebrewCalendar(android.icu.util.HebrewCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.HebrewCalendar wrap(android.icu.util.HebrewCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.HebrewCalendar(real);
    }

    public android.icu.util.HebrewCalendar unwrap() {
        return real;
    }

    public HebrewCalendar() {
        this(new android.icu.util.HebrewCalendar());
    }

    public HebrewCalendar(java.util.Date arg0) {
        this(new android.icu.util.HebrewCalendar(arg0));
    }

    public HebrewCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.HebrewCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public HebrewCalendar(java.util.Locale arg0) {
        this(new android.icu.util.HebrewCalendar(arg0));
    }

    public HebrewCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.HebrewCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public HebrewCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.HebrewCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public HebrewCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.HebrewCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public HebrewCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.HebrewCalendar(arg0, arg1, arg2));
    }

    public HebrewCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.HebrewCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public void add(int arg0, int arg1) {
        real.add(arg0, arg1);
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void roll(int arg0, int arg1) {
        real.roll(arg0, arg1);
    }

    public static final int ADAR = android.icu.util.HebrewCalendar.ADAR;
    public static final int ADAR_1 = android.icu.util.HebrewCalendar.ADAR_1;
    public static final int AV = android.icu.util.HebrewCalendar.AV;
    public static final int ELUL = android.icu.util.HebrewCalendar.ELUL;
    public static final int HESHVAN = android.icu.util.HebrewCalendar.HESHVAN;
    public static final int IYAR = android.icu.util.HebrewCalendar.IYAR;
    public static final int KISLEV = android.icu.util.HebrewCalendar.KISLEV;
    public static final int NISAN = android.icu.util.HebrewCalendar.NISAN;
    public static final int SHEVAT = android.icu.util.HebrewCalendar.SHEVAT;
    public static final int SIVAN = android.icu.util.HebrewCalendar.SIVAN;
    public static final int TAMUZ = android.icu.util.HebrewCalendar.TAMUZ;
    public static final int TEVET = android.icu.util.HebrewCalendar.TEVET;
    public static final int TISHRI = android.icu.util.HebrewCalendar.TISHRI;

}
