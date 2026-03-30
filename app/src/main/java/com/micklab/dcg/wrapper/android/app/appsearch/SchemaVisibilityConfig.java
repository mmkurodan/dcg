// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SchemaVisibilityConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SchemaVisibilityConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig wrap(android.app.appsearch.SchemaVisibilityConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SchemaVisibilityConfig getReal() {
        return (android.app.appsearch.SchemaVisibilityConfig) real;
    }

    public android.app.appsearch.SchemaVisibilityConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SchemaVisibilityConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.SchemaVisibilityConfig) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier getPubliclyVisibleTargetPackage() {
        return com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier.wrap(((android.app.appsearch.SchemaVisibilityConfig) real).getPubliclyVisibleTargetPackage());
    }

    public int hashCode() {
        return ((android.app.appsearch.SchemaVisibilityConfig) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SchemaVisibilityConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder wrap(android.app.appsearch.SchemaVisibilityConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SchemaVisibilityConfig.Builder getReal() {
            return (android.app.appsearch.SchemaVisibilityConfig.Builder) real;
        }

        public android.app.appsearch.SchemaVisibilityConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SchemaVisibilityConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder addAllowedPackage(com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(((android.app.appsearch.SchemaVisibilityConfig.Builder) real).addAllowedPackage(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.wrap(((android.app.appsearch.SchemaVisibilityConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder clearAllowedPackages() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(((android.app.appsearch.SchemaVisibilityConfig.Builder) real).clearAllowedPackages());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder clearRequiredPermissions() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(((android.app.appsearch.SchemaVisibilityConfig.Builder) real).clearRequiredPermissions());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder setPubliclyVisibleTargetPackage(com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(((android.app.appsearch.SchemaVisibilityConfig.Builder) real).setPubliclyVisibleTargetPackage(arg0 == null ? null : arg0.getReal()));
        }

    }
}
