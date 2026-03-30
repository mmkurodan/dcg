// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DatePicker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DatePicker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DatePicker wrap(android.widget.DatePicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DatePicker(real, (__DcgwBridgeToken) null);
    }

    public android.widget.DatePicker getReal() {
        return (android.widget.DatePicker) real;
    }

    public android.widget.DatePicker unwrap() {
        return getReal();
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public DatePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.DatePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.DatePicker) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.widget.DatePicker) real).dispatchProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.DatePicker) real).getAccessibilityClassName();
    }

    public int getAutofillType() {
        return ((android.widget.DatePicker) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.DatePicker) real).getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.widget.CalendarView getCalendarView() {
        return com.micklab.dcg.wrapper.android.widget.CalendarView.wrap(((android.widget.DatePicker) real).getCalendarView());
    }

    public boolean getCalendarViewShown() {
        return ((android.widget.DatePicker) real).getCalendarViewShown();
    }

    public int getDayOfMonth() {
        return ((android.widget.DatePicker) real).getDayOfMonth();
    }

    public int getFirstDayOfWeek() {
        return ((android.widget.DatePicker) real).getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return ((android.widget.DatePicker) real).getMaxDate();
    }

    public long getMinDate() {
        return ((android.widget.DatePicker) real).getMinDate();
    }

    public int getMonth() {
        return ((android.widget.DatePicker) real).getMonth();
    }

    public boolean getSpinnersShown() {
        return ((android.widget.DatePicker) real).getSpinnersShown();
    }

    public int getYear() {
        return ((android.widget.DatePicker) real).getYear();
    }

    public void init(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener arg3) {
        ((android.widget.DatePicker) real).init(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean isEnabled() {
        return ((android.widget.DatePicker) real).isEnabled();
    }

    public void setCalendarViewShown(boolean arg0) {
        ((android.widget.DatePicker) real).setCalendarViewShown(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.DatePicker) real).setEnabled(arg0);
    }

    public void setFirstDayOfWeek(int arg0) {
        ((android.widget.DatePicker) real).setFirstDayOfWeek(arg0);
    }

    public void setMaxDate(long arg0) {
        ((android.widget.DatePicker) real).setMaxDate(arg0);
    }

    public void setMinDate(long arg0) {
        ((android.widget.DatePicker) real).setMinDate(arg0);
    }

    public void setOnDateChangedListener(com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener arg0) {
        ((android.widget.DatePicker) real).setOnDateChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setSpinnersShown(boolean arg0) {
        ((android.widget.DatePicker) real).setSpinnersShown(arg0);
    }

    public void updateDate(int arg0, int arg1, int arg2) {
        ((android.widget.DatePicker) real).updateDate(arg0, arg1, arg2);
    }

    public static final class OnDateChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDateChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener wrap(android.widget.DatePicker.OnDateChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DatePicker.OnDateChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.DatePicker.OnDateChangedListener getReal() {
            return (android.widget.DatePicker.OnDateChangedListener) real;
        }

        public android.widget.DatePicker.OnDateChangedListener unwrap() {
            return getReal();
        }

        public void onDateChanged(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
            ((android.widget.DatePicker.OnDateChangedListener) real).onDateChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
}
