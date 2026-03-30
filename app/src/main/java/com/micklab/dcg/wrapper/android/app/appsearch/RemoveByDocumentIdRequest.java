// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class RemoveByDocumentIdRequest {
    private final android.app.appsearch.RemoveByDocumentIdRequest real;

    public RemoveByDocumentIdRequest(android.app.appsearch.RemoveByDocumentIdRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest wrap(android.app.appsearch.RemoveByDocumentIdRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest(real);
    }

    public android.app.appsearch.RemoveByDocumentIdRequest unwrap() {
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


    public static final class Builder {
        private final android.app.appsearch.RemoveByDocumentIdRequest.Builder real;

        public Builder(android.app.appsearch.RemoveByDocumentIdRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder wrap(android.app.appsearch.RemoveByDocumentIdRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder(real);
        }

        public android.app.appsearch.RemoveByDocumentIdRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.RemoveByDocumentIdRequest.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.Builder.wrap(real.addIds(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.RemoveByDocumentIdRequest.wrap(real.build());
        }

    }
}
