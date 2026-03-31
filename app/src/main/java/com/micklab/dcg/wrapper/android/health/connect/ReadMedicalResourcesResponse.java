// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadMedicalResourcesResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadMedicalResourcesResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesResponse wrap(android.health.connect.ReadMedicalResourcesResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadMedicalResourcesResponse getReal() {
        return (android.health.connect.ReadMedicalResourcesResponse) real;
    }

    public android.health.connect.ReadMedicalResourcesResponse unwrap() {
        return getReal();
    }

    public ReadMedicalResourcesResponse(java.util.List arg0, java.lang.String arg1, int arg2) {
        this(new android.health.connect.ReadMedicalResourcesResponse(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).equals(arg0);
    }

    public java.lang.String getNextPageToken() {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).getNextPageToken();
    }

    public int getRemainingCount() {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).getRemainingCount();
    }

    public int hashCode() {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.health.connect.ReadMedicalResourcesResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.ReadMedicalResourcesResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
