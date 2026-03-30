// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseStep {
    private final android.health.connect.datatypes.PlannedExerciseStep real;

    public PlannedExerciseStep(android.health.connect.datatypes.PlannedExerciseStep real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep wrap(android.health.connect.datatypes.PlannedExerciseStep real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep(real);
    }

    public android.health.connect.datatypes.PlannedExerciseStep unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal getCompletionGoal() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.wrap(real.getCompletionGoal());
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public int getExerciseCategory() {
        return real.getExerciseCategory();
    }

    public int getExerciseType() {
        return real.getExerciseType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final int EXERCISE_CATEGORY_ACTIVE = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_ACTIVE;
    public static final int EXERCISE_CATEGORY_COOLDOWN = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_COOLDOWN;
    public static final int EXERCISE_CATEGORY_RECOVERY = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_RECOVERY;
    public static final int EXERCISE_CATEGORY_REST = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_REST;
    public static final int EXERCISE_CATEGORY_UNKNOWN = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_UNKNOWN;
    public static final int EXERCISE_CATEGORY_WARMUP = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_WARMUP;

    public static final class Builder {
        private final android.health.connect.datatypes.PlannedExerciseStep.Builder real;

        public Builder(android.health.connect.datatypes.PlannedExerciseStep.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder wrap(android.health.connect.datatypes.PlannedExerciseStep.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder(real);
        }

        public android.health.connect.datatypes.PlannedExerciseStep.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal arg2) {
            this(new android.health.connect.datatypes.PlannedExerciseStep.Builder(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder addPerformanceGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExercisePerformanceGoal arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.addPerformanceGoal(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder clearPerformanceGoals() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.clearPerformanceGoals());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setCompletionGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.setCompletionGoal(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseCategory(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.setExerciseCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(real.setExerciseType(arg0));
        }

    }
}
