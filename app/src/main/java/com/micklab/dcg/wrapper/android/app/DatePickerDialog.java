// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DatePickerDialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DatePickerDialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DatePickerDialog wrap(android.app.DatePickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DatePickerDialog(real, (__DcgwBridgeToken) null);
    }

    public android.app.DatePickerDialog getReal() {
        return (android.app.DatePickerDialog) real;
    }

    public android.app.DatePickerDialog unwrap() {
        return getReal();
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg1, int arg2, int arg3, int arg4) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg2, int arg3, int arg4, int arg5) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.DatePicker getDatePicker() {
        return com.micklab.dcg.wrapper.android.widget.DatePicker.wrap(((android.app.DatePickerDialog) real).getDatePicker());
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        ((android.app.DatePickerDialog) real).onClick(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onDateChanged(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
        ((android.app.DatePickerDialog) real).onDateChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.DatePickerDialog) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.DatePickerDialog) real).onSaveInstanceState());
    }

    public void setOnDateSetListener(com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg0) {
        ((android.app.DatePickerDialog) real).setOnDateSetListener(arg0 == null ? null : arg0.getReal());
    }

    public void updateDate(int arg0, int arg1, int arg2) {
        ((android.app.DatePickerDialog) real).updateDate(arg0, arg1, arg2);
    }

    public static final class OnDateSetListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDateSetListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener wrap(android.app.DatePickerDialog.OnDateSetListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.DatePickerDialog.OnDateSetListener getReal() {
            return (android.app.DatePickerDialog.OnDateSetListener) real;
        }

        public android.app.DatePickerDialog.OnDateSetListener unwrap() {
            return getReal();
        }

        public void onDateSet(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
            ((android.app.DatePickerDialog.OnDateSetListener) real).onDateSet(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
}
