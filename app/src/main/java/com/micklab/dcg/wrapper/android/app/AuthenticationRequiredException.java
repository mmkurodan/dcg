// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AuthenticationRequiredException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AuthenticationRequiredException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AuthenticationRequiredException wrap(android.app.AuthenticationRequiredException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AuthenticationRequiredException(real, (__DcgwBridgeToken) null);
    }

    public android.app.AuthenticationRequiredException getReal() {
        return (android.app.AuthenticationRequiredException) real;
    }

    public android.app.AuthenticationRequiredException unwrap() {
        return getReal();
    }

    public AuthenticationRequiredException(java.lang.Throwable arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        this(new android.app.AuthenticationRequiredException(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.AuthenticationRequiredException) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getUserAction() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.AuthenticationRequiredException) real).getUserAction());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.AuthenticationRequiredException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
