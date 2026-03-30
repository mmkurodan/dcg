// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CheckBox {
    private final android.widget.CheckBox real;

    public CheckBox(android.widget.CheckBox real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CheckBox wrap(android.widget.CheckBox real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CheckBox(real);
    }

    public android.widget.CheckBox unwrap() {
        return real;
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.unwrap()));
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

}
