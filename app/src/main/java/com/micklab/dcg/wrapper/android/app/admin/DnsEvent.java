// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DnsEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DnsEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DnsEvent wrap(android.app.admin.DnsEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DnsEvent(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DnsEvent getReal() {
        return (android.app.admin.DnsEvent) real;
    }

    public android.app.admin.DnsEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.DnsEvent) real).describeContents();
    }

    public java.lang.String getHostname() {
        return ((android.app.admin.DnsEvent) real).getHostname();
    }

    public int getTotalResolvedAddressCount() {
        return ((android.app.admin.DnsEvent) real).getTotalResolvedAddressCount();
    }

    public java.lang.String toString() {
        return ((android.app.admin.DnsEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.DnsEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
