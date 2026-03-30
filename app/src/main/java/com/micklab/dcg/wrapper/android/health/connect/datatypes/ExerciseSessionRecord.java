// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseSessionRecord {
    private final android.health.connect.datatypes.ExerciseSessionRecord real;

    public ExerciseSessionRecord(android.health.connect.datatypes.ExerciseSessionRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord wrap(android.health.connect.datatypes.ExerciseSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord(real);
    }

    public android.health.connect.datatypes.ExerciseSessionRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getExerciseType() {
        return real.getExerciseType();
    }

    public java.lang.CharSequence getNotes() {
        return real.getNotes();
    }

    public java.lang.String getPlannedExerciseSessionId() {
        return real.getPlannedExerciseSessionId();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute getRoute() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.wrap(real.getRoute());
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public boolean hasRoute() {
        return real.hasRoute();
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.ExerciseSessionRecord.Builder real;

        public Builder(android.health.connect.datatypes.ExerciseSessionRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder wrap(android.health.connect.datatypes.ExerciseSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder(real);
        }

        public android.health.connect.datatypes.ExerciseSessionRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, int arg3) {
            this(new android.health.connect.datatypes.ExerciseSessionRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setPlannedExerciseSessionId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setPlannedExerciseSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setRoute(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setRoute(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(real.setTitle(arg0));
        }

    }
}
