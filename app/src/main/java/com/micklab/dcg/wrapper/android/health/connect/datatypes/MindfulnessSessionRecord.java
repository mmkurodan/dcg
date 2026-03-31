// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MindfulnessSessionRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MindfulnessSessionRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord wrap(android.health.connect.datatypes.MindfulnessSessionRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MindfulnessSessionRecord getReal() {
        return (android.health.connect.datatypes.MindfulnessSessionRecord) real;
    }

    public android.health.connect.datatypes.MindfulnessSessionRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.MindfulnessSessionRecord) real).equals(arg0);
    }

    public int getMindfulnessSessionType() {
        return ((android.health.connect.datatypes.MindfulnessSessionRecord) real).getMindfulnessSessionType();
    }

    public java.lang.CharSequence getNotes() {
        return ((android.health.connect.datatypes.MindfulnessSessionRecord) real).getNotes();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.health.connect.datatypes.MindfulnessSessionRecord) real).getTitle();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.MindfulnessSessionRecord) real).hashCode();
    }

    public static final int MINDFULNESS_SESSION_TYPE_BREATHING = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_BREATHING;
    public static final int MINDFULNESS_SESSION_TYPE_MEDITATION = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_MEDITATION;
    public static final int MINDFULNESS_SESSION_TYPE_MOVEMENT = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_MOVEMENT;
    public static final int MINDFULNESS_SESSION_TYPE_MUSIC = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_MUSIC;
    public static final int MINDFULNESS_SESSION_TYPE_OTHER = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_OTHER;
    public static final int MINDFULNESS_SESSION_TYPE_UNGUIDED = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_UNGUIDED;
    public static final int MINDFULNESS_SESSION_TYPE_UNKNOWN = android.health.connect.datatypes.MindfulnessSessionRecord.MINDFULNESS_SESSION_TYPE_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder wrap(android.health.connect.datatypes.MindfulnessSessionRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder getReal() {
            return (android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real;
        }

        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, int arg3) {
            this(new android.health.connect.datatypes.MindfulnessSessionRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.wrap(((android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder.wrap(((android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder setNotes(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder.wrap(((android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real).setNotes(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder.wrap(((android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real).setStartZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MindfulnessSessionRecord.Builder.wrap(((android.health.connect.datatypes.MindfulnessSessionRecord.Builder) real).setTitle(arg0));
        }

    }
}
