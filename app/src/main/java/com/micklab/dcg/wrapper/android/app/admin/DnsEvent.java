// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DnsEvent {
    private final android.app.admin.DnsEvent real;

    public DnsEvent(android.app.admin.DnsEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DnsEvent wrap(android.app.admin.DnsEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DnsEvent(real);
    }

    public android.app.admin.DnsEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getHostname() {
        return real.getHostname();
    }

    public int getTotalResolvedAddressCount() {
        return real.getTotalResolvedAddressCount();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
