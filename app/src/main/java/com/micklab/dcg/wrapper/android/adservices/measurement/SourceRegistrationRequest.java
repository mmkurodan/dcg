// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class SourceRegistrationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SourceRegistrationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest wrap(android.adservices.measurement.SourceRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.SourceRegistrationRequest getReal() {
        return (android.adservices.measurement.SourceRegistrationRequest) real;
    }

    public android.adservices.measurement.SourceRegistrationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.measurement.SourceRegistrationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.measurement.SourceRegistrationRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(((android.adservices.measurement.SourceRegistrationRequest) real).getInputEvent());
    }

    public int hashCode() {
        return ((android.adservices.measurement.SourceRegistrationRequest) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.measurement.SourceRegistrationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder wrap(android.adservices.measurement.SourceRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.SourceRegistrationRequest.Builder getReal() {
            return (android.adservices.measurement.SourceRegistrationRequest.Builder) real;
        }

        public android.adservices.measurement.SourceRegistrationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0) {
            this(new android.adservices.measurement.SourceRegistrationRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.wrap(((android.adservices.measurement.SourceRegistrationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder.wrap(((android.adservices.measurement.SourceRegistrationRequest.Builder) real).setInputEvent(arg0 == null ? null : arg0.getReal()));
        }

    }
}
