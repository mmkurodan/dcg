// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class MovementMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MovementMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod wrap(android.text.method.MovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.MovementMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.MovementMethod getReal() {
        return (android.text.method.MovementMethod) real;
    }

    public android.text.method.MovementMethod unwrap() {
        return getReal();
    }

    public boolean canSelectArbitrarily() {
        return ((android.text.method.MovementMethod) real).canSelectArbitrarily();
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        ((android.text.method.MovementMethod) real).initialize(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.MovementMethod) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.MovementMethod) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.text.method.MovementMethod) real).onKeyOther(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.MovementMethod) real).onKeyUp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        ((android.text.method.MovementMethod) real).onTakeFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.MovementMethod) real).onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.MovementMethod) real).onTrackballEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

}
