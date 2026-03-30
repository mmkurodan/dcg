// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CallingAppInfo {
    private final android.service.credentials.CallingAppInfo real;

    public CallingAppInfo(android.service.credentials.CallingAppInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo wrap(android.service.credentials.CallingAppInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo(real);
    }

    public android.service.credentials.CallingAppInfo unwrap() {
        return real;
    }

    public CallingAppInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.SigningInfo arg1) {
        this(new android.service.credentials.CallingAppInfo(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public CallingAppInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.SigningInfo arg1, java.lang.String arg2) {
        this(new android.service.credentials.CallingAppInfo(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getOrigin() {
        return real.getOrigin();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.SigningInfo getSigningInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.SigningInfo.wrap(real.getSigningInfo());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
