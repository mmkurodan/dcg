// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class AlteredCharSequence {
    private final android.text.AlteredCharSequence real;

    public AlteredCharSequence(android.text.AlteredCharSequence real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.AlteredCharSequence wrap(android.text.AlteredCharSequence real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.AlteredCharSequence(real);
    }

    public android.text.AlteredCharSequence unwrap() {
        return real;
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        real.getChars(arg0, arg1, arg2, arg3);
    }

    public int length() {
        return real.length();
    }

    public static com.micklab.dcg.wrapper.android.text.AlteredCharSequence make(java.lang.CharSequence arg0, char[] arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.AlteredCharSequence.wrap(android.text.AlteredCharSequence.make(arg0, arg1, arg2, arg3));
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
