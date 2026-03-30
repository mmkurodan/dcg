// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseLap {
    private final android.health.connect.datatypes.ExerciseLap real;

    public ExerciseLap(android.health.connect.datatypes.ExerciseLap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap wrap(android.health.connect.datatypes.ExerciseLap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap(real);
    }

    public android.health.connect.datatypes.ExerciseLap unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return real.getEndTime();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getLength() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getLength());
    }

    public java.time.Instant getStartTime() {
        return real.getStartTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.ExerciseLap.Builder real;

        public Builder(android.health.connect.datatypes.ExerciseLap.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder wrap(android.health.connect.datatypes.ExerciseLap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder(real);
        }

        public android.health.connect.datatypes.ExerciseLap.Builder unwrap() {
            return real;
        }

        public Builder(java.time.Instant arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.ExerciseLap.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder setLength(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder.wrap(real.setLength(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
