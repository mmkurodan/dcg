// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateFormatSymbols {
    private final android.icu.text.DateFormatSymbols real;

    public DateFormatSymbols(android.icu.text.DateFormatSymbols real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols wrap(android.icu.text.DateFormatSymbols real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols(real);
    }

    public android.icu.text.DateFormatSymbols unwrap() {
        return real;
    }

    public DateFormatSymbols() {
        this(new android.icu.text.DateFormatSymbols());
    }

    public DateFormatSymbols(java.util.Locale arg0) {
        this(new android.icu.text.DateFormatSymbols(arg0));
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.unwrap()));
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public DateFormatSymbols(java.lang.Class arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1));
    }

    public DateFormatSymbols(java.lang.Class arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public DateFormatSymbols(java.util.ResourceBundle arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1));
    }

    public DateFormatSymbols(java.util.ResourceBundle arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public DateFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.util.Locale arg1) {
        this(new android.icu.text.DateFormatSymbols(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String[] getAmPmStrings() {
        return real.getAmPmStrings();
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.DateFormatSymbols.getAvailableLocales();
    }

    public java.lang.String[] getEraNames() {
        return real.getEraNames();
    }

    public java.lang.String[] getEras() {
        return real.getEras();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(android.icu.text.DateFormatSymbols.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getLocalPatternChars() {
        return real.getLocalPatternChars();
    }

    public java.lang.String[] getMonths() {
        return real.getMonths();
    }

    public java.lang.String[] getMonths(int arg0, int arg1) {
        return real.getMonths(arg0, arg1);
    }

    public java.lang.String[] getNarrowEras() {
        return real.getNarrowEras();
    }

    public java.lang.String[] getQuarters(int arg0, int arg1) {
        return real.getQuarters(arg0, arg1);
    }

    public java.lang.String[] getShortMonths() {
        return real.getShortMonths();
    }

    public java.lang.String[] getShortWeekdays() {
        return real.getShortWeekdays();
    }

    public java.lang.String[] getWeekdays() {
        return real.getWeekdays();
    }

    public java.lang.String[] getWeekdays(int arg0, int arg1) {
        return real.getWeekdays(arg0, arg1);
    }

    public java.lang.String[] getYearNames(int arg0, int arg1) {
        return real.getYearNames(arg0, arg1);
    }

    public java.lang.String[] getZodiacNames(int arg0, int arg1) {
        return real.getZodiacNames(arg0, arg1);
    }

    public java.lang.String[][] getZoneStrings() {
        return real.getZoneStrings();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setAmPmStrings(java.lang.String[] arg0) {
        real.setAmPmStrings(arg0);
    }

    public void setEraNames(java.lang.String[] arg0) {
        real.setEraNames(arg0);
    }

    public void setEras(java.lang.String[] arg0) {
        real.setEras(arg0);
    }

    public void setLocalPatternChars(java.lang.String arg0) {
        real.setLocalPatternChars(arg0);
    }

    public void setMonths(java.lang.String[] arg0) {
        real.setMonths(arg0);
    }

    public void setMonths(java.lang.String[] arg0, int arg1, int arg2) {
        real.setMonths(arg0, arg1, arg2);
    }

    public void setNarrowEras(java.lang.String[] arg0) {
        real.setNarrowEras(arg0);
    }

    public void setQuarters(java.lang.String[] arg0, int arg1, int arg2) {
        real.setQuarters(arg0, arg1, arg2);
    }

    public void setShortMonths(java.lang.String[] arg0) {
        real.setShortMonths(arg0);
    }

    public void setShortWeekdays(java.lang.String[] arg0) {
        real.setShortWeekdays(arg0);
    }

    public void setWeekdays(java.lang.String[] arg0) {
        real.setWeekdays(arg0);
    }

    public void setWeekdays(java.lang.String[] arg0, int arg1, int arg2) {
        real.setWeekdays(arg0, arg1, arg2);
    }

    public void setYearNames(java.lang.String[] arg0, int arg1, int arg2) {
        real.setYearNames(arg0, arg1, arg2);
    }

    public void setZodiacNames(java.lang.String[] arg0, int arg1, int arg2) {
        real.setZodiacNames(arg0, arg1, arg2);
    }

    public void setZoneStrings(java.lang.String[][] arg0) {
        real.setZoneStrings(arg0);
    }

    public static final int ABBREVIATED = android.icu.text.DateFormatSymbols.ABBREVIATED;
    public static final int FORMAT = android.icu.text.DateFormatSymbols.FORMAT;
    public static final int NARROW = android.icu.text.DateFormatSymbols.NARROW;
    public static final int SHORT = android.icu.text.DateFormatSymbols.SHORT;
    public static final int STANDALONE = android.icu.text.DateFormatSymbols.STANDALONE;
    public static final int WIDE = android.icu.text.DateFormatSymbols.WIDE;

}
