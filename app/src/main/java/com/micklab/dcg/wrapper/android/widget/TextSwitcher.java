// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextSwitcher {
    private final android.widget.TextSwitcher real;

    public TextSwitcher(android.widget.TextSwitcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextSwitcher wrap(android.widget.TextSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextSwitcher(real);
    }

    public android.widget.TextSwitcher unwrap() {
        return real;
    }

    public TextSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextSwitcher(arg0 == null ? null : arg0.unwrap()));
    }

    public TextSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextSwitcher(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void setCurrentText(java.lang.CharSequence arg0) {
        real.setCurrentText(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

}
