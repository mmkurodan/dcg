// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TimePicker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimePicker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TimePicker wrap(android.widget.TimePicker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TimePicker(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TimePicker getReal() {
        return (android.widget.TimePicker) real;
    }

    public android.widget.TimePicker unwrap() {
        return getReal();
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public TimePicker(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.TimePicker(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.TimePicker) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.widget.TimePicker) real).dispatchProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TimePicker) real).getAccessibilityClassName();
    }

    public int getAutofillType() {
        return ((android.widget.TimePicker) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.TimePicker) real).getAutofillValue());
    }

    public int getBaseline() {
        return ((android.widget.TimePicker) real).getBaseline();
    }

    public java.lang.Integer getCurrentHour() {
        return ((android.widget.TimePicker) real).getCurrentHour();
    }

    public java.lang.Integer getCurrentMinute() {
        return ((android.widget.TimePicker) real).getCurrentMinute();
    }

    public int getHour() {
        return ((android.widget.TimePicker) real).getHour();
    }

    public int getMinute() {
        return ((android.widget.TimePicker) real).getMinute();
    }

    public boolean is24HourView() {
        return ((android.widget.TimePicker) real).is24HourView();
    }

    public boolean isEnabled() {
        return ((android.widget.TimePicker) real).isEnabled();
    }

    public void setCurrentHour(java.lang.Integer arg0) {
        ((android.widget.TimePicker) real).setCurrentHour(arg0);
    }

    public void setCurrentMinute(java.lang.Integer arg0) {
        ((android.widget.TimePicker) real).setCurrentMinute(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.TimePicker) real).setEnabled(arg0);
    }

    public void setHour(int arg0) {
        ((android.widget.TimePicker) real).setHour(arg0);
    }

    public void setIs24HourView(java.lang.Boolean arg0) {
        ((android.widget.TimePicker) real).setIs24HourView(arg0);
    }

    public void setMinute(int arg0) {
        ((android.widget.TimePicker) real).setMinute(arg0);
    }

    public void setOnTimeChangedListener(com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener arg0) {
        ((android.widget.TimePicker) real).setOnTimeChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean validateInput() {
        return ((android.widget.TimePicker) real).validateInput();
    }

    public static final class OnTimeChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTimeChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener wrap(android.widget.TimePicker.OnTimeChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TimePicker.OnTimeChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TimePicker.OnTimeChangedListener getReal() {
            return (android.widget.TimePicker.OnTimeChangedListener) real;
        }

        public android.widget.TimePicker.OnTimeChangedListener unwrap() {
            return getReal();
        }

        public void onTimeChanged(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
            ((android.widget.TimePicker.OnTimeChangedListener) real).onTimeChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
