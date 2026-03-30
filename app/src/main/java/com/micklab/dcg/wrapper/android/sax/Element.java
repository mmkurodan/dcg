// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class Element {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Element(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.Element wrap(android.sax.Element real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.Element(real, (__DcgwBridgeToken) null);
    }

    public android.sax.Element getReal() {
        return (android.sax.Element) real;
    }

    public android.sax.Element unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.sax.Element getChild(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(((android.sax.Element) real).getChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.sax.Element getChild(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(((android.sax.Element) real).getChild(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.sax.Element requireChild(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(((android.sax.Element) real).requireChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.sax.Element requireChild(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(((android.sax.Element) real).requireChild(arg0, arg1));
    }

    public void setElementListener(com.micklab.dcg.wrapper.android.sax.ElementListener arg0) {
        ((android.sax.Element) real).setElementListener(arg0 == null ? null : arg0.getReal());
    }

    public void setEndElementListener(com.micklab.dcg.wrapper.android.sax.EndElementListener arg0) {
        ((android.sax.Element) real).setEndElementListener(arg0 == null ? null : arg0.getReal());
    }

    public void setEndTextElementListener(com.micklab.dcg.wrapper.android.sax.EndTextElementListener arg0) {
        ((android.sax.Element) real).setEndTextElementListener(arg0 == null ? null : arg0.getReal());
    }

    public void setStartElementListener(com.micklab.dcg.wrapper.android.sax.StartElementListener arg0) {
        ((android.sax.Element) real).setStartElementListener(arg0 == null ? null : arg0.getReal());
    }

    public void setTextElementListener(com.micklab.dcg.wrapper.android.sax.TextElementListener arg0) {
        ((android.sax.Element) real).setTextElementListener(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.sax.Element) real).toString();
    }

}
