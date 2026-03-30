// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannableString {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpannableString(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableString wrap(android.text.SpannableString real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannableString(real, (__DcgwBridgeToken) null);
    }

    public android.text.SpannableString getReal() {
        return (android.text.SpannableString) real;
    }

    public android.text.SpannableString unwrap() {
        return getReal();
    }

    public SpannableString(java.lang.CharSequence arg0) {
        this(new android.text.SpannableString(arg0), (__DcgwBridgeToken) null);
    }

    public char charAt(int arg0) {
        return ((android.text.SpannableString) real).charAt(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.text.SpannableString) real).equals(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.text.SpannableString) real).getChars(arg0, arg1, arg2, arg3);
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return ((android.text.SpannableString) real).getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return ((android.text.SpannableString) real).getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return ((android.text.SpannableString) real).getSpanStart(arg0);
    }

    public int hashCode() {
        return ((android.text.SpannableString) real).hashCode();
    }

    public int length() {
        return ((android.text.SpannableString) real).length();
    }

    public void removeSpan(java.lang.Object arg0) {
        ((android.text.SpannableString) real).removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        ((android.text.SpannableString) real).setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.text.SpannableString) real).subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.text.SpannableString) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableString valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableString.wrap(android.text.SpannableString.valueOf(arg0));
    }

}
