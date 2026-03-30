// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class KeyValueStore {
    private final android.adservices.ondevicepersonalization.KeyValueStore real;

    public KeyValueStore(android.adservices.ondevicepersonalization.KeyValueStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore wrap(android.adservices.ondevicepersonalization.KeyValueStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore(real);
    }

    public android.adservices.ondevicepersonalization.KeyValueStore unwrap() {
        return real;
    }

    public byte[] get(java.lang.String arg0) {
        return real.get(arg0);
    }

}
