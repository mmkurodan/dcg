// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ActiveCaloriesBurnedRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActiveCaloriesBurnedRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord wrap(android.health.connect.datatypes.ActiveCaloriesBurnedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ActiveCaloriesBurnedRecord getReal() {
        return (android.health.connect.datatypes.ActiveCaloriesBurnedRecord) real;
    }

    public android.health.connect.datatypes.ActiveCaloriesBurnedRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ActiveCaloriesBurnedRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy getEnergy() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord) real).getEnergy());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ActiveCaloriesBurnedRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder wrap(android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder getReal() {
            return (android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real;
        }

        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg3) {
            this(new android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(((android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
