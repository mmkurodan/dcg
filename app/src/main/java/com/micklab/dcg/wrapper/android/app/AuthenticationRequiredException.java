// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AuthenticationRequiredException {
    private final android.app.AuthenticationRequiredException real;

    public AuthenticationRequiredException(android.app.AuthenticationRequiredException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AuthenticationRequiredException wrap(android.app.AuthenticationRequiredException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AuthenticationRequiredException(real);
    }

    public android.app.AuthenticationRequiredException unwrap() {
        return real;
    }

    public AuthenticationRequiredException(java.lang.Throwable arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        this(new android.app.AuthenticationRequiredException(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getUserAction() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getUserAction());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
