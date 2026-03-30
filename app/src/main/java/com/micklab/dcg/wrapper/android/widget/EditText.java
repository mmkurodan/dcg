// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class EditText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EditText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.EditText wrap(android.widget.EditText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.EditText(real, (__DcgwBridgeToken) null);
    }

    public android.widget.EditText getReal() {
        return (android.widget.EditText) real;
    }

    public android.widget.EditText unwrap() {
        return getReal();
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void extendSelection(int arg0) {
        ((android.widget.EditText) real).extendSelection(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.EditText) real).getAccessibilityClassName();
    }

    public boolean getFreezesText() {
        return ((android.widget.EditText) real).getFreezesText();
    }

    public com.micklab.dcg.wrapper.android.text.Editable getText() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.widget.EditText) real).getText());
    }

    public boolean isStyleShortcutEnabled() {
        return ((android.widget.EditText) real).isStyleShortcutEnabled();
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.EditText) real).onKeyShortcut(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onTextContextMenuItem(int arg0) {
        return ((android.widget.EditText) real).onTextContextMenuItem(arg0);
    }

    public void selectAll() {
        ((android.widget.EditText) real).selectAll();
    }

    public void setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
        ((android.widget.EditText) real).setEllipsize(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.EditText) real).setSelection(arg0);
    }

    public void setSelection(int arg0, int arg1) {
        ((android.widget.EditText) real).setSelection(arg0, arg1);
    }

    public void setStyleShortcutsEnabled(boolean arg0) {
        ((android.widget.EditText) real).setStyleShortcutsEnabled(arg0);
    }

    public void setText(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        ((android.widget.EditText) real).setText(arg0, arg1 == null ? null : arg1.getReal());
    }

}
