// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class EndTextElementListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EndTextElementListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.EndTextElementListener wrap(android.sax.EndTextElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.EndTextElementListener(real, (__DcgwBridgeToken) null);
    }

    public android.sax.EndTextElementListener getReal() {
        return (android.sax.EndTextElementListener) real;
    }

    public android.sax.EndTextElementListener unwrap() {
        return getReal();
    }

    public void end(java.lang.String arg0) {
        ((android.sax.EndTextElementListener) real).end(arg0);
    }

}
