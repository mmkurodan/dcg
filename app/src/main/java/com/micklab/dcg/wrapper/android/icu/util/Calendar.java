// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Calendar {
    private final android.icu.util.Calendar real;

    public Calendar(android.icu.util.Calendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar wrap(android.icu.util.Calendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Calendar(real);
    }

    public android.icu.util.Calendar unwrap() {
        return real;
    }

    public void add(int arg0, int arg1) {
        real.add(arg0, arg1);
    }

    public boolean after(java.lang.Object arg0) {
        return real.after(arg0);
    }

    public boolean before(java.lang.Object arg0) {
        return real.before(arg0);
    }

    public void clear() {
        real.clear();
    }

    public void clear(int arg0) {
        real.clear(arg0);
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int fieldDifference(java.util.Date arg0, int arg1) {
        return real.fieldDifference(arg0, arg1);
    }

    public int get(int arg0) {
        return real.get(arg0);
    }

    public int getActualMaximum(int arg0) {
        return real.getActualMaximum(arg0);
    }

    public int getActualMinimum(int arg0) {
        return real.getActualMinimum(arg0);
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.util.Calendar.getAvailableLocales();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeFormat(int arg0, int arg1, java.util.Locale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(real.getDateTimeFormat(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateTimeFormat(int arg0, int arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(real.getDateTimeFormat(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayName(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getDisplayName(java.util.Locale arg0) {
        return real.getDisplayName(arg0);
    }

    public int getFieldCount() {
        return real.getFieldCount();
    }

    public int getFirstDayOfWeek() {
        return real.getFirstDayOfWeek();
    }

    public int getGreatestMinimum(int arg0) {
        return real.getGreatestMinimum(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance() {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar getInstance(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(android.icu.util.Calendar.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static java.lang.String[] getKeywordValuesForLocale(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean arg2) {
        return android.icu.util.Calendar.getKeywordValuesForLocale(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int getLeastMaximum(int arg0) {
        return real.getLeastMaximum(arg0);
    }

    public int getMaximum(int arg0) {
        return real.getMaximum(arg0);
    }

    public int getMinimalDaysInFirstWeek() {
        return real.getMinimalDaysInFirstWeek();
    }

    public int getMinimum(int arg0) {
        return real.getMinimum(arg0);
    }

    public int getRepeatedWallTimeOption() {
        return real.getRepeatedWallTimeOption();
    }

    public int getSkippedWallTimeOption() {
        return real.getSkippedWallTimeOption();
    }

    public java.util.Date getTime() {
        return real.getTime();
    }

    public long getTimeInMillis() {
        return real.getTimeInMillis();
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(real.getTimeZone());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData getWeekData() {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData.wrap(real.getWeekData());
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData getWeekDataForRegion(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData.wrap(android.icu.util.Calendar.getWeekDataForRegion(arg0));
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEquivalentTo(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0) {
        return real.isEquivalentTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isLenient() {
        return real.isLenient();
    }

    public boolean isSet(int arg0) {
        return real.isSet(arg0);
    }

    public boolean isWeekend() {
        return real.isWeekend();
    }

    public boolean isWeekend(java.util.Date arg0) {
        return real.isWeekend(arg0);
    }

    public void roll(int arg0, int arg1) {
        real.roll(arg0, arg1);
    }

    public void roll(int arg0, boolean arg1) {
        real.roll(arg0, arg1);
    }

    public void set(int arg0, int arg1) {
        real.set(arg0, arg1);
    }

    public void set(int arg0, int arg1, int arg2) {
        real.set(arg0, arg1, arg2);
    }

    public void set(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.set(arg0, arg1, arg2, arg3, arg4);
    }

    public void set(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.set(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void setFirstDayOfWeek(int arg0) {
        real.setFirstDayOfWeek(arg0);
    }

    public void setLenient(boolean arg0) {
        real.setLenient(arg0);
    }

    public void setMinimalDaysInFirstWeek(int arg0) {
        real.setMinimalDaysInFirstWeek(arg0);
    }

    public void setRepeatedWallTimeOption(int arg0) {
        real.setRepeatedWallTimeOption(arg0);
    }

    public void setSkippedWallTimeOption(int arg0) {
        real.setSkippedWallTimeOption(arg0);
    }

    public void setTime(java.util.Date arg0) {
        real.setTime(arg0);
    }

    public void setTimeInMillis(long arg0) {
        real.setTimeInMillis(arg0);
    }

    public void setTimeZone(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        real.setTimeZone(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.util.Calendar setWeekData(com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Calendar.wrap(real.setWeekData(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int AM = android.icu.util.Calendar.AM;
    public static final int AM_PM = android.icu.util.Calendar.AM_PM;
    public static final int APRIL = android.icu.util.Calendar.APRIL;
    public static final int AUGUST = android.icu.util.Calendar.AUGUST;
    public static final int DATE = android.icu.util.Calendar.DATE;
    public static final int DAY_OF_MONTH = android.icu.util.Calendar.DAY_OF_MONTH;
    public static final int DAY_OF_WEEK = android.icu.util.Calendar.DAY_OF_WEEK;
    public static final int DAY_OF_WEEK_IN_MONTH = android.icu.util.Calendar.DAY_OF_WEEK_IN_MONTH;
    public static final int DAY_OF_YEAR = android.icu.util.Calendar.DAY_OF_YEAR;
    public static final int DECEMBER = android.icu.util.Calendar.DECEMBER;
    public static final int DOW_LOCAL = android.icu.util.Calendar.DOW_LOCAL;
    public static final int DST_OFFSET = android.icu.util.Calendar.DST_OFFSET;
    public static final int ERA = android.icu.util.Calendar.ERA;
    public static final int EXTENDED_YEAR = android.icu.util.Calendar.EXTENDED_YEAR;
    public static final int FEBRUARY = android.icu.util.Calendar.FEBRUARY;
    public static final int FRIDAY = android.icu.util.Calendar.FRIDAY;
    public static final int HOUR = android.icu.util.Calendar.HOUR;
    public static final int HOUR_OF_DAY = android.icu.util.Calendar.HOUR_OF_DAY;
    public static final int IS_LEAP_MONTH = android.icu.util.Calendar.IS_LEAP_MONTH;
    public static final int JANUARY = android.icu.util.Calendar.JANUARY;
    public static final int JULIAN_DAY = android.icu.util.Calendar.JULIAN_DAY;
    public static final int JULY = android.icu.util.Calendar.JULY;
    public static final int JUNE = android.icu.util.Calendar.JUNE;
    public static final int MARCH = android.icu.util.Calendar.MARCH;
    public static final int MAY = android.icu.util.Calendar.MAY;
    public static final int MILLISECOND = android.icu.util.Calendar.MILLISECOND;
    public static final int MILLISECONDS_IN_DAY = android.icu.util.Calendar.MILLISECONDS_IN_DAY;
    public static final int MINUTE = android.icu.util.Calendar.MINUTE;
    public static final int MONDAY = android.icu.util.Calendar.MONDAY;
    public static final int MONTH = android.icu.util.Calendar.MONTH;
    public static final int NOVEMBER = android.icu.util.Calendar.NOVEMBER;
    public static final int OCTOBER = android.icu.util.Calendar.OCTOBER;
    public static final int PM = android.icu.util.Calendar.PM;
    public static final int SATURDAY = android.icu.util.Calendar.SATURDAY;
    public static final int SECOND = android.icu.util.Calendar.SECOND;
    public static final int SEPTEMBER = android.icu.util.Calendar.SEPTEMBER;
    public static final int SUNDAY = android.icu.util.Calendar.SUNDAY;
    public static final int THURSDAY = android.icu.util.Calendar.THURSDAY;
    public static final int TUESDAY = android.icu.util.Calendar.TUESDAY;
    public static final int UNDECIMBER = android.icu.util.Calendar.UNDECIMBER;
    public static final int WALLTIME_FIRST = android.icu.util.Calendar.WALLTIME_FIRST;
    public static final int WALLTIME_LAST = android.icu.util.Calendar.WALLTIME_LAST;
    public static final int WALLTIME_NEXT_VALID = android.icu.util.Calendar.WALLTIME_NEXT_VALID;
    public static final int WEDNESDAY = android.icu.util.Calendar.WEDNESDAY;
    public static final int WEEK_OF_MONTH = android.icu.util.Calendar.WEEK_OF_MONTH;
    public static final int WEEK_OF_YEAR = android.icu.util.Calendar.WEEK_OF_YEAR;
    public static final int YEAR = android.icu.util.Calendar.YEAR;
    public static final int YEAR_WOY = android.icu.util.Calendar.YEAR_WOY;
    public static final int ZONE_OFFSET = android.icu.util.Calendar.ZONE_OFFSET;

    public static final class WeekData {
        private final android.icu.util.Calendar.WeekData real;

        public WeekData(android.icu.util.Calendar.WeekData real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData wrap(android.icu.util.Calendar.WeekData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Calendar.WeekData(real);
        }

        public android.icu.util.Calendar.WeekData unwrap() {
            return real;
        }

        public WeekData(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
            this(new android.icu.util.Calendar.WeekData(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
