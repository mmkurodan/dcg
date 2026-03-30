// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class ConnectEvent {
    private final android.app.admin.ConnectEvent real;

    public ConnectEvent(android.app.admin.ConnectEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.ConnectEvent wrap(android.app.admin.ConnectEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.ConnectEvent(real);
    }

    public android.app.admin.ConnectEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.net.InetAddress getInetAddress() {
        return real.getInetAddress();
    }

    public int getPort() {
        return real.getPort();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
