// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SpinnerAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpinnerAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SpinnerAdapter wrap(android.widget.SpinnerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SpinnerAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SpinnerAdapter getReal() {
        return (android.widget.SpinnerAdapter) real;
    }

    public android.widget.SpinnerAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SpinnerAdapter) real).getDropDownView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

}
