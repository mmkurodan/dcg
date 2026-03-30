// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod wrap(android.view.inputmethod.InputMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputMethod getReal() {
        return (android.view.inputmethod.InputMethod) real;
    }

    public android.view.inputmethod.InputMethod unwrap() {
        return getReal();
    }

    public void attachToken(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        ((android.view.inputmethod.InputMethod) real).attachToken(arg0 == null ? null : arg0.getReal());
    }

    public void bindInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding arg0) {
        ((android.view.inputmethod.InputMethod) real).bindInput(arg0 == null ? null : arg0.getReal());
    }

    public void changeInputMethodSubtype(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg0) {
        ((android.view.inputmethod.InputMethod) real).changeInputMethodSubtype(arg0 == null ? null : arg0.getReal());
    }

    public void createSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback arg0) {
        ((android.view.inputmethod.InputMethod) real).createSession(arg0 == null ? null : arg0.getReal());
    }

    public void hideSoftInput(int arg0, com.micklab.dcg.wrapper.android.os.ResultReceiver arg1) {
        ((android.view.inputmethod.InputMethod) real).hideSoftInput(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void restartInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg1) {
        ((android.view.inputmethod.InputMethod) real).restartInput(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void revokeSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0) {
        ((android.view.inputmethod.InputMethod) real).revokeSession(arg0 == null ? null : arg0.getReal());
    }

    public void setSessionEnabled(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0, boolean arg1) {
        ((android.view.inputmethod.InputMethod) real).setSessionEnabled(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void showSoftInput(int arg0, com.micklab.dcg.wrapper.android.os.ResultReceiver arg1) {
        ((android.view.inputmethod.InputMethod) real).showSoftInput(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void startInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg1) {
        ((android.view.inputmethod.InputMethod) real).startInput(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void unbindInput() {
        ((android.view.inputmethod.InputMethod) real).unbindInput();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.view.inputmethod.InputMethod.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.view.inputmethod.InputMethod.SERVICE_META_DATA;
    public static final int SHOW_EXPLICIT = android.view.inputmethod.InputMethod.SHOW_EXPLICIT;
    public static final int SHOW_FORCED = android.view.inputmethod.InputMethod.SHOW_FORCED;

    public static final class SessionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback wrap(android.view.inputmethod.InputMethod.SessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InputMethod.SessionCallback getReal() {
            return (android.view.inputmethod.InputMethod.SessionCallback) real;
        }

        public android.view.inputmethod.InputMethod.SessionCallback unwrap() {
            return getReal();
        }

        public void sessionCreated(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0) {
            ((android.view.inputmethod.InputMethod.SessionCallback) real).sessionCreated(arg0 == null ? null : arg0.getReal());
        }

    }
}
