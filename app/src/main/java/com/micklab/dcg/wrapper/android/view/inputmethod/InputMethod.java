// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethod {
    private final android.view.inputmethod.InputMethod real;

    public InputMethod(android.view.inputmethod.InputMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod wrap(android.view.inputmethod.InputMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod(real);
    }

    public android.view.inputmethod.InputMethod unwrap() {
        return real;
    }

    public void attachToken(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        real.attachToken(arg0 == null ? null : arg0.unwrap());
    }

    public void bindInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding arg0) {
        real.bindInput(arg0 == null ? null : arg0.unwrap());
    }

    public void changeInputMethodSubtype(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg0) {
        real.changeInputMethodSubtype(arg0 == null ? null : arg0.unwrap());
    }

    public void createSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback arg0) {
        real.createSession(arg0 == null ? null : arg0.unwrap());
    }

    public void hideSoftInput(int arg0, com.micklab.dcg.wrapper.android.os.ResultReceiver arg1) {
        real.hideSoftInput(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void restartInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg1) {
        real.restartInput(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void revokeSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0) {
        real.revokeSession(arg0 == null ? null : arg0.unwrap());
    }

    public void setSessionEnabled(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0, boolean arg1) {
        real.setSessionEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void showSoftInput(int arg0, com.micklab.dcg.wrapper.android.os.ResultReceiver arg1) {
        real.showSoftInput(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void startInput(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg1) {
        real.startInput(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unbindInput() {
        real.unbindInput();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.view.inputmethod.InputMethod.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.view.inputmethod.InputMethod.SERVICE_META_DATA;
    public static final int SHOW_EXPLICIT = android.view.inputmethod.InputMethod.SHOW_EXPLICIT;
    public static final int SHOW_FORCED = android.view.inputmethod.InputMethod.SHOW_FORCED;

    public static final class SessionCallback {
        private final android.view.inputmethod.InputMethod.SessionCallback real;

        public SessionCallback(android.view.inputmethod.InputMethod.SessionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback wrap(android.view.inputmethod.InputMethod.SessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback(real);
        }

        public android.view.inputmethod.InputMethod.SessionCallback unwrap() {
            return real;
        }

        public void sessionCreated(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0) {
            real.sessionCreated(arg0 == null ? null : arg0.unwrap());
        }

    }
}
