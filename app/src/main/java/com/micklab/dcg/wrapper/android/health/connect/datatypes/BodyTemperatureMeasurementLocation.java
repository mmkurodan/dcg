// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyTemperatureMeasurementLocation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BodyTemperatureMeasurementLocation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureMeasurementLocation wrap(android.health.connect.datatypes.BodyTemperatureMeasurementLocation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureMeasurementLocation(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BodyTemperatureMeasurementLocation getReal() {
        return (android.health.connect.datatypes.BodyTemperatureMeasurementLocation) real;
    }

    public android.health.connect.datatypes.BodyTemperatureMeasurementLocation unwrap() {
        return getReal();
    }

    public static final int MEASUREMENT_LOCATION_ARMPIT = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_ARMPIT;
    public static final int MEASUREMENT_LOCATION_EAR = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_EAR;
    public static final int MEASUREMENT_LOCATION_FINGER = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_FINGER;
    public static final int MEASUREMENT_LOCATION_FOREHEAD = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_FOREHEAD;
    public static final int MEASUREMENT_LOCATION_MOUTH = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_MOUTH;
    public static final int MEASUREMENT_LOCATION_RECTUM = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_RECTUM;
    public static final int MEASUREMENT_LOCATION_TEMPORAL_ARTERY = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_TEMPORAL_ARTERY;
    public static final int MEASUREMENT_LOCATION_TOE = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_TOE;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_UNKNOWN;
    public static final int MEASUREMENT_LOCATION_VAGINA = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_VAGINA;
    public static final int MEASUREMENT_LOCATION_WRIST = android.health.connect.datatypes.BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_WRIST;

}
