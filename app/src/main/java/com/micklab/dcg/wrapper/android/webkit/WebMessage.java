// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebMessage {
    private final android.webkit.WebMessage real;

    public WebMessage(android.webkit.WebMessage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebMessage wrap(android.webkit.WebMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessage(real);
    }

    public android.webkit.WebMessage unwrap() {
        return real;
    }

    public WebMessage(java.lang.String arg0) {
        this(new android.webkit.WebMessage(arg0));
    }

    public WebMessage(java.lang.String arg0, android.webkit.WebMessagePort[] arg1) {
        this(new android.webkit.WebMessage(arg0, arg1));
    }

    public java.lang.String getData() {
        return real.getData();
    }

    public android.webkit.WebMessagePort[] getPorts() {
        return real.getPorts();
    }

}
