// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethodManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodManager wrap(android.view.inputmethod.InputMethodManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputMethodManager getReal() {
        return (android.view.inputmethod.InputMethodManager) real;
    }

    public android.view.inputmethod.InputMethodManager unwrap() {
        return getReal();
    }

    public boolean acceptStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).acceptStylusHandwritingDelegation(arg0 == null ? null : arg0.getReal());
    }

    public boolean acceptStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        return ((android.view.inputmethod.InputMethodManager) real).acceptStylusHandwritingDelegation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void dispatchKeyEventFromInputMethod(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        ((android.view.inputmethod.InputMethodManager) real).dispatchKeyEventFromInputMethod(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void displayCompletions(com.micklab.dcg.wrapper.android.view.View arg0, android.view.inputmethod.CompletionInfo[] arg1) {
        ((android.view.inputmethod.InputMethodManager) real).displayCompletions(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo.wrap(((android.view.inputmethod.InputMethodManager) real).getCurrentInputMethodInfo());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(((android.view.inputmethod.InputMethodManager) real).getCurrentInputMethodSubtype());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(((android.view.inputmethod.InputMethodManager) real).getLastInputMethodSubtype());
    }

    public void hideSoftInputFromInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        ((android.view.inputmethod.InputMethodManager) real).hideSoftInputFromInputMethod(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean hideSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        return ((android.view.inputmethod.InputMethodManager) real).hideSoftInputFromWindow(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean hideSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        return ((android.view.inputmethod.InputMethodManager) real).hideSoftInputFromWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void hideStatusIcon(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        ((android.view.inputmethod.InputMethodManager) real).hideStatusIcon(arg0 == null ? null : arg0.getReal());
    }

    public void invalidateInput(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.inputmethod.InputMethodManager) real).invalidateInput(arg0 == null ? null : arg0.getReal());
    }

    public boolean isAcceptingText() {
        return ((android.view.inputmethod.InputMethodManager) real).isAcceptingText();
    }

    public boolean isActive() {
        return ((android.view.inputmethod.InputMethodManager) real).isActive();
    }

    public boolean isActive(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).isActive(arg0 == null ? null : arg0.getReal());
    }

    public boolean isConnectionlessStylusHandwritingAvailable() {
        return ((android.view.inputmethod.InputMethodManager) real).isConnectionlessStylusHandwritingAvailable();
    }

    public boolean isFullscreenMode() {
        return ((android.view.inputmethod.InputMethodManager) real).isFullscreenMode();
    }

    public boolean isInputMethodSuppressingSpellChecker() {
        return ((android.view.inputmethod.InputMethodManager) real).isInputMethodSuppressingSpellChecker();
    }

    public boolean isStylusHandwritingAvailable() {
        return ((android.view.inputmethod.InputMethodManager) real).isStylusHandwritingAvailable();
    }

    public boolean isWatchingCursor(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).isWatchingCursor(arg0 == null ? null : arg0.getReal());
    }

    public void prepareStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.inputmethod.InputMethodManager) real).prepareStylusHandwritingDelegation(arg0 == null ? null : arg0.getReal());
    }

    public void prepareStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        ((android.view.inputmethod.InputMethodManager) real).prepareStylusHandwritingDelegation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void restartInput(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.inputmethod.InputMethodManager) real).restartInput(arg0 == null ? null : arg0.getReal());
    }

    public void sendAppPrivateCommand(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.view.inputmethod.InputMethodManager) real).sendAppPrivateCommand(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setAdditionalInputMethodSubtypes(java.lang.String arg0, android.view.inputmethod.InputMethodSubtype[] arg1) {
        ((android.view.inputmethod.InputMethodManager) real).setAdditionalInputMethodSubtypes(arg0, arg1);
    }

    public boolean setCurrentInputMethodSubtype(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).setCurrentInputMethodSubtype(arg0 == null ? null : arg0.getReal());
    }

    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String arg0, int[] arg1) {
        ((android.view.inputmethod.InputMethodManager) real).setExplicitlyEnabledInputMethodSubtypes(arg0, arg1);
    }

    public void setInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1) {
        ((android.view.inputmethod.InputMethodManager) real).setInputMethod(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setInputMethodAndSubtype(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg2) {
        ((android.view.inputmethod.InputMethodManager) real).setInputMethodAndSubtype(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean shouldOfferSwitchingToNextInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).shouldOfferSwitchingToNextInputMethod(arg0 == null ? null : arg0.getReal());
    }

    public void showInputMethodAndSubtypeEnabler(java.lang.String arg0) {
        ((android.view.inputmethod.InputMethodManager) real).showInputMethodAndSubtypeEnabler(arg0);
    }

    public void showInputMethodPicker() {
        ((android.view.inputmethod.InputMethodManager) real).showInputMethodPicker();
    }

    public boolean showSoftInput(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.view.inputmethod.InputMethodManager) real).showSoftInput(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean showSoftInput(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        return ((android.view.inputmethod.InputMethodManager) real).showSoftInput(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void showSoftInputFromInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        ((android.view.inputmethod.InputMethodManager) real).showSoftInputFromInputMethod(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void showStatusIcon(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1, int arg2) {
        ((android.view.inputmethod.InputMethodManager) real).showStatusIcon(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void startConnectionlessStylusHandwriting(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg3) {
        ((android.view.inputmethod.InputMethodManager) real).startConnectionlessStylusHandwriting(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void startConnectionlessStylusHandwritingForDelegation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg3) {
        ((android.view.inputmethod.InputMethodManager) real).startConnectionlessStylusHandwritingForDelegation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void startConnectionlessStylusHandwritingForDelegation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg4) {
        ((android.view.inputmethod.InputMethodManager) real).startConnectionlessStylusHandwritingForDelegation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void startStylusHandwriting(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.inputmethod.InputMethodManager) real).startStylusHandwriting(arg0 == null ? null : arg0.getReal());
    }

    public boolean switchToLastInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        return ((android.view.inputmethod.InputMethodManager) real).switchToLastInputMethod(arg0 == null ? null : arg0.getReal());
    }

    public boolean switchToNextInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, boolean arg1) {
        return ((android.view.inputmethod.InputMethodManager) real).switchToNextInputMethod(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void toggleSoftInput(int arg0, int arg1) {
        ((android.view.inputmethod.InputMethodManager) real).toggleSoftInput(arg0, arg1);
    }

    public void toggleSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1, int arg2) {
        ((android.view.inputmethod.InputMethodManager) real).toggleSoftInputFromWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void updateCursor(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.view.inputmethod.InputMethodManager) real).updateCursor(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void updateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1) {
        ((android.view.inputmethod.InputMethodManager) real).updateCursorAnchorInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void updateExtractedText(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg2) {
        ((android.view.inputmethod.InputMethodManager) real).updateExtractedText(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void updateSelection(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.view.inputmethod.InputMethodManager) real).updateSelection(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void viewClicked(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.inputmethod.InputMethodManager) real).viewClicked(arg0 == null ? null : arg0.getReal());
    }

    public static final int HANDWRITING_DELEGATE_FLAG_HOME_DELEGATOR_ALLOWED = android.view.inputmethod.InputMethodManager.HANDWRITING_DELEGATE_FLAG_HOME_DELEGATOR_ALLOWED;
    public static final int HIDE_IMPLICIT_ONLY = android.view.inputmethod.InputMethodManager.HIDE_IMPLICIT_ONLY;
    public static final int HIDE_NOT_ALWAYS = android.view.inputmethod.InputMethodManager.HIDE_NOT_ALWAYS;
    public static final int RESULT_HIDDEN = android.view.inputmethod.InputMethodManager.RESULT_HIDDEN;
    public static final int RESULT_SHOWN = android.view.inputmethod.InputMethodManager.RESULT_SHOWN;
    public static final int RESULT_UNCHANGED_HIDDEN = android.view.inputmethod.InputMethodManager.RESULT_UNCHANGED_HIDDEN;
    public static final int RESULT_UNCHANGED_SHOWN = android.view.inputmethod.InputMethodManager.RESULT_UNCHANGED_SHOWN;
    public static final int SHOW_FORCED = android.view.inputmethod.InputMethodManager.SHOW_FORCED;
    public static final int SHOW_IMPLICIT = android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT;

}
