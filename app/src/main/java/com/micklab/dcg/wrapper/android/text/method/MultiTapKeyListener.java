// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class MultiTapKeyListener {
    private final android.text.method.MultiTapKeyListener real;

    public MultiTapKeyListener(android.text.method.MultiTapKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener wrap(android.text.method.MultiTapKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener(real);
    }

    public android.text.method.MultiTapKeyListener unwrap() {
        return real;
    }

    public MultiTapKeyListener(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, boolean arg1) {
        this(new android.text.method.MultiTapKeyListener(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener getInstance(boolean arg0, com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg1) {
        return com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener.wrap(android.text.method.MultiTapKeyListener.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanAdded(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        real.onSpanChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.onSpanRemoved(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

}
