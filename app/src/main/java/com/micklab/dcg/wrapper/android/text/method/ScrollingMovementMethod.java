// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ScrollingMovementMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollingMovementMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ScrollingMovementMethod wrap(android.text.method.ScrollingMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ScrollingMovementMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.ScrollingMovementMethod getReal() {
        return (android.text.method.ScrollingMovementMethod) real;
    }

    public android.text.method.ScrollingMovementMethod unwrap() {
        return getReal();
    }

    public ScrollingMovementMethod() {
        this(new android.text.method.ScrollingMovementMethod(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.ScrollingMovementMethod.getInstance());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        ((android.text.method.ScrollingMovementMethod) real).onTakeFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.ScrollingMovementMethod) real).onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

}
