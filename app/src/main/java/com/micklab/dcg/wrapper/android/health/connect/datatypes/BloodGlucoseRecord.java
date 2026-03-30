// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BloodGlucoseRecord {
    private final android.health.connect.datatypes.BloodGlucoseRecord real;

    public BloodGlucoseRecord(android.health.connect.datatypes.BloodGlucoseRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord wrap(android.health.connect.datatypes.BloodGlucoseRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord(real);
    }

    public android.health.connect.datatypes.BloodGlucoseRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose getLevel() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose.wrap(real.getLevel());
    }

    public int getMealType() {
        return real.getMealType();
    }

    public int getRelationToMeal() {
        return real.getRelationToMeal();
    }

    public int getSpecimenSource() {
        return real.getSpecimenSource();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.BloodGlucoseRecord.Builder real;

        public Builder(android.health.connect.datatypes.BloodGlucoseRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder wrap(android.health.connect.datatypes.BloodGlucoseRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder(real);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.BloodGlucose arg3, int arg4, int arg5) {
            this(new android.health.connect.datatypes.BloodGlucoseRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class RelationToMealType {
        private final android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType real;

        public RelationToMealType(android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType wrap(android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType(real);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType unwrap() {
            return real;
        }

        public static final int RELATION_TO_MEAL_AFTER_MEAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_AFTER_MEAL;
        public static final int RELATION_TO_MEAL_BEFORE_MEAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_BEFORE_MEAL;
        public static final int RELATION_TO_MEAL_FASTING = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_FASTING;
        public static final int RELATION_TO_MEAL_GENERAL = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_GENERAL;
        public static final int RELATION_TO_MEAL_UNKNOWN = android.health.connect.datatypes.BloodGlucoseRecord.RelationToMealType.RELATION_TO_MEAL_UNKNOWN;

    }
    public static final class SpecimenSource {
        private final android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource real;

        public SpecimenSource(android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource wrap(android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource(real);
        }

        public android.health.connect.datatypes.BloodGlucoseRecord.SpecimenSource unwrap() {
            return real;
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
