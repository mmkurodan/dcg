// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class PasswordTransformationMethod {
    private final android.text.method.PasswordTransformationMethod real;

    public PasswordTransformationMethod(android.text.method.PasswordTransformationMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod wrap(android.text.method.PasswordTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod(real);
    }

    public android.text.method.PasswordTransformationMethod unwrap() {
        return real;
    }

    public PasswordTransformationMethod() {
        this(new android.text.method.PasswordTransformationMethod());
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        real.afterTextChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public static com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod.wrap(android.text.method.PasswordTransformationMethod.getInstance());
    }

    public java.lang.CharSequence getTransformation(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return real.getTransformation(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.CharSequence arg1, boolean arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        real.onFocusChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        real.onTextChanged(arg0, arg1, arg2, arg3);
    }

}
