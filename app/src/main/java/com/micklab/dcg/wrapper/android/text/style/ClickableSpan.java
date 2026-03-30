// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ClickableSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClickableSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ClickableSpan wrap(android.text.style.ClickableSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ClickableSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ClickableSpan getReal() {
        return (android.text.style.ClickableSpan) real;
    }

    public android.text.style.ClickableSpan unwrap() {
        return getReal();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.text.style.ClickableSpan) real).onClick(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.text.style.ClickableSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ClickableSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

}
