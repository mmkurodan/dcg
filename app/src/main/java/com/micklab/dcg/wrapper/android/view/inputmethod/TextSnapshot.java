// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextSnapshot {
    private final android.view.inputmethod.TextSnapshot real;

    public TextSnapshot(android.view.inputmethod.TextSnapshot real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot wrap(android.view.inputmethod.TextSnapshot real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextSnapshot(real);
    }

    public android.view.inputmethod.TextSnapshot unwrap() {
        return real;
    }

    public TextSnapshot(com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText arg0, int arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.TextSnapshot(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public int getCompositionEnd() {
        return real.getCompositionEnd();
    }

    public int getCompositionStart() {
        return real.getCompositionStart();
    }

    public int getCursorCapsMode() {
        return real.getCursorCapsMode();
    }

    public int getSelectionEnd() {
        return real.getSelectionEnd();
    }

    public int getSelectionStart() {
        return real.getSelectionStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText getSurroundingText() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText.wrap(real.getSurroundingText());
    }

}
