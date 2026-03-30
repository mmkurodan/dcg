// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class FetchAndJoinCustomAudienceRequest {
    private final android.adservices.customaudience.FetchAndJoinCustomAudienceRequest real;

    public FetchAndJoinCustomAudienceRequest(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest wrap(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest(real);
    }

    public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getActivationTime() {
        return real.getActivationTime();
    }

    public java.time.Instant getExpirationTime() {
        return real.getExpirationTime();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getFetchUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getFetchUri());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getUserBiddingSignals());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder real;

        public Builder(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder wrap(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder(real);
        }

        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(real.setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(real.setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setFetchUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(real.setFetchUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder.wrap(real.setUserBiddingSignals(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
