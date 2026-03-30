// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.topics;

public final class GetTopicsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetTopicsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse wrap(android.adservices.topics.GetTopicsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.topics.GetTopicsResponse getReal() {
        return (android.adservices.topics.GetTopicsResponse) real;
    }

    public android.adservices.topics.GetTopicsResponse unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.topics.GetTopicsResponse) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.topics.GetTopicsResponse) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.Builder wrap(android.adservices.topics.GetTopicsResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.topics.GetTopicsResponse.Builder getReal() {
            return (android.adservices.topics.GetTopicsResponse.Builder) real;
        }

        public android.adservices.topics.GetTopicsResponse.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0) {
            this(new android.adservices.topics.GetTopicsResponse.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(java.util.List arg0, java.util.List arg1) {
            this(new android.adservices.topics.GetTopicsResponse.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse build() {
            return com.micklab.dcg.wrapper.android.adservices.topics.GetTopicsResponse.wrap(((android.adservices.topics.GetTopicsResponse.Builder) real).build());
        }

    }
}
