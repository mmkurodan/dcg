// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class BaseInputConnection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseInputConnection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.BaseInputConnection wrap(android.view.inputmethod.BaseInputConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.BaseInputConnection(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.BaseInputConnection getReal() {
        return (android.view.inputmethod.BaseInputConnection) real;
    }

    public android.view.inputmethod.BaseInputConnection unwrap() {
        return getReal();
    }

    public BaseInputConnection(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        this(new android.view.inputmethod.BaseInputConnection(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public boolean beginBatchEdit() {
        return ((android.view.inputmethod.BaseInputConnection) real).beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).clearMetaKeyStates(arg0);
    }

    public void closeConnection() {
        ((android.view.inputmethod.BaseInputConnection) real).closeConnection();
    }

    public boolean commitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).commitCompletion(arg0 == null ? null : arg0.getReal());
    }

    public boolean commitContent(com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.view.inputmethod.BaseInputConnection) real).commitContent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean commitCorrection(com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).commitCorrection(arg0 == null ? null : arg0.getReal());
    }

    public boolean commitText(java.lang.CharSequence arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).commitText(arg0, arg1);
    }

    public boolean deleteSurroundingText(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).deleteSurroundingText(arg0, arg1);
    }

    public boolean deleteSurroundingTextInCodePoints(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).deleteSurroundingTextInCodePoints(arg0, arg1);
    }

    public boolean endBatchEdit() {
        return ((android.view.inputmethod.BaseInputConnection) real).endBatchEdit();
    }

    public boolean finishComposingText() {
        return ((android.view.inputmethod.BaseInputConnection) real).finishComposingText();
    }

    public static int getComposingSpanEnd(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(arg0 == null ? null : arg0.getReal());
    }

    public static int getComposingSpanStart(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanStart(arg0 == null ? null : arg0.getReal());
    }

    public int getCursorCapsMode(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).getCursorCapsMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Editable getEditable() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.view.inputmethod.BaseInputConnection) real).getEditable());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText getExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText.wrap(((android.view.inputmethod.BaseInputConnection) real).getExtractedText(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(((android.view.inputmethod.BaseInputConnection) real).getHandler());
    }

    public java.lang.CharSequence getSelectedText(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).getSelectedText(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(((android.view.inputmethod.BaseInputConnection) real).getSurroundingText(arg0, arg1, arg2));
    }

    public java.lang.CharSequence getTextAfterCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).getTextAfterCursor(arg0, arg1);
    }

    public java.lang.CharSequence getTextBeforeCursor(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).getTextBeforeCursor(arg0, arg1);
    }

    public boolean performContextMenuAction(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).performContextMenuAction(arg0);
    }

    public boolean performEditorAction(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).performEditorAction(arg0);
    }

    public boolean performPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).performPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static void removeComposingSpans(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.view.inputmethod.BaseInputConnection.removeComposingSpans(arg0 == null ? null : arg0.getReal());
    }

    public boolean replaceText(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute arg4) {
        return ((android.view.inputmethod.BaseInputConnection) real).replaceText(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean reportFullscreenMode(boolean arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).reportFullscreenMode(arg0);
    }

    public boolean requestCursorUpdates(int arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).requestCursorUpdates(arg0);
    }

    public boolean sendKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.inputmethod.BaseInputConnection) real).sendKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean setComposingRegion(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).setComposingRegion(arg0, arg1);
    }

    public static void setComposingSpans(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.view.inputmethod.BaseInputConnection.setComposingSpans(arg0 == null ? null : arg0.getReal());
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).setComposingText(arg0, arg1);
    }

    public boolean setSelection(int arg0, int arg1) {
        return ((android.view.inputmethod.BaseInputConnection) real).setSelection(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot takeSnapshot() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot.wrap(((android.view.inputmethod.BaseInputConnection) real).takeSnapshot());
    }

}
