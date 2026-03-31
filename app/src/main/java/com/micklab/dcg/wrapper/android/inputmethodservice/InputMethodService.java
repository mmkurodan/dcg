// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class InputMethodService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethodService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService wrap(android.inputmethodservice.InputMethodService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService(real, (__DcgwBridgeToken) null);
    }

    public android.inputmethodservice.InputMethodService getReal() {
        return (android.inputmethodservice.InputMethodService) real;
    }

    public android.inputmethodservice.InputMethodService unwrap() {
        return getReal();
    }

    public InputMethodService() {
        this(new android.inputmethodservice.InputMethodService(), (__DcgwBridgeToken) null);
    }

    public boolean enableHardwareAcceleration() {
        return ((android.inputmethodservice.InputMethodService) real).enableHardwareAcceleration();
    }

    public void finishConnectionlessStylusHandwriting(java.lang.CharSequence arg0) {
        ((android.inputmethodservice.InputMethodService) real).finishConnectionlessStylusHandwriting(arg0);
    }

    public void finishStylusHandwriting() {
        ((android.inputmethodservice.InputMethodService) real).finishStylusHandwriting();
    }

    public int getBackDisposition() {
        return ((android.inputmethodservice.InputMethodService) real).getBackDisposition();
    }

    public int getCandidatesHiddenVisibility() {
        return ((android.inputmethodservice.InputMethodService) real).getCandidatesHiddenVisibility();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding getCurrentInputBinding() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding.wrap(((android.inputmethodservice.InputMethodService) real).getCurrentInputBinding());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection getCurrentInputConnection() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.inputmethodservice.InputMethodService) real).getCurrentInputConnection());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo.wrap(((android.inputmethodservice.InputMethodService) real).getCurrentInputEditorInfo());
    }

    public boolean getCurrentInputStarted() {
        return ((android.inputmethodservice.InputMethodService) real).getCurrentInputStarted();
    }

    public int getInputMethodWindowRecommendedHeight() {
        return ((android.inputmethodservice.InputMethodService) real).getInputMethodWindowRecommendedHeight();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.inputmethodservice.InputMethodService) real).getLayoutInflater());
    }

    public int getMaxWidth() {
        return ((android.inputmethodservice.InputMethodService) real).getMaxWidth();
    }

    public static java.time.Duration getStylusHandwritingIdleTimeoutMax() {
        return android.inputmethodservice.InputMethodService.getStylusHandwritingIdleTimeoutMax();
    }

    public java.time.Duration getStylusHandwritingSessionTimeout() {
        return ((android.inputmethodservice.InputMethodService) real).getStylusHandwritingSessionTimeout();
    }

    public com.micklab.dcg.wrapper.android.view.Window getStylusHandwritingWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.inputmethodservice.InputMethodService) real).getStylusHandwritingWindow());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.inputmethodservice.InputMethodService) real).getSystemService(arg0);
    }

    public java.lang.CharSequence getTextForImeAction(int arg0) {
        return ((android.inputmethodservice.InputMethodService) real).getTextForImeAction(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getWindow() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.inputmethodservice.InputMethodService) real).getWindow());
    }

    public void hideStatusIcon() {
        ((android.inputmethodservice.InputMethodService) real).hideStatusIcon();
    }

    public void hideWindow() {
        ((android.inputmethodservice.InputMethodService) real).hideWindow();
    }

    public boolean isExtractViewShown() {
        return ((android.inputmethodservice.InputMethodService) real).isExtractViewShown();
    }

    public boolean isFullscreenMode() {
        return ((android.inputmethodservice.InputMethodService) real).isFullscreenMode();
    }

    public boolean isInputViewShown() {
        return ((android.inputmethodservice.InputMethodService) real).isInputViewShown();
    }

    public boolean isShowInputRequested() {
        return ((android.inputmethodservice.InputMethodService) real).isShowInputRequested();
    }

    public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.inputmethodservice.InputMethodService) real).onAppPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onBindInput() {
        ((android.inputmethodservice.InputMethodService) real).onBindInput();
    }

    public void onComputeInsets(com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets arg0) {
        ((android.inputmethodservice.InputMethodService) real).onComputeInsets(arg0 == null ? null : arg0.getReal());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.inputmethodservice.InputMethodService) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onConfigureWindow(com.micklab.dcg.wrapper.android.view.Window arg0, boolean arg1, boolean arg2) {
        ((android.inputmethodservice.InputMethodService) real).onConfigureWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onCreate() {
        ((android.inputmethodservice.InputMethodService) real).onCreate();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateCandidatesView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.inputmethodservice.InputMethodService) real).onCreateCandidatesView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateExtractTextView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.inputmethodservice.InputMethodService) real).onCreateExtractTextView());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest onCreateInlineSuggestionsRequest(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(((android.inputmethodservice.InputMethodService) real).onCreateInlineSuggestionsRequest(arg0 == null ? null : arg0.getReal()));
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return ((android.inputmethodservice.InputMethodService) real).onCreateInputMethodInterface();
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        return ((android.inputmethodservice.InputMethodService) real).onCreateInputMethodSessionInterface();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateInputView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.inputmethodservice.InputMethodService) real).onCreateInputView());
    }

    public void onCustomImeSwitcherButtonRequestedVisible(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).onCustomImeSwitcherButtonRequestedVisible(arg0);
    }

    public void onDestroy() {
        ((android.inputmethodservice.InputMethodService) real).onDestroy();
    }

    public void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] arg0) {
        ((android.inputmethodservice.InputMethodService) real).onDisplayCompletions(arg0);
    }

    public boolean onEvaluateFullscreenMode() {
        return ((android.inputmethodservice.InputMethodService) real).onEvaluateFullscreenMode();
    }

    public boolean onEvaluateInputViewShown() {
        return ((android.inputmethodservice.InputMethodService) real).onEvaluateInputViewShown();
    }

    public boolean onExtractTextContextMenuItem(int arg0) {
        return ((android.inputmethodservice.InputMethodService) real).onExtractTextContextMenuItem(arg0);
    }

    public void onExtractedCursorMovement(int arg0, int arg1) {
        ((android.inputmethodservice.InputMethodService) real).onExtractedCursorMovement(arg0, arg1);
    }

    public void onExtractedSelectionChanged(int arg0, int arg1) {
        ((android.inputmethodservice.InputMethodService) real).onExtractedSelectionChanged(arg0, arg1);
    }

    public void onExtractedTextClicked() {
        ((android.inputmethodservice.InputMethodService) real).onExtractedTextClicked();
    }

    public void onExtractingInputChanged(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        ((android.inputmethodservice.InputMethodService) real).onExtractingInputChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onFinishCandidatesView(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).onFinishCandidatesView(arg0);
    }

    public void onFinishInput() {
        ((android.inputmethodservice.InputMethodService) real).onFinishInput();
    }

    public void onFinishInputView(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).onFinishInputView(arg0);
    }

    public void onFinishStylusHandwriting() {
        ((android.inputmethodservice.InputMethodService) real).onFinishStylusHandwriting();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.InputMethodService) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onInitializeInterface() {
        ((android.inputmethodservice.InputMethodService) real).onInitializeInterface();
    }

    public boolean onInlineSuggestionsResponse(com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse arg0) {
        return ((android.inputmethodservice.InputMethodService) real).onInlineSuggestionsResponse(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.inputmethodservice.InputMethodService) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.inputmethodservice.InputMethodService) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.inputmethodservice.InputMethodService) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.inputmethodservice.InputMethodService) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPrepareStylusHandwriting() {
        ((android.inputmethodservice.InputMethodService) real).onPrepareStylusHandwriting();
    }

    public boolean onShouldVerifyKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.inputmethodservice.InputMethodService) real).onShouldVerifyKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onShowInputRequested(int arg0, boolean arg1) {
        return ((android.inputmethodservice.InputMethodService) real).onShowInputRequested(arg0, arg1);
    }

    public void onStartCandidatesView(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        ((android.inputmethodservice.InputMethodService) real).onStartCandidatesView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean onStartConnectionlessStylusHandwriting(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg1) {
        return ((android.inputmethodservice.InputMethodService) real).onStartConnectionlessStylusHandwriting(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onStartInput(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        ((android.inputmethodservice.InputMethodService) real).onStartInput(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onStartInputView(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0, boolean arg1) {
        ((android.inputmethodservice.InputMethodService) real).onStartInputView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean onStartStylusHandwriting() {
        return ((android.inputmethodservice.InputMethodService) real).onStartStylusHandwriting();
    }

    public void onStylusHandwritingMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.inputmethodservice.InputMethodService) real).onStylusHandwritingMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.InputMethodService) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onUnbindInput() {
        ((android.inputmethodservice.InputMethodService) real).onUnbindInput();
    }

    public void onUpdateCursor(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateCursor(arg0 == null ? null : arg0.getReal());
    }

    public void onUpdateCursorAnchorInfo(com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo arg0) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateCursorAnchorInfo(arg0 == null ? null : arg0.getReal());
    }

    public void onUpdateEditorToolType(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateEditorToolType(arg0);
    }

    public void onUpdateExtractedText(int arg0, com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg1) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateExtractedText(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onUpdateExtractingViews(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateExtractingViews(arg0 == null ? null : arg0.getReal());
    }

    public void onUpdateExtractingVisibility(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateExtractingVisibility(arg0 == null ? null : arg0.getReal());
    }

    public void onUpdateSelection(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.inputmethodservice.InputMethodService) real).onUpdateSelection(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void onViewClicked(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).onViewClicked(arg0);
    }

    public void onWindowHidden() {
        ((android.inputmethodservice.InputMethodService) real).onWindowHidden();
    }

    public void onWindowShown() {
        ((android.inputmethodservice.InputMethodService) real).onWindowShown();
    }

    public void requestHideSelf(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).requestHideSelf(arg0);
    }

    public void requestShowSelf(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).requestShowSelf(arg0);
    }

    public boolean sendDefaultEditorAction(boolean arg0) {
        return ((android.inputmethodservice.InputMethodService) real).sendDefaultEditorAction(arg0);
    }

    public void sendDownUpKeyEvents(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).sendDownUpKeyEvents(arg0);
    }

    public void sendKeyChar(char arg0) {
        ((android.inputmethodservice.InputMethodService) real).sendKeyChar(arg0);
    }

    public void setBackDisposition(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).setBackDisposition(arg0);
    }

    public void setCandidatesView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.inputmethodservice.InputMethodService) real).setCandidatesView(arg0 == null ? null : arg0.getReal());
    }

    public void setCandidatesViewShown(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).setCandidatesViewShown(arg0);
    }

    public void setExtractView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.inputmethodservice.InputMethodService) real).setExtractView(arg0 == null ? null : arg0.getReal());
    }

    public void setExtractViewShown(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).setExtractViewShown(arg0);
    }

    public void setInputView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.inputmethodservice.InputMethodService) real).setInputView(arg0 == null ? null : arg0.getReal());
    }

    public void setStylusHandwritingRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        ((android.inputmethodservice.InputMethodService) real).setStylusHandwritingRegion(arg0 == null ? null : arg0.getReal());
    }

    public void setStylusHandwritingSessionTimeout(java.time.Duration arg0) {
        ((android.inputmethodservice.InputMethodService) real).setStylusHandwritingSessionTimeout(arg0);
    }

    public void setTheme(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).setTheme(arg0);
    }

    public boolean shouldOfferSwitchingToNextInputMethod() {
        return ((android.inputmethodservice.InputMethodService) real).shouldOfferSwitchingToNextInputMethod();
    }

    public void showStatusIcon(int arg0) {
        ((android.inputmethodservice.InputMethodService) real).showStatusIcon(arg0);
    }

    public void showWindow(boolean arg0) {
        ((android.inputmethodservice.InputMethodService) real).showWindow(arg0);
    }

    public void switchInputMethod(java.lang.String arg0) {
        ((android.inputmethodservice.InputMethodService) real).switchInputMethod(arg0);
    }

    public void switchInputMethod(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype arg1) {
        ((android.inputmethodservice.InputMethodService) real).switchInputMethod(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean switchToNextInputMethod(boolean arg0) {
        return ((android.inputmethodservice.InputMethodService) real).switchToNextInputMethod(arg0);
    }

    public boolean switchToPreviousInputMethod() {
        return ((android.inputmethodservice.InputMethodService) real).switchToPreviousInputMethod();
    }

    public void updateFullscreenMode() {
        ((android.inputmethodservice.InputMethodService) real).updateFullscreenMode();
    }

    public void updateInputViewShown() {
        ((android.inputmethodservice.InputMethodService) real).updateInputViewShown();
    }

    public static final int BACK_DISPOSITION_ADJUST_NOTHING = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_ADJUST_NOTHING;
    public static final int BACK_DISPOSITION_DEFAULT = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_DEFAULT;
    public static final int BACK_DISPOSITION_WILL_DISMISS = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_WILL_DISMISS;
    public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = android.inputmethodservice.InputMethodService.BACK_DISPOSITION_WILL_NOT_DISMISS;

    public static final class Insets {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Insets(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets wrap(android.inputmethodservice.InputMethodService.Insets real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.InputMethodService.Insets(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.InputMethodService.Insets getReal() {
            return (android.inputmethodservice.InputMethodService.Insets) real;
        }

        public android.inputmethodservice.InputMethodService.Insets unwrap() {
            return getReal();
        }

        public Insets() {
            this(new android.inputmethodservice.InputMethodService.Insets(), (__DcgwBridgeToken) null);
        }

        public static final int TOUCHABLE_INSETS_CONTENT = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_CONTENT;
        public static final int TOUCHABLE_INSETS_FRAME = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_FRAME;
        public static final int TOUCHABLE_INSETS_REGION = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_REGION;
        public static final int TOUCHABLE_INSETS_VISIBLE = android.inputmethodservice.InputMethodService.Insets.TOUCHABLE_INSETS_VISIBLE;

    }
}
