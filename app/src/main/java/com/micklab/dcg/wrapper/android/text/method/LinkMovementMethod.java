// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class LinkMovementMethod {
    private final android.text.method.LinkMovementMethod real;

    public LinkMovementMethod(android.text.method.LinkMovementMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.LinkMovementMethod wrap(android.text.method.LinkMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.LinkMovementMethod(real);
    }

    public android.text.method.LinkMovementMethod unwrap() {
        return real;
    }

    public LinkMovementMethod() {
        this(new android.text.method.LinkMovementMethod());
    }

    public boolean canSelectArbitrarily() {
        return real.canSelectArbitrarily();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.LinkMovementMethod.getInstance());
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        real.initialize(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        real.onTakeFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

}
