// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class WritableIdentityCredential {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WritableIdentityCredential(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential wrap(android.security.identity.WritableIdentityCredential real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.WritableIdentityCredential getReal() {
        return (android.security.identity.WritableIdentityCredential) real;
    }

    public android.security.identity.WritableIdentityCredential unwrap() {
        return getReal();
    }

    public byte[] personalize(com.micklab.dcg.wrapper.android.security.identity.PersonalizationData arg0) {
        return ((android.security.identity.WritableIdentityCredential) real).personalize(arg0 == null ? null : arg0.getReal());
    }

}
