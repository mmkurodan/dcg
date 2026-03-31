// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class AppInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.AppInfo wrap(android.adservices.ondevicepersonalization.AppInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.AppInfo(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.AppInfo getReal() {
        return (android.adservices.ondevicepersonalization.AppInfo) real;
    }

    public android.adservices.ondevicepersonalization.AppInfo unwrap() {
        return getReal();
    }

    public AppInfo(boolean arg0) {
        this(new android.adservices.ondevicepersonalization.AppInfo(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.AppInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.AppInfo) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.AppInfo) real).hashCode();
    }

    public boolean isInstalled() {
        return ((android.adservices.ondevicepersonalization.AppInfo) real).isInstalled();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.AppInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
