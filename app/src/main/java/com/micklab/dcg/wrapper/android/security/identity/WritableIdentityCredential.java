// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class WritableIdentityCredential {
    private final android.security.identity.WritableIdentityCredential real;

    public WritableIdentityCredential(android.security.identity.WritableIdentityCredential real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential wrap(android.security.identity.WritableIdentityCredential real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential(real);
    }

    public android.security.identity.WritableIdentityCredential unwrap() {
        return real;
    }

    public byte[] personalize(com.micklab.dcg.wrapper.android.security.identity.PersonalizationData arg0) {
        return real.personalize(arg0 == null ? null : arg0.unwrap());
    }

}
