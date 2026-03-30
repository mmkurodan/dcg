// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class GetTopicsRequest {
    private final android.adservices.topics.GetTopicsRequest real;

    public GetTopicsRequest(android.adservices.topics.GetTopicsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest wrap(android.adservices.topics.GetTopicsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest(real);
    }

    public android.adservices.topics.GetTopicsRequest unwrap() {
        return real;
    }

    public java.lang.String getAdsSdkName() {
        return real.getAdsSdkName();
    }

    public boolean shouldRecordObservation() {
        return real.shouldRecordObservation();
    }

    public static final class Builder {
        private final android.adservices.topics.GetTopicsRequest.Builder real;

        public Builder(android.adservices.topics.GetTopicsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder wrap(android.adservices.topics.GetTopicsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder(real);
        }

        public android.adservices.topics.GetTopicsRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.topics.GetTopicsRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder setAdsSdkName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder.wrap(real.setAdsSdkName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder setShouldRecordObservation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsRequest.Builder.wrap(real.setShouldRecordObservation(arg0));
        }

    }
}
