// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class ClipboardManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClipboardManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.ClipboardManager wrap(android.text.ClipboardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.ClipboardManager(real, (__DcgwBridgeToken) null);
    }

    public android.text.ClipboardManager getReal() {
        return (android.text.ClipboardManager) real;
    }

    public android.text.ClipboardManager unwrap() {
        return getReal();
    }

    public java.lang.CharSequence getText() {
        return ((android.text.ClipboardManager) real).getText();
    }

    public boolean hasText() {
        return ((android.text.ClipboardManager) real).hasText();
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.text.ClipboardManager) real).setText(arg0);
    }

}
