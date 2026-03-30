// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class GetTopicsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetTopicsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest wrap(android.adservices.topics.GetTopicsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.topics.GetTopicsRequest getReal() {
        return (android.adservices.topics.GetTopicsRequest) real;
    }

    public android.adservices.topics.GetTopicsRequest unwrap() {
        return getReal();
    }

    public java.lang.String getAdsSdkName() {
        return ((android.adservices.topics.GetTopicsRequest) real).getAdsSdkName();
    }

    public boolean shouldRecordObservation() {
        return ((android.adservices.topics.GetTopicsRequest) real).shouldRecordObservation();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder wrap(android.adservices.topics.GetTopicsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.topics.GetTopicsRequest.Builder getReal() {
            return (android.adservices.topics.GetTopicsRequest.Builder) real;
        }

        public android.adservices.topics.GetTopicsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.topics.GetTopicsRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.wrap(((android.adservices.topics.GetTopicsRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder setAdsSdkName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder.wrap(((android.adservices.topics.GetTopicsRequest.Builder) real).setAdsSdkName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder setShouldRecordObservation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder.wrap(((android.adservices.topics.GetTopicsRequest.Builder) real).setShouldRecordObservation(arg0));
        }

    }
}
