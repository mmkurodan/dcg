// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MedicalResource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MedicalResource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource wrap(android.health.connect.datatypes.MedicalResource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MedicalResource getReal() {
        return (android.health.connect.datatypes.MedicalResource) real;
    }

    public android.health.connect.datatypes.MedicalResource unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.datatypes.MedicalResource) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.MedicalResource) real).equals(arg0);
    }

    public java.lang.String getDataSourceId() {
        return ((android.health.connect.datatypes.MedicalResource) real).getDataSourceId();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource getFhirResource() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.wrap(((android.health.connect.datatypes.MedicalResource) real).getFhirResource());
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion getFhirVersion() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion.wrap(((android.health.connect.datatypes.MedicalResource) real).getFhirVersion());
    }

    public com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId getId() {
        return com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId.wrap(((android.health.connect.datatypes.MedicalResource) real).getId());
    }

    public int getType() {
        return ((android.health.connect.datatypes.MedicalResource) real).getType();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.MedicalResource) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.MedicalResource) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.datatypes.MedicalResource) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MEDICAL_RESOURCE_TYPE_ALLERGIES_INTOLERANCES = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_ALLERGIES_INTOLERANCES;
    public static final int MEDICAL_RESOURCE_TYPE_CONDITIONS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_CONDITIONS;
    public static final int MEDICAL_RESOURCE_TYPE_LABORATORY_RESULTS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_LABORATORY_RESULTS;
    public static final int MEDICAL_RESOURCE_TYPE_MEDICATIONS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_MEDICATIONS;
    public static final int MEDICAL_RESOURCE_TYPE_PERSONAL_DETAILS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_PERSONAL_DETAILS;
    public static final int MEDICAL_RESOURCE_TYPE_PRACTITIONER_DETAILS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_PRACTITIONER_DETAILS;
    public static final int MEDICAL_RESOURCE_TYPE_PREGNANCY = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_PREGNANCY;
    public static final int MEDICAL_RESOURCE_TYPE_PROCEDURES = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_PROCEDURES;
    public static final int MEDICAL_RESOURCE_TYPE_SOCIAL_HISTORY = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_SOCIAL_HISTORY;
    public static final int MEDICAL_RESOURCE_TYPE_VACCINES = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_VACCINES;
    public static final int MEDICAL_RESOURCE_TYPE_VISITS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_VISITS;
    public static final int MEDICAL_RESOURCE_TYPE_VITAL_SIGNS = android.health.connect.datatypes.MedicalResource.MEDICAL_RESOURCE_TYPE_VITAL_SIGNS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder wrap(android.health.connect.datatypes.MedicalResource.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MedicalResource.Builder getReal() {
            return (android.health.connect.datatypes.MedicalResource.Builder) real;
        }

        public android.health.connect.datatypes.MedicalResource.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder arg0) {
            this(new android.health.connect.datatypes.MedicalResource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource arg0) {
            this(new android.health.connect.datatypes.MedicalResource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource arg3) {
            this(new android.health.connect.datatypes.MedicalResource.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.wrap(((android.health.connect.datatypes.MedicalResource.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder setDataSourceId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder.wrap(((android.health.connect.datatypes.MedicalResource.Builder) real).setDataSourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder setFhirResource(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder.wrap(((android.health.connect.datatypes.MedicalResource.Builder) real).setFhirResource(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder setFhirVersion(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder.wrap(((android.health.connect.datatypes.MedicalResource.Builder) real).setFhirVersion(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MedicalResource.Builder.wrap(((android.health.connect.datatypes.MedicalResource.Builder) real).setType(arg0));
        }

    }
}
