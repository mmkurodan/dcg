// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MonthDisplayHelper {
    private final android.util.MonthDisplayHelper real;

    public MonthDisplayHelper(android.util.MonthDisplayHelper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MonthDisplayHelper wrap(android.util.MonthDisplayHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MonthDisplayHelper(real);
    }

    public android.util.MonthDisplayHelper unwrap() {
        return real;
    }

    public MonthDisplayHelper(int arg0, int arg1) {
        this(new android.util.MonthDisplayHelper(arg0, arg1));
    }

    public MonthDisplayHelper(int arg0, int arg1, int arg2) {
        this(new android.util.MonthDisplayHelper(arg0, arg1, arg2));
    }

    public int getColumnOf(int arg0) {
        return real.getColumnOf(arg0);
    }

    public int getDayAt(int arg0, int arg1) {
        return real.getDayAt(arg0, arg1);
    }

    public int[] getDigitsForRow(int arg0) {
        return real.getDigitsForRow(arg0);
    }

    public int getFirstDayOfMonth() {
        return real.getFirstDayOfMonth();
    }

    public int getMonth() {
        return real.getMonth();
    }

    public int getNumberOfDaysInMonth() {
        return real.getNumberOfDaysInMonth();
    }

    public int getOffset() {
        return real.getOffset();
    }

    public int getRowOf(int arg0) {
        return real.getRowOf(arg0);
    }

    public int getWeekStartDay() {
        return real.getWeekStartDay();
    }

    public int getYear() {
        return real.getYear();
    }

    public boolean isWithinCurrentMonth(int arg0, int arg1) {
        return real.isWithinCurrentMonth(arg0, arg1);
    }

    public void nextMonth() {
        real.nextMonth();
    }

    public void previousMonth() {
        real.previousMonth();
    }

}
