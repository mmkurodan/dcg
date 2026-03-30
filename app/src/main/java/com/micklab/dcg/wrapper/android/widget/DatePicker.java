// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DatePicker {
    private final android.widget.DatePicker real;

    public DatePicker(android.widget.DatePicker real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DatePicker wrap(android.widget.DatePicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DatePicker(real);
    }

    public android.widget.DatePicker unwrap() {
        return real;
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.unwrap()));
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.dispatchProvideAutofillStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.widget.CalendarView getCalendarView() {
        return com.micklab.dcg.wrapper.android.widget.CalendarView.wrap(real.getCalendarView());
    }

    public boolean getCalendarViewShown() {
        return real.getCalendarViewShown();
    }

    public int getDayOfMonth() {
        return real.getDayOfMonth();
    }

    public int getFirstDayOfWeek() {
        return real.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return real.getMaxDate();
    }

    public long getMinDate() {
        return real.getMinDate();
    }

    public int getMonth() {
        return real.getMonth();
    }

    public boolean getSpinnersShown() {
        return real.getSpinnersShown();
    }

    public int getYear() {
        return real.getYear();
    }

    public void init(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener arg3) {
        real.init(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public void setCalendarViewShown(boolean arg0) {
        real.setCalendarViewShown(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFirstDayOfWeek(int arg0) {
        real.setFirstDayOfWeek(arg0);
    }

    public void setMaxDate(long arg0) {
        real.setMaxDate(arg0);
    }

    public void setMinDate(long arg0) {
        real.setMinDate(arg0);
    }

    public void setOnDateChangedListener(com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener arg0) {
        real.setOnDateChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSpinnersShown(boolean arg0) {
        real.setSpinnersShown(arg0);
    }

    public void updateDate(int arg0, int arg1, int arg2) {
        real.updateDate(arg0, arg1, arg2);
    }

    public static final class OnDateChangedListener {
        private final android.widget.DatePicker.OnDateChangedListener real;

        public OnDateChangedListener(android.widget.DatePicker.OnDateChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener wrap(android.widget.DatePicker.OnDateChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener(real);
        }

        public android.widget.DatePicker.OnDateChangedListener unwrap() {
            return real;
        }

        public void onDateChanged(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
            real.onDateChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
}
