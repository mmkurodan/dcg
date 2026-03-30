// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ChineseCalendar {
    private final android.icu.util.ChineseCalendar real;

    public ChineseCalendar(android.icu.util.ChineseCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ChineseCalendar wrap(android.icu.util.ChineseCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ChineseCalendar(real);
    }

    public android.icu.util.ChineseCalendar unwrap() {
        return real;
    }

    public ChineseCalendar() {
        this(new android.icu.util.ChineseCalendar());
    }

    public ChineseCalendar(java.util.Locale arg0) {
        this(new android.icu.util.ChineseCalendar(arg0));
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public ChineseCalendar(java.util.Date arg0) {
        this(new android.icu.util.ChineseCalendar(arg0));
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3));
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4));
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
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

}
