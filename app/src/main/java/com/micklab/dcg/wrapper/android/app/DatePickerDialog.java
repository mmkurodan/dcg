// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DatePickerDialog {
    private final android.app.DatePickerDialog real;

    public DatePickerDialog(android.app.DatePickerDialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DatePickerDialog wrap(android.app.DatePickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DatePickerDialog(real);
    }

    public android.app.DatePickerDialog unwrap() {
        return real;
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.unwrap()));
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg1, int arg2, int arg3, int arg4) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public DatePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg2, int arg3, int arg4, int arg5) {
        this(new android.app.DatePickerDialog(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5));
    }

    public com.micklab.dcg.wrapper.android.widget.DatePicker getDatePicker() {
        return com.micklab.dcg.wrapper.android.widget.DatePicker.wrap(real.getDatePicker());
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        real.onClick(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onDateChanged(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
        real.onDateChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onSaveInstanceState());
    }

    public void setOnDateSetListener(com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener arg0) {
        real.setOnDateSetListener(arg0 == null ? null : arg0.unwrap());
    }

    public void updateDate(int arg0, int arg1, int arg2) {
        real.updateDate(arg0, arg1, arg2);
    }

    public static final class OnDateSetListener {
        private final android.app.DatePickerDialog.OnDateSetListener real;

        public OnDateSetListener(android.app.DatePickerDialog.OnDateSetListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener wrap(android.app.DatePickerDialog.OnDateSetListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DatePickerDialog.OnDateSetListener(real);
        }

        public android.app.DatePickerDialog.OnDateSetListener unwrap() {
            return real;
        }

        public void onDateSet(com.micklab.dcg.wrapper.android.widget.DatePicker arg0, int arg1, int arg2, int arg3) {
            real.onDateSet(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
}
