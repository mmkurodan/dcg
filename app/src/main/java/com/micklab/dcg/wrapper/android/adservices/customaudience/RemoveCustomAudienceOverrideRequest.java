// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class RemoveCustomAudienceOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveCustomAudienceOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest wrap(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest getReal() {
        return (android.adservices.customaudience.RemoveCustomAudienceOverrideRequest) real;
    }

    public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest unwrap() {
        return getReal();
    }

    public RemoveCustomAudienceOverrideRequest(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0, java.lang.String arg1) {
        this(new android.adservices.customaudience.RemoveCustomAudienceOverrideRequest(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.customaudience.RemoveCustomAudienceOverrideRequest) real).getBuyer());
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.RemoveCustomAudienceOverrideRequest) real).getName();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder wrap(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder getReal() {
            return (android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder) real;
        }

        public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.wrap(((android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder) real).setName(arg0));
        }

    }
}
