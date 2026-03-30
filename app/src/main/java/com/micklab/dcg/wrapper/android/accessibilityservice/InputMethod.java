// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class InputMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod wrap(android.accessibilityservice.InputMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.InputMethod getReal() {
        return (android.accessibilityservice.InputMethod) real;
    }

    public android.accessibilityservice.InputMethod unwrap() {
        return getReal();
    }

    public InputMethod(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService arg0) {
        this(new android.accessibilityservice.InputMethod(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.InputMethod.AccessibilityInputConnection getCurrentInputConnection() {
        return ((android.accessibilityservice.InputMethod) real).getCurrentInputConnection();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo.wrap(((android.accessibilityservice.InputMethod) real).getCurrentInputEditorInfo());
    }

    public boolean getCurrentInputStarted() {
        return ((android.accessibilityservice.InputMethod) real).getCurrentInputStarted();
    }

    public void onFinishInput() {
        ((android.accessibilityservice.InputMethod) real).onFinishInput();
    }

    public void onStartInput(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        ((android.accessibilityservice.InputMethod) real).onStartInput(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onUpdateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.accessibilityservice.InputMethod) real).onUpdateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

}
