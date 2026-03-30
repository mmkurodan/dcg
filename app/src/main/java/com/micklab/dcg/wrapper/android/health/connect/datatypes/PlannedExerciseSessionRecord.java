// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseSessionRecord {
    private final android.health.connect.datatypes.PlannedExerciseSessionRecord real;

    public PlannedExerciseSessionRecord(android.health.connect.datatypes.PlannedExerciseSessionRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord wrap(android.health.connect.datatypes.PlannedExerciseSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord(real);
    }

    public android.health.connect.datatypes.PlannedExerciseSessionRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getCompletedExerciseSessionId() {
        return real.getCompletedExerciseSessionId();
    }

    public java.time.Duration getDuration() {
        return real.getDuration();
    }

    public int getExerciseType() {
        return real.getExerciseType();
    }

    public java.lang.CharSequence getNotes() {
        return real.getNotes();
    }

    public java.time.LocalDate getStartDate() {
        return real.getStartDate();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public boolean hasExplicitTime() {
        return real.hasExplicitTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder real;

        public Builder(android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder wrap(android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(real);
        }

        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, int arg1, java.time.Instant arg2, java.time.Instant arg3) {
            this(new android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, int arg1, java.time.LocalDate arg2, java.time.Duration arg3) {
            this(new android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder addBlock(com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.addBlock(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearBlocks() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.clearBlocks());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setExerciseType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setExerciseType(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setMetadata(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setMetadata(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setStartTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(real.setTitle(arg0));
        }

    }
}
