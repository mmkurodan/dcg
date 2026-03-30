// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebSourceParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebSourceParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams wrap(android.adservices.measurement.WebSourceParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.WebSourceParams getReal() {
        return (android.adservices.measurement.WebSourceParams) real;
    }

    public android.adservices.measurement.WebSourceParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.measurement.WebSourceParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.measurement.WebSourceParams) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRegistrationUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebSourceParams) real).getRegistrationUri());
    }

    public int hashCode() {
        return ((android.adservices.measurement.WebSourceParams) real).hashCode();
    }

    public boolean isDebugKeyAllowed() {
        return ((android.adservices.measurement.WebSourceParams) real).isDebugKeyAllowed();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.measurement.WebSourceParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder wrap(android.adservices.measurement.WebSourceParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.WebSourceParams.Builder getReal() {
            return (android.adservices.measurement.WebSourceParams.Builder) real;
        }

        public android.adservices.measurement.WebSourceParams.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.measurement.WebSourceParams.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.wrap(((android.adservices.measurement.WebSourceParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder setDebugKeyAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebSourceParams.Builder.wrap(((android.adservices.measurement.WebSourceParams.Builder) real).setDebugKeyAllowed(arg0));
        }

    }
}
