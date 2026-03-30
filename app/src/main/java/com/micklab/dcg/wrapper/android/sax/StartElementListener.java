// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class StartElementListener {
    private final android.sax.StartElementListener real;

    public StartElementListener(android.sax.StartElementListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.StartElementListener wrap(android.sax.StartElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.StartElementListener(real);
    }

    public android.sax.StartElementListener unwrap() {
        return real;
    }

    public void start(org.xml.sax.Attributes arg0) {
        real.start(arg0);
    }

}
