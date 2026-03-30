// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class LeaveCustomAudienceRequest {
    private final android.adservices.customaudience.LeaveCustomAudienceRequest real;

    public LeaveCustomAudienceRequest(android.adservices.customaudience.LeaveCustomAudienceRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest wrap(android.adservices.customaudience.LeaveCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest(real);
    }

    public android.adservices.customaudience.LeaveCustomAudienceRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getBuyer());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.customaudience.LeaveCustomAudienceRequest.Builder real;

        public Builder(android.adservices.customaudience.LeaveCustomAudienceRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder wrap(android.adservices.customaudience.LeaveCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder(real);
        }

        public android.adservices.customaudience.LeaveCustomAudienceRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.LeaveCustomAudienceRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder.wrap(real.setBuyer(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder.wrap(real.setName(arg0));
        }

    }
}
