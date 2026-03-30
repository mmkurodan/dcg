// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseSegment {
    private final android.health.connect.datatypes.ExerciseSegment real;

    public ExerciseSegment(android.health.connect.datatypes.ExerciseSegment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment wrap(android.health.connect.datatypes.ExerciseSegment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment(real);
    }

    public android.health.connect.datatypes.ExerciseSegment unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return real.getEndTime();
    }

    public int getRepetitionsCount() {
        return real.getRepetitionsCount();
    }

    public int getSegmentType() {
        return real.getSegmentType();
    }

    public java.time.Instant getStartTime() {
        return real.getStartTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.ExerciseSegment.Builder real;

        public Builder(android.health.connect.datatypes.ExerciseSegment.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder wrap(android.health.connect.datatypes.ExerciseSegment.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder(real);
        }

        public android.health.connect.datatypes.ExerciseSegment.Builder unwrap() {
            return real;
        }

        public Builder(java.time.Instant arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.ExerciseSegment.Builder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder setRepetitionsCount(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder.wrap(real.setRepetitionsCount(arg0));
        }

    }
}
