// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class JapaneseCalendar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JapaneseCalendar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.JapaneseCalendar wrap(android.icu.util.JapaneseCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.JapaneseCalendar(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.JapaneseCalendar getReal() {
        return (android.icu.util.JapaneseCalendar) real;
    }

    public android.icu.util.JapaneseCalendar unwrap() {
        return getReal();
    }

    public JapaneseCalendar() {
        this(new android.icu.util.JapaneseCalendar(), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(java.util.Date arg0) {
        this(new android.icu.util.JapaneseCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(java.util.Locale arg0) {
        this(new android.icu.util.JapaneseCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.JapaneseCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.JapaneseCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.JapaneseCalendar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.JapaneseCalendar(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.JapaneseCalendar(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(int arg0, int arg1, int arg2, int arg3) {
        this(new android.icu.util.JapaneseCalendar(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public JapaneseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.JapaneseCalendar(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int getActualMaximum(int arg0) {
        return ((android.icu.util.JapaneseCalendar) real).getActualMaximum(arg0);
    }

    public java.lang.String getType() {
        return ((android.icu.util.JapaneseCalendar) real).getType();
    }

    public static final int HEISEI = android.icu.util.JapaneseCalendar.HEISEI;
    public static final int MEIJI = android.icu.util.JapaneseCalendar.MEIJI;
    public static final int REIWA = android.icu.util.JapaneseCalendar.REIWA;
    public static final int SHOWA = android.icu.util.JapaneseCalendar.SHOWA;
    public static final int TAISHO = android.icu.util.JapaneseCalendar.TAISHO;

}
