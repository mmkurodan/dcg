// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class IndianCalendar {
    private final android.icu.util.IndianCalendar real;

    public IndianCalendar(android.icu.util.IndianCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.IndianCalendar wrap(android.icu.util.IndianCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.IndianCalendar(real);
    }

    public android.icu.util.IndianCalendar unwrap() {
        return real;
    }

    public IndianCalendar() {
        this(new android.icu.util.IndianCalendar());
    }

    public IndianCalendar(java.util.Date arg0) {
        this(new android.icu.util.IndianCalendar(arg0));
    }

    public IndianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.IndianCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public IndianCalendar(java.util.Locale arg0) {
        this(new android.icu.util.IndianCalendar(arg0));
    }

    public IndianCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.IndianCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public IndianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.IndianCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public IndianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.IndianCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public IndianCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.IndianCalendar(arg0, arg1, arg2));
    }

    public IndianCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.IndianCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final int AGRAHAYANA = android.icu.util.IndianCalendar.AGRAHAYANA;
    public static final int ASADHA = android.icu.util.IndianCalendar.ASADHA;
    public static final int ASVINA = android.icu.util.IndianCalendar.ASVINA;
    public static final int BHADRA = android.icu.util.IndianCalendar.BHADRA;
    public static final int CHAITRA = android.icu.util.IndianCalendar.CHAITRA;
    public static final int IE = android.icu.util.IndianCalendar.IE;
    public static final int JYAISTHA = android.icu.util.IndianCalendar.JYAISTHA;
    public static final int KARTIKA = android.icu.util.IndianCalendar.KARTIKA;
    public static final int MAGHA = android.icu.util.IndianCalendar.MAGHA;
    public static final int PAUSA = android.icu.util.IndianCalendar.PAUSA;
    public static final int PHALGUNA = android.icu.util.IndianCalendar.PHALGUNA;
    public static final int SRAVANA = android.icu.util.IndianCalendar.SRAVANA;
    public static final int VAISAKHA = android.icu.util.IndianCalendar.VAISAKHA;

}
