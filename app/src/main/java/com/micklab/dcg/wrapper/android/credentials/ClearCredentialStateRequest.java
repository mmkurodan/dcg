// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class ClearCredentialStateRequest {
    private final android.credentials.ClearCredentialStateRequest real;

    public ClearCredentialStateRequest(android.credentials.ClearCredentialStateRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateRequest wrap(android.credentials.ClearCredentialStateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateRequest(real);
    }

    public android.credentials.ClearCredentialStateRequest unwrap() {
        return real;
    }

    public ClearCredentialStateRequest(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.credentials.ClearCredentialStateRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
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
