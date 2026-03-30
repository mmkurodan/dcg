// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class TextElementListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextElementListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.TextElementListener wrap(android.sax.TextElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.TextElementListener(real, (__DcgwBridgeToken) null);
    }

    public android.sax.TextElementListener getReal() {
        return (android.sax.TextElementListener) real;
    }

    public android.sax.TextElementListener unwrap() {
        return getReal();
    }

}
