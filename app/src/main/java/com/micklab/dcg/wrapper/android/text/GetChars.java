// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class GetChars {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetChars(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.GetChars wrap(android.text.GetChars real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.GetChars(real, (__DcgwBridgeToken) null);
    }

    public android.text.GetChars getReal() {
        return (android.text.GetChars) real;
    }

    public android.text.GetChars unwrap() {
        return getReal();
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.text.GetChars) real).getChars(arg0, arg1, arg2, arg3);
    }

}
