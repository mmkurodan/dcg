// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateCredentialResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialResponse wrap(android.credentials.CreateCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialResponse(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CreateCredentialResponse getReal() {
        return (android.credentials.CreateCredentialResponse) real;
    }

    public android.credentials.CreateCredentialResponse unwrap() {
        return getReal();
    }

    public CreateCredentialResponse(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.credentials.CreateCredentialResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.CreateCredentialResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.CreateCredentialResponse) real).getData());
    }

    public java.lang.String toString() {
        return ((android.credentials.CreateCredentialResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.CreateCredentialResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
