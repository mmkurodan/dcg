// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannedString {
    private final android.text.SpannedString real;

    public SpannedString(android.text.SpannedString real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannedString wrap(android.text.SpannedString real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannedString(real);
    }

    public android.text.SpannedString unwrap() {
        return real;
    }

    public SpannedString(java.lang.CharSequence arg0) {
        this(new android.text.SpannedString(arg0));
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

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannedString valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannedString.wrap(android.text.SpannedString.valueOf(arg0));
    }

}
