// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SpinnerAdapter {
    private final android.widget.SpinnerAdapter real;

    public SpinnerAdapter(android.widget.SpinnerAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SpinnerAdapter wrap(android.widget.SpinnerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SpinnerAdapter(real);
    }

    public android.widget.SpinnerAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDropDownView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

}
