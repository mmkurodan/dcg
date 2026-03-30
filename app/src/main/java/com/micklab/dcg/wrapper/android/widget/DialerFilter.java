// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DialerFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DialerFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DialerFilter wrap(android.widget.DialerFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DialerFilter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.DialerFilter getReal() {
        return (android.widget.DialerFilter) real;
    }

    public android.widget.DialerFilter unwrap() {
        return getReal();
    }

    public DialerFilter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DialerFilter(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DialerFilter(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DialerFilter(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void append(java.lang.String arg0) {
        ((android.widget.DialerFilter) real).append(arg0);
    }

    public void clearText() {
        ((android.widget.DialerFilter) real).clearText();
    }

    public java.lang.CharSequence getDigits() {
        return ((android.widget.DialerFilter) real).getDigits();
    }

    public java.lang.CharSequence getFilterText() {
        return ((android.widget.DialerFilter) real).getFilterText();
    }

    public java.lang.CharSequence getLetters() {
        return ((android.widget.DialerFilter) real).getLetters();
    }

    public int getMode() {
        return ((android.widget.DialerFilter) real).getMode();
    }

    public boolean isQwertyKeyboard() {
        return ((android.widget.DialerFilter) real).isQwertyKeyboard();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.DialerFilter) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.DialerFilter) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void removeFilterWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.DialerFilter) real).removeFilterWatcher(arg0 == null ? null : arg0.getReal());
    }

    public void setDigitsWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.DialerFilter) real).setDigitsWatcher(arg0 == null ? null : arg0.getReal());
    }

    public void setFilterWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.DialerFilter) real).setFilterWatcher(arg0 == null ? null : arg0.getReal());
    }

    public void setLettersWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        ((android.widget.DialerFilter) real).setLettersWatcher(arg0 == null ? null : arg0.getReal());
    }

    public void setMode(int arg0) {
        ((android.widget.DialerFilter) real).setMode(arg0);
    }

    public static final int DIGITS_AND_LETTERS = android.widget.DialerFilter.DIGITS_AND_LETTERS;
    public static final int DIGITS_AND_LETTERS_NO_DIGITS = android.widget.DialerFilter.DIGITS_AND_LETTERS_NO_DIGITS;
    public static final int DIGITS_AND_LETTERS_NO_LETTERS = android.widget.DialerFilter.DIGITS_AND_LETTERS_NO_LETTERS;
    public static final int DIGITS_ONLY = android.widget.DialerFilter.DIGITS_ONLY;
    public static final int LETTERS_ONLY = android.widget.DialerFilter.LETTERS_ONLY;

}
