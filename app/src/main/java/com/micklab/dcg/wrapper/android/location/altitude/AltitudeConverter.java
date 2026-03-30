// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location.altitude;

public final class AltitudeConverter {
    private final android.location.altitude.AltitudeConverter real;

    public AltitudeConverter(android.location.altitude.AltitudeConverter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.altitude.AltitudeConverter wrap(android.location.altitude.AltitudeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.altitude.AltitudeConverter(real);
    }

    public android.location.altitude.AltitudeConverter unwrap() {
        return real;
    }

    public AltitudeConverter() {
        this(new android.location.altitude.AltitudeConverter());
    }

    public void addMslAltitudeToLocation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.location.Location arg1) throws java.io.IOException {
        real.addMslAltitudeToLocation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean tryAddMslAltitudeToLocation(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return real.tryAddMslAltitudeToLocation(arg0 == null ? null : arg0.unwrap());
    }

}
