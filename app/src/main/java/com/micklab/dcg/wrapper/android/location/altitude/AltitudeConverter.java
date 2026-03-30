// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location.altitude;

public final class AltitudeConverter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AltitudeConverter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.altitude.AltitudeConverter wrap(android.location.altitude.AltitudeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.altitude.AltitudeConverter(real, (__DcgwBridgeToken) null);
    }

    public android.location.altitude.AltitudeConverter getReal() {
        return (android.location.altitude.AltitudeConverter) real;
    }

    public android.location.altitude.AltitudeConverter unwrap() {
        return getReal();
    }

    public AltitudeConverter() {
        this(new android.location.altitude.AltitudeConverter(), (__DcgwBridgeToken) null);
    }

    public void addMslAltitudeToLocation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.location.Location arg1) throws java.io.IOException {
        ((android.location.altitude.AltitudeConverter) real).addMslAltitudeToLocation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean tryAddMslAltitudeToLocation(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return ((android.location.altitude.AltitudeConverter) real).tryAddMslAltitudeToLocation(arg0 == null ? null : arg0.getReal());
    }

}
