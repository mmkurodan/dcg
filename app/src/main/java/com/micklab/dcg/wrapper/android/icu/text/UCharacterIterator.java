// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UCharacterIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UCharacterIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator wrap(android.icu.text.UCharacterIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UCharacterIterator getReal() {
        return (android.icu.text.UCharacterIterator) real;
    }

    public android.icu.text.UCharacterIterator unwrap() {
        return getReal();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return ((android.icu.text.UCharacterIterator) real).clone();
    }

    public int current() {
        return ((android.icu.text.UCharacterIterator) real).current();
    }

    public int currentCodePoint() {
        return ((android.icu.text.UCharacterIterator) real).currentCodePoint();
    }

    public java.text.CharacterIterator getCharacterIterator() {
        return ((android.icu.text.UCharacterIterator) real).getCharacterIterator();
    }

    public int getIndex() {
        return ((android.icu.text.UCharacterIterator) real).getIndex();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.lang.StringBuffer arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(java.text.CharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(char[] arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator getInstance(char[] arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator.wrap(android.icu.text.UCharacterIterator.getInstance(arg0, arg1, arg2));
    }

    public int getLength() {
        return ((android.icu.text.UCharacterIterator) real).getLength();
    }

    public java.lang.String getText() {
        return ((android.icu.text.UCharacterIterator) real).getText();
    }

    public int getText(char[] arg0) {
        return ((android.icu.text.UCharacterIterator) real).getText(arg0);
    }

    public int getText(char[] arg0, int arg1) {
        return ((android.icu.text.UCharacterIterator) real).getText(arg0, arg1);
    }

    public int moveCodePointIndex(int arg0) {
        return ((android.icu.text.UCharacterIterator) real).moveCodePointIndex(arg0);
    }

    public int moveIndex(int arg0) {
        return ((android.icu.text.UCharacterIterator) real).moveIndex(arg0);
    }

    public int next() {
        return ((android.icu.text.UCharacterIterator) real).next();
    }

    public int nextCodePoint() {
        return ((android.icu.text.UCharacterIterator) real).nextCodePoint();
    }

    public int previous() {
        return ((android.icu.text.UCharacterIterator) real).previous();
    }

    public int previousCodePoint() {
        return ((android.icu.text.UCharacterIterator) real).previousCodePoint();
    }

    public void setIndex(int arg0) {
        ((android.icu.text.UCharacterIterator) real).setIndex(arg0);
    }

    public void setToLimit() {
        ((android.icu.text.UCharacterIterator) real).setToLimit();
    }

    public void setToStart() {
        ((android.icu.text.UCharacterIterator) real).setToStart();
    }

    public static final int DONE = android.icu.text.UCharacterIterator.DONE;

}
