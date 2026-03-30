// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Messenger {
    private final android.os.Messenger real;

    public Messenger(android.os.Messenger real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Messenger wrap(android.os.Messenger real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Messenger(real);
    }

    public android.os.Messenger unwrap() {
        return real;
    }

    public Messenger(com.micklab.dcg.wrapper.android.os.Handler arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#android.os.Messenger(android.os.Handler)");
    }

    public Messenger(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#android.os.Messenger(android.os.IBinder)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#getBinder()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#hashCode()");
    }

    public static com.micklab.dcg.wrapper.android.os.Messenger readMessengerOrNullFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#readMessengerOrNullFromParcel(android.os.Parcel)");
    }

    public void send(com.micklab.dcg.wrapper.android.os.Message arg0) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#send(android.os.Message)");
    }

    public static void writeMessengerOrNullToParcel(com.micklab.dcg.wrapper.android.os.Messenger arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#writeMessengerOrNullToParcel(android.os.Messenger,android.os.Parcel)");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Messenger#writeToParcel(android.os.Parcel,int)");
    }


}
