// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class RootElement {
    private final android.sax.RootElement real;

    public RootElement(android.sax.RootElement real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.RootElement wrap(android.sax.RootElement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.RootElement(real);
    }

    public android.sax.RootElement unwrap() {
        return real;
    }

    public RootElement(java.lang.String arg0) {
        this(new android.sax.RootElement(arg0));
    }

    public RootElement(java.lang.String arg0, java.lang.String arg1) {
        this(new android.sax.RootElement(arg0, arg1));
    }

    public org.xml.sax.ContentHandler getContentHandler() {
        return real.getContentHandler();
    }

}
