// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class EndElementListener {
    private final android.sax.EndElementListener real;

    public EndElementListener(android.sax.EndElementListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.EndElementListener wrap(android.sax.EndElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.EndElementListener(real);
    }

    public android.sax.EndElementListener unwrap() {
        return real;
    }

    public void end() {
        real.end();
    }

}
