// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseBlock {
    private final android.health.connect.datatypes.PlannedExerciseBlock real;

    public PlannedExerciseBlock(android.health.connect.datatypes.PlannedExerciseBlock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock wrap(android.health.connect.datatypes.PlannedExerciseBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock(real);
    }

    public android.health.connect.datatypes.PlannedExerciseBlock unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public int getRepetitions() {
        return real.getRepetitions();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.PlannedExerciseBlock.Builder real;

        public Builder(android.health.connect.datatypes.PlannedExerciseBlock.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder wrap(android.health.connect.datatypes.PlannedExerciseBlock.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder(real);
        }

        public android.health.connect.datatypes.PlannedExerciseBlock.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.health.connect.datatypes.PlannedExerciseBlock.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder addStep(com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(real.addStep(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder clearSteps() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(real.clearSteps());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder setRepetitions(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(real.setRepetitions(arg0));
        }

    }
}
