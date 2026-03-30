// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseStep {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlannedExerciseStep(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep wrap(android.health.connect.datatypes.PlannedExerciseStep real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.PlannedExerciseStep getReal() {
        return (android.health.connect.datatypes.PlannedExerciseStep) real;
    }

    public android.health.connect.datatypes.PlannedExerciseStep unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.PlannedExerciseStep) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal getCompletionGoal() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.wrap(((android.health.connect.datatypes.PlannedExerciseStep) real).getCompletionGoal());
    }

    public java.lang.CharSequence getDescription() {
        return ((android.health.connect.datatypes.PlannedExerciseStep) real).getDescription();
    }

    public int getExerciseCategory() {
        return ((android.health.connect.datatypes.PlannedExerciseStep) real).getExerciseCategory();
    }

    public int getExerciseType() {
        return ((android.health.connect.datatypes.PlannedExerciseStep) real).getExerciseType();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.PlannedExerciseStep) real).hashCode();
    }

    public static final int EXERCISE_CATEGORY_ACTIVE = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_ACTIVE;
    public static final int EXERCISE_CATEGORY_COOLDOWN = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_COOLDOWN;
    public static final int EXERCISE_CATEGORY_RECOVERY = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_RECOVERY;
    public static final int EXERCISE_CATEGORY_REST = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_REST;
    public static final int EXERCISE_CATEGORY_UNKNOWN = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_UNKNOWN;
    public static final int EXERCISE_CATEGORY_WARMUP = android.health.connect.datatypes.PlannedExerciseStep.EXERCISE_CATEGORY_WARMUP;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder wrap(android.health.connect.datatypes.PlannedExerciseStep.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.PlannedExerciseStep.Builder getReal() {
            return (android.health.connect.datatypes.PlannedExerciseStep.Builder) real;
        }

        public android.health.connect.datatypes.PlannedExerciseStep.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal arg2) {
            this(new android.health.connect.datatypes.PlannedExerciseStep.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder addPerformanceGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExercisePerformanceGoal arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).addPerformanceGoal(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder clearPerformanceGoals() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).clearPerformanceGoals());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setCompletionGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).setCompletionGoal(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseCategory(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).setExerciseCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseStep.Builder) real).setExerciseType(arg0));
        }

    }
}
