// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class EncryptedTopic {
    private final android.adservices.topics.EncryptedTopic real;

    public EncryptedTopic(android.adservices.topics.EncryptedTopic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.EncryptedTopic wrap(android.adservices.topics.EncryptedTopic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.EncryptedTopic(real);
    }

    public android.adservices.topics.EncryptedTopic unwrap() {
        return real;
    }

    public EncryptedTopic(byte[] arg0, java.lang.String arg1, byte[] arg2) {
        this(new android.adservices.topics.EncryptedTopic(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public byte[] getEncapsulatedKey() {
        return real.getEncapsulatedKey();
    }

    public byte[] getEncryptedTopic() {
        return real.getEncryptedTopic();
    }

    public java.lang.String getKeyIdentifier() {
        return real.getKeyIdentifier();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
