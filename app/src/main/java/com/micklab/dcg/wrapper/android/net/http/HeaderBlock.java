// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class HeaderBlock {
    private final android.net.http.HeaderBlock real;

    public HeaderBlock(android.net.http.HeaderBlock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.HeaderBlock wrap(android.net.http.HeaderBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HeaderBlock(real);
    }

    public android.net.http.HeaderBlock unwrap() {
        return real;
    }

}
