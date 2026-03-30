// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class Topic {
    private final android.adservices.topics.Topic real;

    public Topic(android.adservices.topics.Topic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.Topic wrap(android.adservices.topics.Topic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.Topic(real);
    }

    public android.adservices.topics.Topic unwrap() {
        return real;
    }

    public Topic(long arg0, long arg1, int arg2) {
        this(new android.adservices.topics.Topic(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getModelVersion() {
        return real.getModelVersion();
    }

    public long getTaxonomyVersion() {
        return real.getTaxonomyVersion();
    }

    public int getTopicId() {
        return real.getTopicId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
