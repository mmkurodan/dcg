// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class Light {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Light(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.Light wrap(android.hardware.lights.Light real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.Light(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.lights.Light getReal() {
        return (android.hardware.lights.Light) real;
    }

    public android.hardware.lights.Light unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.lights.Light) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.lights.Light) real).equals(arg0);
    }

    public int getId() {
        return ((android.hardware.lights.Light) real).getId();
    }

    public java.lang.String getName() {
        return ((android.hardware.lights.Light) real).getName();
    }

    public int getOrdinal() {
        return ((android.hardware.lights.Light) real).getOrdinal();
    }

    public int getType() {
        return ((android.hardware.lights.Light) real).getType();
    }

    public boolean hasBrightnessControl() {
        return ((android.hardware.lights.Light) real).hasBrightnessControl();
    }

    public boolean hasRgbControl() {
        return ((android.hardware.lights.Light) real).hasRgbControl();
    }

    public int hashCode() {
        return ((android.hardware.lights.Light) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.lights.Light) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.lights.Light) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int LIGHT_CAPABILITY_BRIGHTNESS = android.hardware.lights.Light.LIGHT_CAPABILITY_BRIGHTNESS;
    public static final int LIGHT_CAPABILITY_COLOR_RGB = android.hardware.lights.Light.LIGHT_CAPABILITY_COLOR_RGB;
    public static final int LIGHT_CAPABILITY_RGB = android.hardware.lights.Light.LIGHT_CAPABILITY_RGB;
    public static final int LIGHT_TYPE_INPUT = android.hardware.lights.Light.LIGHT_TYPE_INPUT;
    public static final int LIGHT_TYPE_KEYBOARD_BACKLIGHT = android.hardware.lights.Light.LIGHT_TYPE_KEYBOARD_BACKLIGHT;
    public static final int LIGHT_TYPE_MICROPHONE = android.hardware.lights.Light.LIGHT_TYPE_MICROPHONE;
    public static final int LIGHT_TYPE_PLAYER_ID = android.hardware.lights.Light.LIGHT_TYPE_PLAYER_ID;

}
