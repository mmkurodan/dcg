// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class PersonalizationData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PersonalizationData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.PersonalizationData wrap(android.security.identity.PersonalizationData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PersonalizationData(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.PersonalizationData getReal() {
        return (android.security.identity.PersonalizationData) real;
    }

    public android.security.identity.PersonalizationData unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder wrap(android.security.identity.PersonalizationData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.identity.PersonalizationData.Builder getReal() {
            return (android.security.identity.PersonalizationData.Builder) real;
        }

        public android.security.identity.PersonalizationData.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.security.identity.PersonalizationData.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder addAccessControlProfile(com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.security.identity.PersonalizationData$Builder#addAccessControlProfile(android.security.identity.AccessControlProfile)");
        }

        public com.micklab.dcg.wrapper.android.security.identity.PersonalizationData build() {
            return com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.wrap(((android.security.identity.PersonalizationData.Builder) real).build());
        }

    }
}
