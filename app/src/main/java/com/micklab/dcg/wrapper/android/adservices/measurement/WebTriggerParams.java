// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class WebTriggerParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebTriggerParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams wrap(android.adservices.measurement.WebTriggerParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.WebTriggerParams getReal() {
        return (android.adservices.measurement.WebTriggerParams) real;
    }

    public android.adservices.measurement.WebTriggerParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.measurement.WebTriggerParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.measurement.WebTriggerParams) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRegistrationUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.measurement.WebTriggerParams) real).getRegistrationUri());
    }

    public int hashCode() {
        return ((android.adservices.measurement.WebTriggerParams) real).hashCode();
    }

    public boolean isDebugKeyAllowed() {
        return ((android.adservices.measurement.WebTriggerParams) real).isDebugKeyAllowed();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.measurement.WebTriggerParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder wrap(android.adservices.measurement.WebTriggerParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.WebTriggerParams.Builder getReal() {
            return (android.adservices.measurement.WebTriggerParams.Builder) real;
        }

        public android.adservices.measurement.WebTriggerParams.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.measurement.WebTriggerParams.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.wrap(((android.adservices.measurement.WebTriggerParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder setDebugKeyAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.WebTriggerParams.Builder.wrap(((android.adservices.measurement.WebTriggerParams.Builder) real).setDebugKeyAllowed(arg0));
        }

    }
}
