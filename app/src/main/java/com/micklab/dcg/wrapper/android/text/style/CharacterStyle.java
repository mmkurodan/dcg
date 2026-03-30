// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class CharacterStyle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CharacterStyle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.CharacterStyle wrap(android.text.style.CharacterStyle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.CharacterStyle(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.CharacterStyle getReal() {
        return (android.text.style.CharacterStyle) real;
    }

    public android.text.style.CharacterStyle unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.text.style.CharacterStyle getUnderlying() {
        return com.micklab.dcg.wrapper.android.text.style.CharacterStyle.wrap(((android.text.style.CharacterStyle) real).getUnderlying());
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.CharacterStyle) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.text.style.CharacterStyle wrap(com.micklab.dcg.wrapper.android.text.style.CharacterStyle arg0) {
        return com.micklab.dcg.wrapper.android.text.style.CharacterStyle.wrap(android.text.style.CharacterStyle.wrap(arg0 == null ? null : arg0.getReal()));
    }

}
