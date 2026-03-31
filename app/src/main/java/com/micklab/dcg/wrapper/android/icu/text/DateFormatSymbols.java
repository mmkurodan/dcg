// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateFormatSymbols {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateFormatSymbols(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols wrap(android.icu.text.DateFormatSymbols real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DateFormatSymbols getReal() {
        return (android.icu.text.DateFormatSymbols) real;
    }

    public android.icu.text.DateFormatSymbols unwrap() {
        return getReal();
    }

    public DateFormatSymbols() {
        this(new android.icu.text.DateFormatSymbols(), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(java.util.Locale arg0) {
        this(new android.icu.text.DateFormatSymbols(arg0), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(java.lang.Class arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(java.lang.Class arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(java.util.ResourceBundle arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(java.util.ResourceBundle arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DateFormatSymbols) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.DateFormatSymbols) real).equals(arg0);
    }

    public java.lang.String[] getAmPmStrings() {
        return ((android.icu.text.DateFormatSymbols) real).getAmPmStrings();
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.DateFormatSymbols.getAvailableLocales();
    }

    public java.lang.String[] getEraNames() {
        return ((android.icu.text.DateFormatSymbols) real).getEraNames();
    }

    public java.lang.String[] getEras() {
        return ((android.icu.text.DateFormatSymbols) real).getEras();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance(arg0));
    }

    public java.lang.String getLocalPatternChars() {
        return ((android.icu.text.DateFormatSymbols) real).getLocalPatternChars();
    }

    public java.lang.String[] getMonths() {
        return ((android.icu.text.DateFormatSymbols) real).getMonths();
    }

    public java.lang.String[] getMonths(int arg0, int arg1) {
        return ((android.icu.text.DateFormatSymbols) real).getMonths(arg0, arg1);
    }

    public java.lang.String[] getNarrowEras() {
        return ((android.icu.text.DateFormatSymbols) real).getNarrowEras();
    }

    public java.lang.String[] getQuarters(int arg0, int arg1) {
        return ((android.icu.text.DateFormatSymbols) real).getQuarters(arg0, arg1);
    }

    public java.lang.String[] getShortMonths() {
        return ((android.icu.text.DateFormatSymbols) real).getShortMonths();
    }

    public java.lang.String[] getShortWeekdays() {
        return ((android.icu.text.DateFormatSymbols) real).getShortWeekdays();
    }

    public java.lang.String[] getWeekdays() {
        return ((android.icu.text.DateFormatSymbols) real).getWeekdays();
    }

    public java.lang.String[] getWeekdays(int arg0, int arg1) {
        return ((android.icu.text.DateFormatSymbols) real).getWeekdays(arg0, arg1);
    }

    public java.lang.String[] getYearNames(int arg0, int arg1) {
        return ((android.icu.text.DateFormatSymbols) real).getYearNames(arg0, arg1);
    }

    public java.lang.String[] getZodiacNames(int arg0, int arg1) {
        return ((android.icu.text.DateFormatSymbols) real).getZodiacNames(arg0, arg1);
    }

    public java.lang.String[][] getZoneStrings() {
        return ((android.icu.text.DateFormatSymbols) real).getZoneStrings();
    }

    public int hashCode() {
        return ((android.icu.text.DateFormatSymbols) real).hashCode();
    }

    public void setAmPmStrings(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setAmPmStrings(arg0);
    }

    public void setEraNames(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setEraNames(arg0);
    }

    public void setEras(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setEras(arg0);
    }

    public void setLocalPatternChars(java.lang.String arg0) {
        ((android.icu.text.DateFormatSymbols) real).setLocalPatternChars(arg0);
    }

    public void setMonths(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setMonths(arg0);
    }

    public void setMonths(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.icu.text.DateFormatSymbols) real).setMonths(arg0, arg1, arg2);
    }

    public void setNarrowEras(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setNarrowEras(arg0);
    }

    public void setQuarters(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.icu.text.DateFormatSymbols) real).setQuarters(arg0, arg1, arg2);
    }

    public void setShortMonths(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setShortMonths(arg0);
    }

    public void setShortWeekdays(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setShortWeekdays(arg0);
    }

    public void setWeekdays(java.lang.String[] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setWeekdays(arg0);
    }

    public void setWeekdays(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.icu.text.DateFormatSymbols) real).setWeekdays(arg0, arg1, arg2);
    }

    public void setYearNames(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.icu.text.DateFormatSymbols) real).setYearNames(arg0, arg1, arg2);
    }

    public void setZodiacNames(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.icu.text.DateFormatSymbols) real).setZodiacNames(arg0, arg1, arg2);
    }

    public void setZoneStrings(java.lang.String[][] arg0) {
        ((android.icu.text.DateFormatSymbols) real).setZoneStrings(arg0);
    }

    public static final int ABBREVIATED = android.icu.text.DateFormatSymbols.ABBREVIATED;
    public static final int FORMAT = android.icu.text.DateFormatSymbols.FORMAT;
    public static final int NARROW = android.icu.text.DateFormatSymbols.NARROW;
    public static final int SHORT = android.icu.text.DateFormatSymbols.SHORT;
    public static final int STANDALONE = android.icu.text.DateFormatSymbols.STANDALONE;
    public static final int WIDE = android.icu.text.DateFormatSymbols.WIDE;

}
