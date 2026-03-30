// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class NumberKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.NumberKeyListener wrap(android.text.method.NumberKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.NumberKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.NumberKeyListener getReal() {
        return (android.text.method.NumberKeyListener) real;
    }

    public android.text.method.NumberKeyListener unwrap() {
        return getReal();
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return ((android.text.method.NumberKeyListener) real).filter(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5);
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.NumberKeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

}
