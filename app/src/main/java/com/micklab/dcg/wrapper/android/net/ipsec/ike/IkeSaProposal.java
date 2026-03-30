// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSaProposal {
    private final android.net.ipsec.ike.IkeSaProposal real;

    public IkeSaProposal(android.net.ipsec.ike.IkeSaProposal real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal wrap(android.net.ipsec.ike.IkeSaProposal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal(real);
    }

    public android.net.ipsec.ike.IkeSaProposal unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal#hashCode()");
    }

    public static final class Builder {
        private final android.net.ipsec.ike.IkeSaProposal.Builder real;

        public Builder(android.net.ipsec.ike.IkeSaProposal.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder wrap(android.net.ipsec.ike.IkeSaProposal.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder(real);
        }

        public android.net.ipsec.ike.IkeSaProposal.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#android.net.ipsec.ike.IkeSaProposal$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder addDhGroup(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#addDhGroup(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder addEncryptionAlgorithm(int arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#addEncryptionAlgorithm(int,int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder addIntegrityAlgorithm(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#addIntegrityAlgorithm(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal.Builder addPseudorandomFunction(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#addPseudorandomFunction(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSaProposal build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSaProposal$Builder#build()");
        }

    }
}
