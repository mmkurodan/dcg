// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsSpinner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbsSpinner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsSpinner wrap(android.widget.AbsSpinner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsSpinner(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AbsSpinner getReal() {
        return (android.widget.AbsSpinner) real;
    }

    public android.widget.AbsSpinner unwrap() {
        return getReal();
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.AbsSpinner) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AbsSpinner) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.SpinnerAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.SpinnerAdapter.wrap(((android.widget.AbsSpinner) real).getAdapter());
    }

    public int getAutofillType() {
        return ((android.widget.AbsSpinner) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.AbsSpinner) real).getAutofillValue());
    }

    public int getCount() {
        return ((android.widget.AbsSpinner) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.AbsSpinner) real).getSelectedView());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.AbsSpinner) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.AbsSpinner) real).onSaveInstanceState());
    }

    public int pointToPosition(int arg0, int arg1) {
        return ((android.widget.AbsSpinner) real).pointToPosition(arg0, arg1);
    }

    public void requestLayout() {
        ((android.widget.AbsSpinner) real).requestLayout();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.SpinnerAdapter arg0) {
        ((android.widget.AbsSpinner) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.AbsSpinner) real).setSelection(arg0);
    }

    public void setSelection(int arg0, boolean arg1) {
        ((android.widget.AbsSpinner) real).setSelection(arg0, arg1);
    }

}
