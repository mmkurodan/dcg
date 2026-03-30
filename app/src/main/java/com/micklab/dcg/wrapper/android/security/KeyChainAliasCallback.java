// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyChainAliasCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyChainAliasCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback wrap(android.security.KeyChainAliasCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback(real, (__DcgwBridgeToken) null);
    }

    public android.security.KeyChainAliasCallback getReal() {
        return (android.security.KeyChainAliasCallback) real;
    }

    public android.security.KeyChainAliasCallback unwrap() {
        return getReal();
    }

    public void alias(java.lang.String arg0) {
        ((android.security.KeyChainAliasCallback) real).alias(arg0);
    }

}
