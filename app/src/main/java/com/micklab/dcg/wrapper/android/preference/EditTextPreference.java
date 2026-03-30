// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class EditTextPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EditTextPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.EditTextPreference wrap(android.preference.EditTextPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.EditTextPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.EditTextPreference getReal() {
        return (android.preference.EditTextPreference) real;
    }

    public android.preference.EditTextPreference unwrap() {
        return getReal();
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.EditText getEditText() {
        return com.micklab.dcg.wrapper.android.widget.EditText.wrap(((android.preference.EditTextPreference) real).getEditText());
    }

    public java.lang.String getText() {
        return ((android.preference.EditTextPreference) real).getText();
    }

    public void setText(java.lang.String arg0) {
        ((android.preference.EditTextPreference) real).setText(arg0);
    }

    public boolean shouldDisableDependents() {
        return ((android.preference.EditTextPreference) real).shouldDisableDependents();
    }

}
