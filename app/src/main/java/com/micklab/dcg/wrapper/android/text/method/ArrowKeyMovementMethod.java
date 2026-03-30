// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ArrowKeyMovementMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArrowKeyMovementMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ArrowKeyMovementMethod wrap(android.text.method.ArrowKeyMovementMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ArrowKeyMovementMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.ArrowKeyMovementMethod getReal() {
        return (android.text.method.ArrowKeyMovementMethod) real;
    }

    public android.text.method.ArrowKeyMovementMethod unwrap() {
        return getReal();
    }

    public ArrowKeyMovementMethod() {
        this(new android.text.method.ArrowKeyMovementMethod(), (__DcgwBridgeToken) null);
    }

    public boolean canSelectArbitrarily() {
        return ((android.text.method.ArrowKeyMovementMethod) real).canSelectArbitrarily();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MovementMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.MovementMethod.wrap(android.text.method.ArrowKeyMovementMethod.getInstance());
    }

    public void initialize(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        ((android.text.method.ArrowKeyMovementMethod) real).initialize(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean nextParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return ((android.text.method.ArrowKeyMovementMethod) real).nextParagraph(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onTakeFocus(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, int arg2) {
        ((android.text.method.ArrowKeyMovementMethod) real).onTakeFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return ((android.text.method.ArrowKeyMovementMethod) real).onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean previousParagraph(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return ((android.text.method.ArrowKeyMovementMethod) real).previousParagraph(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

}
