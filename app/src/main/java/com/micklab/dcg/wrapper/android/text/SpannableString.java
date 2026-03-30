// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannableString {
    private final android.text.SpannableString real;

    public SpannableString(android.text.SpannableString real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableString wrap(android.text.SpannableString real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannableString(real);
    }

    public android.text.SpannableString unwrap() {
        return real;
    }

    public SpannableString(java.lang.CharSequence arg0) {
        this(new android.text.SpannableString(arg0));
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        real.getChars(arg0, arg1, arg2, arg3);
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return real.getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return real.getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return real.getSpanStart(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int length() {
        return real.length();
    }

    public void removeSpan(java.lang.Object arg0) {
        real.removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        real.setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableString valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableString.wrap(android.text.SpannableString.valueOf(arg0));
    }

}
