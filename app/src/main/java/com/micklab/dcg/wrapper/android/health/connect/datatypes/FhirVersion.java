// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class FhirVersion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FhirVersion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion wrap(android.health.connect.datatypes.FhirVersion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.FhirVersion getReal() {
        return (android.health.connect.datatypes.FhirVersion) real;
    }

    public android.health.connect.datatypes.FhirVersion unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.datatypes.FhirVersion) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.FhirVersion) real).equals(arg0);
    }

    public int getMajor() {
        return ((android.health.connect.datatypes.FhirVersion) real).getMajor();
    }

    public int getMinor() {
        return ((android.health.connect.datatypes.FhirVersion) real).getMinor();
    }

    public int getPatch() {
        return ((android.health.connect.datatypes.FhirVersion) real).getPatch();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.FhirVersion) real).hashCode();
    }

    public boolean isSupportedFhirVersion() {
        return ((android.health.connect.datatypes.FhirVersion) real).isSupportedFhirVersion();
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion parseFhirVersion(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.FhirVersion.wrap(android.health.connect.datatypes.FhirVersion.parseFhirVersion(arg0));
    }

    public java.lang.String toString() {
        return ((android.health.connect.datatypes.FhirVersion) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.datatypes.FhirVersion) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
