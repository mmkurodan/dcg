// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ActivityIntensityRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityIntensityRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord wrap(android.health.connect.datatypes.ActivityIntensityRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ActivityIntensityRecord getReal() {
        return (android.health.connect.datatypes.ActivityIntensityRecord) real;
    }

    public android.health.connect.datatypes.ActivityIntensityRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ActivityIntensityRecord) real).equals(arg0);
    }

    public int getActivityIntensityType() {
        return ((android.health.connect.datatypes.ActivityIntensityRecord) real).getActivityIntensityType();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ActivityIntensityRecord) real).hashCode();
    }

    public static final int ACTIVITY_INTENSITY_TYPE_MODERATE = android.health.connect.datatypes.ActivityIntensityRecord.ACTIVITY_INTENSITY_TYPE_MODERATE;
    public static final int ACTIVITY_INTENSITY_TYPE_VIGOROUS = android.health.connect.datatypes.ActivityIntensityRecord.ACTIVITY_INTENSITY_TYPE_VIGOROUS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder wrap(android.health.connect.datatypes.ActivityIntensityRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ActivityIntensityRecord.Builder getReal() {
            return (android.health.connect.datatypes.ActivityIntensityRecord.Builder) real;
        }

        public android.health.connect.datatypes.ActivityIntensityRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, int arg3) {
            this(new android.health.connect.datatypes.ActivityIntensityRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.wrap(((android.health.connect.datatypes.ActivityIntensityRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder.wrap(((android.health.connect.datatypes.ActivityIntensityRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActivityIntensityRecord.Builder.wrap(((android.health.connect.datatypes.ActivityIntensityRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
