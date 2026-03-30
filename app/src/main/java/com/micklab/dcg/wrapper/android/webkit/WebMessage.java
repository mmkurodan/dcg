// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebMessage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebMessage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebMessage wrap(android.webkit.WebMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessage(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebMessage getReal() {
        return (android.webkit.WebMessage) real;
    }

    public android.webkit.WebMessage unwrap() {
        return getReal();
    }

    public WebMessage(java.lang.String arg0) {
        this(new android.webkit.WebMessage(arg0), (__DcgwBridgeToken) null);
    }

    public WebMessage(java.lang.String arg0, android.webkit.WebMessagePort[] arg1) {
        this(new android.webkit.WebMessage(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public java.lang.String getData() {
        return ((android.webkit.WebMessage) real).getData();
    }

    public android.webkit.WebMessagePort[] getPorts() {
        return ((android.webkit.WebMessage) real).getPorts();
    }

}
