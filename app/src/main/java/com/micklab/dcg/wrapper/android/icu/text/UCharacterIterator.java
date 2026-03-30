// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UCharacterIterator {
    private final android.icu.text.UCharacterIterator real;

    public UCharacterIterator(android.icu.text.UCharacterIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator wrap(android.icu.text.UCharacterIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator(real);
    }

    public android.icu.text.UCharacterIterator unwrap() {
        return real;
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return real.clone();
    }

    public int current() {
        return real.current();
    }

    public int currentCodePoint() {
        return real.currentCodePoint();
    }

    public java.text.CharacterIterator getCharacterIterator() {
        return real.getCharacterIterator();
    }

    public int getIndex() {
        return real.getIndex();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.text.CharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(char[] arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.lang.StringBuffer arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(char[] arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0, arg1, arg2));
    }

    public int getLength() {
        return real.getLength();
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public int getText(char[] arg0) {
        return real.getText(arg0);
    }

    public int getText(char[] arg0, int arg1) {
        return real.getText(arg0, arg1);
    }

    public int moveCodePointIndex(int arg0) {
        return real.moveCodePointIndex(arg0);
    }

    public int moveIndex(int arg0) {
        return real.moveIndex(arg0);
    }

    public int next() {
        return real.next();
    }

    public int nextCodePoint() {
        return real.nextCodePoint();
    }

    public int previous() {
        return real.previous();
    }

    public int previousCodePoint() {
        return real.previousCodePoint();
    }

    public void setIndex(int arg0) {
        real.setIndex(arg0);
    }

    public void setToLimit() {
        real.setToLimit();
    }

    public void setToStart() {
        real.setToStart();
    }

    public static final int DONE = android.icu.text.UCharacterIterator.DONE;

}
