// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class CharacterStyle {
    private final android.text.style.CharacterStyle real;

    public CharacterStyle(android.text.style.CharacterStyle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.CharacterStyle wrap(android.text.style.CharacterStyle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.CharacterStyle(real);
    }

    public android.text.style.CharacterStyle unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.text.style.CharacterStyle getUnderlying() {
        return com.micklab.dcg.wrapper.android.text.style.CharacterStyle.wrap(real.getUnderlying());
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.text.style.CharacterStyle wrap(com.micklab.dcg.wrapper.android.text.style.CharacterStyle arg0) {
        return com.micklab.dcg.wrapper.android.text.style.CharacterStyle.wrap(android.text.style.CharacterStyle.wrap(arg0 == null ? null : arg0.unwrap()));
    }

}
