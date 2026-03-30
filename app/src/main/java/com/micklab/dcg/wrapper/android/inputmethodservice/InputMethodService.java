// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class InputMethodService {
    private final android.inputmethodservice.InputMethodService real;

    public InputMethodService(android.inputmethodservice.InputMethodService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService wrap(android.inputmethodservice.InputMethodService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService(real);
    }

    public android.inputmethodservice.InputMethodService unwrap() {
        return real;
    }

    public InputMethodService() {
        this(new android.inputmethodservice.InputMethodService());
    }

    public boolean enableHardwareAcceleration() {
        return real.enableHardwareAcceleration();
    }

    public void finishConnectionlessStylusHandwriting(java.lang.CharSequence arg0) {
        real.finishConnectionlessStylusHandwriting(arg0);
    }

    public void finishStylusHandwriting() {
        real.finishStylusHandwriting();
    }

    public int getBackDisposition() {
        return real.getBackDisposition();
    }

    public int getCandidatesHiddenVisibility() {
        return real.getCandidatesHiddenVisibility();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding getCurrentInputBinding() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding.wrap(real.getCurrentInputBinding());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection getCurrentInputConnection() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.getCurrentInputConnection());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo.wrap(real.getCurrentInputEditorInfo());
    }

    public boolean getCurrentInputStarted() {
        return real.getCurrentInputStarted();
    }

    public int getInputMethodWindowRecommendedHeight() {
        return real.getInputMethodWindowRecommendedHeight();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public int getMaxWidth() {
        return real.getMaxWidth();
    }

    public static java.time.Duration getStylusHandwritingIdleTimeoutMax() {
        return android.inputmethodservice.InputMethodService.getStylusHandwritingIdleTimeoutMax();
    }

    public java.time.Duration getStylusHandwritingSessionTimeout() {
        return real.getStylusHandwritingSessionTimeout();
    }

    public com.micklab.dcg.wrapper.android.view.Window getStylusHandwritingWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.getStylusHandwritingWindow());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return real.getSystemService(arg0);
    }

    public java.lang.CharSequence getTextForImeAction(int arg0) {
        return real.getTextForImeAction(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getWindow() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.getWindow());
    }

    public void hideStatusIcon() {
        real.hideStatusIcon();
    }

    public void hideWindow() {
        real.hideWindow();
    }

    public boolean isExtractViewShown() {
        return real.isExtractViewShown();
    }

    public boolean isFullscreenMode() {
        return real.isFullscreenMode();
    }

    public boolean isInputViewShown() {
        return real.isInputViewShown();
    }

    public boolean isShowInputRequested() {
        return real.isShowInputRequested();
    }

    public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onAppPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onBindInput() {
        real.onBindInput();
    }

    public void onComputeInsets(com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets arg0) {
        real.onComputeInsets(arg0 == null ? null : arg0.unwrap());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onConfigureWindow(com.micklab.dcg.wrapper.android.view.Window arg0, boolean arg1, boolean arg2) {
        real.onConfigureWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onCreate() {
        real.onCreate();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateCandidatesView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateCandidatesView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateExtractTextView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateExtractTextView());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest onCreateInlineSuggestionsRequest(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(real.onCreateInlineSuggestionsRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return real.onCreateInputMethodInterface();
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        return real.onCreateInputMethodSessionInterface();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateInputView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateInputView());
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] arg0) {
        real.onDisplayCompletions(arg0);
    }

    public boolean onEvaluateFullscreenMode() {
        return real.onEvaluateFullscreenMode();
    }

    public boolean onEvaluateInputViewShown() {
        return real.onEvaluateInputViewShown();
    }

    public boolean onExtractTextContextMenuItem(int arg0) {
        return real.onExtractTextContextMenuItem(arg0);
    }

    public void onExtractedCursorMovement(int arg0, int arg1) {
        real.onExtractedCursorMovement(arg0, arg1);
    }

    public void onExtractedSelectionChanged(int arg0, int arg1) {
        real.onExtractedSelectionChanged(arg0, arg1);
    }

    public void onExtractedTextClicked() {
        real.onExtractedTextClicked();
    }

    public void onExtractingInputChanged(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        real.onExtractingInputChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onFinishCandidatesView(boolean arg0) {
        real.onFinishCandidatesView(arg0);
    }

    public void onFinishInput() {
        real.onFinishInput();
    }

    public void onFinishInputView(boolean arg0) {
        real.onFinishInputView(arg0);
    }

    public void onFinishStylusHandwriting() {
        real.onFinishStylusHandwriting();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onInitializeInterface() {
        real.onInitializeInterface();
    }

    public boolean onInlineSuggestionsResponse(com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse arg0) {
        return real.onInlineSuggestionsResponse(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyLongPress(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onPrepareStylusHandwriting() {
        real.onPrepareStylusHandwriting();
    }

    public boolean onShowInputRequested(int arg0, boolean arg1) {
        return real.onShowInputRequested(arg0, arg1);
    }

    public void onStartCandidatesView(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        real.onStartCandidatesView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean onStartConnectionlessStylusHandwriting(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1) {
        return real.onStartConnectionlessStylusHandwriting(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onStartInput(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        real.onStartInput(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onStartInputView(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        real.onStartInputView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean onStartStylusHandwriting() {
        return real.onStartStylusHandwriting();
    }

    public void onStylusHandwritingMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.onStylusHandwritingMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onUnbindInput() {
        real.onUnbindInput();
    }

    public void onUpdateCursor(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.onUpdateCursor(arg0 == null ? null : arg0.unwrap());
    }

    public void onUpdateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg0) {
        real.onUpdateCursorAnchorInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void onUpdateEditorToolType(int arg0) {
        real.onUpdateEditorToolType(arg0);
    }

    public void onUpdateExtractedText(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        real.onUpdateExtractedText(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onUpdateExtractingViews(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        real.onUpdateExtractingViews(arg0 == null ? null : arg0.unwrap());
    }

    public void onUpdateExtractingVisibility(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        real.onUpdateExtractingVisibility(arg0 == null ? null : arg0.unwrap());
    }

    public void onUpdateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.onUpdateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void onViewClicked(boolean arg0) {
        real.onViewClicked(arg0);
    }

    public void onWindowHidden() {
        real.onWindowHidden();
    }

    public void onWindowShown() {
        real.onWindowShown();
    }

    public void requestHideSelf(int arg0) {
        real.requestHideSelf(arg0);
    }

    public void requestShowSelf(int arg0) {
        real.requestShowSelf(arg0);
    }

    public boolean sendDefaultEditorAction(boolean arg0) {
        return real.sendDefaultEditorAction(arg0);
    }

    public void sendDownUpKeyEvents(int arg0) {
        real.sendDownUpKeyEvents(arg0);
    }

    public void sendKeyChar(char arg0) {
        real.sendKeyChar(arg0);
    }

    public void setBackDisposition(int arg0) {
        real.setBackDisposition(arg0);
    }

    public void setCandidatesView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setCandidatesView(arg0 == null ? null : arg0.unwrap());
    }

    public void setCandidatesViewShown(boolean arg0) {
        real.setCandidatesViewShown(arg0);
    }

    public void setExtractView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setExtractView(arg0 == null ? null : arg0.unwrap());
    }

    public void setExtractViewShown(boolean arg0) {
        real.setExtractViewShown(arg0);
    }

    public void setInputView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setInputView(arg0 == null ? null : arg0.unwrap());
    }

    public void setStylusHandwritingSessionTimeout(java.time.Duration arg0) {
        real.setStylusHandwritingSessionTimeout(arg0);
    }

    public void setTheme(int arg0) {
        real.setTheme(arg0);
    }

    public boolean shouldOfferSwitchingToNextInputMethod() {
        return real.shouldOfferSwitchingToNextInputMethod();
    }

    public void showStatusIcon(int arg0) {
        real.showStatusIcon(arg0);
    }

    public void showWindow(boolean arg0) {
        real.showWindow(arg0);
    }

    public void switchInputMethod(java.lang.String arg0) {
        real.switchInputMethod(arg0);
    }

    public void switchInputMethod(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg1) {
        real.switchInputMethod(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean switchToNextInputMethod(boolean arg0) {
        return real.switchToNextInputMethod(arg0);
    }

    public boolean switchToPreviousInputMethod() {
        return real.switchToPreviousInputMethod();
    }

    public void updateFullscreenMode() {
        real.updateFullscreenMode();
    }

    public void updateInputViewShown() {
        real.updateInputViewShown();
    }

    public static final int BACK_DISPOSITION_ADJUST_NOTHING = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_ADJUST_NOTHING;
    public static final int BACK_DISPOSITION_DEFAULT = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_DEFAULT;
    public static final int BACK_DISPOSITION_WILL_DISMISS = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_WILL_DISMISS;
    public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_WILL_NOT_DISMISS;

    public static final class Insets {
        private final android.inputmethodservice.InputMethodService.Insets real;

        public Insets(android.inputmethodservice.InputMethodService.Insets real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets wrap(android.inputmethodservice.InputMethodService.Insets real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets(real);
        }

        public android.inputmethodservice.InputMethodService.Insets unwrap() {
            return real;
        }

        public Insets() {
            this(new android.inputmethodservice.InputMethodService.Insets());
        }

        public static final int TOUCHABLE_INSETS_CONTENT = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_CONTENT;
        public static final int TOUCHABLE_INSETS_FRAME = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_FRAME;
        public static final int TOUCHABLE_INSETS_REGION = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_REGION;
        public static final int TOUCHABLE_INSETS_VISIBLE = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_VISIBLE;

    }
}
