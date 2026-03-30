// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateFormat {
    private final android.icu.text.DateFormat real;

    public DateFormat(android.icu.text.DateFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat wrap(android.icu.text.DateFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormat(real);
    }

    public android.icu.text.DateFormat unwrap() {
        return real;
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String format(java.util.Date arg0) {
        return real.format(arg0);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.util.Date arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.DateFormat.getAvailableLocales();
    }

    public boolean getBooleanAttribute(com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute arg0) {
        return real.getBooleanAttribute(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.util.Calendar getCalendar() {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(real.getCalendar());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext getContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(real.getContext(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(int arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(int arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(int arg0, int arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(int arg0, int arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.icu.util.ULocale arg3) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, int arg2, java.util.Locale arg3) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getDateTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstance(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstanceForSkeleton(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstanceForSkeleton(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstanceForSkeleton(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstanceForSkeleton(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.String arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstanceForSkeleton(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getInstanceForSkeleton(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getInstanceForSkeleton(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(real.getNumberFormat());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getPatternInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getPatternInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getPatternInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getPatternInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getPatternInstance(java.lang.String arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getPatternInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getPatternInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.String arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getPatternInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getPatternInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getPatternInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(int arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(int arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateFormat getTimeInstance(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, int arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(android.icu.text.DateFormat.getTimeInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(real.getTimeZone());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isCalendarLenient() {
        return real.isCalendarLenient();
    }

    public boolean isLenient() {
        return real.isLenient();
    }

    public java.util.Date parse(java.lang.String arg0) throws java.text.ParseException {
        return real.parse(arg0);
    }

    public java.util.Date parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parse(arg0, arg1);
    }

    public void parse(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1, java.text.ParsePosition arg2) {
        real.parse(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parseObject(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat setBooleanAttribute(com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(real.setBooleanAttribute(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void setCalendar(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        real.setCalendar(arg0 == null ? null : arg0.unwrap());
    }

    public void setCalendarLenient(boolean arg0) {
        real.setCalendarLenient(arg0);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        real.setContext(arg0 == null ? null : arg0.unwrap());
    }

    public void setLenient(boolean arg0) {
        real.setLenient(arg0);
    }

    public void setNumberFormat(com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg0) {
        real.setNumberFormat(arg0 == null ? null : arg0.unwrap());
    }

    public void setTimeZone(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        real.setTimeZone(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ABBR_GENERIC_TZ = android.icu.text.DateFormat.ABBR_GENERIC_TZ;
    public static final java.lang.String ABBR_MONTH = android.icu.text.DateFormat.ABBR_MONTH;
    public static final java.lang.String ABBR_MONTH_DAY = android.icu.text.DateFormat.ABBR_MONTH_DAY;
    public static final java.lang.String ABBR_MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.ABBR_MONTH_WEEKDAY_DAY;
    public static final java.lang.String ABBR_QUARTER = android.icu.text.DateFormat.ABBR_QUARTER;
    public static final java.lang.String ABBR_SPECIFIC_TZ = android.icu.text.DateFormat.ABBR_SPECIFIC_TZ;
    public static final java.lang.String ABBR_UTC_TZ = android.icu.text.DateFormat.ABBR_UTC_TZ;
    public static final java.lang.String ABBR_WEEKDAY = android.icu.text.DateFormat.ABBR_WEEKDAY;
    public static final int AM_PM_FIELD = android.icu.text.DateFormat.AM_PM_FIELD;
    public static final int AM_PM_MIDNIGHT_NOON_FIELD = android.icu.text.DateFormat.AM_PM_MIDNIGHT_NOON_FIELD;
    public static final int DATE_FIELD = android.icu.text.DateFormat.DATE_FIELD;
    public static final java.lang.String DAY = android.icu.text.DateFormat.DAY;
    public static final int DAY_OF_WEEK_FIELD = android.icu.text.DateFormat.DAY_OF_WEEK_FIELD;
    public static final int DAY_OF_WEEK_IN_MONTH_FIELD = android.icu.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
    public static final int DAY_OF_YEAR_FIELD = android.icu.text.DateFormat.DAY_OF_YEAR_FIELD;
    public static final int DEFAULT = android.icu.text.DateFormat.DEFAULT;
    public static final int DOW_LOCAL_FIELD = android.icu.text.DateFormat.DOW_LOCAL_FIELD;
    public static final int ERA_FIELD = android.icu.text.DateFormat.ERA_FIELD;
    public static final int EXTENDED_YEAR_FIELD = android.icu.text.DateFormat.EXTENDED_YEAR_FIELD;
    public static final int FLEXIBLE_DAY_PERIOD_FIELD = android.icu.text.DateFormat.FLEXIBLE_DAY_PERIOD_FIELD;
    public static final int FRACTIONAL_SECOND_FIELD = android.icu.text.DateFormat.FRACTIONAL_SECOND_FIELD;
    public static final int FULL = android.icu.text.DateFormat.FULL;
    public static final java.lang.String GENERIC_TZ = android.icu.text.DateFormat.GENERIC_TZ;
    public static final java.lang.String HOUR = android.icu.text.DateFormat.HOUR;
    public static final int HOUR0_FIELD = android.icu.text.DateFormat.HOUR0_FIELD;
    public static final int HOUR1_FIELD = android.icu.text.DateFormat.HOUR1_FIELD;
    public static final java.lang.String HOUR24 = android.icu.text.DateFormat.HOUR24;
    public static final java.lang.String HOUR24_MINUTE = android.icu.text.DateFormat.HOUR24_MINUTE;
    public static final java.lang.String HOUR24_MINUTE_SECOND = android.icu.text.DateFormat.HOUR24_MINUTE_SECOND;
    public static final java.lang.String HOUR_MINUTE = android.icu.text.DateFormat.HOUR_MINUTE;
    public static final java.lang.String HOUR_MINUTE_SECOND = android.icu.text.DateFormat.HOUR_MINUTE_SECOND;
    public static final int HOUR_OF_DAY0_FIELD = android.icu.text.DateFormat.HOUR_OF_DAY0_FIELD;
    public static final int HOUR_OF_DAY1_FIELD = android.icu.text.DateFormat.HOUR_OF_DAY1_FIELD;
    public static final int JULIAN_DAY_FIELD = android.icu.text.DateFormat.JULIAN_DAY_FIELD;
    public static final java.lang.String LOCATION_TZ = android.icu.text.DateFormat.LOCATION_TZ;
    public static final int LONG = android.icu.text.DateFormat.LONG;
    public static final int MEDIUM = android.icu.text.DateFormat.MEDIUM;
    public static final int MILLISECONDS_IN_DAY_FIELD = android.icu.text.DateFormat.MILLISECONDS_IN_DAY_FIELD;
    public static final int MILLISECOND_FIELD = android.icu.text.DateFormat.MILLISECOND_FIELD;
    public static final java.lang.String MINUTE = android.icu.text.DateFormat.MINUTE;
    public static final int MINUTE_FIELD = android.icu.text.DateFormat.MINUTE_FIELD;
    public static final java.lang.String MINUTE_SECOND = android.icu.text.DateFormat.MINUTE_SECOND;
    public static final java.lang.String MONTH = android.icu.text.DateFormat.MONTH;
    public static final java.lang.String MONTH_DAY = android.icu.text.DateFormat.MONTH_DAY;
    public static final int MONTH_FIELD = android.icu.text.DateFormat.MONTH_FIELD;
    public static final java.lang.String MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.MONTH_WEEKDAY_DAY;
    public static final int NONE = android.icu.text.DateFormat.NONE;
    public static final java.lang.String NUM_MONTH = android.icu.text.DateFormat.NUM_MONTH;
    public static final java.lang.String NUM_MONTH_DAY = android.icu.text.DateFormat.NUM_MONTH_DAY;
    public static final java.lang.String NUM_MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.NUM_MONTH_WEEKDAY_DAY;
    public static final java.lang.String QUARTER = android.icu.text.DateFormat.QUARTER;
    public static final int QUARTER_FIELD = android.icu.text.DateFormat.QUARTER_FIELD;
    public static final int RELATIVE = android.icu.text.DateFormat.RELATIVE;
    public static final int RELATIVE_DEFAULT = android.icu.text.DateFormat.RELATIVE_DEFAULT;
    public static final int RELATIVE_FULL = android.icu.text.DateFormat.RELATIVE_FULL;
    public static final int RELATIVE_LONG = android.icu.text.DateFormat.RELATIVE_LONG;
    public static final int RELATIVE_MEDIUM = android.icu.text.DateFormat.RELATIVE_MEDIUM;
    public static final int RELATIVE_SHORT = android.icu.text.DateFormat.RELATIVE_SHORT;
    public static final java.lang.String SECOND = android.icu.text.DateFormat.SECOND;
    public static final int SECOND_FIELD = android.icu.text.DateFormat.SECOND_FIELD;
    public static final int SHORT = android.icu.text.DateFormat.SHORT;
    public static final java.lang.String SPECIFIC_TZ = android.icu.text.DateFormat.SPECIFIC_TZ;
    public static final int STANDALONE_DAY_FIELD = android.icu.text.DateFormat.STANDALONE_DAY_FIELD;
    public static final int STANDALONE_MONTH_FIELD = android.icu.text.DateFormat.STANDALONE_MONTH_FIELD;
    public static final int STANDALONE_QUARTER_FIELD = android.icu.text.DateFormat.STANDALONE_QUARTER_FIELD;
    public static final int TIMEZONE_FIELD = android.icu.text.DateFormat.TIMEZONE_FIELD;
    public static final int TIMEZONE_GENERIC_FIELD = android.icu.text.DateFormat.TIMEZONE_GENERIC_FIELD;
    public static final int TIMEZONE_ISO_FIELD = android.icu.text.DateFormat.TIMEZONE_ISO_FIELD;
    public static final int TIMEZONE_ISO_LOCAL_FIELD = android.icu.text.DateFormat.TIMEZONE_ISO_LOCAL_FIELD;
    public static final int TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD = android.icu.text.DateFormat.TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD;
    public static final int TIMEZONE_RFC_FIELD = android.icu.text.DateFormat.TIMEZONE_RFC_FIELD;
    public static final int TIMEZONE_SPECIAL_FIELD = android.icu.text.DateFormat.TIMEZONE_SPECIAL_FIELD;
    public static final java.lang.String WEEKDAY = android.icu.text.DateFormat.WEEKDAY;
    public static final int WEEK_OF_MONTH_FIELD = android.icu.text.DateFormat.WEEK_OF_MONTH_FIELD;
    public static final int WEEK_OF_YEAR_FIELD = android.icu.text.DateFormat.WEEK_OF_YEAR_FIELD;
    public static final java.lang.String YEAR = android.icu.text.DateFormat.YEAR;
    public static final java.lang.String YEAR_ABBR_MONTH = android.icu.text.DateFormat.YEAR_ABBR_MONTH;
    public static final java.lang.String YEAR_ABBR_MONTH_DAY = android.icu.text.DateFormat.YEAR_ABBR_MONTH_DAY;
    public static final java.lang.String YEAR_ABBR_MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.YEAR_ABBR_MONTH_WEEKDAY_DAY;
    public static final java.lang.String YEAR_ABBR_QUARTER = android.icu.text.DateFormat.YEAR_ABBR_QUARTER;
    public static final int YEAR_FIELD = android.icu.text.DateFormat.YEAR_FIELD;
    public static final java.lang.String YEAR_MONTH = android.icu.text.DateFormat.YEAR_MONTH;
    public static final java.lang.String YEAR_MONTH_DAY = android.icu.text.DateFormat.YEAR_MONTH_DAY;
    public static final java.lang.String YEAR_MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.YEAR_MONTH_WEEKDAY_DAY;
    public static final int YEAR_NAME_FIELD = android.icu.text.DateFormat.YEAR_NAME_FIELD;
    public static final java.lang.String YEAR_NUM_MONTH = android.icu.text.DateFormat.YEAR_NUM_MONTH;
    public static final java.lang.String YEAR_NUM_MONTH_DAY = android.icu.text.DateFormat.YEAR_NUM_MONTH_DAY;
    public static final java.lang.String YEAR_NUM_MONTH_WEEKDAY_DAY = android.icu.text.DateFormat.YEAR_NUM_MONTH_WEEKDAY_DAY;
    public static final java.lang.String YEAR_QUARTER = android.icu.text.DateFormat.YEAR_QUARTER;
    public static final int YEAR_WOY_FIELD = android.icu.text.DateFormat.YEAR_WOY_FIELD;

    public static final class BooleanAttribute {
        private final android.icu.text.DateFormat.BooleanAttribute real;

        public BooleanAttribute(android.icu.text.DateFormat.BooleanAttribute real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute wrap(android.icu.text.DateFormat.BooleanAttribute real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute(real);
        }

        public android.icu.text.DateFormat.BooleanAttribute unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute.wrap(android.icu.text.DateFormat.BooleanAttribute.valueOf(arg0));
        }

        public static android.icu.text.DateFormat.BooleanAttribute[] values() {
            return android.icu.text.DateFormat.BooleanAttribute.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute PARSE_ALLOW_NUMERIC = com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute.wrap(android.icu.text.DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute PARSE_ALLOW_WHITESPACE = com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute.wrap(android.icu.text.DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute PARSE_MULTIPLE_PATTERNS_FOR_MATCH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute.wrap(android.icu.text.DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute PARSE_PARTIAL_LITERAL_MATCH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.BooleanAttribute.wrap(android.icu.text.DateFormat.BooleanAttribute.PARSE_PARTIAL_LITERAL_MATCH);

    }
    public static final class Field {
        private final android.icu.text.DateFormat.Field real;

        public Field(android.icu.text.DateFormat.Field real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field wrap(android.icu.text.DateFormat.Field real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field(real);
        }

        public android.icu.text.DateFormat.Field unwrap() {
            return real;
        }

        public int getCalendarField() {
            return real.getCalendarField();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field ofCalendarField(int arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.ofCalendarField(arg0));
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field AM_PM = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.AM_PM);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field AM_PM_MIDNIGHT_NOON = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.AM_PM_MIDNIGHT_NOON);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field DAY_OF_MONTH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.DAY_OF_MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field DAY_OF_WEEK = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.DAY_OF_WEEK);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.DAY_OF_WEEK_IN_MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field DAY_OF_YEAR = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.DAY_OF_YEAR);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field DOW_LOCAL = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.DOW_LOCAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field ERA = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.ERA);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field EXTENDED_YEAR = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.EXTENDED_YEAR);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field FLEXIBLE_DAY_PERIOD = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.FLEXIBLE_DAY_PERIOD);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field HOUR0 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.HOUR0);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field HOUR1 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.HOUR1);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field HOUR_OF_DAY0 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.HOUR_OF_DAY0);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field HOUR_OF_DAY1 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.HOUR_OF_DAY1);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field JULIAN_DAY = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.JULIAN_DAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field MILLISECOND = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.MILLISECOND);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field MILLISECONDS_IN_DAY = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.MILLISECONDS_IN_DAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field MINUTE = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.MINUTE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field MONTH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field QUARTER = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.QUARTER);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field SECOND = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.SECOND);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field TIME_ZONE = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.TIME_ZONE);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field WEEK_OF_MONTH = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.WEEK_OF_MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field WEEK_OF_YEAR = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.WEEK_OF_YEAR);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field YEAR = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.YEAR);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field YEAR_WOY = com.micklab.dcg.wrapper.android.icu.text.DateFormat.Field.wrap(android.icu.text.DateFormat.Field.YEAR_WOY);

    }
    public static final class HourCycle {
        private final android.icu.text.DateFormat.HourCycle real;

        public HourCycle(android.icu.text.DateFormat.HourCycle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle wrap(android.icu.text.DateFormat.HourCycle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle(real);
        }

        public android.icu.text.DateFormat.HourCycle unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(android.icu.text.DateFormat.HourCycle.valueOf(arg0));
        }

        public static android.icu.text.DateFormat.HourCycle[] values() {
            return android.icu.text.DateFormat.HourCycle.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle HOUR_CYCLE_11 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_11);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle HOUR_CYCLE_12 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_12);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle HOUR_CYCLE_23 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_23);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle HOUR_CYCLE_24 = com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_24);

    }
}
