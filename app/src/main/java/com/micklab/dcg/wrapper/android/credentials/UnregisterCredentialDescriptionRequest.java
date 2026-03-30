// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class UnregisterCredentialDescriptionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnregisterCredentialDescriptionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest wrap(android.credentials.UnregisterCredentialDescriptionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.UnregisterCredentialDescriptionRequest getReal() {
        return (android.credentials.UnregisterCredentialDescriptionRequest) real;
    }

    public android.credentials.UnregisterCredentialDescriptionRequest unwrap() {
        return getReal();
    }

    public UnregisterCredentialDescriptionRequest(com.micklab.dcg.wrapper.android.credentials.CredentialDescription arg0) {
        this(new android.credentials.UnregisterCredentialDescriptionRequest(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public UnregisterCredentialDescriptionRequest(java.util.Set arg0) {
        this(new android.credentials.UnregisterCredentialDescriptionRequest(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.UnregisterCredentialDescriptionRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.UnregisterCredentialDescriptionRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
