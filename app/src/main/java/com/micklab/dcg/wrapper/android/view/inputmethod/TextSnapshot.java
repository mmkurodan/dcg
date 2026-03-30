// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextSnapshot {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextSnapshot(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot wrap(android.view.inputmethod.TextSnapshot real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.TextSnapshot getReal() {
        return (android.view.inputmethod.TextSnapshot) real;
    }

    public android.view.inputmethod.TextSnapshot unwrap() {
        return getReal();
    }

    public TextSnapshot(com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText arg0, int arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.TextSnapshot(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int getCompositionEnd() {
        return ((android.view.inputmethod.TextSnapshot) real).getCompositionEnd();
    }

    public int getCompositionStart() {
        return ((android.view.inputmethod.TextSnapshot) real).getCompositionStart();
    }

    public int getCursorCapsMode() {
        return ((android.view.inputmethod.TextSnapshot) real).getCursorCapsMode();
    }

    public int getSelectionEnd() {
        return ((android.view.inputmethod.TextSnapshot) real).getSelectionEnd();
    }

    public int getSelectionStart() {
        return ((android.view.inputmethod.TextSnapshot) real).getSelectionStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(((android.view.inputmethod.TextSnapshot) real).getSurroundingText());
    }

}
