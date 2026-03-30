// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class NetworkSpecifier {
    private final android.net.NetworkSpecifier real;

    public NetworkSpecifier(android.net.NetworkSpecifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.NetworkSpecifier wrap(android.net.NetworkSpecifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkSpecifier(real);
    }

    public android.net.NetworkSpecifier unwrap() {
        return real;
    }

}
