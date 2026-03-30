// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AccessControlProfileId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessControlProfileId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AccessControlProfileId wrap(android.security.identity.AccessControlProfileId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AccessControlProfileId(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.AccessControlProfileId getReal() {
        return (android.security.identity.AccessControlProfileId) real;
    }

    public android.security.identity.AccessControlProfileId unwrap() {
        return getReal();
    }

    public AccessControlProfileId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.security.identity.AccessControlProfileId#android.security.identity.AccessControlProfileId(int)");
    }

    public int getId() {
        return ((android.security.identity.AccessControlProfileId) real).getId();
    }

}
