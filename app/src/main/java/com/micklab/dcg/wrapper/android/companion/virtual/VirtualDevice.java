// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion.virtual;

public final class VirtualDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VirtualDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice wrap(android.companion.virtual.VirtualDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice(real, (__DcgwBridgeToken) null);
    }

    public android.companion.virtual.VirtualDevice getReal() {
        return (android.companion.virtual.VirtualDevice) real;
    }

    public android.companion.virtual.VirtualDevice unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.virtual.VirtualDevice) real).describeContents();
    }

    public int getDeviceId() {
        return ((android.companion.virtual.VirtualDevice) real).getDeviceId();
    }

    public int[] getDisplayIds() {
        return ((android.companion.virtual.VirtualDevice) real).getDisplayIds();
    }

    public java.lang.CharSequence getDisplayName() {
        return ((android.companion.virtual.VirtualDevice) real).getDisplayName();
    }

    public java.lang.String getName() {
        return ((android.companion.virtual.VirtualDevice) real).getName();
    }

    public java.lang.String getPersistentDeviceId() {
        return ((android.companion.virtual.VirtualDevice) real).getPersistentDeviceId();
    }

    public boolean hasCustomSensorSupport() {
        return ((android.companion.virtual.VirtualDevice) real).hasCustomSensorSupport();
    }

    public java.lang.String toString() {
        return ((android.companion.virtual.VirtualDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.virtual.VirtualDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
