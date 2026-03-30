// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebTriggerRegistrationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebTriggerRegistrationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest wrap(android.adservices.measurement.WebTriggerRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.WebTriggerRegistrationRequest getReal() {
        return (android.adservices.measurement.WebTriggerRegistrationRequest) real;
    }

    public android.adservices.measurement.WebTriggerRegistrationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.measurement.WebTriggerRegistrationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.measurement.WebTriggerRegistrationRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebTriggerRegistrationRequest) real).getDestination());
    }

    public int hashCode() {
        return ((android.adservices.measurement.WebTriggerRegistrationRequest) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.measurement.WebTriggerRegistrationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.Builder wrap(android.adservices.measurement.WebTriggerRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.WebTriggerRegistrationRequest.Builder getReal() {
            return (android.adservices.measurement.WebTriggerRegistrationRequest.Builder) real;
        }

        public android.adservices.measurement.WebTriggerRegistrationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.adservices.measurement.WebTriggerRegistrationRequest.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.wrap(((android.adservices.measurement.WebTriggerRegistrationRequest.Builder) real).build());
        }

    }
}
