// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class FhirResource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FhirResource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource wrap(android.health.connect.datatypes.FhirResource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.FhirResource getReal() {
        return (android.health.connect.datatypes.FhirResource) real;
    }

    public android.health.connect.datatypes.FhirResource unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.datatypes.FhirResource) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.FhirResource) real).equals(arg0);
    }

    public java.lang.String getData() {
        return ((android.health.connect.datatypes.FhirResource) real).getData();
    }

    public java.lang.String getId() {
        return ((android.health.connect.datatypes.FhirResource) real).getId();
    }

    public int getType() {
        return ((android.health.connect.datatypes.FhirResource) real).getType();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.FhirResource) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.FhirResource) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.datatypes.FhirResource) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FHIR_RESOURCE_TYPE_ALLERGY_INTOLERANCE = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_ALLERGY_INTOLERANCE;
    public static final int FHIR_RESOURCE_TYPE_CONDITION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_CONDITION;
    public static final int FHIR_RESOURCE_TYPE_ENCOUNTER = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_ENCOUNTER;
    public static final int FHIR_RESOURCE_TYPE_IMMUNIZATION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_IMMUNIZATION;
    public static final int FHIR_RESOURCE_TYPE_LOCATION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_LOCATION;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_MEDICATION;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_REQUEST = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_MEDICATION_REQUEST;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_STATEMENT = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_MEDICATION_STATEMENT;
    public static final int FHIR_RESOURCE_TYPE_OBSERVATION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_OBSERVATION;
    public static final int FHIR_RESOURCE_TYPE_ORGANIZATION = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_ORGANIZATION;
    public static final int FHIR_RESOURCE_TYPE_PATIENT = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_PATIENT;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_PRACTITIONER;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER_ROLE = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_PRACTITIONER_ROLE;
    public static final int FHIR_RESOURCE_TYPE_PROCEDURE = android.health.connect.datatypes.FhirResource.FHIR_RESOURCE_TYPE_PROCEDURE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder wrap(android.health.connect.datatypes.FhirResource.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.FhirResource.Builder getReal() {
            return (android.health.connect.datatypes.FhirResource.Builder) real;
        }

        public android.health.connect.datatypes.FhirResource.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder arg0) {
            this(new android.health.connect.datatypes.FhirResource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource arg0) {
            this(new android.health.connect.datatypes.FhirResource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(int arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.health.connect.datatypes.FhirResource.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.wrap(((android.health.connect.datatypes.FhirResource.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder setData(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder.wrap(((android.health.connect.datatypes.FhirResource.Builder) real).setData(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder.wrap(((android.health.connect.datatypes.FhirResource.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirResource.Builder.wrap(((android.health.connect.datatypes.FhirResource.Builder) real).setType(arg0));
        }

    }
}
