// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CalendarView {
    private final android.widget.CalendarView real;

    public CalendarView(android.widget.CalendarView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CalendarView wrap(android.widget.CalendarView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CalendarView(real);
    }

    public android.widget.CalendarView unwrap() {
        return real;
    }

    public CalendarView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.CalendarView(arg0 == null ? null : arg0.unwrap()));
    }

    public CalendarView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.CalendarView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public CalendarView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.CalendarView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public CalendarView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.CalendarView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public long getDate() {
        return real.getDate();
    }

    public int getDateTextAppearance() {
        return real.getDateTextAppearance();
    }

    public int getFirstDayOfWeek() {
        return real.getFirstDayOfWeek();
    }

    public int getFocusedMonthDateColor() {
        return real.getFocusedMonthDateColor();
    }

    public long getMaxDate() {
        return real.getMaxDate();
    }

    public long getMinDate() {
        return real.getMinDate();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getSelectedDateVerticalBar() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getSelectedDateVerticalBar());
    }

    public int getSelectedWeekBackgroundColor() {
        return real.getSelectedWeekBackgroundColor();
    }

    public boolean getShowWeekNumber() {
        return real.getShowWeekNumber();
    }

    public int getShownWeekCount() {
        return real.getShownWeekCount();
    }

    public int getUnfocusedMonthDateColor() {
        return real.getUnfocusedMonthDateColor();
    }

    public int getWeekDayTextAppearance() {
        return real.getWeekDayTextAppearance();
    }

    public int getWeekNumberColor() {
        return real.getWeekNumberColor();
    }

    public int getWeekSeparatorLineColor() {
        return real.getWeekSeparatorLineColor();
    }

    public void setDate(long arg0) {
        real.setDate(arg0);
    }

    public void setDate(long arg0, boolean arg1, boolean arg2) {
        real.setDate(arg0, arg1, arg2);
    }

    public void setDateTextAppearance(int arg0) {
        real.setDateTextAppearance(arg0);
    }

    public void setFirstDayOfWeek(int arg0) {
        real.setFirstDayOfWeek(arg0);
    }

    public void setFocusedMonthDateColor(int arg0) {
        real.setFocusedMonthDateColor(arg0);
    }

    public void setMaxDate(long arg0) {
        real.setMaxDate(arg0);
    }

    public void setMinDate(long arg0) {
        real.setMinDate(arg0);
    }

    public void setOnDateChangeListener(com.micklab.dcg.wrapper.android.widget.CalendarView.OnDateChangeListener arg0) {
        real.setOnDateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelectedDateVerticalBar(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setSelectedDateVerticalBar(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelectedDateVerticalBar(int arg0) {
        real.setSelectedDateVerticalBar(arg0);
    }

    public void setSelectedWeekBackgroundColor(int arg0) {
        real.setSelectedWeekBackgroundColor(arg0);
    }

    public void setShowWeekNumber(boolean arg0) {
        real.setShowWeekNumber(arg0);
    }

    public void setShownWeekCount(int arg0) {
        real.setShownWeekCount(arg0);
    }

    public void setUnfocusedMonthDateColor(int arg0) {
        real.setUnfocusedMonthDateColor(arg0);
    }

    public void setWeekDayTextAppearance(int arg0) {
        real.setWeekDayTextAppearance(arg0);
    }

    public void setWeekNumberColor(int arg0) {
        real.setWeekNumberColor(arg0);
    }

    public void setWeekSeparatorLineColor(int arg0) {
        real.setWeekSeparatorLineColor(arg0);
    }

    public static final class OnDateChangeListener {
        private final android.widget.CalendarView.OnDateChangeListener real;

        public OnDateChangeListener(android.widget.CalendarView.OnDateChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.CalendarView.OnDateChangeListener wrap(android.widget.CalendarView.OnDateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CalendarView.OnDateChangeListener(real);
        }

        public android.widget.CalendarView.OnDateChangeListener unwrap() {
            return real;
        }

        public void onSelectedDayChange(com.micklab.dcg.wrapper.android.widget.CalendarView arg0, int arg1, int arg2, int arg3) {
            real.onSelectedDayChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
}
