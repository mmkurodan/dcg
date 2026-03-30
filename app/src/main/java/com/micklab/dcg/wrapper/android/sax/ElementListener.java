// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class ElementListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ElementListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.ElementListener wrap(android.sax.ElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.ElementListener(real, (__DcgwBridgeToken) null);
    }

    public android.sax.ElementListener getReal() {
        return (android.sax.ElementListener) real;
    }

    public android.sax.ElementListener unwrap() {
        return getReal();
    }

}
