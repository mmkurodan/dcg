// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethodSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession wrap(android.view.inputmethod.InputMethodSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputMethodSession getReal() {
        return (android.view.inputmethod.InputMethodSession) real;
    }

    public android.view.inputmethod.InputMethodSession unwrap() {
        return getReal();
    }

    public void appPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.view.inputmethod.InputMethodSession) real).appPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void dispatchGenericMotionEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        ((android.view.inputmethod.InputMethodSession) real).dispatchGenericMotionEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void dispatchKeyEvent(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        ((android.view.inputmethod.InputMethodSession) real).dispatchKeyEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void dispatchTrackballEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        ((android.view.inputmethod.InputMethodSession) real).dispatchTrackballEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void displayCompletions(android.view.inputmethod.CompletionInfo[] arg0) {
        ((android.view.inputmethod.InputMethodSession) real).displayCompletions(arg0);
    }

    public void finishInput() {
        ((android.view.inputmethod.InputMethodSession) real).finishInput();
    }

    public void toggleSoftInput(int arg0, int arg1) {
        ((android.view.inputmethod.InputMethodSession) real).toggleSoftInput(arg0, arg1);
    }

    public void updateCursor(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.inputmethod.InputMethodSession) real).updateCursor(arg0 == null ? null : arg0.getReal());
    }

    public void updateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg0) {
        ((android.view.inputmethod.InputMethodSession) real).updateCursorAnchorInfo(arg0 == null ? null : arg0.getReal());
    }

    public void updateExtractedText(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        ((android.view.inputmethod.InputMethodSession) real).updateExtractedText(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void updateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.view.inputmethod.InputMethodSession) real).updateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void viewClicked(boolean arg0) {
        ((android.view.inputmethod.InputMethodSession) real).viewClicked(arg0);
    }

    public static final class EventCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EventCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback wrap(android.view.inputmethod.InputMethodSession.EventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InputMethodSession.EventCallback getReal() {
            return (android.view.inputmethod.InputMethodSession.EventCallback) real;
        }

        public android.view.inputmethod.InputMethodSession.EventCallback unwrap() {
            return getReal();
        }

        public void finishedEvent(int arg0, boolean arg1) {
            ((android.view.inputmethod.InputMethodSession.EventCallback) real).finishedEvent(arg0, arg1);
        }

    }
}
