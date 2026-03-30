// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ClickableSpan {
    private final android.text.style.ClickableSpan real;

    public ClickableSpan(android.text.style.ClickableSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ClickableSpan wrap(android.text.style.ClickableSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ClickableSpan(real);
    }

    public android.text.style.ClickableSpan unwrap() {
        return real;
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onClick(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

}
