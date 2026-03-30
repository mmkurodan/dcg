// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Replaceable {
    private final android.icu.text.Replaceable real;

    public Replaceable(android.icu.text.Replaceable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Replaceable wrap(android.icu.text.Replaceable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Replaceable(real);
    }

    public android.icu.text.Replaceable unwrap() {
        return real;
    }

    public int char32At(int arg0) {
        return real.char32At(arg0);
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public void copy(int arg0, int arg1, int arg2) {
        real.copy(arg0, arg1, arg2);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        real.getChars(arg0, arg1, arg2, arg3);
    }

    public boolean hasMetaData() {
        return real.hasMetaData();
    }

    public int length() {
        return real.length();
    }

    public void replace(int arg0, int arg1, java.lang.String arg2) {
        real.replace(arg0, arg1, arg2);
    }

    public void replace(int arg0, int arg1, char[] arg2, int arg3, int arg4) {
        real.replace(arg0, arg1, arg2, arg3, arg4);
    }

}
