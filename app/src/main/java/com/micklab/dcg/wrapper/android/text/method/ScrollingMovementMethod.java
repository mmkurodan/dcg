// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ScrollingMovementMethod {
    private final android.text.method.ScrollingMovementMethod real;

    public ScrollingMovementMethod(android.text.method.ScrollingMovementMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ScrollingMovementMethod wrap(android.text.method.ScrollingMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ScrollingMovementMethod(real);
    }

    public android.text.method.ScrollingMovementMethod unwrap() {
        return real;
    }

    public ScrollingMovementMethod() {
        this(new android.text.method.ScrollingMovementMethod());
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.ScrollingMovementMethod.getInstance());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        real.onTakeFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

}
