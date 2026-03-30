// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class ExtractEditText {
    private final android.inputmethodservice.ExtractEditText real;

    public ExtractEditText(android.inputmethodservice.ExtractEditText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.ExtractEditText wrap(android.inputmethodservice.ExtractEditText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.ExtractEditText(real);
    }

    public android.inputmethodservice.ExtractEditText unwrap() {
        return real;
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.unwrap()));
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void finishInternalChanges() {
        real.finishInternalChanges();
    }

    public boolean hasFocus() {
        return real.hasFocus();
    }

    public boolean hasVerticalScrollBar() {
        return real.hasVerticalScrollBar();
    }

    public boolean hasWindowFocus() {
        return real.hasWindowFocus();
    }

    public boolean isFocused() {
        return real.isFocused();
    }

    public boolean isInputMethodTarget() {
        return real.isInputMethodTarget();
    }

    public boolean onTextContextMenuItem(int arg0) {
        return real.onTextContextMenuItem(arg0);
    }

    public boolean performClick() {
        return real.performClick();
    }

    public void setExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg0) {
        real.setExtractedText(arg0 == null ? null : arg0.unwrap());
    }

    public void startInternalChanges() {
        real.startInternalChanges();
    }

}
