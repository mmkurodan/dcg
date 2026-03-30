// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class OverlayProperties {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverlayProperties(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.OverlayProperties wrap(android.hardware.OverlayProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.OverlayProperties(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.OverlayProperties getReal() {
        return (android.hardware.OverlayProperties) real;
    }

    public android.hardware.OverlayProperties unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.OverlayProperties) real).describeContents();
    }

    public boolean isCombinationSupported(int arg0, int arg1) {
        return ((android.hardware.OverlayProperties) real).isCombinationSupported(arg0, arg1);
    }

    public boolean isMixedColorSpacesSupported() {
        return ((android.hardware.OverlayProperties) real).isMixedColorSpacesSupported();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.OverlayProperties) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
