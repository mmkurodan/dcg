// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ParagraphStyle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParagraphStyle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ParagraphStyle wrap(android.text.style.ParagraphStyle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ParagraphStyle(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ParagraphStyle getReal() {
        return (android.text.style.ParagraphStyle) real;
    }

    public android.text.style.ParagraphStyle unwrap() {
        return getReal();
    }

}
