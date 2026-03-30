// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SimpleDateFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleDateFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SimpleDateFormat wrap(android.icu.text.SimpleDateFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SimpleDateFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.SimpleDateFormat getReal() {
        return (android.icu.text.SimpleDateFormat) real;
    }

    public android.icu.text.SimpleDateFormat unwrap() {
        return getReal();
    }

    public SimpleDateFormat() {
        this(new android.icu.text.SimpleDateFormat(), (__DcgwBridgeToken) null);
    }

    public SimpleDateFormat(java.lang.String arg0) {
        this(new android.icu.text.SimpleDateFormat(arg0), (__DcgwBridgeToken) null);
    }

    public SimpleDateFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SimpleDateFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SimpleDateFormat(java.lang.String arg0, java.util.Locale arg1) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public SimpleDateFormat(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        this(new android.icu.text.SimpleDateFormat(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public void applyLocalizedPattern(java.lang.String arg0) {
        ((android.icu.text.SimpleDateFormat) real).applyLocalizedPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0) {
        ((android.icu.text.SimpleDateFormat) real).applyPattern(arg0);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.SimpleDateFormat) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.SimpleDateFormat) real).equals(arg0);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.SimpleDateFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return ((android.icu.text.SimpleDateFormat) real).formatToCharacterIterator(arg0);
    }

    public java.util.Date get2DigitYearStart() {
        return ((android.icu.text.SimpleDateFormat) real).get2DigitYearStart();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols getDateFormatSymbols() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols.wrap(((android.icu.text.SimpleDateFormat) real).getDateFormatSymbols());
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat(char arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(((android.icu.text.SimpleDateFormat) real).getNumberFormat(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat getTimeZoneFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.SimpleDateFormat) real).getTimeZoneFormat());
    }

    public int hashCode() {
        return ((android.icu.text.SimpleDateFormat) real).hashCode();
    }

    public void parse(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1, java.text.ParsePosition arg2) {
        ((android.icu.text.SimpleDateFormat) real).parse(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void set2DigitYearStart(java.util.Date arg0) {
        ((android.icu.text.SimpleDateFormat) real).set2DigitYearStart(arg0);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        ((android.icu.text.SimpleDateFormat) real).setContext(arg0 == null ? null : arg0.getReal());
    }

    public void setDateFormatSymbols(com.micklab.dcg.wrapper.android.icu.text.DateFormatSymbols arg0) {
        ((android.icu.text.SimpleDateFormat) real).setDateFormatSymbols(arg0 == null ? null : arg0.getReal());
    }

    public void setNumberFormat(com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg0) {
        ((android.icu.text.SimpleDateFormat) real).setNumberFormat(arg0 == null ? null : arg0.getReal());
    }

    public void setNumberFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg1) {
        ((android.icu.text.SimpleDateFormat) real).setNumberFormat(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTimeZoneFormat(com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat arg0) {
        ((android.icu.text.SimpleDateFormat) real).setTimeZoneFormat(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toLocalizedPattern() {
        return ((android.icu.text.SimpleDateFormat) real).toLocalizedPattern();
    }

    public java.lang.String toPattern() {
        return ((android.icu.text.SimpleDateFormat) real).toPattern();
    }

}
