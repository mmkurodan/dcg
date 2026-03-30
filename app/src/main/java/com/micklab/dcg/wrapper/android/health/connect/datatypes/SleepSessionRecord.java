// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SleepSessionRecord {
    private final android.health.connect.datatypes.SleepSessionRecord real;

    public SleepSessionRecord(android.health.connect.datatypes.SleepSessionRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord wrap(android.health.connect.datatypes.SleepSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord(real);
    }

    public android.health.connect.datatypes.SleepSessionRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.CharSequence getNotes() {
        return real.getNotes();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.SleepSessionRecord.Builder real;

        public Builder(android.health.connect.datatypes.SleepSessionRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder wrap(android.health.connect.datatypes.SleepSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder(real);
        }

        public android.health.connect.datatypes.SleepSessionRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.SleepSessionRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(real.setTitle(arg0));
        }

    }
    public static final class Stage {
        private final android.health.connect.datatypes.SleepSessionRecord.Stage real;

        public Stage(android.health.connect.datatypes.SleepSessionRecord.Stage real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Stage wrap(android.health.connect.datatypes.SleepSessionRecord.Stage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Stage(real);
        }

        public android.health.connect.datatypes.SleepSessionRecord.Stage unwrap() {
            return real;
        }

        public Stage(java.time.Instant arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.SleepSessionRecord.Stage(arg0, arg1, arg2));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.time.Instant getEndTime() {
            return real.getEndTime();
        }

        public java.time.Instant getStartTime() {
            return real.getStartTime();
        }

        public int getType() {
            return real.getType();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class StageType {
        private final android.health.connect.datatypes.SleepSessionRecord.StageType real;

        public StageType(android.health.connect.datatypes.SleepSessionRecord.StageType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.StageType wrap(android.health.connect.datatypes.SleepSessionRecord.StageType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.StageType(real);
        }

        public android.health.connect.datatypes.SleepSessionRecord.StageType unwrap() {
            return real;
        }

        public static final int STAGE_TYPE_AWAKE = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_AWAKE;
        public static final int STAGE_TYPE_AWAKE_IN_BED = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_AWAKE_IN_BED;
        public static final int STAGE_TYPE_AWAKE_OUT_OF_BED = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_AWAKE_OUT_OF_BED;
        public static final int STAGE_TYPE_SLEEPING = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_SLEEPING;
        public static final int STAGE_TYPE_SLEEPING_DEEP = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_SLEEPING_DEEP;
        public static final int STAGE_TYPE_SLEEPING_LIGHT = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_SLEEPING_LIGHT;
        public static final int STAGE_TYPE_SLEEPING_REM = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_SLEEPING_REM;
        public static final int STAGE_TYPE_UNKNOWN = android.health.connect.datatypes.SleepSessionRecord.StageType.STAGE_TYPE_UNKNOWN;

    }
}
