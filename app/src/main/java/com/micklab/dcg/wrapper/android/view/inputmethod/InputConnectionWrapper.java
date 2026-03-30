// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputConnectionWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputConnectionWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputConnectionWrapper wrap(android.view.inputmethod.InputConnectionWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputConnectionWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputConnectionWrapper getReal() {
        return (android.view.inputmethod.InputConnectionWrapper) real;
    }

    public android.view.inputmethod.InputConnectionWrapper unwrap() {
        return getReal();
    }

    public InputConnectionWrapper(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, boolean arg1) {
        this(new android.view.inputmethod.InputConnectionWrapper(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public boolean beginBatchEdit() {
        return ((android.view.inputmethod.InputConnectionWrapper) real).beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).clearMetaKeyStates(arg0);
    }

    public void closeConnection() {
        ((android.view.inputmethod.InputConnectionWrapper) real).closeConnection();
    }

    public boolean commitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).commitCompletion(arg0 == null ? null : arg0.getReal());
    }

    public boolean commitContent(com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).commitContent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean commitCorrection(com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).commitCorrection(arg0 == null ? null : arg0.getReal());
    }

    public boolean commitText(java.lang.CharSequence arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).commitText(arg0, arg1);
    }

    public boolean commitText(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).commitText(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean deleteSurroundingText(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).deleteSurroundingText(arg0, arg1);
    }

    public boolean deleteSurroundingTextInCodePoints(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).deleteSurroundingTextInCodePoints(arg0, arg1);
    }

    public boolean endBatchEdit() {
        return ((android.view.inputmethod.InputConnectionWrapper) real).endBatchEdit();
    }

    public boolean finishComposingText() {
        return ((android.view.inputmethod.InputConnectionWrapper) real).finishComposingText();
    }

    public int getCursorCapsMode(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).getCursorCapsMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText getExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText.wrap(((android.view.inputmethod.InputConnectionWrapper) real).getExtractedText(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(((android.view.inputmethod.InputConnectionWrapper) real).getHandler());
    }

    public java.lang.CharSequence getSelectedText(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).getSelectedText(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(((android.view.inputmethod.InputConnectionWrapper) real).getSurroundingText(arg0, arg1, arg2));
    }

    public java.lang.CharSequence getTextAfterCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).getTextAfterCursor(arg0, arg1);
    }

    public java.lang.CharSequence getTextBeforeCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).getTextBeforeCursor(arg0, arg1);
    }

    public boolean performContextMenuAction(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).performContextMenuAction(arg0);
    }

    public boolean performEditorAction(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).performEditorAction(arg0);
    }

    public void performHandwritingGesture(com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture arg0, java.util.concurrent.Executor arg1, java.util.function.IntConsumer arg2) {
        ((android.view.inputmethod.InputConnectionWrapper) real).performHandwritingGesture(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean performPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).performPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean performSpellCheck() {
        return ((android.view.inputmethod.InputConnectionWrapper) real).performSpellCheck();
    }

    public boolean previewHandwritingGesture(com.micklab.dcg.wrapper.android.view.inputmethod.PreviewableHandwritingGesture arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).previewHandwritingGesture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean replaceText(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg4) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).replaceText(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean reportFullscreenMode(boolean arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).reportFullscreenMode(arg0);
    }

    public boolean requestCursorUpdates(int arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).requestCursorUpdates(arg0);
    }

    public boolean requestCursorUpdates(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).requestCursorUpdates(arg0, arg1);
    }

    public boolean sendKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).sendKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean setComposingRegion(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setComposingRegion(arg0, arg1);
    }

    public boolean setComposingRegion(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setComposingRegion(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setComposingText(arg0, arg1);
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setComposingText(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean setImeConsumesInput(boolean arg0) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setImeConsumesInput(arg0);
    }

    public boolean setSelection(int arg0, int arg1) {
        return ((android.view.inputmethod.InputConnectionWrapper) real).setSelection(arg0, arg1);
    }

    public void setTarget(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0) {
        ((android.view.inputmethod.InputConnectionWrapper) real).setTarget(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot takeSnapshot() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot.wrap(((android.view.inputmethod.InputConnectionWrapper) real).takeSnapshot());
    }

}
