// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.eap;

public final class EapAkaInfo {
    private final android.net.eap.EapAkaInfo real;

    public EapAkaInfo(android.net.eap.EapAkaInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo wrap(android.net.eap.EapAkaInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo(real);
    }

    public android.net.eap.EapAkaInfo unwrap() {
        return real;
    }

    public byte[] getReauthId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapAkaInfo#getReauthId()");
    }

    public static final class Builder {
        private final android.net.eap.EapAkaInfo.Builder real;

        public Builder(android.net.eap.EapAkaInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo.Builder wrap(android.net.eap.EapAkaInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo.Builder(real);
        }

        public android.net.eap.EapAkaInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapAkaInfo$Builder#android.net.eap.EapAkaInfo$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapAkaInfo$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.eap.EapAkaInfo.Builder setReauthId(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapAkaInfo$Builder#setReauthId([B)");
        }

    }
}
