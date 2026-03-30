// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class DialerFilter {
    private final android.widget.DialerFilter real;

    public DialerFilter(android.widget.DialerFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.DialerFilter wrap(android.widget.DialerFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.DialerFilter(real);
    }

    public android.widget.DialerFilter unwrap() {
        return real;
    }

    public DialerFilter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.DialerFilter(arg0 == null ? null : arg0.unwrap()));
    }

    public DialerFilter(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.DialerFilter(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void append(java.lang.String arg0) {
        real.append(arg0);
    }

    public void clearText() {
        real.clearText();
    }

    public java.lang.CharSequence getDigits() {
        return real.getDigits();
    }

    public java.lang.CharSequence getFilterText() {
        return real.getFilterText();
    }

    public java.lang.CharSequence getLetters() {
        return real.getLetters();
    }

    public int getMode() {
        return real.getMode();
    }

    public boolean isQwertyKeyboard() {
        return real.isQwertyKeyboard();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void removeFilterWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.removeFilterWatcher(arg0 == null ? null : arg0.unwrap());
    }

    public void setDigitsWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.setDigitsWatcher(arg0 == null ? null : arg0.unwrap());
    }

    public void setFilterWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.setFilterWatcher(arg0 == null ? null : arg0.unwrap());
    }

    public void setLettersWatcher(com.micklab.dcg.wrapper.android.text.TextWatcher arg0) {
        real.setLettersWatcher(arg0 == null ? null : arg0.unwrap());
    }

    public void setMode(int arg0) {
        real.setMode(arg0);
    }

    public static final int DIGITS_AND_LETTERS = android.widget.DialerFilter.DIGITS_AND_LETTERS;
    public static final int DIGITS_AND_LETTERS_NO_DIGITS = android.widget.DialerFilter.DIGITS_AND_LETTERS_NO_DIGITS;
    public static final int DIGITS_AND_LETTERS_NO_LETTERS = android.widget.DialerFilter.DIGITS_AND_LETTERS_NO_LETTERS;
    public static final int DIGITS_ONLY = android.widget.DialerFilter.DIGITS_ONLY;
    public static final int LETTERS_ONLY = android.widget.DialerFilter.LETTERS_ONLY;

}
