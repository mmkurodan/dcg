// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class MedicalResourceId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MedicalResourceId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId wrap(android.health.connect.MedicalResourceId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.MedicalResourceId getReal() {
        return (android.health.connect.MedicalResourceId) real;
    }

    public android.health.connect.MedicalResourceId unwrap() {
        return getReal();
    }

    public MedicalResourceId(java.lang.String arg0, int arg1, java.lang.String arg2) {
        this(new android.health.connect.MedicalResourceId(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.health.connect.MedicalResourceId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.MedicalResourceId) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId fromFhirReference(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.health.connect.MedicalResourceId.wrap(android.health.connect.MedicalResourceId.fromFhirReference(arg0, arg1));
    }

    public java.lang.String getDataSourceId() {
        return ((android.health.connect.MedicalResourceId) real).getDataSourceId();
    }

    public java.lang.String getFhirResourceId() {
        return ((android.health.connect.MedicalResourceId) real).getFhirResourceId();
    }

    public int getFhirResourceType() {
        return ((android.health.connect.MedicalResourceId) real).getFhirResourceType();
    }

    public int hashCode() {
        return ((android.health.connect.MedicalResourceId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.MedicalResourceId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.MedicalResourceId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
