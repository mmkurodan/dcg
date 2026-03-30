// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TimePicker {
    private final android.widget.TimePicker real;

    public TimePicker(android.widget.TimePicker real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TimePicker wrap(android.widget.TimePicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TimePicker(real);
    }

    public android.widget.TimePicker unwrap() {
        return real;
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.unwrap()));
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
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

    public int getBaseline() {
        return real.getBaseline();
    }

    public java.lang.Integer getCurrentHour() {
        return real.getCurrentHour();
    }

    public java.lang.Integer getCurrentMinute() {
        return real.getCurrentMinute();
    }

    public int getHour() {
        return real.getHour();
    }

    public int getMinute() {
        return real.getMinute();
    }

    public boolean is24HourView() {
        return real.is24HourView();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public void setCurrentHour(java.lang.Integer arg0) {
        real.setCurrentHour(arg0);
    }

    public void setCurrentMinute(java.lang.Integer arg0) {
        real.setCurrentMinute(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setHour(int arg0) {
        real.setHour(arg0);
    }

    public void setIs24HourView(java.lang.Boolean arg0) {
        real.setIs24HourView(arg0);
    }

    public void setMinute(int arg0) {
        real.setMinute(arg0);
    }

    public void setOnTimeChangedListener(com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener arg0) {
        real.setOnTimeChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean validateInput() {
        return real.validateInput();
    }

    public static final class OnTimeChangedListener {
        private final android.widget.TimePicker.OnTimeChangedListener real;

        public OnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener wrap(android.widget.TimePicker.OnTimeChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener(real);
        }

        public android.widget.TimePicker.OnTimeChangedListener unwrap() {
            return real;
        }

        public void onTimeChanged(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
            real.onTimeChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
