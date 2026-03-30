// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CredentialEntry {
    private final android.service.credentials.CredentialEntry real;

    public CredentialEntry(android.service.credentials.CredentialEntry real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry wrap(android.service.credentials.CredentialEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry(real);
    }

    public android.service.credentials.CredentialEntry unwrap() {
        return real;
    }

    public CredentialEntry(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.slice.Slice arg1) {
        this(new android.service.credentials.CredentialEntry(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public CredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption arg0, com.micklab.dcg.wrapper.android.app.slice.Slice arg1) {
        this(new android.service.credentials.CredentialEntry(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public CredentialEntry(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.slice.Slice arg2) {
        this(new android.service.credentials.CredentialEntry(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getBeginGetCredentialOptionId() {
        return real.getBeginGetCredentialOptionId();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(real.getSlice());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
