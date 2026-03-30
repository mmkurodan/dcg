// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SimpleDateFormat {
    private final android.icu.text.SimpleDateFormat real;

    public SimpleDateFormat(android.icu.text.SimpleDateFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SimpleDateFormat wrap(android.icu.text.SimpleDateFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SimpleDateFormat(real);
    }

    public android.icu.text.SimpleDateFormat unwrap() {
        return real;
    }

    public SimpleDateFormat() {
        this(new android.icu.text.SimpleDateFormat());
    }

    public SimpleDateFormat(java.lang.String arg0) {
        this(new android.icu.text.SimpleDateFormat(arg0));
    }

    public SimpleDateFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public SimpleDateFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public SimpleDateFormat(java.lang.String arg0, java.util.Locale arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1));
    }

    public SimpleDateFormat(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void applyLocalizedPattern(java.lang.String arg0) {
        real.applyLocalizedPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0) {
        real.applyPattern(arg0);
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return real.formatToCharacterIterator(arg0);
    }

    public java.util.Date get2DigitYearStart() {
        return real.get2DigitYearStart();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getDateFormatSymbols() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(real.getDateFormatSymbols());
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat(char arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(real.getNumberFormat(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat getTimeZoneFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(real.getTimeZoneFormat());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void parse(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1, java.text.ParsePosition arg2) {
        real.parse(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void set2DigitYearStart(java.util.Date arg0) {
        real.set2DigitYearStart(arg0);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        real.setContext(arg0 == null ? null : arg0.unwrap());
    }

    public void setDateFormatSymbols(com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols arg0) {
        real.setDateFormatSymbols(arg0 == null ? null : arg0.unwrap());
    }

    public void setNumberFormat(com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg0) {
        real.setNumberFormat(arg0 == null ? null : arg0.unwrap());
    }

    public void setNumberFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg1) {
        real.setNumberFormat(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTimeZoneFormat(com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat arg0) {
        real.setTimeZoneFormat(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toLocalizedPattern() {
        return real.toLocalizedPattern();
    }

    public java.lang.String toPattern() {
        return real.toPattern();
    }

}
