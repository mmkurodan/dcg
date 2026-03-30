// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyStoreParameter {
    private final android.security.KeyStoreParameter real;

    public KeyStoreParameter(android.security.KeyStoreParameter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyStoreParameter wrap(android.security.KeyStoreParameter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyStoreParameter(real);
    }

    public android.security.KeyStoreParameter unwrap() {
        return real;
    }

    public boolean isEncryptionRequired() {
        return real.isEncryptionRequired();
    }

    public static final class Builder {
        private final android.security.KeyStoreParameter.Builder real;

        public Builder(android.security.KeyStoreParameter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder wrap(android.security.KeyStoreParameter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder(real);
        }

        public android.security.KeyStoreParameter.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.KeyStoreParameter.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.security.KeyStoreParameter build() {
            return com.micklab.dcg.wrapper.android.security.KeyStoreParameter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder setEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyStoreParameter.Builder.wrap(real.setEncryptionRequired(arg0));
        }

    }
}
