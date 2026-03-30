// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AccessControlProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessControlProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile wrap(android.security.identity.AccessControlProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.AccessControlProfile getReal() {
        return (android.security.identity.AccessControlProfile) real;
    }

    public android.security.identity.AccessControlProfile unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder wrap(android.security.identity.AccessControlProfile.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.identity.AccessControlProfile.Builder getReal() {
            return (android.security.identity.AccessControlProfile.Builder) real;
        }

        public android.security.identity.AccessControlProfile.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.security.identity.AccessControlProfileId arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.security.identity.AccessControlProfile$Builder#android.security.identity.AccessControlProfile$Builder(android.security.identity.AccessControlProfileId)");
        }

        public com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile build() {
            return com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.wrap(((android.security.identity.AccessControlProfile.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder setReaderCertificate(java.security.cert.X509Certificate arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder.wrap(((android.security.identity.AccessControlProfile.Builder) real).setReaderCertificate(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder setUserAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder.wrap(((android.security.identity.AccessControlProfile.Builder) real).setUserAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder setUserAuthenticationTimeout(long arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.AccessControlProfile.Builder.wrap(((android.security.identity.AccessControlProfile.Builder) real).setUserAuthenticationTimeout(arg0));
        }

    }
}
