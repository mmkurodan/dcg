// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseSessionRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExerciseSessionRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord wrap(android.health.connect.datatypes.ExerciseSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ExerciseSessionRecord getReal() {
        return (android.health.connect.datatypes.ExerciseSessionRecord) real;
    }

    public android.health.connect.datatypes.ExerciseSessionRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).equals(arg0);
    }

    public int getExerciseType() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).getExerciseType();
    }

    public java.lang.CharSequence getNotes() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).getNotes();
    }

    public java.lang.String getPlannedExerciseSessionId() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).getPlannedExerciseSessionId();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute getRoute() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute.wrap(((android.health.connect.datatypes.ExerciseSessionRecord) real).getRoute());
    }

    public java.lang.CharSequence getTitle() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).getTitle();
    }

    public boolean hasRoute() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).hasRoute();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ExerciseSessionRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder wrap(android.health.connect.datatypes.ExerciseSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ExerciseSessionRecord.Builder getReal() {
            return (android.health.connect.datatypes.ExerciseSessionRecord.Builder) real;
        }

        public android.health.connect.datatypes.ExerciseSessionRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, int arg3) {
            this(new android.health.connect.datatypes.ExerciseSessionRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setPlannedExerciseSessionId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setPlannedExerciseSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setRoute(com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseRoute arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setRoute(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSessionRecord.Builder.wrap(((android.health.connect.datatypes.ExerciseSessionRecord.Builder) real).setTitle(arg0));
        }

    }
}
