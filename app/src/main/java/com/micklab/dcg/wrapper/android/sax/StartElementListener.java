// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class StartElementListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StartElementListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.StartElementListener wrap(android.sax.StartElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.StartElementListener(real, (__DcgwBridgeToken) null);
    }

    public android.sax.StartElementListener getReal() {
        return (android.sax.StartElementListener) real;
    }

    public android.sax.StartElementListener unwrap() {
        return getReal();
    }

    public void start(org.xml.sax.Attributes arg0) {
        ((android.sax.StartElementListener) real).start(arg0);
    }

}
