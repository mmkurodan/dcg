// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class TopicsManager {
    private final android.adservices.topics.TopicsManager real;

    public TopicsManager(android.adservices.topics.TopicsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager wrap(android.adservices.topics.TopicsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager(real);
    }

    public android.adservices.topics.TopicsManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager.wrap(android.adservices.topics.TopicsManager.get(arg0 == null ? null : arg0.unwrap()));
    }

}
