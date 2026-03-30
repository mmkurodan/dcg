// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class TaiwanCalendar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TaiwanCalendar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TaiwanCalendar wrap(android.icu.util.TaiwanCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TaiwanCalendar(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.TaiwanCalendar getReal() {
        return (android.icu.util.TaiwanCalendar) real;
    }

    public android.icu.util.TaiwanCalendar unwrap() {
        return getReal();
    }

    public TaiwanCalendar() {
        this(new android.icu.util.TaiwanCalendar(), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(java.util.Date arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(java.util.Locale arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.TaiwanCalendar(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public TaiwanCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.TaiwanCalendar(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public java.lang.String getType() {
        return ((android.icu.util.TaiwanCalendar) real).getType();
    }

    public static final int BEFORE_MINGUO = android.icu.util.TaiwanCalendar.BEFORE_MINGUO;
    public static final int MINGUO = android.icu.util.TaiwanCalendar.MINGUO;

}
