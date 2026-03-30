// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TimePickerDialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimePickerDialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TimePickerDialog wrap(android.app.TimePickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TimePickerDialog(real, (__DcgwBridgeToken) null);
    }

    public android.app.TimePickerDialog getReal() {
        return (android.app.TimePickerDialog) real;
    }

    public android.app.TimePickerDialog unwrap() {
        return getReal();
    }

    public TimePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener arg1, int arg2, int arg3, boolean arg4) {
        this(new android.app.TimePickerDialog(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public TimePickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener arg2, int arg3, int arg4, boolean arg5) {
        this(new android.app.TimePickerDialog(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        ((android.app.TimePickerDialog) real).onClick(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.TimePickerDialog) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.TimePickerDialog) real).onSaveInstanceState());
    }

    public void onTimeChanged(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
        ((android.app.TimePickerDialog) real).onTimeChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void show() {
        ((android.app.TimePickerDialog) real).show();
    }

    public void updateTime(int arg0, int arg1) {
        ((android.app.TimePickerDialog) real).updateTime(arg0, arg1);
    }

    public static final class OnTimeSetListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTimeSetListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener wrap(android.app.TimePickerDialog.OnTimeSetListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.TimePickerDialog.OnTimeSetListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.TimePickerDialog.OnTimeSetListener getReal() {
            return (android.app.TimePickerDialog.OnTimeSetListener) real;
        }

        public android.app.TimePickerDialog.OnTimeSetListener unwrap() {
            return getReal();
        }

        public void onTimeSet(com.micklab.dcg.wrapper.android.widget.TimePicker arg0, int arg1, int arg2) {
            ((android.app.TimePickerDialog.OnTimeSetListener) real).onTimeSet(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
