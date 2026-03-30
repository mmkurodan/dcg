// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class Touch {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Touch(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.Touch wrap(android.text.method.Touch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.Touch(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.Touch getReal() {
        return (android.text.method.Touch) real;
    }

    public android.text.method.Touch unwrap() {
        return getReal();
    }

    public static int getInitialScrollX(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return android.text.method.Touch.getInitialScrollX(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static int getInitialScrollY(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1) {
        return android.text.method.Touch.getInitialScrollY(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static boolean onTouchEvent(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Spannable arg1, com.micklab.dcg.wrapper.android.view.MotionEvent arg2) {
        return android.text.method.Touch.onTouchEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static void scrollTo(com.micklab.dcg.wrapper.android.widget.TextView arg0, com.micklab.dcg.wrapper.android.text.Layout arg1, int arg2, int arg3) {
        android.text.method.Touch.scrollTo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

}
