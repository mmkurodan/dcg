// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class ExtractEditText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExtractEditText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.ExtractEditText wrap(android.inputmethodservice.ExtractEditText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.ExtractEditText(real, (__DcgwBridgeToken) null);
    }

    public android.inputmethodservice.ExtractEditText getReal() {
        return (android.inputmethodservice.ExtractEditText) real;
    }

    public android.inputmethodservice.ExtractEditText unwrap() {
        return getReal();
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ExtractEditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.inputmethodservice.ExtractEditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void finishInternalChanges() {
        ((android.inputmethodservice.ExtractEditText) real).finishInternalChanges();
    }

    public boolean hasFocus() {
        return ((android.inputmethodservice.ExtractEditText) real).hasFocus();
    }

    public boolean hasVerticalScrollBar() {
        return ((android.inputmethodservice.ExtractEditText) real).hasVerticalScrollBar();
    }

    public boolean hasWindowFocus() {
        return ((android.inputmethodservice.ExtractEditText) real).hasWindowFocus();
    }

    public boolean isFocused() {
        return ((android.inputmethodservice.ExtractEditText) real).isFocused();
    }

    public boolean isInputMethodTarget() {
        return ((android.inputmethodservice.ExtractEditText) real).isInputMethodTarget();
    }

    public boolean onTextContextMenuItem(int arg0) {
        return ((android.inputmethodservice.ExtractEditText) real).onTextContextMenuItem(arg0);
    }

    public boolean performClick() {
        return ((android.inputmethodservice.ExtractEditText) real).performClick();
    }

    public void setExtractedText(com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText arg0) {
        ((android.inputmethodservice.ExtractEditText) real).setExtractedText(arg0 == null ? null : arg0.getReal());
    }

    public void startInternalChanges() {
        ((android.inputmethodservice.ExtractEditText) real).startInternalChanges();
    }

}
