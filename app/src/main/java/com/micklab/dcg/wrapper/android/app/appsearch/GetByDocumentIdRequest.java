// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GetByDocumentIdRequest {
    private final android.app.appsearch.GetByDocumentIdRequest real;

    public GetByDocumentIdRequest(android.app.appsearch.GetByDocumentIdRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest wrap(android.app.appsearch.GetByDocumentIdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest(real);
    }

    public android.app.appsearch.GetByDocumentIdRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = android.app.appsearch.GetByDocumentIdRequest.PROJECTION_SCHEMA_TYPE_WILDCARD;

    public static final class Builder {
        private final android.app.appsearch.GetByDocumentIdRequest.Builder real;

        public Builder(android.app.appsearch.GetByDocumentIdRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder wrap(android.app.appsearch.GetByDocumentIdRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder(real);
        }

        public android.app.appsearch.GetByDocumentIdRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.GetByDocumentIdRequest.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.Builder.wrap(real.addIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetByDocumentIdRequest.wrap(real.build());
        }

    }
}
