// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class BaseMovementMethod {
    private final android.text.method.BaseMovementMethod real;

    public BaseMovementMethod(android.text.method.BaseMovementMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.BaseMovementMethod wrap(android.text.method.BaseMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.BaseMovementMethod(real);
    }

    public android.text.method.BaseMovementMethod unwrap() {
        return real;
    }

    public BaseMovementMethod() {
        this(new android.text.method.BaseMovementMethod());
    }

    public boolean canSelectArbitrarily() {
        return real.canSelectArbitrarily();
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        real.initialize(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean nextParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return real.nextParagraph(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onKeyOther(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyOther(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyUp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        real.onTakeFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean previousParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return real.previousParagraph(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

}
