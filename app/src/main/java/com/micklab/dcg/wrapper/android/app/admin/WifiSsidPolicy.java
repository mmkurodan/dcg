// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class WifiSsidPolicy {
    private final android.app.admin.WifiSsidPolicy real;

    public WifiSsidPolicy(android.app.admin.WifiSsidPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy wrap(android.app.admin.WifiSsidPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy(real);
    }

    public android.app.admin.WifiSsidPolicy unwrap() {
        return real;
    }

    public WifiSsidPolicy(int arg0, java.util.Set arg1) {
        this(new android.app.admin.WifiSsidPolicy(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getPolicyType() {
        return real.getPolicyType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int WIFI_SSID_POLICY_TYPE_ALLOWLIST = android.app.admin.WifiSsidPolicy.WIFI_SSID_POLICY_TYPE_ALLOWLIST;
    public static final int WIFI_SSID_POLICY_TYPE_DENYLIST = android.app.admin.WifiSsidPolicy.WIFI_SSID_POLICY_TYPE_DENYLIST;

}
