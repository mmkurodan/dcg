// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class GetChars {
    private final android.text.GetChars real;

    public GetChars(android.text.GetChars real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.GetChars wrap(android.text.GetChars real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.GetChars(real);
    }

    public android.text.GetChars unwrap() {
        return real;
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        real.getChars(arg0, arg1, arg2, arg3);
    }

}
