// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2Token {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Session2Token(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2Token wrap(android.media.Session2Token real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Token(real, (__DcgwBridgeToken) null);
    }

    public android.media.Session2Token getReal() {
        return (android.media.Session2Token) real;
    }

    public android.media.Session2Token unwrap() {
        return getReal();
    }

    public Session2Token(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        this(new android.media.Session2Token(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.Session2Token) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.Session2Token) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.Session2Token) real).getExtras());
    }

    public java.lang.String getPackageName() {
        return ((android.media.Session2Token) real).getPackageName();
    }

    public java.lang.String getServiceName() {
        return ((android.media.Session2Token) real).getServiceName();
    }

    public int getType() {
        return ((android.media.Session2Token) real).getType();
    }

    public int getUid() {
        return ((android.media.Session2Token) real).getUid();
    }

    public int hashCode() {
        return ((android.media.Session2Token) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.Session2Token) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.Session2Token) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_SESSION = android.media.Session2Token.TYPE_SESSION;
    public static final int TYPE_SESSION_SERVICE = android.media.Session2Token.TYPE_SESSION_SERVICE;

}
