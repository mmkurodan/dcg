// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GetByDocumentIdRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetByDocumentIdRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest wrap(android.app.appsearch.GetByDocumentIdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.GetByDocumentIdRequest getReal() {
        return (android.app.appsearch.GetByDocumentIdRequest) real;
    }

    public android.app.appsearch.GetByDocumentIdRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.GetByDocumentIdRequest) real).describeContents();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.GetByDocumentIdRequest) real).getNamespace();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.GetByDocumentIdRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = android.app.appsearch.GetByDocumentIdRequest.PROJECTION_SCHEMA_TYPE_WILDCARD;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder wrap(android.app.appsearch.GetByDocumentIdRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.GetByDocumentIdRequest.Builder getReal() {
            return (android.app.appsearch.GetByDocumentIdRequest.Builder) real;
        }

        public android.app.appsearch.GetByDocumentIdRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.GetByDocumentIdRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder.wrap(((android.app.appsearch.GetByDocumentIdRequest.Builder) real).addIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.wrap(((android.app.appsearch.GetByDocumentIdRequest.Builder) real).build());
        }

    }
}
