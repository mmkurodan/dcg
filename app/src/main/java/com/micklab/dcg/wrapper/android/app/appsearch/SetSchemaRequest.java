// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SetSchemaRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetSchemaRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest wrap(android.app.appsearch.SetSchemaRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SetSchemaRequest getReal() {
        return (android.app.appsearch.SetSchemaRequest) real;
    }

    public android.app.appsearch.SetSchemaRequest unwrap() {
        return getReal();
    }

    public int getVersion() {
        return ((android.app.appsearch.SetSchemaRequest) real).getVersion();
    }

    public boolean isForceOverride() {
        return ((android.app.appsearch.SetSchemaRequest) real).isForceOverride();
    }

    public static final int READ_ASSISTANT_APP_SEARCH_DATA = android.app.appsearch.SetSchemaRequest.READ_ASSISTANT_APP_SEARCH_DATA;
    public static final int READ_CALENDAR = android.app.appsearch.SetSchemaRequest.READ_CALENDAR;
    public static final int READ_CONTACTS = android.app.appsearch.SetSchemaRequest.READ_CONTACTS;
    public static final int READ_EXTERNAL_STORAGE = android.app.appsearch.SetSchemaRequest.READ_EXTERNAL_STORAGE;
    public static final int READ_HOME_APP_SEARCH_DATA = android.app.appsearch.SetSchemaRequest.READ_HOME_APP_SEARCH_DATA;
    public static final int READ_SMS = android.app.appsearch.SetSchemaRequest.READ_SMS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder wrap(android.app.appsearch.SetSchemaRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SetSchemaRequest.Builder getReal() {
            return (android.app.appsearch.SetSchemaRequest.Builder) real;
        }

        public android.app.appsearch.SetSchemaRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SetSchemaRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder addSchemaTypeVisibleToConfig(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).addSchemaTypeVisibleToConfig(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder addSchemas(android.app.appsearch.AppSearchSchema... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).addSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder clearRequiredPermissionsForSchemaTypeVisibility(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).clearRequiredPermissionsForSchemaTypeVisibility(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder clearSchemaTypeVisibleToConfigs(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).clearSchemaTypeVisibleToConfigs(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setForceOverride(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setForceOverride(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setMigrator(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.Migrator arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setMigrator(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setPubliclyVisibleSchema(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setPubliclyVisibleSchema(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeDisplayedBySystem(java.lang.String arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setSchemaTypeDisplayedBySystem(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeVisibilityForPackage(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg2) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setSchemaTypeVisibilityForPackage(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder setVersion(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetSchemaRequest.Builder.wrap(((android.app.appsearch.SetSchemaRequest.Builder) real).setVersion(arg0));
        }

    }
}
