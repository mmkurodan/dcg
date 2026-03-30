// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseSessionRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlannedExerciseSessionRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord wrap(android.health.connect.datatypes.PlannedExerciseSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.PlannedExerciseSessionRecord getReal() {
        return (android.health.connect.datatypes.PlannedExerciseSessionRecord) real;
    }

    public android.health.connect.datatypes.PlannedExerciseSessionRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).equals(arg0);
    }

    public java.lang.String getCompletedExerciseSessionId() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getCompletedExerciseSessionId();
    }

    public java.time.Duration getDuration() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getDuration();
    }

    public int getExerciseType() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getExerciseType();
    }

    public java.lang.CharSequence getNotes() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getNotes();
    }

    public java.time.LocalDate getStartDate() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getStartDate();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).getTitle();
    }

    public boolean hasExplicitTime() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).hasExplicitTime();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.PlannedExerciseSessionRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder wrap(android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder getReal() {
            return (android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real;
        }

        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, int arg1, java.time.Instant arg2, java.time.Instant arg3) {
            this(new android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, int arg1, java.time.LocalDate arg2, java.time.Duration arg3) {
            this(new android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder addBlock(com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).addBlock(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearBlocks() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).clearBlocks());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setExerciseType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setExerciseType(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setMetadata(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setMetadata(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setStartTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder) real).setTitle(arg0));
        }

    }
}
