// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadMedicalResourcesPageRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadMedicalResourcesPageRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest wrap(android.health.connect.ReadMedicalResourcesPageRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadMedicalResourcesPageRequest getReal() {
        return (android.health.connect.ReadMedicalResourcesPageRequest) real;
    }

    public android.health.connect.ReadMedicalResourcesPageRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.ReadMedicalResourcesPageRequest) real).equals(arg0);
    }

    public java.lang.String getPageToken() {
        return ((android.health.connect.ReadMedicalResourcesPageRequest) real).getPageToken();
    }

    public int hashCode() {
        return ((android.health.connect.ReadMedicalResourcesPageRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.ReadMedicalResourcesPageRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder wrap(android.health.connect.ReadMedicalResourcesPageRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.ReadMedicalResourcesPageRequest.Builder getReal() {
            return (android.health.connect.ReadMedicalResourcesPageRequest.Builder) real;
        }

        public android.health.connect.ReadMedicalResourcesPageRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.health.connect.ReadMedicalResourcesPageRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder arg0) {
            this(new android.health.connect.ReadMedicalResourcesPageRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest arg0) {
            this(new android.health.connect.ReadMedicalResourcesPageRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.wrap(((android.health.connect.ReadMedicalResourcesPageRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder setPageSize(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesPageRequest.Builder) real).setPageSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder setPageToken(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesPageRequest.Builder.wrap(((android.health.connect.ReadMedicalResourcesPageRequest.Builder) real).setPageToken(arg0));
        }

    }
}
