// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class GeomagneticField {
    private final android.hardware.GeomagneticField real;

    public GeomagneticField(android.hardware.GeomagneticField real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.GeomagneticField wrap(android.hardware.GeomagneticField real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.GeomagneticField(real);
    }

    public android.hardware.GeomagneticField unwrap() {
        return real;
    }

    public GeomagneticField(float arg0, float arg1, float arg2, long arg3) {
        this(new android.hardware.GeomagneticField(arg0, arg1, arg2, arg3));
    }

    public float getDeclination() {
        return real.getDeclination();
    }

    public float getFieldStrength() {
        return real.getFieldStrength();
    }

    public float getHorizontalStrength() {
        return real.getHorizontalStrength();
    }

    public float getInclination() {
        return real.getInclination();
    }

    public float getX() {
        return real.getX();
    }

    public float getY() {
        return real.getY();
    }

    public float getZ() {
        return real.getZ();
    }

}
