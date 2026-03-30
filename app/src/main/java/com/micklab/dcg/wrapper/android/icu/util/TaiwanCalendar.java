// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class TaiwanCalendar {
    private final android.icu.util.TaiwanCalendar real;

    public TaiwanCalendar(android.icu.util.TaiwanCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TaiwanCalendar wrap(android.icu.util.TaiwanCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TaiwanCalendar(real);
    }

    public android.icu.util.TaiwanCalendar unwrap() {
        return real;
    }

    public TaiwanCalendar() {
        this(new android.icu.util.TaiwanCalendar());
    }

    public TaiwanCalendar(java.util.Date arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0));
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public TaiwanCalendar(java.util.Locale arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0));
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public TaiwanCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.TaiwanCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TaiwanCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.TaiwanCalendar(arg0, arg1, arg2));
    }

    public TaiwanCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.TaiwanCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final int BEFORE_MINGUO = android.icu.util.TaiwanCalendar.BEFORE_MINGUO;
    public static final int MINGUO = android.icu.util.TaiwanCalendar.MINGUO;

}
