// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebTriggerRegistrationRequest {
    private final android.adservices.measurement.WebTriggerRegistrationRequest real;

    public WebTriggerRegistrationRequest(android.adservices.measurement.WebTriggerRegistrationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest wrap(android.adservices.measurement.WebTriggerRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest(real);
    }

    public android.adservices.measurement.WebTriggerRegistrationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDestination());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.measurement.WebTriggerRegistrationRequest.Builder real;

        public Builder(android.adservices.measurement.WebTriggerRegistrationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.Builder wrap(android.adservices.measurement.WebTriggerRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.Builder(real);
        }

        public android.adservices.measurement.WebTriggerRegistrationRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.adservices.measurement.WebTriggerRegistrationRequest.Builder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerRegistrationRequest.wrap(real.build());
        }

    }
}
