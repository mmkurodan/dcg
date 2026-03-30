// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class JoinCustomAudienceRequest {
    private final android.adservices.customaudience.JoinCustomAudienceRequest real;

    public JoinCustomAudienceRequest(android.adservices.customaudience.JoinCustomAudienceRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest wrap(android.adservices.customaudience.JoinCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest(real);
    }

    public android.adservices.customaudience.JoinCustomAudienceRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience getCustomAudience() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.wrap(real.getCustomAudience());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.customaudience.JoinCustomAudienceRequest.Builder real;

        public Builder(android.adservices.customaudience.JoinCustomAudienceRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder wrap(android.adservices.customaudience.JoinCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder(real);
        }

        public android.adservices.customaudience.JoinCustomAudienceRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.JoinCustomAudienceRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder setCustomAudience(com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder.wrap(real.setCustomAudience(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
