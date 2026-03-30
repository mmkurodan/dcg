// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.sax;

public final class ElementListener {
    private final android.sax.ElementListener real;

    public ElementListener(android.sax.ElementListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.sax.ElementListener wrap(android.sax.ElementListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.sax.ElementListener(real);
    }

    public android.sax.ElementListener unwrap() {
        return real;
    }

}
