// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PutDocumentsRequest {
    private final android.app.appsearch.PutDocumentsRequest real;

    public PutDocumentsRequest(android.app.appsearch.PutDocumentsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest wrap(android.app.appsearch.PutDocumentsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest(real);
    }

    public android.app.appsearch.PutDocumentsRequest unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.app.appsearch.PutDocumentsRequest.Builder real;

        public Builder(android.app.appsearch.PutDocumentsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder wrap(android.app.appsearch.PutDocumentsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder(real);
        }

        public android.app.appsearch.PutDocumentsRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.PutDocumentsRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder addGenericDocuments(android.app.appsearch.GenericDocument... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder.wrap(real.addGenericDocuments(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder addTakenActionGenericDocuments(android.app.appsearch.GenericDocument... arg0) throws android.app.appsearch.exceptions.AppSearchException {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.Builder.wrap(real.addTakenActionGenericDocuments(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.PutDocumentsRequest.wrap(real.build());
        }

    }
}
