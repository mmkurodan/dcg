// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class NumberKeyListener {
    private final android.text.method.NumberKeyListener real;

    public NumberKeyListener(android.text.method.NumberKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.NumberKeyListener wrap(android.text.method.NumberKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.NumberKeyListener(real);
    }

    public android.text.method.NumberKeyListener unwrap() {
        return real;
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

}
