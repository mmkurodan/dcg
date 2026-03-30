// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class BuddhistCalendar {
    private final android.icu.util.BuddhistCalendar real;

    public BuddhistCalendar(android.icu.util.BuddhistCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.BuddhistCalendar wrap(android.icu.util.BuddhistCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.BuddhistCalendar(real);
    }

    public android.icu.util.BuddhistCalendar unwrap() {
        return real;
    }

    public BuddhistCalendar() {
        this(new android.icu.util.BuddhistCalendar());
    }

    public BuddhistCalendar(java.util.Date arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0));
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public BuddhistCalendar(java.util.Locale arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0));
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public BuddhistCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.BuddhistCalendar(arg0, arg1, arg2));
    }

    public BuddhistCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.BuddhistCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final int BE = android.icu.util.BuddhistCalendar.BE;

}
