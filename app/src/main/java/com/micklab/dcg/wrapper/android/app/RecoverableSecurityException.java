// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class RecoverableSecurityException {
    private final android.app.RecoverableSecurityException real;

    public RecoverableSecurityException(android.app.RecoverableSecurityException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.RecoverableSecurityException wrap(android.app.RecoverableSecurityException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.RecoverableSecurityException(real);
    }

    public android.app.RecoverableSecurityException unwrap() {
        return real;
    }

    public RecoverableSecurityException(java.lang.Throwable arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.RemoteAction arg2) {
        this(new android.app.RecoverableSecurityException(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getUserAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(real.getUserAction());
    }

    public java.lang.CharSequence getUserMessage() {
        return real.getUserMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
