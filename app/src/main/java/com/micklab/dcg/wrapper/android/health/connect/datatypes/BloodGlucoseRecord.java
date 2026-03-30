// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BloodGlucoseRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BloodGlucoseRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord wrap(android.health.connect.datatypes.BloodGlucoseRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BloodGlucoseRecord getReal() {
        return (android.health.connect.datatypes.BloodGlucoseRecord) real;
    }

    public android.health.connect.datatypes.BloodGlucoseRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BloodGlucoseRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose getLevel() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose.wrap(((android.health.connect.datatypes.BloodGlucoseRecord) real).getLevel());
    }

    public int getMealType() {
        return ((android.health.connect.datatypes.BloodGlucoseRecord) real).getMealType();
    }

    public int getRelationToMeal() {
        return ((android.health.connect.datatypes.BloodGlucoseRecord) real).getRelationToMeal();
    }

    public int getSpecimenSource() {
        return ((android.health.connect.datatypes.BloodGlucoseRecord) real).getSpecimenSource();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BloodGlucoseRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder wrap(android.health.connect.datatypes.BloodGlucoseRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.Builder getReal() {
            return (android.health.connect.datatypes.BloodGlucoseRecord.Builder) real;
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose arg3, int arg4, int arg5) {
            this(new android.health.connect.datatypes.BloodGlucoseRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.wrap(((android.health.connect.datatypes.BloodGlucoseRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder.wrap(((android.health.connect.datatypes.BloodGlucoseRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder.wrap(((android.health.connect.datatypes.BloodGlucoseRecord.Builder) real).setZoneOffset(arg0));
        }

    }
    public static final class RelationToMealType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RelationToMealType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType wrap(android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType getReal() {
            return (android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType) real;
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType unwrap() {
            return getReal();
        }

        public static final int RELATION_TO_MEAL_AFTER_MEAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_AFTER_MEAL;
        public static final int RELATION_TO_MEAL_BEFORE_MEAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_BEFORE_MEAL;
        public static final int RELATION_TO_MEAL_FASTING = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_FASTING;
        public static final int RELATION_TO_MEAL_GENERAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_GENERAL;
        public static final int RELATION_TO_MEAL_UNKNOWN = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_UNKNOWN;

    }
    public static final class SpecimenSource {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpecimenSource(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource wrap(android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource getReal() {
            return (android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource) real;
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource unwrap() {
            return getReal();
        }

        public static final int SPECIMEN_SOURCE_CAPILLARY_BLOOD = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_CAPILLARY_BLOOD;
        public static final int SPECIMEN_SOURCE_INTERSTITIAL_FLUID = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_INTERSTITIAL_FLUID;
        public static final int SPECIMEN_SOURCE_PLASMA = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_PLASMA;
        public static final int SPECIMEN_SOURCE_SERUM = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_SERUM;
        public static final int SPECIMEN_SOURCE_TEARS = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_TEARS;
        public static final int SPECIMEN_SOURCE_UNKNOWN = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_UNKNOWN;
        public static final int SPECIMEN_SOURCE_WHOLE_BLOOD = android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource.SPECIMEN_SOURCE_WHOLE_BLOOD;

    }
}
