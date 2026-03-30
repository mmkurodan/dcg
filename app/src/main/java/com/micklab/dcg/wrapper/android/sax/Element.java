// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class Element {
    private final android.sax.Element real;

    public Element(android.sax.Element real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.Element wrap(android.sax.Element real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.Element(real);
    }

    public android.sax.Element unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.sax.Element getChild(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(real.getChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.sax.Element getChild(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(real.getChild(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.sax.Element requireChild(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(real.requireChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.sax.Element requireChild(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.sax.Element.wrap(real.requireChild(arg0, arg1));
    }

    public void setElementListener(com.micklab.dcg.wrapper.android.sax.ElementListener arg0) {
        real.setElementListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setEndElementListener(com.micklab.dcg.wrapper.android.sax.EndElementListener arg0) {
        real.setEndElementListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setEndTextElementListener(com.micklab.dcg.wrapper.android.sax.EndTextElementListener arg0) {
        real.setEndTextElementListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setStartElementListener(com.micklab.dcg.wrapper.android.sax.StartElementListener arg0) {
        real.setStartElementListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextElementListener(com.micklab.dcg.wrapper.android.sax.TextElementListener arg0) {
        real.setTextElementListener(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
