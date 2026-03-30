// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class EndTextElementListener {
    private final android.sax.EndTextElementListener real;

    public EndTextElementListener(android.sax.EndTextElementListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.EndTextElementListener wrap(android.sax.EndTextElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.EndTextElementListener(real);
    }

    public android.sax.EndTextElementListener unwrap() {
        return real;
    }

    public void end(java.lang.String arg0) {
        real.end(arg0);
    }

}
