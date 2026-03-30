// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class ClearCredentialStateRequest {
    private final android.service.credentials.ClearCredentialStateRequest real;

    public ClearCredentialStateRequest(android.service.credentials.ClearCredentialStateRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.ClearCredentialStateRequest wrap(android.service.credentials.ClearCredentialStateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.ClearCredentialStateRequest(real);
    }

    public android.service.credentials.ClearCredentialStateRequest unwrap() {
        return real;
    }

    public ClearCredentialStateRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.service.credentials.ClearCredentialStateRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(real.getCallingAppInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getData());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
