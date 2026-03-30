// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TextSwitcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextSwitcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TextSwitcher wrap(android.widget.TextSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TextSwitcher(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TextSwitcher getReal() {
        return (android.widget.TextSwitcher) real;
    }

    public android.widget.TextSwitcher unwrap() {
        return getReal();
    }

    public TextSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TextSwitcher(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TextSwitcher(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.TextSwitcher) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TextSwitcher) real).getAccessibilityClassName();
    }

    public void setCurrentText(java.lang.CharSequence arg0) {
        ((android.widget.TextSwitcher) real).setCurrentText(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.widget.TextSwitcher) real).setText(arg0);
    }

}
