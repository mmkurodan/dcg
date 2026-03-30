// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class GetCredentialRequest {
    private final android.service.credentials.GetCredentialRequest real;

    public GetCredentialRequest(android.service.credentials.GetCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.GetCredentialRequest wrap(android.service.credentials.GetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.GetCredentialRequest(real);
    }

    public android.service.credentials.GetCredentialRequest unwrap() {
        return real;
    }

    public GetCredentialRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, java.util.List arg1) {
        this(new android.service.credentials.GetCredentialRequest(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(real.getCallingAppInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
