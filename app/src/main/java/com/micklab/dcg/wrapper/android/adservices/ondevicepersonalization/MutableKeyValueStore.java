// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class MutableKeyValueStore {
    private final android.adservices.ondevicepersonalization.MutableKeyValueStore real;

    public MutableKeyValueStore(android.adservices.ondevicepersonalization.MutableKeyValueStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore wrap(android.adservices.ondevicepersonalization.MutableKeyValueStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore(real);
    }

    public android.adservices.ondevicepersonalization.MutableKeyValueStore unwrap() {
        return real;
    }

    public byte[] put(java.lang.String arg0, byte[] arg1) {
        return real.put(arg0, arg1);
    }

    public byte[] remove(java.lang.String arg0) {
        return real.remove(arg0);
    }

}
