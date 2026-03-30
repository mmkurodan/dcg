// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class AddCustomAudienceOverrideRequest {
    private final android.adservices.customaudience.AddCustomAudienceOverrideRequest real;

    public AddCustomAudienceOverrideRequest(android.adservices.customaudience.AddCustomAudienceOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest wrap(android.adservices.customaudience.AddCustomAudienceOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest(real);
    }

    public android.adservices.customaudience.AddCustomAudienceOverrideRequest unwrap() {
        return real;
    }

    public AddCustomAudienceOverrideRequest(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg3) {
        this(new android.adservices.customaudience.AddCustomAudienceOverrideRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public java.lang.String getBiddingLogicJs() {
        return real.getBiddingLogicJs();
    }

    public long getBiddingLogicJsVersion() {
        return real.getBiddingLogicJsVersion();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getBuyer());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getTrustedBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getTrustedBiddingSignals());
    }

    public static final class Builder {
        private final android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder real;

        public Builder(android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder wrap(android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder(real);
        }

        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJs(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(real.setBiddingLogicJs(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJsVersion(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(real.setBiddingLogicJsVersion(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(real.setBuyer(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setTrustedBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder.wrap(real.setTrustedBiddingSignals(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
