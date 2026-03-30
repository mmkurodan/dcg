// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class LeaveCustomAudienceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LeaveCustomAudienceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest wrap(android.adservices.customaudience.LeaveCustomAudienceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.LeaveCustomAudienceRequest getReal() {
        return (android.adservices.customaudience.LeaveCustomAudienceRequest) real;
    }

    public android.adservices.customaudience.LeaveCustomAudienceRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.LeaveCustomAudienceRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.customaudience.LeaveCustomAudienceRequest) real).getBuyer());
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.LeaveCustomAudienceRequest) real).getName();
    }

    public int hashCode() {
        return ((android.adservices.customaudience.LeaveCustomAudienceRequest) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder wrap(android.adservices.customaudience.LeaveCustomAudienceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.LeaveCustomAudienceRequest.Builder getReal() {
            return (android.adservices.customaudience.LeaveCustomAudienceRequest.Builder) real;
        }

        public android.adservices.customaudience.LeaveCustomAudienceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.LeaveCustomAudienceRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.wrap(((android.adservices.customaudience.LeaveCustomAudienceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.LeaveCustomAudienceRequest.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.LeaveCustomAudienceRequest.Builder.wrap(((android.adservices.customaudience.LeaveCustomAudienceRequest.Builder) real).setName(arg0));
        }

    }
}
