// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class SupplicantState {
    private final android.net.wifi.SupplicantState real;

    public SupplicantState(android.net.wifi.SupplicantState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.SupplicantState wrap(android.net.wifi.SupplicantState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.SupplicantState(real);
    }

    public android.net.wifi.SupplicantState unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SupplicantState#describeContents()");
    }

    public static boolean isValidState(com.micklab.dcg.wrapper.android.net.wifi.SupplicantState arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SupplicantState#isValidState(android.net.wifi.SupplicantState)");
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.SupplicantState valueOf(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SupplicantState#valueOf(java.lang.String)");
    }

    public static android.net.wifi.SupplicantState[] values() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SupplicantState#values()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SupplicantState#writeToParcel(android.os.Parcel,int)");
    }


}
