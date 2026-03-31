// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.format;

public final class DateFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.format.DateFormat wrap(android.text.format.DateFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.format.DateFormat(real, (__DcgwBridgeToken) null);
    }

    public android.text.format.DateFormat getReal() {
        return (android.text.format.DateFormat) real;
    }

    public android.text.format.DateFormat unwrap() {
        return getReal();
    }

    public DateFormat() {
        this(new android.text.format.DateFormat(), (__DcgwBridgeToken) null);
    }

    public static java.lang.CharSequence format(java.lang.CharSequence arg0, long arg1) {
        return android.text.format.DateFormat.format(arg0, arg1);
    }

    public static java.lang.CharSequence format(java.lang.CharSequence arg0, java.util.Date arg1) {
        return android.text.format.DateFormat.format(arg0, arg1);
    }

    public static java.lang.CharSequence format(java.lang.CharSequence arg0, java.util.Calendar arg1) {
        return android.text.format.DateFormat.format(arg0, arg1);
    }

    public static java.lang.String getBestDateTimePattern(java.util.Locale arg0, java.lang.String arg1) {
        return android.text.format.DateFormat.getBestDateTimePattern(arg0, arg1);
    }

    public static java.text.DateFormat getDateFormat(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.getDateFormat(arg0 == null ? null : arg0.getReal());
    }

    public static char[] getDateFormatOrder(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.getDateFormatOrder(arg0 == null ? null : arg0.getReal());
    }

    public static java.text.DateFormat getLongDateFormat(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.getLongDateFormat(arg0 == null ? null : arg0.getReal());
    }

    public static java.text.DateFormat getMediumDateFormat(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.getMediumDateFormat(arg0 == null ? null : arg0.getReal());
    }

    public static java.text.DateFormat getTimeFormat(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.getTimeFormat(arg0 == null ? null : arg0.getReal());
    }

    public static boolean is24HourFormat(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.text.format.DateFormat.is24HourFormat(arg0 == null ? null : arg0.getReal());
    }

}
