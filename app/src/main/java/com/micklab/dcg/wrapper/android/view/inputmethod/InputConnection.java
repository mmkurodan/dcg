// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputConnection {
    private final android.view.inputmethod.InputConnection real;

    public InputConnection(android.view.inputmethod.InputConnection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection wrap(android.view.inputmethod.InputConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection(real);
    }

    public android.view.inputmethod.InputConnection unwrap() {
        return real;
    }

    public boolean beginBatchEdit() {
        return real.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int arg0) {
        return real.clearMetaKeyStates(arg0);
    }

    public void closeConnection() {
        real.closeConnection();
    }

    public boolean commitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        return real.commitCompletion(arg0 == null ? null : arg0.unwrap());
    }

    public boolean commitContent(com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.commitContent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean commitCorrection(com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo arg0) {
        return real.commitCorrection(arg0 == null ? null : arg0.unwrap());
    }

    public boolean commitText(java.lang.CharSequence arg0, int arg1) {
        return real.commitText(arg0, arg1);
    }

    public boolean commitText(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return real.commitText(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean deleteSurroundingText(int arg0, int arg1) {
        return real.deleteSurroundingText(arg0, arg1);
    }

    public boolean deleteSurroundingTextInCodePoints(int arg0, int arg1) {
        return real.deleteSurroundingTextInCodePoints(arg0, arg1);
    }

    public boolean endBatchEdit() {
        return real.endBatchEdit();
    }

    public boolean finishComposingText() {
        return real.finishComposingText();
    }

    public int getCursorCapsMode(int arg0) {
        return real.getCursorCapsMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText getExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText.wrap(real.getExtractedText(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(real.getHandler());
    }

    public java.lang.CharSequence getSelectedText(int arg0) {
        return real.getSelectedText(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(real.getSurroundingText(arg0, arg1, arg2));
    }

    public java.lang.CharSequence getTextAfterCursor(int arg0, int arg1) {
        return real.getTextAfterCursor(arg0, arg1);
    }

    public java.lang.CharSequence getTextBeforeCursor(int arg0, int arg1) {
        return real.getTextBeforeCursor(arg0, arg1);
    }

    public boolean performContextMenuAction(int arg0) {
        return real.performContextMenuAction(arg0);
    }

    public boolean performEditorAction(int arg0) {
        return real.performEditorAction(arg0);
    }

    public void performHandwritingGesture(com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture arg0, java.util.concurrent.Executor arg1, java.util.function.IntConsumer arg2) {
        real.performHandwritingGesture(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean performPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.performPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean performSpellCheck() {
        return real.performSpellCheck();
    }

    public boolean previewHandwritingGesture(com.micklab.dcg.wrapper.android.view.inputmethod.PreviewableHandwritingGesture arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1) {
        return real.previewHandwritingGesture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean replaceText(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg4) {
        return real.replaceText(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public boolean reportFullscreenMode(boolean arg0) {
        return real.reportFullscreenMode(arg0);
    }

    public boolean requestCursorUpdates(int arg0) {
        return real.requestCursorUpdates(arg0);
    }

    public boolean requestCursorUpdates(int arg0, int arg1) {
        return real.requestCursorUpdates(arg0, arg1);
    }

    public boolean sendKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.sendKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setComposingRegion(int arg0, int arg1) {
        return real.setComposingRegion(arg0, arg1);
    }

    public boolean setComposingRegion(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return real.setComposingRegion(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1) {
        return real.setComposingText(arg0, arg1);
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg2) {
        return real.setComposingText(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean setImeConsumesInput(boolean arg0) {
        return real.setImeConsumesInput(arg0);
    }

    public boolean setSelection(int arg0, int arg1) {
        return real.setSelection(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot takeSnapshot() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot.wrap(real.takeSnapshot());
    }

    public static final int CURSOR_UPDATE_FILTER_CHARACTER_BOUNDS = android.view.inputmethod.InputConnection.CURSOR_UPDATE_FILTER_CHARACTER_BOUNDS;
    public static final int CURSOR_UPDATE_FILTER_EDITOR_BOUNDS = android.view.inputmethod.InputConnection.CURSOR_UPDATE_FILTER_EDITOR_BOUNDS;
    public static final int CURSOR_UPDATE_FILTER_INSERTION_MARKER = android.view.inputmethod.InputConnection.CURSOR_UPDATE_FILTER_INSERTION_MARKER;
    public static final int CURSOR_UPDATE_FILTER_TEXT_APPEARANCE = android.view.inputmethod.InputConnection.CURSOR_UPDATE_FILTER_TEXT_APPEARANCE;
    public static final int CURSOR_UPDATE_FILTER_VISIBLE_LINE_BOUNDS = android.view.inputmethod.InputConnection.CURSOR_UPDATE_FILTER_VISIBLE_LINE_BOUNDS;
    public static final int CURSOR_UPDATE_IMMEDIATE = android.view.inputmethod.InputConnection.CURSOR_UPDATE_IMMEDIATE;
    public static final int CURSOR_UPDATE_MONITOR = android.view.inputmethod.InputConnection.CURSOR_UPDATE_MONITOR;
    public static final int GET_EXTRACTED_TEXT_MONITOR = android.view.inputmethod.InputConnection.GET_EXTRACTED_TEXT_MONITOR;
    public static final int GET_TEXT_WITH_STYLES = android.view.inputmethod.InputConnection.GET_TEXT_WITH_STYLES;
    public static final int HANDWRITING_GESTURE_RESULT_CANCELLED = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_CANCELLED;
    public static final int HANDWRITING_GESTURE_RESULT_FAILED = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_FAILED;
    public static final int HANDWRITING_GESTURE_RESULT_FALLBACK = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_FALLBACK;
    public static final int HANDWRITING_GESTURE_RESULT_SUCCESS = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_SUCCESS;
    public static final int HANDWRITING_GESTURE_RESULT_UNKNOWN = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_UNKNOWN;
    public static final int HANDWRITING_GESTURE_RESULT_UNSUPPORTED = android.view.inputmethod.InputConnection.HANDWRITING_GESTURE_RESULT_UNSUPPORTED;
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = android.view.inputmethod.InputConnection.INPUT_CONTENT_GRANT_READ_URI_PERMISSION;

}
