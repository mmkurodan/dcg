// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class UserData {
    private final android.adservices.ondevicepersonalization.UserData real;

    public UserData(android.adservices.ondevicepersonalization.UserData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData wrap(android.adservices.ondevicepersonalization.UserData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.UserData(real);
    }

    public android.adservices.ondevicepersonalization.UserData unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getAvailableStorageBytes() {
        return real.getAvailableStorageBytes();
    }

    public int getBatteryPercentage() {
        return real.getBatteryPercentage();
    }

    public java.lang.String getCarrier() {
        return real.getCarrier();
    }

    public int getDataNetworkType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.adservices.ondevicepersonalization.UserData#getDataNetworkType()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkCapabilities getNetworkCapabilities() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.adservices.ondevicepersonalization.UserData#getNetworkCapabilities()");
    }

    public int getOrientation() {
        return real.getOrientation();
    }

    public java.time.Duration getTimezoneUtcOffset() {
        return real.getTimezoneUtcOffset();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
