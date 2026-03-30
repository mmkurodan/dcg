// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class RemoveByDocumentIdRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveByDocumentIdRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest wrap(android.app.appsearch.RemoveByDocumentIdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.RemoveByDocumentIdRequest getReal() {
        return (android.app.appsearch.RemoveByDocumentIdRequest) real;
    }

    public android.app.appsearch.RemoveByDocumentIdRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.RemoveByDocumentIdRequest) real).describeContents();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.RemoveByDocumentIdRequest) real).getNamespace();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.RemoveByDocumentIdRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder wrap(android.app.appsearch.RemoveByDocumentIdRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.RemoveByDocumentIdRequest.Builder getReal() {
            return (android.app.appsearch.RemoveByDocumentIdRequest.Builder) real;
        }

        public android.app.appsearch.RemoveByDocumentIdRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.RemoveByDocumentIdRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder.wrap(((android.app.appsearch.RemoveByDocumentIdRequest.Builder) real).addIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.wrap(((android.app.appsearch.RemoveByDocumentIdRequest.Builder) real).build());
        }

    }
}
