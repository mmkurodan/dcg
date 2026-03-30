// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class TransportInfo {
    private final android.net.TransportInfo real;

    public TransportInfo(android.net.TransportInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.TransportInfo wrap(android.net.TransportInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.TransportInfo(real);
    }

    public android.net.TransportInfo unwrap() {
        return real;
    }

}
