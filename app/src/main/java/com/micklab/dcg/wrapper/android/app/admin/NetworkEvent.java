// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class NetworkEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.NetworkEvent wrap(android.app.admin.NetworkEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.NetworkEvent(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.NetworkEvent getReal() {
        return (android.app.admin.NetworkEvent) real;
    }

    public android.app.admin.NetworkEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.NetworkEvent) real).describeContents();
    }

    public long getId() {
        return ((android.app.admin.NetworkEvent) real).getId();
    }

    public java.lang.String getPackageName() {
        return ((android.app.admin.NetworkEvent) real).getPackageName();
    }

    public long getTimestamp() {
        return ((android.app.admin.NetworkEvent) real).getTimestamp();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.NetworkEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
