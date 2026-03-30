// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CheckBox {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CheckBox(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CheckBox wrap(android.widget.CheckBox real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CheckBox(real, (__DcgwBridgeToken) null);
    }

    public android.widget.CheckBox getReal() {
        return (android.widget.CheckBox) real;
    }

    public android.widget.CheckBox unwrap() {
        return getReal();
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public CheckBox(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.CheckBox(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.CheckBox) real).getAccessibilityClassName();
    }

}
