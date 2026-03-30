// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CredentialEntry {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialEntry(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry wrap(android.service.credentials.CredentialEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.CredentialEntry getReal() {
        return (android.service.credentials.CredentialEntry) real;
    }

    public android.service.credentials.CredentialEntry unwrap() {
        return getReal();
    }

    public CredentialEntry(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.slice.Slice arg1) {
        this(new android.service.credentials.CredentialEntry(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption arg0, com.micklab.dcg.wrapper.android.app.slice.Slice arg1) {
        this(new android.service.credentials.CredentialEntry(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CredentialEntry(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.slice.Slice arg2) {
        this(new android.service.credentials.CredentialEntry(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.CredentialEntry) real).describeContents();
    }

    public java.lang.String getBeginGetCredentialOptionId() {
        return ((android.service.credentials.CredentialEntry) real).getBeginGetCredentialOptionId();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.service.credentials.CredentialEntry) real).getSlice());
    }

    public java.lang.String getType() {
        return ((android.service.credentials.CredentialEntry) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.CredentialEntry) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
