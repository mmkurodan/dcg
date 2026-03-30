// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class Topic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Topic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.Topic wrap(android.adservices.topics.Topic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.Topic(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.topics.Topic getReal() {
        return (android.adservices.topics.Topic) real;
    }

    public android.adservices.topics.Topic unwrap() {
        return getReal();
    }

    public Topic(long arg0, long arg1, int arg2) {
        this(new android.adservices.topics.Topic(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.topics.Topic) real).equals(arg0);
    }

    public long getModelVersion() {
        return ((android.adservices.topics.Topic) real).getModelVersion();
    }

    public long getTaxonomyVersion() {
        return ((android.adservices.topics.Topic) real).getTaxonomyVersion();
    }

    public int getTopicId() {
        return ((android.adservices.topics.Topic) real).getTopicId();
    }

    public int hashCode() {
        return ((android.adservices.topics.Topic) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.topics.Topic) real).toString();
    }

}
