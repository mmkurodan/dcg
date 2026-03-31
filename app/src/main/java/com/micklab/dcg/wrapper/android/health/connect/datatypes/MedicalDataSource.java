// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MedicalDataSource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MedicalDataSource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource wrap(android.health.connect.datatypes.MedicalDataSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MedicalDataSource getReal() {
        return (android.health.connect.datatypes.MedicalDataSource) real;
    }

    public android.health.connect.datatypes.MedicalDataSource unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.MedicalDataSource) real).equals(arg0);
    }

    public java.lang.String getDisplayName() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).getDisplayName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getFhirBaseUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.health.connect.datatypes.MedicalDataSource) real).getFhirBaseUri());
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion getFhirVersion() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion.wrap(((android.health.connect.datatypes.MedicalDataSource) real).getFhirVersion());
    }

    public java.lang.String getId() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).getId();
    }

    public java.time.Instant getLastDataUpdateTime() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).getLastDataUpdateTime();
    }

    public java.lang.String getPackageName() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).getPackageName();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.MedicalDataSource) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.datatypes.MedicalDataSource) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder wrap(android.health.connect.datatypes.MedicalDataSource.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MedicalDataSource.Builder getReal() {
            return (android.health.connect.datatypes.MedicalDataSource.Builder) real;
        }

        public android.health.connect.datatypes.MedicalDataSource.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder arg0) {
            this(new android.health.connect.datatypes.MedicalDataSource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource arg0) {
            this(new android.health.connect.datatypes.MedicalDataSource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg4) {
            this(new android.health.connect.datatypes.MedicalDataSource.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setDisplayName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setDisplayName(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setFhirBaseUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setFhirBaseUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setFhirVersion(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setFhirVersion(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setLastDataUpdateTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setLastDataUpdateTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder setPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalDataSource.Builder.wrap(((android.health.connect.datatypes.MedicalDataSource.Builder) real).setPackageName(arg0));
        }

    }
}
