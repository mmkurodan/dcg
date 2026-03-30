// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebSourceParams {
    private final android.adservices.measurement.WebSourceParams real;

    public WebSourceParams(android.adservices.measurement.WebSourceParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams wrap(android.adservices.measurement.WebSourceParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams(real);
    }

    public android.adservices.measurement.WebSourceParams unwrap() {
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
        private final android.adservices.measurement.WebSourceParams.Builder real;

        public Builder(android.adservices.measurement.WebSourceParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder wrap(android.adservices.measurement.WebSourceParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder(real);
        }

        public android.adservices.measurement.WebSourceParams.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.measurement.WebSourceParams.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder setDebugKeyAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder.wrap(real.setDebugKeyAllowed(arg0));
        }

    }
}
