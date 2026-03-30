// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class MultiTapKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiTapKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener wrap(android.text.method.MultiTapKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.MultiTapKeyListener getReal() {
        return (android.text.method.MultiTapKeyListener) real;
    }

    public android.text.method.MultiTapKeyListener unwrap() {
        return getReal();
    }

    public MultiTapKeyListener(com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg0, boolean arg1) {
        this(new android.text.method.MultiTapKeyListener(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int getInputType() {
        return ((android.text.method.MultiTapKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener getInstance(boolean arg0, com.micklab.dcg.wrapper.android.text.method.TextKeyListener.Capitalize arg1) {
        return com.micklab.dcg.wrapper.android.text.method.MultiTapKeyListener.wrap(android.text.method.MultiTapKeyListener.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.MultiTapKeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onSpanAdded(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.method.MultiTapKeyListener) real).onSpanAdded(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onSpanChanged(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.text.method.MultiTapKeyListener) real).onSpanChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5);
    }

    public void onSpanRemoved(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.text.method.MultiTapKeyListener) real).onSpanRemoved(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

}
