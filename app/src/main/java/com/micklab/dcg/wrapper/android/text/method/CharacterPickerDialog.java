// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class CharacterPickerDialog {
    private final android.text.method.CharacterPickerDialog real;

    public CharacterPickerDialog(android.text.method.CharacterPickerDialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.CharacterPickerDialog wrap(android.text.method.CharacterPickerDialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.CharacterPickerDialog(real);
    }

    public android.text.method.CharacterPickerDialog unwrap() {
        return real;
    }

    public CharacterPickerDialog(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.text.Editable arg2, java.lang.String arg3, boolean arg4) {
        this(new android.text.method.CharacterPickerDialog(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4));
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onClick(arg0 == null ? null : arg0.unwrap());
    }

}
