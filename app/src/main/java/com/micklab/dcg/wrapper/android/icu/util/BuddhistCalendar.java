// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class BuddhistCalendar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BuddhistCalendar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.BuddhistCalendar wrap(android.icu.util.BuddhistCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.BuddhistCalendar(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.BuddhistCalendar getReal() {
        return (android.icu.util.BuddhistCalendar) real;
    }

    public android.icu.util.BuddhistCalendar unwrap() {
        return getReal();
    }

    public BuddhistCalendar() {
        this(new android.icu.util.BuddhistCalendar(), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(java.util.Date arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(java.util.Locale arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.BuddhistCalendar(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.BuddhistCalendar(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public BuddhistCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.BuddhistCalendar(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public java.lang.String getType() {
        return ((android.icu.util.BuddhistCalendar) real).getType();
    }

    public static final int BE = android.icu.util.BuddhistCalendar.BE;

}
