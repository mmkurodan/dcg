// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebTriggerParams {
    private final android.adservices.measurement.WebTriggerParams real;

    public WebTriggerParams(android.adservices.measurement.WebTriggerParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams wrap(android.adservices.measurement.WebTriggerParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams(real);
    }

    public android.adservices.measurement.WebTriggerParams unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRegistrationUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getRegistrationUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isDebugKeyAllowed() {
        return real.isDebugKeyAllowed();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.measurement.WebTriggerParams.Builder real;

        public Builder(android.adservices.measurement.WebTriggerParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder wrap(android.adservices.measurement.WebTriggerParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder(real);
        }

        public android.adservices.measurement.WebTriggerParams.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.measurement.WebTriggerParams.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder setDebugKeyAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder.wrap(real.setDebugKeyAllowed(arg0));
        }

    }
}
