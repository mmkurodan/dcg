// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class BaseMovementMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseMovementMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.BaseMovementMethod wrap(android.text.method.BaseMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.BaseMovementMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.BaseMovementMethod getReal() {
        return (android.text.method.BaseMovementMethod) real;
    }

    public android.text.method.BaseMovementMethod unwrap() {
        return getReal();
    }

    public BaseMovementMethod() {
        this(new android.text.method.BaseMovementMethod(), (__DcgwBridgeToken) null);
    }

    public boolean canSelectArbitrarily() {
        return ((android.text.method.BaseMovementMethod) real).canSelectArbitrarily();
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        ((android.text.method.BaseMovementMethod) real).initialize(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean nextParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return ((android.text.method.BaseMovementMethod) real).nextParagraph(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.BaseMovementMethod) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.BaseMovementMethod) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.text.method.BaseMovementMethod) real).onKeyOther(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.BaseMovementMethod) real).onKeyUp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        ((android.text.method.BaseMovementMethod) real).onTakeFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.BaseMovementMethod) real).onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.BaseMovementMethod) real).onTrackballEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean previousParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return ((android.text.method.BaseMovementMethod) real).previousParagraph(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

}
