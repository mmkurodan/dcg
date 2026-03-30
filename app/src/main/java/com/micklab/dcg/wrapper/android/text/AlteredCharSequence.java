// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class AlteredCharSequence {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlteredCharSequence(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.AlteredCharSequence wrap(android.text.AlteredCharSequence real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.AlteredCharSequence(real, (__DcgwBridgeToken) null);
    }

    public android.text.AlteredCharSequence getReal() {
        return (android.text.AlteredCharSequence) real;
    }

    public android.text.AlteredCharSequence unwrap() {
        return getReal();
    }

    public char charAt(int arg0) {
        return ((android.text.AlteredCharSequence) real).charAt(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.text.AlteredCharSequence) real).getChars(arg0, arg1, arg2, arg3);
    }

    public int length() {
        return ((android.text.AlteredCharSequence) real).length();
    }

    public static com.micklab.dcg.wrapper.android.text.AlteredCharSequence make(java.lang.CharSequence arg0, char[] arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.AlteredCharSequence.wrap(android.text.AlteredCharSequence.make(arg0, arg1, arg2, arg3));
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.text.AlteredCharSequence) real).subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.text.AlteredCharSequence) real).toString();
    }

}
