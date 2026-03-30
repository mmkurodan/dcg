// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyChainAliasCallback {
    private final android.security.KeyChainAliasCallback real;

    public KeyChainAliasCallback(android.security.KeyChainAliasCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback wrap(android.security.KeyChainAliasCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyChainAliasCallback(real);
    }

    public android.security.KeyChainAliasCallback unwrap() {
        return real;
    }

    public void alias(java.lang.String arg0) {
        real.alias(arg0);
    }

}
