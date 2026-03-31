// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class GetMedicalDataSourcesRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetMedicalDataSourcesRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest wrap(android.health.connect.GetMedicalDataSourcesRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.GetMedicalDataSourcesRequest getReal() {
        return (android.health.connect.GetMedicalDataSourcesRequest) real;
    }

    public android.health.connect.GetMedicalDataSourcesRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.GetMedicalDataSourcesRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.GetMedicalDataSourcesRequest) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.GetMedicalDataSourcesRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.GetMedicalDataSourcesRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.GetMedicalDataSourcesRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder wrap(android.health.connect.GetMedicalDataSourcesRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.GetMedicalDataSourcesRequest.Builder getReal() {
            return (android.health.connect.GetMedicalDataSourcesRequest.Builder) real;
        }

        public android.health.connect.GetMedicalDataSourcesRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.GetMedicalDataSourcesRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder arg0) {
            this(new android.health.connect.GetMedicalDataSourcesRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest arg0) {
            this(new android.health.connect.GetMedicalDataSourcesRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder addPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder.wrap(((android.health.connect.GetMedicalDataSourcesRequest.Builder) real).addPackageName(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.wrap(((android.health.connect.GetMedicalDataSourcesRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder clearPackageNames() {
            return com.micklab.dcg.wrapper.android.health.connect.GetMedicalDataSourcesRequest.Builder.wrap(((android.health.connect.GetMedicalDataSourcesRequest.Builder) real).clearPackageNames());
        }

    }
}
