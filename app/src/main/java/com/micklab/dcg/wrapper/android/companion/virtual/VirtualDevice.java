// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion.virtual;

public final class VirtualDevice {
    private final android.companion.virtual.VirtualDevice real;

    public VirtualDevice(android.companion.virtual.VirtualDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice wrap(android.companion.virtual.VirtualDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice(real);
    }

    public android.companion.virtual.VirtualDevice unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public int[] getDisplayIds() {
        return real.getDisplayIds();
    }

    public java.lang.CharSequence getDisplayName() {
        return real.getDisplayName();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String getPersistentDeviceId() {
        return real.getPersistentDeviceId();
    }

    public boolean hasCustomSensorSupport() {
        return real.hasCustomSensorSupport();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
