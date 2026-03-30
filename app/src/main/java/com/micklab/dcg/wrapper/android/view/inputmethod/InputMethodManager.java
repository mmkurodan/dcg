// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodManager {
    private final android.view.inputmethod.InputMethodManager real;

    public InputMethodManager(android.view.inputmethod.InputMethodManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodManager wrap(android.view.inputmethod.InputMethodManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodManager(real);
    }

    public android.view.inputmethod.InputMethodManager unwrap() {
        return real;
    }

    public boolean acceptStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.acceptStylusHandwritingDelegation(arg0 == null ? null : arg0.unwrap());
    }

    public boolean acceptStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        return real.acceptStylusHandwritingDelegation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void dispatchKeyEventFromInputMethod(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        real.dispatchKeyEventFromInputMethod(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void displayCompletions(com.micklab.dcg.wrapper.android.view.View arg0, android.view.inputmethod.CompletionInfo[] arg1) {
        real.displayCompletions(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo.wrap(real.getCurrentInputMethodInfo());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(real.getCurrentInputMethodSubtype());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(real.getLastInputMethodSubtype());
    }

    public void hideSoftInputFromInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        real.hideSoftInputFromInputMethod(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean hideSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        return real.hideSoftInputFromWindow(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean hideSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        return real.hideSoftInputFromWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void hideStatusIcon(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        real.hideStatusIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidateInput(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.invalidateInput(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAcceptingText() {
        return real.isAcceptingText();
    }

    public boolean isActive() {
        return real.isActive();
    }

    public boolean isActive(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.isActive(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isConnectionlessStylusHandwritingAvailable() {
        return real.isConnectionlessStylusHandwritingAvailable();
    }

    public boolean isFullscreenMode() {
        return real.isFullscreenMode();
    }

    public boolean isInputMethodSuppressingSpellChecker() {
        return real.isInputMethodSuppressingSpellChecker();
    }

    public boolean isStylusHandwritingAvailable() {
        return real.isStylusHandwritingAvailable();
    }

    public boolean isWatchingCursor(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.isWatchingCursor(arg0 == null ? null : arg0.unwrap());
    }

    public void prepareStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.prepareStylusHandwritingDelegation(arg0 == null ? null : arg0.unwrap());
    }

    public void prepareStylusHandwritingDelegation(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        real.prepareStylusHandwritingDelegation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void restartInput(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.restartInput(arg0 == null ? null : arg0.unwrap());
    }

    public void sendAppPrivateCommand(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.sendAppPrivateCommand(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setAdditionalInputMethodSubtypes(java.lang.String arg0, android.view.inputmethod.InputMethodSubtype[] arg1) {
        real.setAdditionalInputMethodSubtypes(arg0, arg1);
    }

    public boolean setCurrentInputMethodSubtype(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg0) {
        return real.setCurrentInputMethodSubtype(arg0 == null ? null : arg0.unwrap());
    }

    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String arg0, int[] arg1) {
        real.setExplicitlyEnabledInputMethodSubtypes(arg0, arg1);
    }

    public void setInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1) {
        real.setInputMethod(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setInputMethodAndSubtype(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg2) {
        real.setInputMethodAndSubtype(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean shouldOfferSwitchingToNextInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        return real.shouldOfferSwitchingToNextInputMethod(arg0 == null ? null : arg0.unwrap());
    }

    public void showInputMethodAndSubtypeEnabler(java.lang.String arg0) {
        real.showInputMethodAndSubtypeEnabler(arg0);
    }

    public void showInputMethodPicker() {
        real.showInputMethodPicker();
    }

    public boolean showSoftInput(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.showSoftInput(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean showSoftInput(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        return real.showSoftInput(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void showSoftInputFromInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
        real.showSoftInputFromInputMethod(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void showStatusIcon(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1, int arg2) {
        real.showStatusIcon(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void startConnectionlessStylusHandwriting(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg3) {
        real.startConnectionlessStylusHandwriting(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void startConnectionlessStylusHandwritingForDelegation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg3) {
        real.startConnectionlessStylusHandwritingForDelegation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void startConnectionlessStylusHandwritingForDelegation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback arg4) {
        real.startConnectionlessStylusHandwritingForDelegation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void startStylusHandwriting(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.startStylusHandwriting(arg0 == null ? null : arg0.unwrap());
    }

    public boolean switchToLastInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        return real.switchToLastInputMethod(arg0 == null ? null : arg0.unwrap());
    }

    public boolean switchToNextInputMethod(com.micklab.dcg.wrapper.android.os.IBinder arg0, boolean arg1) {
        return real.switchToNextInputMethod(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void toggleSoftInput(int arg0, int arg1) {
        real.toggleSoftInput(arg0, arg1);
    }

    public void toggleSoftInputFromWindow(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1, int arg2) {
        real.toggleSoftInputFromWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void updateCursor(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.updateCursor(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void updateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1) {
        real.updateCursorAnchorInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void updateExtractedText(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg2) {
        real.updateExtractedText(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void updateSelection(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.updateSelection(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void viewClicked(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.viewClicked(arg0 == null ? null : arg0.unwrap());
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
