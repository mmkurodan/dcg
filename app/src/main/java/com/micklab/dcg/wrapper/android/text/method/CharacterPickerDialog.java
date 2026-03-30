// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class CharacterPickerDialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CharacterPickerDialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.CharacterPickerDialog wrap(android.text.method.CharacterPickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.CharacterPickerDialog(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.CharacterPickerDialog getReal() {
        return (android.text.method.CharacterPickerDialog) real;
    }

    public android.text.method.CharacterPickerDialog unwrap() {
        return getReal();
    }

    public CharacterPickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.text.Editable arg2, java.lang.String arg3, boolean arg4) {
        this(new android.text.method.CharacterPickerDialog(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4), (__DcgwBridgeToken) null);
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.text.method.CharacterPickerDialog) real).onClick(arg0 == null ? null : arg0.getReal());
    }

}
