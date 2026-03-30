// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class AddCustomAudienceOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AddCustomAudienceOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest wrap(android.adservices.customaudience.AddCustomAudienceOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.AddCustomAudienceOverrideRequest getReal() {
        return (android.adservices.customaudience.AddCustomAudienceOverrideRequest) real;
    }

    public android.adservices.customaudience.AddCustomAudienceOverrideRequest unwrap() {
        return getReal();
    }

    public AddCustomAudienceOverrideRequest(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg3) {
        this(new android.adservices.customaudience.AddCustomAudienceOverrideRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.String getBiddingLogicJs() {
        return ((android.adservices.customaudience.AddCustomAudienceOverrideRequest) real).getBiddingLogicJs();
    }

    public long getBiddingLogicJsVersion() {
        return ((android.adservices.customaudience.AddCustomAudienceOverrideRequest) real).getBiddingLogicJsVersion();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest) real).getBuyer());
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.AddCustomAudienceOverrideRequest) real).getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getTrustedBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest) real).getTrustedBiddingSignals());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder wrap(android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder getReal() {
            return (android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real;
        }

        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJs(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).setBiddingLogicJs(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJsVersion(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).setBiddingLogicJsVersion(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setTrustedBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(((android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder) real).setTrustedBiddingSignals(arg0 == null ? null : arg0.getReal()));
        }

    }
}
