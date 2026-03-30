// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class NetworkOnMainThreadException {
    private final android.os.NetworkOnMainThreadException real;

    public NetworkOnMainThreadException(android.os.NetworkOnMainThreadException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.NetworkOnMainThreadException wrap(android.os.NetworkOnMainThreadException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.NetworkOnMainThreadException(real);
    }

    public android.os.NetworkOnMainThreadException unwrap() {
        return real;
    }

    public NetworkOnMainThreadException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.NetworkOnMainThreadException#android.os.NetworkOnMainThreadException()");
    }

}
