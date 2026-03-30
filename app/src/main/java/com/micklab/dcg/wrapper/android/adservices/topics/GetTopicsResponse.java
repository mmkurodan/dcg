// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class GetTopicsResponse {
    private final android.adservices.topics.GetTopicsResponse real;

    public GetTopicsResponse(android.adservices.topics.GetTopicsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse wrap(android.adservices.topics.GetTopicsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse(real);
    }

    public android.adservices.topics.GetTopicsResponse unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.topics.GetTopicsResponse.Builder real;

        public Builder(android.adservices.topics.GetTopicsResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.Builder wrap(android.adservices.topics.GetTopicsResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.Builder(real);
        }

        public android.adservices.topics.GetTopicsResponse.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0) {
            this(new android.adservices.topics.GetTopicsResponse.Builder(arg0));
        }

        public Builder(java.util.List arg0, java.util.List arg1) {
            this(new android.adservices.topics.GetTopicsResponse.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse build() {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.wrap(real.build());
        }

    }
}
