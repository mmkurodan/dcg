// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MonthDisplayHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MonthDisplayHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MonthDisplayHelper wrap(android.util.MonthDisplayHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MonthDisplayHelper(real, (__DcgwBridgeToken) null);
    }

    public android.util.MonthDisplayHelper getReal() {
        return (android.util.MonthDisplayHelper) real;
    }

    public android.util.MonthDisplayHelper unwrap() {
        return getReal();
    }

    public MonthDisplayHelper(int arg0, int arg1) {
        this(new android.util.MonthDisplayHelper(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public MonthDisplayHelper(int arg0, int arg1, int arg2) {
        this(new android.util.MonthDisplayHelper(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getColumnOf(int arg0) {
        return ((android.util.MonthDisplayHelper) real).getColumnOf(arg0);
    }

    public int getDayAt(int arg0, int arg1) {
        return ((android.util.MonthDisplayHelper) real).getDayAt(arg0, arg1);
    }

    public int[] getDigitsForRow(int arg0) {
        return ((android.util.MonthDisplayHelper) real).getDigitsForRow(arg0);
    }

    public int getFirstDayOfMonth() {
        return ((android.util.MonthDisplayHelper) real).getFirstDayOfMonth();
    }

    public int getMonth() {
        return ((android.util.MonthDisplayHelper) real).getMonth();
    }

    public int getNumberOfDaysInMonth() {
        return ((android.util.MonthDisplayHelper) real).getNumberOfDaysInMonth();
    }

    public int getOffset() {
        return ((android.util.MonthDisplayHelper) real).getOffset();
    }

    public int getRowOf(int arg0) {
        return ((android.util.MonthDisplayHelper) real).getRowOf(arg0);
    }

    public int getWeekStartDay() {
        return ((android.util.MonthDisplayHelper) real).getWeekStartDay();
    }

    public int getYear() {
        return ((android.util.MonthDisplayHelper) real).getYear();
    }

    public boolean isWithinCurrentMonth(int arg0, int arg1) {
        return ((android.util.MonthDisplayHelper) real).isWithinCurrentMonth(arg0, arg1);
    }

    public void nextMonth() {
        ((android.util.MonthDisplayHelper) real).nextMonth();
    }

    public void previousMonth() {
        ((android.util.MonthDisplayHelper) real).previousMonth();
    }

}
