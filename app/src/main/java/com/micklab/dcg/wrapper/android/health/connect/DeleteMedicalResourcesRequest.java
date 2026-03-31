// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class DeleteMedicalResourcesRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeleteMedicalResourcesRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest wrap(android.health.connect.DeleteMedicalResourcesRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.DeleteMedicalResourcesRequest getReal() {
        return (android.health.connect.DeleteMedicalResourcesRequest) real;
    }

    public android.health.connect.DeleteMedicalResourcesRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.DeleteMedicalResourcesRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.DeleteMedicalResourcesRequest) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.DeleteMedicalResourcesRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.DeleteMedicalResourcesRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.DeleteMedicalResourcesRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder wrap(android.health.connect.DeleteMedicalResourcesRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.DeleteMedicalResourcesRequest.Builder getReal() {
            return (android.health.connect.DeleteMedicalResourcesRequest.Builder) real;
        }

        public android.health.connect.DeleteMedicalResourcesRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.DeleteMedicalResourcesRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder arg0) {
            this(new android.health.connect.DeleteMedicalResourcesRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest arg0) {
            this(new android.health.connect.DeleteMedicalResourcesRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder addDataSourceId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder.wrap(((android.health.connect.DeleteMedicalResourcesRequest.Builder) real).addDataSourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder addMedicalResourceType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder.wrap(((android.health.connect.DeleteMedicalResourcesRequest.Builder) real).addMedicalResourceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.wrap(((android.health.connect.DeleteMedicalResourcesRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder clearDataSourceIds() {
            return com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder.wrap(((android.health.connect.DeleteMedicalResourcesRequest.Builder) real).clearDataSourceIds());
        }

        public com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder clearMedicalResourceTypes() {
            return com.micklab.dcg.wrapper.android.health.connect.DeleteMedicalResourcesRequest.Builder.wrap(((android.health.connect.DeleteMedicalResourcesRequest.Builder) real).clearMedicalResourceTypes());
        }

    }
}
