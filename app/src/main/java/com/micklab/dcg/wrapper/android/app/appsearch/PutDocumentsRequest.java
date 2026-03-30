// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PutDocumentsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PutDocumentsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest wrap(android.app.appsearch.PutDocumentsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.PutDocumentsRequest getReal() {
        return (android.app.appsearch.PutDocumentsRequest) real;
    }

    public android.app.appsearch.PutDocumentsRequest unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder wrap(android.app.appsearch.PutDocumentsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.PutDocumentsRequest.Builder getReal() {
            return (android.app.appsearch.PutDocumentsRequest.Builder) real;
        }

        public android.app.appsearch.PutDocumentsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.PutDocumentsRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder addGenericDocuments(android.app.appsearch.GenericDocument... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder.wrap(((android.app.appsearch.PutDocumentsRequest.Builder) real).addGenericDocuments(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder addTakenActionGenericDocuments(android.app.appsearch.GenericDocument... arg0) throws android.app.appsearch.exceptions.AppSearchException {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder.wrap(((android.app.appsearch.PutDocumentsRequest.Builder) real).addTakenActionGenericDocuments(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.wrap(((android.app.appsearch.PutDocumentsRequest.Builder) real).build());
        }

    }
}
