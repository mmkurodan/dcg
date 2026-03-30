// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class XmlResourceParser {
    private final android.content.res.XmlResourceParser real;

    public XmlResourceParser(android.content.res.XmlResourceParser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.XmlResourceParser wrap(android.content.res.XmlResourceParser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.XmlResourceParser(real);
    }

    public android.content.res.XmlResourceParser unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public java.lang.String getAttributeNamespace(int arg0) {
        return real.getAttributeNamespace(arg0);
    }

}
