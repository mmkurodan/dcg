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

    public com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.AccessibilityInputConnection getCurrentInputConnection() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.AccessibilityInputConnection.wrap(((android.accessibilityservice.InputMethod) real).getCurrentInputConnection());
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

    public static final class AccessibilityInputConnection {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityInputConnection(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.AccessibilityInputConnection wrap(android.accessibilityservice.InputMethod.AccessibilityInputConnection real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.AccessibilityInputConnection(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.InputMethod.AccessibilityInputConnection getReal() {
            return (android.accessibilityservice.InputMethod.AccessibilityInputConnection) real;
        }

        public android.accessibilityservice.InputMethod.AccessibilityInputConnection unwrap() {
            return getReal();
        }

        public void clearMetaKeyStates(int arg0) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).clearMetaKeyStates(arg0);
        }

        public void commitText(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).commitText(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void deleteSurroundingText(int arg0, int arg1) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).deleteSurroundingText(arg0, arg1);
        }

        public int getCursorCapsMode(int arg0) {
            return ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).getCursorCapsMode(arg0);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText(int arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).getSurroundingText(arg0, arg1, arg2));
        }

        public void performContextMenuAction(int arg0) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).performContextMenuAction(arg0);
        }

        public void performEditorAction(int arg0) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).performEditorAction(arg0);
        }

        public void sendKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).sendKeyEvent(arg0 == null ? null : arg0.getReal());
        }

        public void setSelection(int arg0, int arg1) {
            ((android.accessibilityservice.InputMethod.AccessibilityInputConnection) real).setSelection(arg0, arg1);
        }


    }
}
