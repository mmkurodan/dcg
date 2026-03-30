// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.format;

public final class Time {
    private final android.text.format.Time real;

    public Time(android.text.format.Time real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.format.Time wrap(android.text.format.Time real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.format.Time(real);
    }

    public android.text.format.Time unwrap() {
        return real;
    }

    public Time() {
        this(new android.text.format.Time());
    }

    public Time(com.micklab.dcg.wrapper.android.text.format.Time arg0) {
        this(new android.text.format.Time(arg0 == null ? null : arg0.unwrap()));
    }

    public Time(java.lang.String arg0) {
        this(new android.text.format.Time(arg0));
    }

    public boolean after(com.micklab.dcg.wrapper.android.text.format.Time arg0) {
        return real.after(arg0 == null ? null : arg0.unwrap());
    }

    public boolean before(com.micklab.dcg.wrapper.android.text.format.Time arg0) {
        return real.before(arg0 == null ? null : arg0.unwrap());
    }

    public void clear(java.lang.String arg0) {
        real.clear(arg0);
    }

    public static int compare(com.micklab.dcg.wrapper.android.text.format.Time arg0, com.micklab.dcg.wrapper.android.text.format.Time arg1) {
        return android.text.format.Time.compare(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String format(java.lang.String arg0) {
        return real.format(arg0);
    }

    public java.lang.String format2445() {
        return real.format2445();
    }

    public java.lang.String format3339(boolean arg0) {
        return real.format3339(arg0);
    }

    public int getActualMaximum(int arg0) {
        return real.getActualMaximum(arg0);
    }

    public static java.lang.String getCurrentTimezone() {
        return android.text.format.Time.getCurrentTimezone();
    }

    public static int getJulianDay(long arg0, long arg1) {
        return android.text.format.Time.getJulianDay(arg0, arg1);
    }

    public static int getJulianMondayFromWeeksSinceEpoch(int arg0) {
        return android.text.format.Time.getJulianMondayFromWeeksSinceEpoch(arg0);
    }

    public int getWeekNumber() {
        return real.getWeekNumber();
    }

    public static int getWeeksSinceEpochFromJulianDay(int arg0, int arg1) {
        return android.text.format.Time.getWeeksSinceEpochFromJulianDay(arg0, arg1);
    }

    public static boolean isEpoch(com.micklab.dcg.wrapper.android.text.format.Time arg0) {
        return android.text.format.Time.isEpoch(arg0 == null ? null : arg0.unwrap());
    }

    public long normalize(boolean arg0) {
        return real.normalize(arg0);
    }

    public boolean parse(java.lang.String arg0) {
        return real.parse(arg0);
    }

    public boolean parse3339(java.lang.String arg0) {
        return real.parse3339(arg0);
    }

    public void set(long arg0) {
        real.set(arg0);
    }

    public void set(com.micklab.dcg.wrapper.android.text.format.Time arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(int arg0, int arg1, int arg2) {
        real.set(arg0, arg1, arg2);
    }

    public void set(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.set(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public long setJulianDay(int arg0) {
        return real.setJulianDay(arg0);
    }

    public void setToNow() {
        real.setToNow();
    }

    public void switchTimezone(java.lang.String arg0) {
        real.switchTimezone(arg0);
    }

    public long toMillis(boolean arg0) {
        return real.toMillis(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int EPOCH_JULIAN_DAY = android.text.format.Time.EPOCH_JULIAN_DAY;
    public static final int FRIDAY = android.text.format.Time.FRIDAY;
    public static final int HOUR = android.text.format.Time.HOUR;
    public static final int MINUTE = android.text.format.Time.MINUTE;
    public static final int MONDAY = android.text.format.Time.MONDAY;
    public static final int MONDAY_BEFORE_JULIAN_EPOCH = android.text.format.Time.MONDAY_BEFORE_JULIAN_EPOCH;
    public static final int MONTH = android.text.format.Time.MONTH;
    public static final int MONTH_DAY = android.text.format.Time.MONTH_DAY;
    public static final int SATURDAY = android.text.format.Time.SATURDAY;
    public static final int SECOND = android.text.format.Time.SECOND;
    public static final int SUNDAY = android.text.format.Time.SUNDAY;
    public static final int THURSDAY = android.text.format.Time.THURSDAY;
    public static final java.lang.String TIMEZONE_UTC = android.text.format.Time.TIMEZONE_UTC;
    public static final int TUESDAY = android.text.format.Time.TUESDAY;
    public static final int WEDNESDAY = android.text.format.Time.WEDNESDAY;
    public static final int WEEK_DAY = android.text.format.Time.WEEK_DAY;
    public static final int WEEK_NUM = android.text.format.Time.WEEK_NUM;
    public static final int YEAR = android.text.format.Time.YEAR;
    public static final int YEAR_DAY = android.text.format.Time.YEAR_DAY;

}
