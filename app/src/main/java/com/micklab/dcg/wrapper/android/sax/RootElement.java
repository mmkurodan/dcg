// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class RootElement {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RootElement(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.RootElement wrap(android.sax.RootElement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.RootElement(real, (__DcgwBridgeToken) null);
    }

    public android.sax.RootElement getReal() {
        return (android.sax.RootElement) real;
    }

    public android.sax.RootElement unwrap() {
        return getReal();
    }

    public RootElement(java.lang.String arg0) {
        this(new android.sax.RootElement(arg0), (__DcgwBridgeToken) null);
    }

    public RootElement(java.lang.String arg0, java.lang.String arg1) {
        this(new android.sax.RootElement(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public org.xml.sax.ContentHandler getContentHandler() {
        return ((android.sax.RootElement) real).getContentHandler();
    }

}
