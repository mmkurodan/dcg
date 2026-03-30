// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class ConnectEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConnectEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.ConnectEvent wrap(android.app.admin.ConnectEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.ConnectEvent(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.ConnectEvent getReal() {
        return (android.app.admin.ConnectEvent) real;
    }

    public android.app.admin.ConnectEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.ConnectEvent) real).describeContents();
    }

    public java.net.InetAddress getInetAddress() {
        return ((android.app.admin.ConnectEvent) real).getInetAddress();
    }

    public int getPort() {
        return ((android.app.admin.ConnectEvent) real).getPort();
    }

    public java.lang.String toString() {
        return ((android.app.admin.ConnectEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.ConnectEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
