// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class GregorianCalendar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GregorianCalendar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.GregorianCalendar wrap(android.icu.util.GregorianCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.GregorianCalendar(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.GregorianCalendar getReal() {
        return (android.icu.util.GregorianCalendar) real;
    }

    public android.icu.util.GregorianCalendar unwrap() {
        return getReal();
    }

    public GregorianCalendar() {
        this(new android.icu.util.GregorianCalendar(), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(java.util.Locale arg0) {
        this(new android.icu.util.GregorianCalendar(arg0), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public GregorianCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int getActualMaximum(int arg0) {
        return ((android.icu.util.GregorianCalendar) real).getActualMaximum(arg0);
    }

    public int getActualMinimum(int arg0) {
        return ((android.icu.util.GregorianCalendar) real).getActualMinimum(arg0);
    }

    public java.util.Date getGregorianChange() {
        return ((android.icu.util.GregorianCalendar) real).getGregorianChange();
    }

    public java.lang.String getType() {
        return ((android.icu.util.GregorianCalendar) real).getType();
    }

    public int hashCode() {
        return ((android.icu.util.GregorianCalendar) real).hashCode();
    }

    public boolean isEquivalentTo(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        return ((android.icu.util.GregorianCalendar) real).isEquivalentTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean isLeapYear(int arg0) {
        return ((android.icu.util.GregorianCalendar) real).isLeapYear(arg0);
    }

    public void roll(int arg0, int arg1) {
        ((android.icu.util.GregorianCalendar) real).roll(arg0, arg1);
    }

    public void setGregorianChange(java.util.Date arg0) {
        ((android.icu.util.GregorianCalendar) real).setGregorianChange(arg0);
    }

    public static final int AD = android.icu.util.GregorianCalendar.AD;
    public static final int BC = android.icu.util.GregorianCalendar.BC;

}
