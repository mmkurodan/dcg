// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadMedicalResourcesRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadMedicalResourcesRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesRequest wrap(android.health.connect.ReadMedicalResourcesRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadMedicalResourcesRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadMedicalResourcesRequest getReal() {
        return (android.health.connect.ReadMedicalResourcesRequest) real;
    }

    public android.health.connect.ReadMedicalResourcesRequest unwrap() {
        return getReal();
    }

    public int getPageSize() {
        return ((android.health.connect.ReadMedicalResourcesRequest) real).getPageSize();
    }

}
