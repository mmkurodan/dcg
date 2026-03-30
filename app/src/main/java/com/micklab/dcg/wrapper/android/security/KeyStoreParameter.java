// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyStoreParameter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyStoreParameter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyStoreParameter wrap(android.security.KeyStoreParameter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyStoreParameter(real, (__DcgwBridgeToken) null);
    }

    public android.security.KeyStoreParameter getReal() {
        return (android.security.KeyStoreParameter) real;
    }

    public android.security.KeyStoreParameter unwrap() {
        return getReal();
    }

    public boolean isEncryptionRequired() {
        return ((android.security.KeyStoreParameter) real).isEncryptionRequired();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder wrap(android.security.KeyStoreParameter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.KeyStoreParameter.Builder getReal() {
            return (android.security.KeyStoreParameter.Builder) real;
        }

        public android.security.KeyStoreParameter.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.KeyStoreParameter.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.KeyStoreParameter build() {
            return com.micklab.dcg.wrapper.android.security.KeyStoreParameter.wrap(((android.security.KeyStoreParameter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder setEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder.wrap(((android.security.KeyStoreParameter.Builder) real).setEncryptionRequired(arg0));
        }

    }
}
