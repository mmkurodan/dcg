// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SchemaVisibilityConfig {
    private final android.app.appsearch.SchemaVisibilityConfig real;

    public SchemaVisibilityConfig(android.app.appsearch.SchemaVisibilityConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig wrap(android.app.appsearch.SchemaVisibilityConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig(real);
    }

    public android.app.appsearch.SchemaVisibilityConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier getPubliclyVisibleTargetPackage() {
        return com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier.wrap(real.getPubliclyVisibleTargetPackage());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.SchemaVisibilityConfig.Builder real;

        public Builder(android.app.appsearch.SchemaVisibilityConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder wrap(android.app.appsearch.SchemaVisibilityConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder(real);
        }

        public android.app.appsearch.SchemaVisibilityConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.SchemaVisibilityConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder addAllowedPackage(com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(real.addAllowedPackage(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder clearAllowedPackages() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(real.clearAllowedPackages());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder clearRequiredPermissions() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(real.clearRequiredPermissions());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder setPubliclyVisibleTargetPackage(com.micklab.dcg.wrapper.android.app.appsearch.PackageIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig.Builder.wrap(real.setPubliclyVisibleTargetPackage(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
