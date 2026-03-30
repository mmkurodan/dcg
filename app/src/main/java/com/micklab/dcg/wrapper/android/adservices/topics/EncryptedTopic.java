// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class EncryptedTopic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EncryptedTopic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.EncryptedTopic wrap(android.adservices.topics.EncryptedTopic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.EncryptedTopic(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.topics.EncryptedTopic getReal() {
        return (android.adservices.topics.EncryptedTopic) real;
    }

    public android.adservices.topics.EncryptedTopic unwrap() {
        return getReal();
    }

    public EncryptedTopic(byte[] arg0, java.lang.String arg1, byte[] arg2) {
        this(new android.adservices.topics.EncryptedTopic(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.topics.EncryptedTopic) real).equals(arg0);
    }

    public byte[] getEncapsulatedKey() {
        return ((android.adservices.topics.EncryptedTopic) real).getEncapsulatedKey();
    }

    public byte[] getEncryptedTopic() {
        return ((android.adservices.topics.EncryptedTopic) real).getEncryptedTopic();
    }

    public java.lang.String getKeyIdentifier() {
        return ((android.adservices.topics.EncryptedTopic) real).getKeyIdentifier();
    }

    public int hashCode() {
        return ((android.adservices.topics.EncryptedTopic) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.topics.EncryptedTopic) real).toString();
    }

}
