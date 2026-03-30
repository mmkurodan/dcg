// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class MutableKeyValueStore {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableKeyValueStore(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore wrap(android.adservices.ondevicepersonalization.MutableKeyValueStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.MutableKeyValueStore(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.MutableKeyValueStore getReal() {
        return (android.adservices.ondevicepersonalization.MutableKeyValueStore) real;
    }

    public android.adservices.ondevicepersonalization.MutableKeyValueStore unwrap() {
        return getReal();
    }

    public byte[] put(java.lang.String arg0, byte[] arg1) {
        return ((android.adservices.ondevicepersonalization.MutableKeyValueStore) real).put(arg0, arg1);
    }

    public byte[] remove(java.lang.String arg0) {
        return ((android.adservices.ondevicepersonalization.MutableKeyValueStore) real).remove(arg0);
    }

}
