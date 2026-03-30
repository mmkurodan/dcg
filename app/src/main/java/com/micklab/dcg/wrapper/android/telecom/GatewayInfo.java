// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class GatewayInfo {
    private final android.telecom.GatewayInfo real;

    public GatewayInfo(android.telecom.GatewayInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.GatewayInfo wrap(android.telecom.GatewayInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.GatewayInfo(real);
    }

    public android.telecom.GatewayInfo unwrap() {
        return real;
    }

    public GatewayInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.telecom.GatewayInfo(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getGatewayAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getGatewayAddress());
    }

    public java.lang.String getGatewayProviderPackageName() {
        return real.getGatewayProviderPackageName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getOriginalAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getOriginalAddress());
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
