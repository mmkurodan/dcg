// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RadioButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RadioButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RadioButton wrap(android.widget.RadioButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioButton(real, (__DcgwBridgeToken) null);
    }

    public android.widget.RadioButton getReal() {
        return (android.widget.RadioButton) real;
    }

    public android.widget.RadioButton unwrap() {
        return getReal();
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.RadioButton) real).getAccessibilityClassName();
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        ((android.widget.RadioButton) real).onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal());
    }

    public void toggle() {
        ((android.widget.RadioButton) real).toggle();
    }

}
