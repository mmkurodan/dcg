// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GetSchemaResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetSchemaResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse wrap(android.app.appsearch.GetSchemaResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.GetSchemaResponse getReal() {
        return (android.app.appsearch.GetSchemaResponse) real;
    }

    public android.app.appsearch.GetSchemaResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.GetSchemaResponse) real).describeContents();
    }

    public int getVersion() {
        return ((android.app.appsearch.GetSchemaResponse) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.GetSchemaResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder wrap(android.app.appsearch.GetSchemaResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.GetSchemaResponse.Builder getReal() {
            return (android.app.appsearch.GetSchemaResponse.Builder) real;
        }

        public android.app.appsearch.GetSchemaResponse.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.GetSchemaResponse.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder addSchema(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSchema arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(((android.app.appsearch.GetSchemaResponse.Builder) real).addSchema(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder addSchemaTypeNotDisplayedBySystem(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(((android.app.appsearch.GetSchemaResponse.Builder) real).addSchemaTypeNotDisplayedBySystem(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.wrap(((android.app.appsearch.GetSchemaResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder setPubliclyVisibleSchema(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(((android.app.appsearch.GetSchemaResponse.Builder) real).setPubliclyVisibleSchema(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder setVersion(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(((android.app.appsearch.GetSchemaResponse.Builder) real).setVersion(arg0));
        }

    }
}
