// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AccessControlProfileId {
    private final android.security.identity.AccessControlProfileId real;

    public AccessControlProfileId(android.security.identity.AccessControlProfileId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AccessControlProfileId wrap(android.security.identity.AccessControlProfileId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AccessControlProfileId(real);
    }

    public android.security.identity.AccessControlProfileId unwrap() {
        return real;
    }

    public AccessControlProfileId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.security.identity.AccessControlProfileId#android.security.identity.AccessControlProfileId(int)");
    }

    public int getId() {
        return real.getId();
    }

}
