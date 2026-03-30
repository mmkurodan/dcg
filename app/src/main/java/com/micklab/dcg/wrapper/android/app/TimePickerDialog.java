// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TimePickerDialog {
    private final android.app.TimePickerDialog real;

    public TimePickerDialog(android.app.TimePickerDialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TimePickerDialog wrap(android.app.TimePickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TimePickerDialog(real);
    }

    public android.app.TimePickerDialog unwrap() {
        return real;
    }

    public TimePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener arg1, int arg2, int arg3, boolean arg4) {
        this(new android.app.TimePickerDialog(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public TimePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener arg2, int arg3, int arg4, boolean arg5) {
        this(new android.app.TimePickerDialog(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5));
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        real.onClick(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onSaveInstanceState());
    }

    public void onTimeChanged(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
        real.onTimeChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void show() {
        real.show();
    }

    public void updateTime(int arg0, int arg1) {
        real.updateTime(arg0, arg1);
    }

    public static final class OnTimeSetListener {
        private final android.app.TimePickerDialog.OnTimeSetListener real;

        public OnTimeSetListener(android.app.TimePickerDialog.OnTimeSetListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener wrap(android.app.TimePickerDialog.OnTimeSetListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener(real);
        }

        public android.app.TimePickerDialog.OnTimeSetListener unwrap() {
            return real;
        }

        public void onTimeSet(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
            real.onTimeSet(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
