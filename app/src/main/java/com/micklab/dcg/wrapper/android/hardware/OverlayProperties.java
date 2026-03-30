// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class OverlayProperties {
    private final android.hardware.OverlayProperties real;

    public OverlayProperties(android.hardware.OverlayProperties real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.OverlayProperties wrap(android.hardware.OverlayProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.OverlayProperties(real);
    }

    public android.hardware.OverlayProperties unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean isCombinationSupported(int arg0, int arg1) {
        return real.isCombinationSupported(arg0, arg1);
    }

    public boolean isMixedColorSpacesSupported() {
        return real.isMixedColorSpacesSupported();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
