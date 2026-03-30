// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class FetchAndJoinCustomAudienceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FetchAndJoinCustomAudienceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest wrap(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest getReal() {
        return (android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real;
    }

    public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).equals(arg0);
    }

    public java.time.Instant getActivationTime() {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).getActivationTime();
    }

    public java.time.Instant getExpirationTime() {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).getExpirationTime();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getFetchUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).getFetchUri());
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).getUserBiddingSignals());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder wrap(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder getReal() {
            return (android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real;
        }

        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setFetchUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).setFetchUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder) real).setUserBiddingSignals(arg0 == null ? null : arg0.getReal()));
        }

    }
}
