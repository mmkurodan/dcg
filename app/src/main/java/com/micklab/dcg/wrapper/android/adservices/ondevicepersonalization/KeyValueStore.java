// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class KeyValueStore {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyValueStore(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore wrap(android.adservices.ondevicepersonalization.KeyValueStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.KeyValueStore getReal() {
        return (android.adservices.ondevicepersonalization.KeyValueStore) real;
    }

    public android.adservices.ondevicepersonalization.KeyValueStore unwrap() {
        return getReal();
    }

    public byte[] get(java.lang.String arg0) {
        return ((android.adservices.ondevicepersonalization.KeyValueStore) real).get(arg0);
    }

}
