// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RadioButton {
    private final android.widget.RadioButton real;

    public RadioButton(android.widget.RadioButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RadioButton wrap(android.widget.RadioButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioButton(real);
    }

    public android.widget.RadioButton unwrap() {
        return real;
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.unwrap()));
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public RadioButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.RadioButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        real.onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void toggle() {
        real.toggle();
    }

}
