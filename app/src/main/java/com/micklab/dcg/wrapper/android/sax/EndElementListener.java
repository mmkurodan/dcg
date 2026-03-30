// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class EndElementListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EndElementListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.EndElementListener wrap(android.sax.EndElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.EndElementListener(real, (__DcgwBridgeToken) null);
    }

    public android.sax.EndElementListener getReal() {
        return (android.sax.EndElementListener) real;
    }

    public android.sax.EndElementListener unwrap() {
        return getReal();
    }

    public void end() {
        ((android.sax.EndElementListener) real).end();
    }

}
