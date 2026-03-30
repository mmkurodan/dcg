// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class SourceRegistrationRequest {
    private final android.adservices.measurement.SourceRegistrationRequest real;

    public SourceRegistrationRequest(android.adservices.measurement.SourceRegistrationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest wrap(android.adservices.measurement.SourceRegistrationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest(real);
    }

    public android.adservices.measurement.SourceRegistrationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(real.getInputEvent());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.measurement.SourceRegistrationRequest.Builder real;

        public Builder(android.adservices.measurement.SourceRegistrationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder wrap(android.adservices.measurement.SourceRegistrationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder(real);
        }

        public android.adservices.measurement.SourceRegistrationRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0) {
            this(new android.adservices.measurement.SourceRegistrationRequest.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.SourceRegistrationRequest.Builder.wrap(real.setInputEvent(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
