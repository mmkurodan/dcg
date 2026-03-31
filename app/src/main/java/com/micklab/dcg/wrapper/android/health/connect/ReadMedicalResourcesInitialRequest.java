// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadMedicalResourcesInitialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadMedicalResourcesInitialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest wrap(android.health.connect.ReadMedicalResourcesInitialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadMedicalResourcesInitialRequest getReal() {
        return (android.health.connect.ReadMedicalResourcesInitialRequest) real;
    }

    public android.health.connect.ReadMedicalResourcesInitialRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.ReadMedicalResourcesInitialRequest) real).equals(arg0);
    }

    public int getMedicalResourceType() {
        return ((android.health.connect.ReadMedicalResourcesInitialRequest) real).getMedicalResourceType();
    }

    public int hashCode() {
        return ((android.health.connect.ReadMedicalResourcesInitialRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.ReadMedicalResourcesInitialRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder wrap(android.health.connect.ReadMedicalResourcesInitialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder getReal() {
            return (android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real;
        }

        public android.health.connect.ReadMedicalResourcesInitialRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.health.connect.ReadMedicalResourcesInitialRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder arg0) {
            this(new android.health.connect.ReadMedicalResourcesInitialRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest arg0) {
            this(new android.health.connect.ReadMedicalResourcesInitialRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder addDataSourceId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real).addDataSourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.wrap(((android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder clearDataSourceIds() {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real).clearDataSourceIds());
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder setMedicalResourceType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real).setMedicalResourceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder setPageSize(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesInitialRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesInitialRequest.Builder) real).setPageSize(arg0));
        }

    }
}
