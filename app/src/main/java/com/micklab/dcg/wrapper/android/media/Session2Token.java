// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2Token {
    private final android.media.Session2Token real;

    public Session2Token(android.media.Session2Token real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2Token wrap(android.media.Session2Token real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Token(real);
    }

    public android.media.Session2Token unwrap() {
        return real;
    }

    public Session2Token(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        this(new android.media.Session2Token(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getServiceName() {
        return real.getServiceName();
    }

    public int getType() {
        return real.getType();
    }

    public int getUid() {
        return real.getUid();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_SESSION = android.media.Session2Token.TYPE_SESSION;
    public static final int TYPE_SESSION_SERVICE = android.media.Session2Token.TYPE_SESSION_SERVICE;

}
