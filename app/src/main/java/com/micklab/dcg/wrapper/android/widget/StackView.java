// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class StackView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StackView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.StackView wrap(android.widget.StackView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.StackView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.StackView getReal() {
        return (android.widget.StackView) real;
    }

    public android.widget.StackView unwrap() {
        return getReal();
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public StackView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.StackView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void advance() {
        ((android.widget.StackView) real).advance();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.StackView) real).getAccessibilityClassName();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.StackView) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.StackView) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.StackView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void showNext() {
        ((android.widget.StackView) real).showNext();
    }

    public void showPrevious() {
        ((android.widget.StackView) real).showPrevious();
    }

}
