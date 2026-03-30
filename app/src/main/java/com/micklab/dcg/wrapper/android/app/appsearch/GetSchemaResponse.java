// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GetSchemaResponse {
    private final android.app.appsearch.GetSchemaResponse real;

    public GetSchemaResponse(android.app.appsearch.GetSchemaResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse wrap(android.app.appsearch.GetSchemaResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse(real);
    }

    public android.app.appsearch.GetSchemaResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getVersion() {
        return real.getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.GetSchemaResponse.Builder real;

        public Builder(android.app.appsearch.GetSchemaResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder wrap(android.app.appsearch.GetSchemaResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder(real);
        }

        public android.app.appsearch.GetSchemaResponse.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.GetSchemaResponse.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder addSchema(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchSchema arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(real.addSchema(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder addSchemaTypeNotDisplayedBySystem(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(real.addSchemaTypeNotDisplayedBySystem(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder setPubliclyVisibleSchema(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(real.setPubliclyVisibleSchema(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder setVersion(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.GetSchemaResponse.Builder.wrap(real.setVersion(arg0));
        }

    }
}
