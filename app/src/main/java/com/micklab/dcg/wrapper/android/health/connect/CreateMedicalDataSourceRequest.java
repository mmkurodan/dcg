// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class CreateMedicalDataSourceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateMedicalDataSourceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest wrap(android.health.connect.CreateMedicalDataSourceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.CreateMedicalDataSourceRequest getReal() {
        return (android.health.connect.CreateMedicalDataSourceRequest) real;
    }

    public android.health.connect.CreateMedicalDataSourceRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.CreateMedicalDataSourceRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.CreateMedicalDataSourceRequest) real).equals(arg0);
    }

    public java.lang.String getDisplayName() {
        return ((android.health.connect.CreateMedicalDataSourceRequest) real).getDisplayName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getFhirBaseUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.health.connect.CreateMedicalDataSourceRequest) real).getFhirBaseUri());
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion getFhirVersion() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion.wrap(((android.health.connect.CreateMedicalDataSourceRequest) real).getFhirVersion());
    }

    public int hashCode() {
        return ((android.health.connect.CreateMedicalDataSourceRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.CreateMedicalDataSourceRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.CreateMedicalDataSourceRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder wrap(android.health.connect.CreateMedicalDataSourceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.CreateMedicalDataSourceRequest.Builder getReal() {
            return (android.health.connect.CreateMedicalDataSourceRequest.Builder) real;
        }

        public android.health.connect.CreateMedicalDataSourceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder arg0) {
            this(new android.health.connect.CreateMedicalDataSourceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest arg0) {
            this(new android.health.connect.CreateMedicalDataSourceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg2) {
            this(new android.health.connect.CreateMedicalDataSourceRequest.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.wrap(((android.health.connect.CreateMedicalDataSourceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder setDisplayName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder.wrap(((android.health.connect.CreateMedicalDataSourceRequest.Builder) real).setDisplayName(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder setFhirBaseUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder.wrap(((android.health.connect.CreateMedicalDataSourceRequest.Builder) real).setFhirBaseUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder setFhirVersion(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.CreateMedicalDataSourceRequest.Builder.wrap(((android.health.connect.CreateMedicalDataSourceRequest.Builder) real).setFhirVersion(arg0 == null ? null : arg0.getReal()));
        }

    }
}
