// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class ScheduleCustomAudienceUpdateRequest {
    private final android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest real;

    public ScheduleCustomAudienceUpdateRequest(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest wrap(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest(real);
    }

    public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Duration getMinDelay() {
        return real.getMinDelay();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUpdateUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder real;

        public Builder(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder wrap(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder(real);
        }

        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0, java.time.Duration arg1, java.util.List arg2) {
            this(new android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setMinDelay(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder.wrap(real.setMinDelay(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder.wrap(real.setUpdateUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
