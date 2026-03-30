// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class LinkMovementMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LinkMovementMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.LinkMovementMethod wrap(android.text.method.LinkMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.LinkMovementMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.LinkMovementMethod getReal() {
        return (android.text.method.LinkMovementMethod) real;
    }

    public android.text.method.LinkMovementMethod unwrap() {
        return getReal();
    }

    public LinkMovementMethod() {
        this(new android.text.method.LinkMovementMethod(), (__DcgwBridgeToken) null);
    }

    public boolean canSelectArbitrarily() {
        return ((android.text.method.LinkMovementMethod) real).canSelectArbitrarily();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.LinkMovementMethod.getInstance());
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        ((android.text.method.LinkMovementMethod) real).initialize(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        ((android.text.method.LinkMovementMethod) real).onTakeFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.LinkMovementMethod) real).onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

}
