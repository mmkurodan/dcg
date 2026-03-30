// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextWatcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextWatcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextWatcher wrap(android.text.TextWatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextWatcher(real, (__DcgwBridgeToken) null);
    }

    public android.text.TextWatcher getReal() {
        return (android.text.TextWatcher) real;
    }

    public android.text.TextWatcher unwrap() {
        return getReal();
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        ((android.text.TextWatcher) real).afterTextChanged(arg0 == null ? null : arg0.getReal());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.text.TextWatcher) real).beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.text.TextWatcher) real).onTextChanged(arg0, arg1, arg2, arg3);
    }

}
