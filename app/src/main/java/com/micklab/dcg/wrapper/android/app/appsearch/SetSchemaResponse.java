// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SetSchemaResponse {
    private final android.app.appsearch.SetSchemaResponse real;

    public SetSchemaResponse(android.app.appsearch.SetSchemaResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse wrap(android.app.appsearch.SetSchemaResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse(real);
    }

    public android.app.appsearch.SetSchemaResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.SetSchemaResponse.Builder real;

        public Builder(android.app.appsearch.SetSchemaResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder wrap(android.app.appsearch.SetSchemaResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder(real);
        }

        public android.app.appsearch.SetSchemaResponse.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.SetSchemaResponse.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addDeletedType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(real.addDeletedType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addIncompatibleType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(real.addIncompatibleType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addMigratedType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(real.addMigratedType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addMigrationFailure(com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(real.addMigrationFailure(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.wrap(real.build());
        }

    }
    public static final class MigrationFailure {
        private final android.app.appsearch.SetSchemaResponse.MigrationFailure real;

        public MigrationFailure(android.app.appsearch.SetSchemaResponse.MigrationFailure real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure wrap(android.app.appsearch.SetSchemaResponse.MigrationFailure real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure(real);
        }

        public android.app.appsearch.SetSchemaResponse.MigrationFailure unwrap() {
            return real;
        }

        public MigrationFailure(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult arg3) {
            this(new android.app.appsearch.SetSchemaResponse.MigrationFailure(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getDocumentId() {
            return real.getDocumentId();
        }

        public java.lang.String getNamespace() {
            return real.getNamespace();
        }

        public java.lang.String getSchemaType() {
            return real.getSchemaType();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
