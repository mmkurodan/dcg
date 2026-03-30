// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class MetaKeyKeyListener {
    private final android.text.method.MetaKeyKeyListener real;

    public MetaKeyKeyListener(android.text.method.MetaKeyKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.MetaKeyKeyListener wrap(android.text.method.MetaKeyKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.MetaKeyKeyListener(real);
    }

    public android.text.method.MetaKeyKeyListener unwrap() {
        return real;
    }

    public static long adjustMetaAfterKeypress(long arg0) {
        return android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(arg0);
    }

    public static void adjustMetaAfterKeypress(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(arg0 == null ? null : arg0.unwrap());
    }

    public long clearMetaKeyState(long arg0, int arg1) {
        return real.clearMetaKeyState(arg0, arg1);
    }

    public static void clearMetaKeyState(com.micklab.dcg.wrapper.android.text.Editable arg0, int arg1) {
        android.text.method.MetaKeyKeyListener.clearMetaKeyState(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void clearMetaKeyState(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2) {
        real.clearMetaKeyState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
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
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static int getMetaState(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.getMetaState(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static long handleKeyDown(long arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.handleKeyDown(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static long handleKeyUp(long arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return android.text.method.MetaKeyKeyListener.handleKeyUp(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static boolean isMetaTracker(java.lang.CharSequence arg0, java.lang.Object arg1) {
        return android.text.method.MetaKeyKeyListener.isMetaTracker(arg0, arg1);
    }

    public static boolean isSelectingMetaTracker(java.lang.CharSequence arg0, java.lang.Object arg1) {
        return android.text.method.MetaKeyKeyListener.isSelectingMetaTracker(arg0, arg1);
    }

    public boolean onKeyDown(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyDown(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean onKeyUp(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.text.Editable arg1, int arg2, com.micklab.dcg.wrapper.android.view.KeyEvent arg3) {
        return real.onKeyUp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public static long resetLockedMeta(long arg0) {
        return android.text.method.MetaKeyKeyListener.resetLockedMeta(arg0);
    }

    public static void resetMetaState(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.text.method.MetaKeyKeyListener.resetMetaState(arg0 == null ? null : arg0.unwrap());
    }

    public static final int META_ALT_LOCKED = android.text.method.MetaKeyKeyListener.META_ALT_LOCKED;
    public static final int META_ALT_ON = android.text.method.MetaKeyKeyListener.META_ALT_ON;
    public static final int META_CAP_LOCKED = android.text.method.MetaKeyKeyListener.META_CAP_LOCKED;
    public static final int META_SHIFT_ON = android.text.method.MetaKeyKeyListener.META_SHIFT_ON;
    public static final int META_SYM_LOCKED = android.text.method.MetaKeyKeyListener.META_SYM_LOCKED;
    public static final int META_SYM_ON = android.text.method.MetaKeyKeyListener.META_SYM_ON;

}
