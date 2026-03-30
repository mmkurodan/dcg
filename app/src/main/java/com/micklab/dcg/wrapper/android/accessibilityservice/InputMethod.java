// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class InputMethod {
    private final android.accessibilityservice.InputMethod real;

    public InputMethod(android.accessibilityservice.InputMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod wrap(android.accessibilityservice.InputMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod(real);
    }

    public android.accessibilityservice.InputMethod unwrap() {
        return real;
    }

    public InputMethod(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService arg0) {
        this(new android.accessibilityservice.InputMethod(arg0 == null ? null : arg0.unwrap()));
    }

    public android.accessibilityservice.InputMethod.AccessibilityInputConnection getCurrentInputConnection() {
        return real.getCurrentInputConnection();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo.wrap(real.getCurrentInputEditorInfo());
    }

    public boolean getCurrentInputStarted() {
        return real.getCurrentInputStarted();
    }

    public void onFinishInput() {
        real.onFinishInput();
    }

    public void onStartInput(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        real.onStartInput(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onUpdateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.onUpdateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

}
