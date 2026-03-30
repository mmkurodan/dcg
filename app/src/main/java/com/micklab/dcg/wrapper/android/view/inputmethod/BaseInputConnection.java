// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class BaseInputConnection {
    private final android.view.inputmethod.BaseInputConnection real;

    public BaseInputConnection(android.view.inputmethod.BaseInputConnection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.BaseInputConnection wrap(android.view.inputmethod.BaseInputConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.BaseInputConnection(real);
    }

    public android.view.inputmethod.BaseInputConnection unwrap() {
        return real;
    }

    public BaseInputConnection(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        this(new android.view.inputmethod.BaseInputConnection(arg0 == null ? null : arg0.unwrap(), arg1));
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

    public static int getComposingSpanEnd(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(arg0 == null ? null : arg0.unwrap());
    }

    public static int getComposingSpanStart(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanStart(arg0 == null ? null : arg0.unwrap());
    }

    public int getCursorCapsMode(int arg0) {
        return real.getCursorCapsMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Editable getEditable() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.getEditable());
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

    public boolean performPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.performPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static void removeComposingSpans(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.view.inputmethod.BaseInputConnection.removeComposingSpans(arg0 == null ? null : arg0.unwrap());
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

    public boolean sendKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.sendKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setComposingRegion(int arg0, int arg1) {
        return real.setComposingRegion(arg0, arg1);
    }

    public static void setComposingSpans(com.micklab.dcg.wrapper.android.text.Spannable arg0) {
        android.view.inputmethod.BaseInputConnection.setComposingSpans(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setComposingText(java.lang.CharSequence arg0, int arg1) {
        return real.setComposingText(arg0, arg1);
    }

    public boolean setSelection(int arg0, int arg1) {
        return real.setSelection(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot takeSnapshot() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot.wrap(real.takeSnapshot());
    }

}
