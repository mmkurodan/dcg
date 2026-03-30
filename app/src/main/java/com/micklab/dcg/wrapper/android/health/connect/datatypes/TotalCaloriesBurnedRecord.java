// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class TotalCaloriesBurnedRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TotalCaloriesBurnedRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord wrap(android.health.connect.datatypes.TotalCaloriesBurnedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.TotalCaloriesBurnedRecord getReal() {
        return (android.health.connect.datatypes.TotalCaloriesBurnedRecord) real;
    }

    public android.health.connect.datatypes.TotalCaloriesBurnedRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.TotalCaloriesBurnedRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy getEnergy() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord) real).getEnergy());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.TotalCaloriesBurnedRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder wrap(android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder getReal() {
            return (android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real;
        }

        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg3) {
            this(new android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
