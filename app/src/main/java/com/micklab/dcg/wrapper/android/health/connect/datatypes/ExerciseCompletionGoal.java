// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseCompletionGoal {
    private final android.health.connect.datatypes.ExerciseCompletionGoal real;

    public ExerciseCompletionGoal(android.health.connect.datatypes.ExerciseCompletionGoal real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal(real);
    }

    public android.health.connect.datatypes.ExerciseCompletionGoal unwrap() {
        return real;
    }

    public static final class ActiveCaloriesBurnedGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal real;

        public ActiveCaloriesBurnedGoal(android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal unwrap() {
            return real;
        }

        public ActiveCaloriesBurnedGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(arg0 == null ? null : arg0.unwrap()));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy getActiveCalories() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(real.getActiveCalories());
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class DistanceGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal real;

        public DistanceGoal(android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal unwrap() {
            return real;
        }

        public DistanceGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.DistanceGoal(arg0 == null ? null : arg0.unwrap()));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getDistance() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getDistance());
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class DistanceWithVariableRestGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal real;

        public DistanceWithVariableRestGoal(android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal unwrap() {
            return real;
        }

        public DistanceWithVariableRestGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0, java.time.Duration arg1) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.DistanceWithVariableRestGoal(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getDistance() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getDistance());
        }

        public java.time.Duration getDuration() {
            return real.getDuration();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class DurationGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal real;

        public DurationGoal(android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal unwrap() {
            return real;
        }

        public DurationGoal(java.time.Duration arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.DurationGoal(arg0));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.time.Duration getDuration() {
            return real.getDuration();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class RepetitionsGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal real;

        public RepetitionsGoal(android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal unwrap() {
            return real;
        }

        public RepetitionsGoal(int arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.RepetitionsGoal(arg0));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getRepetitions() {
            return real.getRepetitions();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class StepsGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal real;

        public StepsGoal(android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal unwrap() {
            return real;
        }

        public StepsGoal(int arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.StepsGoal(arg0));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getSteps() {
            return real.getSteps();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class TotalCaloriesBurnedGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal real;

        public TotalCaloriesBurnedGoal(android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal unwrap() {
            return real;
        }

        public TotalCaloriesBurnedGoal(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg0) {
            this(new android.health.connect.datatypes.ExerciseCompletionGoal.TotalCaloriesBurnedGoal(arg0 == null ? null : arg0.unwrap()));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy getTotalCalories() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(real.getTotalCalories());
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class UnknownGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal real;

        public UnknownGoal(android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal INSTANCE = com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal.wrap(android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal.INSTANCE);

    }
    public static final class UnspecifiedGoal {
        private final android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal real;

        public UnspecifiedGoal(android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal wrap(android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal(real);
        }

        public android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal INSTANCE = com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal.wrap(android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal.INSTANCE);

    }
}
