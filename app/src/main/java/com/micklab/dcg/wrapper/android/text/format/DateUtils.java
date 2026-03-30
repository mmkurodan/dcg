// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.format;

public final class DateUtils {
    private final android.text.format.DateUtils real;

    public DateUtils(android.text.format.DateUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.format.DateUtils wrap(android.text.format.DateUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.format.DateUtils(real);
    }

    public android.text.format.DateUtils unwrap() {
        return real;
    }

    public DateUtils() {
        this(new android.text.format.DateUtils());
    }

    public static java.lang.String formatDateRange(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, long arg2, int arg3) {
        return android.text.format.DateUtils.formatDateRange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public static java.util.Formatter formatDateRange(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.Formatter arg1, long arg2, long arg3, int arg4) {
        return android.text.format.DateUtils.formatDateRange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public static java.util.Formatter formatDateRange(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.Formatter arg1, long arg2, long arg3, int arg4, java.lang.String arg5) {
        return android.text.format.DateUtils.formatDateRange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public static java.lang.String formatDateTime(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, int arg2) {
        return android.text.format.DateUtils.formatDateTime(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static java.lang.String formatElapsedTime(long arg0) {
        return android.text.format.DateUtils.formatElapsedTime(arg0);
    }

    public static java.lang.String formatElapsedTime(java.lang.StringBuilder arg0, long arg1) {
        return android.text.format.DateUtils.formatElapsedTime(arg0, arg1);
    }

    public static java.lang.CharSequence formatSameDayTime(long arg0, long arg1, int arg2, int arg3) {
        return android.text.format.DateUtils.formatSameDayTime(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String getAMPMString(int arg0) {
        return android.text.format.DateUtils.getAMPMString(arg0);
    }

    public static java.lang.String getDayOfWeekString(int arg0, int arg1) {
        return android.text.format.DateUtils.getDayOfWeekString(arg0, arg1);
    }

    public static java.lang.String getMonthString(int arg0, int arg1) {
        return android.text.format.DateUtils.getMonthString(arg0, arg1);
    }

    public static java.lang.CharSequence getRelativeDateTimeString(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, long arg2, long arg3, int arg4) {
        return android.text.format.DateUtils.getRelativeDateTimeString(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public static java.lang.CharSequence getRelativeTimeSpanString(long arg0) {
        return android.text.format.DateUtils.getRelativeTimeSpanString(arg0);
    }

    public static java.lang.CharSequence getRelativeTimeSpanString(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1) {
        return android.text.format.DateUtils.getRelativeTimeSpanString(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static java.lang.CharSequence getRelativeTimeSpanString(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, boolean arg2) {
        return android.text.format.DateUtils.getRelativeTimeSpanString(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static java.lang.CharSequence getRelativeTimeSpanString(long arg0, long arg1, long arg2) {
        return android.text.format.DateUtils.getRelativeTimeSpanString(arg0, arg1, arg2);
    }

    public static java.lang.CharSequence getRelativeTimeSpanString(long arg0, long arg1, long arg2, int arg3) {
        return android.text.format.DateUtils.getRelativeTimeSpanString(arg0, arg1, arg2, arg3);
    }

    public static boolean isToday(long arg0) {
        return android.text.format.DateUtils.isToday(arg0);
    }

    public static final java.lang.String ABBREV_MONTH_FORMAT = android.text.format.DateUtils.ABBREV_MONTH_FORMAT;
    public static final java.lang.String ABBREV_WEEKDAY_FORMAT = android.text.format.DateUtils.ABBREV_WEEKDAY_FORMAT;
    public static final long DAY_IN_MILLIS = android.text.format.DateUtils.DAY_IN_MILLIS;
    public static final int FORMAT_12HOUR = android.text.format.DateUtils.FORMAT_12HOUR;
    public static final int FORMAT_24HOUR = android.text.format.DateUtils.FORMAT_24HOUR;
    public static final int FORMAT_ABBREV_ALL = android.text.format.DateUtils.FORMAT_ABBREV_ALL;
    public static final int FORMAT_ABBREV_MONTH = android.text.format.DateUtils.FORMAT_ABBREV_MONTH;
    public static final int FORMAT_ABBREV_RELATIVE = android.text.format.DateUtils.FORMAT_ABBREV_RELATIVE;
    public static final int FORMAT_ABBREV_TIME = android.text.format.DateUtils.FORMAT_ABBREV_TIME;
    public static final int FORMAT_ABBREV_WEEKDAY = android.text.format.DateUtils.FORMAT_ABBREV_WEEKDAY;
    public static final int FORMAT_CAP_AMPM = android.text.format.DateUtils.FORMAT_CAP_AMPM;
    public static final int FORMAT_CAP_MIDNIGHT = android.text.format.DateUtils.FORMAT_CAP_MIDNIGHT;
    public static final int FORMAT_CAP_NOON = android.text.format.DateUtils.FORMAT_CAP_NOON;
    public static final int FORMAT_CAP_NOON_MIDNIGHT = android.text.format.DateUtils.FORMAT_CAP_NOON_MIDNIGHT;
    public static final int FORMAT_NO_MIDNIGHT = android.text.format.DateUtils.FORMAT_NO_MIDNIGHT;
    public static final int FORMAT_NO_MONTH_DAY = android.text.format.DateUtils.FORMAT_NO_MONTH_DAY;
    public static final int FORMAT_NO_NOON = android.text.format.DateUtils.FORMAT_NO_NOON;
    public static final int FORMAT_NO_NOON_MIDNIGHT = android.text.format.DateUtils.FORMAT_NO_NOON_MIDNIGHT;
    public static final int FORMAT_NO_YEAR = android.text.format.DateUtils.FORMAT_NO_YEAR;
    public static final int FORMAT_NUMERIC_DATE = android.text.format.DateUtils.FORMAT_NUMERIC_DATE;
    public static final int FORMAT_SHOW_DATE = android.text.format.DateUtils.FORMAT_SHOW_DATE;
    public static final int FORMAT_SHOW_TIME = android.text.format.DateUtils.FORMAT_SHOW_TIME;
    public static final int FORMAT_SHOW_WEEKDAY = android.text.format.DateUtils.FORMAT_SHOW_WEEKDAY;
    public static final int FORMAT_SHOW_YEAR = android.text.format.DateUtils.FORMAT_SHOW_YEAR;
    public static final int FORMAT_UTC = android.text.format.DateUtils.FORMAT_UTC;
    public static final long HOUR_IN_MILLIS = android.text.format.DateUtils.HOUR_IN_MILLIS;
    public static final java.lang.String HOUR_MINUTE_24 = android.text.format.DateUtils.HOUR_MINUTE_24;
    public static final int LENGTH_LONG = android.text.format.DateUtils.LENGTH_LONG;
    public static final int LENGTH_MEDIUM = android.text.format.DateUtils.LENGTH_MEDIUM;
    public static final int LENGTH_SHORT = android.text.format.DateUtils.LENGTH_SHORT;
    public static final int LENGTH_SHORTER = android.text.format.DateUtils.LENGTH_SHORTER;
    public static final int LENGTH_SHORTEST = android.text.format.DateUtils.LENGTH_SHORTEST;
    public static final long MINUTE_IN_MILLIS = android.text.format.DateUtils.MINUTE_IN_MILLIS;
    public static final java.lang.String MONTH_DAY_FORMAT = android.text.format.DateUtils.MONTH_DAY_FORMAT;
    public static final java.lang.String MONTH_FORMAT = android.text.format.DateUtils.MONTH_FORMAT;
    public static final java.lang.String NUMERIC_MONTH_FORMAT = android.text.format.DateUtils.NUMERIC_MONTH_FORMAT;
    public static final long SECOND_IN_MILLIS = android.text.format.DateUtils.SECOND_IN_MILLIS;
    public static final java.lang.String WEEKDAY_FORMAT = android.text.format.DateUtils.WEEKDAY_FORMAT;
    public static final long WEEK_IN_MILLIS = android.text.format.DateUtils.WEEK_IN_MILLIS;
    public static final java.lang.String YEAR_FORMAT = android.text.format.DateUtils.YEAR_FORMAT;
    public static final java.lang.String YEAR_FORMAT_TWO_DIGITS = android.text.format.DateUtils.YEAR_FORMAT_TWO_DIGITS;
    public static final long YEAR_IN_MILLIS = android.text.format.DateUtils.YEAR_IN_MILLIS;
    public static final int[] sameMonthTable = android.text.format.DateUtils.sameMonthTable;
    public static final int[] sameYearTable = android.text.format.DateUtils.sameYearTable;

}
