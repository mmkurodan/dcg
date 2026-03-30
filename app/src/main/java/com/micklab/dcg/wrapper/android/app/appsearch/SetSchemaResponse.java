// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SetSchemaResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetSchemaResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse wrap(android.app.appsearch.SetSchemaResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SetSchemaResponse getReal() {
        return (android.app.appsearch.SetSchemaResponse) real;
    }

    public android.app.appsearch.SetSchemaResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SetSchemaResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SetSchemaResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder wrap(android.app.appsearch.SetSchemaResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SetSchemaResponse.Builder getReal() {
            return (android.app.appsearch.SetSchemaResponse.Builder) real;
        }

        public android.app.appsearch.SetSchemaResponse.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SetSchemaResponse.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addDeletedType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(((android.app.appsearch.SetSchemaResponse.Builder) real).addDeletedType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addIncompatibleType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(((android.app.appsearch.SetSchemaResponse.Builder) real).addIncompatibleType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addMigratedType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(((android.app.appsearch.SetSchemaResponse.Builder) real).addMigratedType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder addMigrationFailure(com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.Builder.wrap(((android.app.appsearch.SetSchemaResponse.Builder) real).addMigrationFailure(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.wrap(((android.app.appsearch.SetSchemaResponse.Builder) real).build());
        }

    }
    public static final class MigrationFailure {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MigrationFailure(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure wrap(android.app.appsearch.SetSchemaResponse.MigrationFailure real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaResponse.MigrationFailure(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SetSchemaResponse.MigrationFailure getReal() {
            return (android.app.appsearch.SetSchemaResponse.MigrationFailure) real;
        }

        public android.app.appsearch.SetSchemaResponse.MigrationFailure unwrap() {
            return getReal();
        }

        public MigrationFailure(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult arg3) {
            this(new android.app.appsearch.SetSchemaResponse.MigrationFailure(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).describeContents();
        }

        public java.lang.String getDocumentId() {
            return ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).getDocumentId();
        }

        public java.lang.String getNamespace() {
            return ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).getNamespace();
        }

        public java.lang.String getSchemaType() {
            return ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).getSchemaType();
        }

        public java.lang.String toString() {
            return ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.appsearch.SetSchemaResponse.MigrationFailure) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
