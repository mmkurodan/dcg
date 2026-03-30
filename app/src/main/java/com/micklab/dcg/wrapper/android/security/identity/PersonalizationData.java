// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class PersonalizationData {
    private final android.security.identity.PersonalizationData real;

    public PersonalizationData(android.security.identity.PersonalizationData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.PersonalizationData wrap(android.security.identity.PersonalizationData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PersonalizationData(real);
    }

    public android.security.identity.PersonalizationData unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.security.identity.PersonalizationData.Builder real;

        public Builder(android.security.identity.PersonalizationData.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder wrap(android.security.identity.PersonalizationData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder(real);
        }

        public android.security.identity.PersonalizationData.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.security.identity.PersonalizationData.Builder());
        }

        public com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.Builder addAccessControlProfile(com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.security.identity.PersonalizationData$Builder#addAccessControlProfile(android.security.identity.AccessControlProfile)");
        }

        public com.micklab.dcg.wrapper.android.security.identity.PersonalizationData build() {
            return com.micklab.dcg.wrapper.android.security.identity.PersonalizationData.wrap(real.build());
        }

    }
}
