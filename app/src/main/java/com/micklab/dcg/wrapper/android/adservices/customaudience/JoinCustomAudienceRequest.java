// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class JoinCustomAudienceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JoinCustomAudienceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest wrap(android.adservices.customaudience.JoinCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.JoinCustomAudienceRequest getReal() {
        return (android.adservices.customaudience.JoinCustomAudienceRequest) real;
    }

    public android.adservices.customaudience.JoinCustomAudienceRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.JoinCustomAudienceRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience getCustomAudience() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.wrap(((android.adservices.customaudience.JoinCustomAudienceRequest) real).getCustomAudience());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.JoinCustomAudienceRequest) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder wrap(android.adservices.customaudience.JoinCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.JoinCustomAudienceRequest.Builder getReal() {
            return (android.adservices.customaudience.JoinCustomAudienceRequest.Builder) real;
        }

        public android.adservices.customaudience.JoinCustomAudienceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.JoinCustomAudienceRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.wrap(((android.adservices.customaudience.JoinCustomAudienceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder setCustomAudience(com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.JoinCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.JoinCustomAudienceRequest.Builder) real).setCustomAudience(arg0 == null ? null : arg0.getReal()));
        }

    }
}
