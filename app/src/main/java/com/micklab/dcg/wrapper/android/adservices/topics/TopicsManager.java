// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class TopicsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TopicsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager wrap(android.adservices.topics.TopicsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.topics.TopicsManager getReal() {
        return (android.adservices.topics.TopicsManager) real;
    }

    public android.adservices.topics.TopicsManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.topics.TopicsManager.wrap(android.adservices.topics.TopicsManager.get(arg0 == null ? null : arg0.getReal()));
    }

}
