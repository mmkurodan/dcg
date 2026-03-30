// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class PasswordTransformationMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PasswordTransformationMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod wrap(android.text.method.PasswordTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.PasswordTransformationMethod getReal() {
        return (android.text.method.PasswordTransformationMethod) real;
    }

    public android.text.method.PasswordTransformationMethod unwrap() {
        return getReal();
    }

    public PasswordTransformationMethod() {
        this(new android.text.method.PasswordTransformationMethod(), (__DcgwBridgeToken) null);
    }

    public void afterTextChanged(com.micklab.dcg.wrapper.android.text.Editable arg0) {
        ((android.text.method.PasswordTransformationMethod) real).afterTextChanged(arg0 == null ? null : arg0.getReal());
    }

    public void beforeTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.text.method.PasswordTransformationMethod) real).beforeTextChanged(arg0, arg1, arg2, arg3);
    }

    public static com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.PasswordTransformationMethod.wrap(android.text.method.PasswordTransformationMethod.getInstance());
    }

    public java.lang.CharSequence getTransformation(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return ((android.text.method.PasswordTransformationMethod) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.CharSequence arg1, boolean arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        ((android.text.method.PasswordTransformationMethod) real).onFocusChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        ((android.text.method.PasswordTransformationMethod) real).onTextChanged(arg0, arg1, arg2, arg3);
    }

}
