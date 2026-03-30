// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class ClipboardManager {
    private final android.text.ClipboardManager real;

    public ClipboardManager(android.text.ClipboardManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.ClipboardManager wrap(android.text.ClipboardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.ClipboardManager(real);
    }

    public android.text.ClipboardManager unwrap() {
        return real;
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public boolean hasText() {
        return real.hasText();
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

}
