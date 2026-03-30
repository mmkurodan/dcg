// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextWatcher {
    private final android.text.TextWatcher real;

    public TextWatcher(android.text.TextWatcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextWatcher wrap(android.text.TextWatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextWatcher(real);
    }

    public android.text.TextWatcher unwrap() {
        return real;
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        real.afterTextChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.onTextChanged(arg0, arg1, arg2, arg3);
    }

}
