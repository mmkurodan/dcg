// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ArrowKeyMovementMethod {
    private final android.text.method.ArrowKeyMovementMethod real;

    public ArrowKeyMovementMethod(android.text.method.ArrowKeyMovementMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ArrowKeyMovementMethod wrap(android.text.method.ArrowKeyMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ArrowKeyMovementMethod(real);
    }

    public android.text.method.ArrowKeyMovementMethod unwrap() {
        return real;
    }

    public ArrowKeyMovementMethod() {
        this(new android.text.method.ArrowKeyMovementMethod());
    }

    public boolean canSelectArbitrarily() {
        return real.canSelectArbitrarily();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.ArrowKeyMovementMethod.getInstance());
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        real.initialize(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean nextParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return real.nextParagraph(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        real.onTakeFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean previousParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return real.previousParagraph(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

}
