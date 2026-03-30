// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSaProposal {
    private final android.net.ipsec.ike.ChildSaProposal real;

    public ChildSaProposal(android.net.ipsec.ike.ChildSaProposal real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal wrap(android.net.ipsec.ike.ChildSaProposal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal(real);
    }

    public android.net.ipsec.ike.ChildSaProposal unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal#hashCode()");
    }

    public static final class Builder {
        private final android.net.ipsec.ike.ChildSaProposal.Builder real;

        public Builder(android.net.ipsec.ike.ChildSaProposal.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal.Builder wrap(android.net.ipsec.ike.ChildSaProposal.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal.Builder(real);
        }

        public android.net.ipsec.ike.ChildSaProposal.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal$Builder#android.net.ipsec.ike.ChildSaProposal$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal.Builder addDhGroup(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal$Builder#addDhGroup(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal.Builder addEncryptionAlgorithm(int arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal$Builder#addEncryptionAlgorithm(int,int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal.Builder addIntegrityAlgorithm(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal$Builder#addIntegrityAlgorithm(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSaProposal build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSaProposal$Builder#build()");
        }

    }
}
