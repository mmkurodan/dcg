// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SleepSessionRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SleepSessionRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord wrap(android.health.connect.datatypes.SleepSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.SleepSessionRecord getReal() {
        return (android.health.connect.datatypes.SleepSessionRecord) real;
    }

    public android.health.connect.datatypes.SleepSessionRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.SleepSessionRecord) real).equals(arg0);
    }

    public java.lang.CharSequence getNotes() {
        return ((android.health.connect.datatypes.SleepSessionRecord) real).getNotes();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.health.connect.datatypes.SleepSessionRecord) real).getTitle();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.SleepSessionRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder wrap(android.health.connect.datatypes.SleepSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SleepSessionRecord.Builder getReal() {
            return (android.health.connect.datatypes.SleepSessionRecord.Builder) real;
        }

        public android.health.connect.datatypes.SleepSessionRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.SleepSessionRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Builder.wrap(((android.health.connect.datatypes.SleepSessionRecord.Builder) real).setTitle(arg0));
        }

    }
    public static final class Stage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Stage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Stage wrap(android.health.connect.datatypes.SleepSessionRecord.Stage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.Stage(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SleepSessionRecord.Stage getReal() {
            return (android.health.connect.datatypes.SleepSessionRecord.Stage) real;
        }

        public android.health.connect.datatypes.SleepSessionRecord.Stage unwrap() {
            return getReal();
        }

        public Stage(java.time.Instant arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.SleepSessionRecord.Stage(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.SleepSessionRecord.Stage) real).equals(arg0);
        }

        public java.time.Instant getEndTime() {
            return ((android.health.connect.datatypes.SleepSessionRecord.Stage) real).getEndTime();
        }

        public java.time.Instant getStartTime() {
            return ((android.health.connect.datatypes.SleepSessionRecord.Stage) real).getStartTime();
        }

        public int getType() {
            return ((android.health.connect.datatypes.SleepSessionRecord.Stage) real).getType();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.SleepSessionRecord.Stage) real).hashCode();
        }

    }
    public static final class StageType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StageType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.StageType wrap(android.health.connect.datatypes.SleepSessionRecord.StageType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SleepSessionRecord.StageType(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SleepSessionRecord.StageType getReal() {
            return (android.health.connect.datatypes.SleepSessionRecord.StageType) real;
        }

        public android.health.connect.datatypes.SleepSessionRecord.StageType unwrap() {
            return getReal();
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
