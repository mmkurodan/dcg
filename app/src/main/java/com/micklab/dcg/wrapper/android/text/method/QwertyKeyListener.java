// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class QwertyKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QwertyKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener wrap(android.text.method.QwertyKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.QwertyKeyListener getReal() {
        return (android.text.method.QwertyKeyListener) real;
    }

    public android.text.method.QwertyKeyListener unwrap() {
        return getReal();
    }

    public QwertyKeyListener(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, boolean arg1) {
        this(new android.text.method.QwertyKeyListener(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int getInputType() {
        return ((android.text.method.QwertyKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener getInstance(boolean arg0, com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg1) {
        return com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener.wrap(android.text.method.QwertyKeyListener.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener getInstanceForFullKeyboard() {
        return com.micklab.dcg.wrapper.android.text.method.QwertyKeyListener.wrap(android.text.method.QwertyKeyListener.getInstanceForFullKeyboard());
    }

    public static void markAsReplaced(com.micklab.dcg.wrapper.android.text.Spannable arg0, int arg1, int arg2, java.lang.String arg3) {
        android.text.method.QwertyKeyListener.markAsReplaced(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.QwertyKeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

}
