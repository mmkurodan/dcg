// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsSpinner {
    private final android.widget.AbsSpinner real;

    public AbsSpinner(android.widget.AbsSpinner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsSpinner wrap(android.widget.AbsSpinner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsSpinner(real);
    }

    public android.widget.AbsSpinner unwrap() {
        return real;
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.SpinnerAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.SpinnerAdapter.wrap(real.getAdapter());
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getSelectedView());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public int pointToPosition(int arg0, int arg1) {
        return real.pointToPosition(arg0, arg1);
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.SpinnerAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void setSelection(int arg0, boolean arg1) {
        real.setSelection(arg0, arg1);
    }

}
