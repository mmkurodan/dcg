// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannedString {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpannedString(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannedString wrap(android.text.SpannedString real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannedString(real, (__DcgwBridgeToken) null);
    }

    public android.text.SpannedString getReal() {
        return (android.text.SpannedString) real;
    }

    public android.text.SpannedString unwrap() {
        return getReal();
    }

    public SpannedString(java.lang.CharSequence arg0) {
        this(new android.text.SpannedString(arg0), (__DcgwBridgeToken) null);
    }

    public char charAt(int arg0) {
        return ((android.text.SpannedString) real).charAt(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.text.SpannedString) real).equals(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.text.SpannedString) real).getChars(arg0, arg1, arg2, arg3);
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return ((android.text.SpannedString) real).getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return ((android.text.SpannedString) real).getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return ((android.text.SpannedString) real).getSpanStart(arg0);
    }

    public int hashCode() {
        return ((android.text.SpannedString) real).hashCode();
    }

    public int length() {
        return ((android.text.SpannedString) real).length();
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.text.SpannedString) real).subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.text.SpannedString) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannedString valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannedString.wrap(android.text.SpannedString.valueOf(arg0));
    }

}
