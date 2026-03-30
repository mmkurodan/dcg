// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class RecoverableSecurityException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecoverableSecurityException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.RecoverableSecurityException wrap(android.app.RecoverableSecurityException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.RecoverableSecurityException(real, (__DcgwBridgeToken) null);
    }

    public android.app.RecoverableSecurityException getReal() {
        return (android.app.RecoverableSecurityException) real;
    }

    public android.app.RecoverableSecurityException unwrap() {
        return getReal();
    }

    public RecoverableSecurityException(java.lang.Throwable arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.RemoteAction arg2) {
        this(new android.app.RecoverableSecurityException(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.RecoverableSecurityException) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getUserAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(((android.app.RecoverableSecurityException) real).getUserAction());
    }

    public java.lang.CharSequence getUserMessage() {
        return ((android.app.RecoverableSecurityException) real).getUserMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.RecoverableSecurityException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
