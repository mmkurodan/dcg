// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class MetaKeyKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MetaKeyKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.MetaKeyKeyListener wrap(android.text.method.MetaKeyKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.MetaKeyKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.MetaKeyKeyListener getReal() {
        return (android.text.method.MetaKeyKeyListener) real;
    }

    public android.text.method.MetaKeyKeyListener unwrap() {
        return getReal();
    }

    public static long adjustMetaAfterKeypress(long arg0) {
        return android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(arg0);
    }

    public static void adjustMetaAfterKeypress(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(arg0 == null ? null : arg0.getReal());
    }

    public long clearMetaKeyState(long arg0, int arg1) {
        return ((android.text.method.MetaKeyKeyListener) real).clearMetaKeyState(arg0, arg1);
    }

    public static void clearMetaKeyState(com.micklab.dcg.wrapper.android.text.Editable arg0, int arg1) {
        android.text.method.MetaKeyKeyListener.clearMetaKeyState(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void clearMetaKeyState(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2) {
        ((android.text.method.MetaKeyKeyListener) real).clearMetaKeyState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static int getMetaState(java.lang.CharSequence arg0) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0);
    }

    public static int getMetaState(long arg0) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0);
    }

    public static int getMetaState(java.lang.CharSequence arg0, int arg1) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1);
    }

    public static int getMetaState(long arg0, int arg1) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1);
    }

    public static int getMetaState(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static int getMetaState(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static long handleKeyDown(long arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.handleKeyDown(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static long handleKeyUp(long arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.handleKeyUp(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static boolean isMetaTracker(java.lang.CharSequence arg0, java.lang.Object arg1) {
        return android.text.method.MetaKeyKeyListener.isMetaTracker(arg0, arg1);
    }

    public static boolean isSelectingMetaTracker(java.lang.CharSequence arg0, java.lang.Object arg1) {
        return android.text.method.MetaKeyKeyListener.isSelectingMetaTracker(arg0, arg1);
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.MetaKeyKeyListener) real).onKeyDown(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return ((android.text.method.MetaKeyKeyListener) real).onKeyUp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public static long resetLockedMeta(long arg0) {
        return android.text.method.MetaKeyKeyListener.resetLockedMeta(arg0);
    }

    public static void resetMetaState(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.method.MetaKeyKeyListener.resetMetaState(arg0 == null ? null : arg0.getReal());
    }

    public static final int META_ALT_LOCKED = android.text.method.MetaKeyKeyListener.META_ALT_LOCKED;
    public static final int META_ALT_ON = android.text.method.MetaKeyKeyListener.META_ALT_ON;
    public static final int META_CAP_LOCKED = android.text.method.MetaKeyKeyListener.META_CAP_LOCKED;
    public static final int META_SHIFT_ON = android.text.method.MetaKeyKeyListener.META_SHIFT_ON;
    public static final int META_SYM_LOCKED = android.text.method.MetaKeyKeyListener.META_SYM_LOCKED;
    public static final int META_SYM_ON = android.text.method.MetaKeyKeyListener.META_SYM_ON;

}
