// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class UserData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UserData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData wrap(android.adservices.ondevicepersonalization.UserData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.UserData getReal() {
        return (android.adservices.ondevicepersonalization.UserData) real;
    }

    public android.adservices.ondevicepersonalization.UserData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.UserData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.UserData) real).equals(arg0);
    }

    public long getAvailableStorageBytes() {
        return ((android.adservices.ondevicepersonalization.UserData) real).getAvailableStorageBytes();
    }

    public int getBatteryPercentage() {
        return ((android.adservices.ondevicepersonalization.UserData) real).getBatteryPercentage();
    }

    public java.lang.String getCarrier() {
        return ((android.adservices.ondevicepersonalization.UserData) real).getCarrier();
    }

    public int getDataNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.adservices.ondevicepersonalization.UserData#getDataNetworkType()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkCapabilities getNetworkCapabilities() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.adservices.ondevicepersonalization.UserData#getNetworkCapabilities()");
    }

    public int getOrientation() {
        return ((android.adservices.ondevicepersonalization.UserData) real).getOrientation();
    }

    public java.time.Duration getTimezoneUtcOffset() {
        return ((android.adservices.ondevicepersonalization.UserData) real).getTimezoneUtcOffset();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.UserData) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.UserData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
