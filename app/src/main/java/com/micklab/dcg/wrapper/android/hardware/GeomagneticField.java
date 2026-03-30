// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class GeomagneticField {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GeomagneticField(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.GeomagneticField wrap(android.hardware.GeomagneticField real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.GeomagneticField(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.GeomagneticField getReal() {
        return (android.hardware.GeomagneticField) real;
    }

    public android.hardware.GeomagneticField unwrap() {
        return getReal();
    }

    public GeomagneticField(float arg0, float arg1, float arg2, long arg3) {
        this(new android.hardware.GeomagneticField(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public float getDeclination() {
        return ((android.hardware.GeomagneticField) real).getDeclination();
    }

    public float getFieldStrength() {
        return ((android.hardware.GeomagneticField) real).getFieldStrength();
    }

    public float getHorizontalStrength() {
        return ((android.hardware.GeomagneticField) real).getHorizontalStrength();
    }

    public float getInclination() {
        return ((android.hardware.GeomagneticField) real).getInclination();
    }

    public float getX() {
        return ((android.hardware.GeomagneticField) real).getX();
    }

    public float getY() {
        return ((android.hardware.GeomagneticField) real).getY();
    }

    public float getZ() {
        return ((android.hardware.GeomagneticField) real).getZ();
    }

}
