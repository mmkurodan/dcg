// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodSession {
    private final android.view.inputmethod.InputMethodSession real;

    public InputMethodSession(android.view.inputmethod.InputMethodSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession wrap(android.view.inputmethod.InputMethodSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession(real);
    }

    public android.view.inputmethod.InputMethodSession unwrap() {
        return real;
    }

    public void appPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.appPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void dispatchGenericMotionEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        real.dispatchGenericMotionEvent(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void dispatchKeyEvent(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        real.dispatchKeyEvent(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void dispatchTrackballEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
        real.dispatchTrackballEvent(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void displayCompletions(android.view.inputmethod.CompletionInfo[] arg0) {
        real.displayCompletions(arg0);
    }

    public void finishInput() {
        real.finishInput();
    }

    public void toggleSoftInput(int arg0, int arg1) {
        real.toggleSoftInput(arg0, arg1);
    }

    public void updateCursor(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.updateCursor(arg0 == null ? null : arg0.unwrap());
    }

    public void updateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg0) {
        real.updateCursorAnchorInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void updateExtractedText(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        real.updateExtractedText(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void updateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.updateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void viewClicked(boolean arg0) {
        real.viewClicked(arg0);
    }

    public static final class EventCallback {
        private final android.view.inputmethod.InputMethodSession.EventCallback real;

        public EventCallback(android.view.inputmethod.InputMethodSession.EventCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback wrap(android.view.inputmethod.InputMethodSession.EventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback(real);
        }

        public android.view.inputmethod.InputMethodSession.EventCallback unwrap() {
            return real;
        }

        public void finishedEvent(int arg0, boolean arg1) {
            real.finishedEvent(arg0, arg1);
        }

    }
}
