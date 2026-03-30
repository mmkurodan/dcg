// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class ScheduleCustomAudienceUpdateRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScheduleCustomAudienceUpdateRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest wrap(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest getReal() {
        return (android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real;
    }

    public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real).equals(arg0);
    }

    public java.time.Duration getMinDelay() {
        return ((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real).getMinDelay();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real).getUpdateUri());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder wrap(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder getReal() {
            return (android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder) real;
        }

        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0, java.time.Duration arg1, java.util.List arg2) {
            this(new android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.wrap(((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setMinDelay(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder.wrap(((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder) real).setMinDelay(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder.wrap(((android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder) real).setUpdateUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
