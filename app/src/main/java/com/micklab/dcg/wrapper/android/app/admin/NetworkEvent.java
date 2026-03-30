// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class NetworkEvent {
    private final android.app.admin.NetworkEvent real;

    public NetworkEvent(android.app.admin.NetworkEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.NetworkEvent wrap(android.app.admin.NetworkEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.NetworkEvent(real);
    }

    public android.app.admin.NetworkEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getId() {
        return real.getId();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
