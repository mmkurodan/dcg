// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class EditText {
    private final android.widget.EditText real;

    public EditText(android.widget.EditText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.EditText wrap(android.widget.EditText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.EditText(real);
    }

    public android.widget.EditText unwrap() {
        return real;
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.unwrap()));
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public EditText(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.EditText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void extendSelection(int arg0) {
        real.extendSelection(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean getFreezesText() {
        return real.getFreezesText();
    }

    public com.micklab.dcg.wrapper.android.text.Editable getText() {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.getText());
    }

    public boolean isStyleShortcutEnabled() {
        return real.isStyleShortcutEnabled();
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyShortcut(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onTextContextMenuItem(int arg0) {
        return real.onTextContextMenuItem(arg0);
    }

    public void selectAll() {
        real.selectAll();
    }

    public void setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
        real.setEllipsize(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void setSelection(int arg0, int arg1) {
        real.setSelection(arg0, arg1);
    }

    public void setStyleShortcutsEnabled(boolean arg0) {
        real.setStyleShortcutsEnabled(arg0);
    }

    public void setText(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.TextView.BufferType arg1) {
        real.setText(arg0, arg1 == null ? null : arg1.unwrap());
    }

}
