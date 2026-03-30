// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class WifiSsidPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiSsidPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy wrap(android.app.admin.WifiSsidPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.WifiSsidPolicy getReal() {
        return (android.app.admin.WifiSsidPolicy) real;
    }

    public android.app.admin.WifiSsidPolicy unwrap() {
        return getReal();
    }

    public WifiSsidPolicy(int arg0, java.util.Set arg1) {
        this(new android.app.admin.WifiSsidPolicy(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.admin.WifiSsidPolicy) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.WifiSsidPolicy) real).equals(arg0);
    }

    public int getPolicyType() {
        return ((android.app.admin.WifiSsidPolicy) real).getPolicyType();
    }

    public int hashCode() {
        return ((android.app.admin.WifiSsidPolicy) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.WifiSsidPolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int WIFI_SSID_POLICY_TYPE_ALLOWLIST = android.app.admin.WifiSsidPolicy.WIFI_SSID_POLICY_TYPE_ALLOWLIST;
    public static final int WIFI_SSID_POLICY_TYPE_DENYLIST = android.app.admin.WifiSsidPolicy.WIFI_SSID_POLICY_TYPE_DENYLIST;

}
