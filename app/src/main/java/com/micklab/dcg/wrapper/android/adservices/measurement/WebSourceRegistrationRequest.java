// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebSourceRegistrationRequest {
    private final android.adservices.measurement.WebSourceRegistrationRequest real;

    public WebSourceRegistrationRequest(android.adservices.measurement.WebSourceRegistrationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest wrap(android.adservices.measurement.WebSourceRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest(real);
    }

    public android.adservices.measurement.WebSourceRegistrationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAppDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getAppDestination());
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(real.getInputEvent());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTopOriginUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getTopOriginUri());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getVerifiedDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getVerifiedDestination());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getWebDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getWebDestination());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.measurement.WebSourceRegistrationRequest.Builder real;

        public Builder(android.adservices.measurement.WebSourceRegistrationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder wrap(android.adservices.measurement.WebSourceRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder(real);
        }

        public android.adservices.measurement.WebSourceRegistrationRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.adservices.measurement.WebSourceRegistrationRequest.Builder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setAppDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(real.setAppDestination(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(real.setInputEvent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setVerifiedDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(real.setVerifiedDestination(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setWebDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(real.setWebDestination(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
