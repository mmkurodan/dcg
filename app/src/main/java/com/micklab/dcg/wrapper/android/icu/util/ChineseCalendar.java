// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ChineseCalendar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChineseCalendar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ChineseCalendar wrap(android.icu.util.ChineseCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ChineseCalendar(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.ChineseCalendar getReal() {
        return (android.icu.util.ChineseCalendar) real;
    }

    public android.icu.util.ChineseCalendar unwrap() {
        return getReal();
    }

    public ChineseCalendar() {
        this(new android.icu.util.ChineseCalendar(), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(java.util.Locale arg0) {
        this(new android.icu.util.ChineseCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(java.util.Date arg0) {
        this(new android.icu.util.ChineseCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.ChineseCalendar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public ChineseCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this(new android.icu.util.ChineseCalendar(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public void add(int arg0, int arg1) {
        ((android.icu.util.ChineseCalendar) real).add(arg0, arg1);
    }

    public java.lang.String getType() {
        return ((android.icu.util.ChineseCalendar) real).getType();
    }

    public void roll(int arg0, int arg1) {
        ((android.icu.util.ChineseCalendar) real).roll(arg0, arg1);
    }

}
