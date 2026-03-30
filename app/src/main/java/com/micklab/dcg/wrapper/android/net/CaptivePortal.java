// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class CaptivePortal {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaptivePortal(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.CaptivePortal wrap(android.net.CaptivePortal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.CaptivePortal(real, (__DcgwBridgeToken) null);
    }

    public android.net.CaptivePortal getReal() {
        return (android.net.CaptivePortal) real;
    }

    public android.net.CaptivePortal unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.CaptivePortal#describeContents()");
    }

    public void ignoreNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.CaptivePortal#ignoreNetwork()");
    }

    public void reportCaptivePortalDismissed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.CaptivePortal#reportCaptivePortalDismissed()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.CaptivePortal#writeToParcel(android.os.Parcel,int)");
    }


}
