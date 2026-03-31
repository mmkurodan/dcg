// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class UpsertMedicalResourceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UpsertMedicalResourceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest wrap(android.health.connect.UpsertMedicalResourceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.UpsertMedicalResourceRequest getReal() {
        return (android.health.connect.UpsertMedicalResourceRequest) real;
    }

    public android.health.connect.UpsertMedicalResourceRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).equals(arg0);
    }

    public java.lang.String getData() {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).getData();
    }

    public java.lang.String getDataSourceId() {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).getDataSourceId();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion getFhirVersion() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion.wrap(((android.health.connect.UpsertMedicalResourceRequest) real).getFhirVersion());
    }

    public int hashCode() {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.UpsertMedicalResourceRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.UpsertMedicalResourceRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder wrap(android.health.connect.UpsertMedicalResourceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.UpsertMedicalResourceRequest.Builder getReal() {
            return (android.health.connect.UpsertMedicalResourceRequest.Builder) real;
        }

        public android.health.connect.UpsertMedicalResourceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder arg0) {
            this(new android.health.connect.UpsertMedicalResourceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest arg0) {
            this(new android.health.connect.UpsertMedicalResourceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg1, java.lang.String arg2) {
            this(new android.health.connect.UpsertMedicalResourceRequest.Builder(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.wrap(((android.health.connect.UpsertMedicalResourceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder setData(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder.wrap(((android.health.connect.UpsertMedicalResourceRequest.Builder) real).setData(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder setDataSourceId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder.wrap(((android.health.connect.UpsertMedicalResourceRequest.Builder) real).setDataSourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder setFhirVersion(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.UpsertMedicalResourceRequest.Builder.wrap(((android.health.connect.UpsertMedicalResourceRequest.Builder) real).setFhirVersion(arg0 == null ? null : arg0.getReal()));
        }

    }
}
