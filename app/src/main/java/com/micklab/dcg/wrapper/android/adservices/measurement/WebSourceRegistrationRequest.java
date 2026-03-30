// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebSourceRegistrationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebSourceRegistrationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest wrap(android.adservices.measurement.WebSourceRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.WebSourceRegistrationRequest getReal() {
        return (android.adservices.measurement.WebSourceRegistrationRequest) real;
    }

    public android.adservices.measurement.WebSourceRegistrationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.measurement.WebSourceRegistrationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.measurement.WebSourceRegistrationRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAppDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebSourceRegistrationRequest) real).getAppDestination());
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(((android.adservices.measurement.WebSourceRegistrationRequest) real).getInputEvent());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTopOriginUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebSourceRegistrationRequest) real).getTopOriginUri());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getVerifiedDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebSourceRegistrationRequest) real).getVerifiedDestination());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getWebDestination() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebSourceRegistrationRequest) real).getWebDestination());
    }

    public int hashCode() {
        return ((android.adservices.measurement.WebSourceRegistrationRequest) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.measurement.WebSourceRegistrationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder wrap(android.adservices.measurement.WebSourceRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.WebSourceRegistrationRequest.Builder getReal() {
            return (android.adservices.measurement.WebSourceRegistrationRequest.Builder) real;
        }

        public android.adservices.measurement.WebSourceRegistrationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.adservices.measurement.WebSourceRegistrationRequest.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.wrap(((android.adservices.measurement.WebSourceRegistrationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setAppDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(((android.adservices.measurement.WebSourceRegistrationRequest.Builder) real).setAppDestination(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(((android.adservices.measurement.WebSourceRegistrationRequest.Builder) real).setInputEvent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setVerifiedDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(((android.adservices.measurement.WebSourceRegistrationRequest.Builder) real).setVerifiedDestination(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder setWebDestination(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceRegistrationRequest.Builder.wrap(((android.adservices.measurement.WebSourceRegistrationRequest.Builder) real).setWebDestination(arg0 == null ? null : arg0.getReal()));
        }

    }
}
