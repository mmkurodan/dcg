// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class EditTextPreference {
    private final android.preference.EditTextPreference real;

    public EditTextPreference(android.preference.EditTextPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.EditTextPreference wrap(android.preference.EditTextPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.EditTextPreference(real);
    }

    public android.preference.EditTextPreference unwrap() {
        return real;
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.unwrap()));
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public EditTextPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.EditTextPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.widget.EditText getEditText() {
        return com.micklab.dcg.wrapper.android.widget.EditText.wrap(real.getEditText());
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public void setText(java.lang.String arg0) {
        real.setText(arg0);
    }

    public boolean shouldDisableDependents() {
        return real.shouldDisableDependents();
    }

}
