// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Button {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Button(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Button wrap(android.widget.Button real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Button(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Button getReal() {
        return (android.widget.Button) real;
    }

    public android.widget.Button unwrap() {
        return getReal();
    }

    public Button(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Button(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Button(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Button(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Button(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Button(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public Button(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Button(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.Button) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.widget.Button) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

}
