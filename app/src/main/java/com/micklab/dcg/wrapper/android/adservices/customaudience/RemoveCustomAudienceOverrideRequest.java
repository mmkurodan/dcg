// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class RemoveCustomAudienceOverrideRequest {
    private final android.adservices.customaudience.RemoveCustomAudienceOverrideRequest real;

    public RemoveCustomAudienceOverrideRequest(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest wrap(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest(real);
    }

    public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest unwrap() {
        return real;
    }

    public RemoveCustomAudienceOverrideRequest(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0, java.lang.String arg1) {
        this(new android.adservices.customaudience.RemoveCustomAudienceOverrideRequest(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getBuyer());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public static final class Builder {
        private final android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder real;

        public Builder(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder wrap(android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder(real);
        }

        public android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder.wrap(real.setBuyer(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.RemoveCustomAudienceOverrideRequest.Builder.wrap(real.setName(arg0));
        }

    }
}
