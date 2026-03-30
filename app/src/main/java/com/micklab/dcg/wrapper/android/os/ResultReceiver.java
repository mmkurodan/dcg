// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ResultReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResultReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ResultReceiver wrap(android.os.ResultReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ResultReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.os.ResultReceiver getReal() {
        return (android.os.ResultReceiver) real;
    }

    public android.os.ResultReceiver unwrap() {
        return getReal();
    }

    public ResultReceiver(com.micklab.dcg.wrapper.android.os.Handler arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ResultReceiver#android.os.ResultReceiver(android.os.Handler)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ResultReceiver#describeContents()");
    }

    public void send(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ResultReceiver#send(int,android.os.Bundle)");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ResultReceiver#writeToParcel(android.os.Parcel,int)");
    }


}
