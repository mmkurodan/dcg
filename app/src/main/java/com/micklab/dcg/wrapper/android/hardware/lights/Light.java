// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class Light {
    private final android.hardware.lights.Light real;

    public Light(android.hardware.lights.Light real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.Light wrap(android.hardware.lights.Light real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.Light(real);
    }

    public android.hardware.lights.Light unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getId() {
        return real.getId();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getOrdinal() {
        return real.getOrdinal();
    }

    public int getType() {
        return real.getType();
    }

    public boolean hasBrightnessControl() {
        return real.hasBrightnessControl();
    }

    public boolean hasRgbControl() {
        return real.hasRgbControl();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int LIGHT_CAPABILITY_BRIGHTNESS = android.hardware.lights.Light.LIGHT_CAPABILITY_BRIGHTNESS;
    public static final int LIGHT_CAPABILITY_COLOR_RGB = android.hardware.lights.Light.LIGHT_CAPABILITY_COLOR_RGB;
    public static final int LIGHT_CAPABILITY_RGB = android.hardware.lights.Light.LIGHT_CAPABILITY_RGB;
    public static final int LIGHT_TYPE_INPUT = android.hardware.lights.Light.LIGHT_TYPE_INPUT;
    public static final int LIGHT_TYPE_KEYBOARD_BACKLIGHT = android.hardware.lights.Light.LIGHT_TYPE_KEYBOARD_BACKLIGHT;
    public static final int LIGHT_TYPE_MICROPHONE = android.hardware.lights.Light.LIGHT_TYPE_MICROPHONE;
    public static final int LIGHT_TYPE_PLAYER_ID = android.hardware.lights.Light.LIGHT_TYPE_PLAYER_ID;

}
