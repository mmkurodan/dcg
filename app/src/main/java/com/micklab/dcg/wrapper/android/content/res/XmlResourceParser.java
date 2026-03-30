// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class XmlResourceParser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private XmlResourceParser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.XmlResourceParser wrap(android.content.res.XmlResourceParser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.XmlResourceParser(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.XmlResourceParser getReal() {
        return (android.content.res.XmlResourceParser) real;
    }

    public android.content.res.XmlResourceParser unwrap() {
        return getReal();
    }

    public void close() {
        ((android.content.res.XmlResourceParser) real).close();
    }

    public java.lang.String getAttributeNamespace(int arg0) {
        return ((android.content.res.XmlResourceParser) real).getAttributeNamespace(arg0);
    }

}
