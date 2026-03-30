// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class GregorianCalendar {
    private final android.icu.util.GregorianCalendar real;

    public GregorianCalendar(android.icu.util.GregorianCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.GregorianCalendar wrap(android.icu.util.GregorianCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.GregorianCalendar(real);
    }

    public android.icu.util.GregorianCalendar unwrap() {
        return real;
    }

    public GregorianCalendar() {
        this(new android.icu.util.GregorianCalendar());
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public GregorianCalendar(java.util.Locale arg0) {
        this(new android.icu.util.GregorianCalendar(arg0));
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public GregorianCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.GregorianCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GregorianCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2));
    }

    public GregorianCalendar(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2, arg3, arg4));
    }

    public GregorianCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.GregorianCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public int getActualMaximum(int arg0) {
        return real.getActualMaximum(arg0);
    }

    public int getActualMinimum(int arg0) {
        return real.getActualMinimum(arg0);
    }

    public java.util.Date getGregorianChange() {
        return real.getGregorianChange();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEquivalentTo(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        return real.isEquivalentTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isLeapYear(int arg0) {
        return real.isLeapYear(arg0);
    }

    public void roll(int arg0, int arg1) {
        real.roll(arg0, arg1);
    }

    public void setGregorianChange(java.util.Date arg0) {
        real.setGregorianChange(arg0);
    }

    public static final int AD = android.icu.util.GregorianCalendar.AD;
    public static final int BC = android.icu.util.GregorianCalendar.BC;

}
