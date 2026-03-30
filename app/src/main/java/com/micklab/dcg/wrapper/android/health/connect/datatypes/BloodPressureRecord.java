// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BloodPressureRecord {
    private final android.health.connect.datatypes.BloodPressureRecord real;

    public BloodPressureRecord(android.health.connect.datatypes.BloodPressureRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord wrap(android.health.connect.datatypes.BloodPressureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord(real);
    }

    public android.health.connect.datatypes.BloodPressureRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getBodyPosition() {
        return real.getBodyPosition();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure getDiastolic() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure.wrap(real.getDiastolic());
    }

    public int getMeasurementLocation() {
        return real.getMeasurementLocation();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure getSystolic() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure.wrap(real.getSystolic());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class BloodPressureMeasurementLocation {
        private final android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation real;

        public BloodPressureMeasurementLocation(android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation wrap(android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation(real);
        }

        public android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation unwrap() {
            return real;
        }

        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_UPPER_ARM = android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation.BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_UPPER_ARM;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_WRIST = android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation.BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_WRIST;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_UPPER_ARM = android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation.BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_UPPER_ARM;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_WRIST = android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation.BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_WRIST;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_UNKNOWN = android.health.connect.datatypes.BloodPressureRecord.BloodPressureMeasurementLocation.BLOOD_PRESSURE_MEASUREMENT_LOCATION_UNKNOWN;

    }
    public static final class BodyPosition {
        private final android.health.connect.datatypes.BloodPressureRecord.BodyPosition real;

        public BodyPosition(android.health.connect.datatypes.BloodPressureRecord.BodyPosition real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.BodyPosition wrap(android.health.connect.datatypes.BloodPressureRecord.BodyPosition real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.BodyPosition(real);
        }

        public android.health.connect.datatypes.BloodPressureRecord.BodyPosition unwrap() {
            return real;
        }

        public static final int BODY_POSITION_LYING_DOWN = android.health.connect.datatypes.BloodPressureRecord.BodyPosition.BODY_POSITION_LYING_DOWN;
        public static final int BODY_POSITION_RECLINING = android.health.connect.datatypes.BloodPressureRecord.BodyPosition.BODY_POSITION_RECLINING;
        public static final int BODY_POSITION_SITTING_DOWN = android.health.connect.datatypes.BloodPressureRecord.BodyPosition.BODY_POSITION_SITTING_DOWN;
        public static final int BODY_POSITION_STANDING_UP = android.health.connect.datatypes.BloodPressureRecord.BodyPosition.BODY_POSITION_STANDING_UP;
        public static final int BODY_POSITION_UNKNOWN = android.health.connect.datatypes.BloodPressureRecord.BodyPosition.BODY_POSITION_UNKNOWN;

    }
    public static final class Builder {
        private final android.health.connect.datatypes.BloodPressureRecord.Builder real;

        public Builder(android.health.connect.datatypes.BloodPressureRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder wrap(android.health.connect.datatypes.BloodPressureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder(real);
        }

        public android.health.connect.datatypes.BloodPressureRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure arg3, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Pressure arg4, int arg5) {
            this(new android.health.connect.datatypes.BloodPressureRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodPressureRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
