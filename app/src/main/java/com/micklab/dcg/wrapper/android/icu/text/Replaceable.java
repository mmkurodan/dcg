// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Replaceable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Replaceable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Replaceable wrap(android.icu.text.Replaceable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Replaceable(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Replaceable getReal() {
        return (android.icu.text.Replaceable) real;
    }

    public android.icu.text.Replaceable unwrap() {
        return getReal();
    }

    public int char32At(int arg0) {
        return ((android.icu.text.Replaceable) real).char32At(arg0);
    }

    public char charAt(int arg0) {
        return ((android.icu.text.Replaceable) real).charAt(arg0);
    }

    public void copy(int arg0, int arg1, int arg2) {
        ((android.icu.text.Replaceable) real).copy(arg0, arg1, arg2);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.icu.text.Replaceable) real).getChars(arg0, arg1, arg2, arg3);
    }

    public boolean hasMetaData() {
        return ((android.icu.text.Replaceable) real).hasMetaData();
    }

    public int length() {
        return ((android.icu.text.Replaceable) real).length();
    }

    public void replace(int arg0, int arg1, java.lang.String arg2) {
        ((android.icu.text.Replaceable) real).replace(arg0, arg1, arg2);
    }

    public void replace(int arg0, int arg1, char[] arg2, int arg3, int arg4) {
        ((android.icu.text.Replaceable) real).replace(arg0, arg1, arg2, arg3, arg4);
    }

}
