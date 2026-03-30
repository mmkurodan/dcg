// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class CervicalMucusRecord {
    private final android.health.connect.datatypes.CervicalMucusRecord real;

    public CervicalMucusRecord(android.health.connect.datatypes.CervicalMucusRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord wrap(android.health.connect.datatypes.CervicalMucusRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord(real);
    }

    public android.health.connect.datatypes.CervicalMucusRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAppearance() {
        return real.getAppearance();
    }

    public int getSensation() {
        return real.getSensation();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.CervicalMucusRecord.Builder real;

        public Builder(android.health.connect.datatypes.CervicalMucusRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder wrap(android.health.connect.datatypes.CervicalMucusRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder(real);
        }

        public android.health.connect.datatypes.CervicalMucusRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, int arg3) {
            this(new android.health.connect.datatypes.CervicalMucusRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class CervicalMucusAppearance {
        private final android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance real;

        public CervicalMucusAppearance(android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance wrap(android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance(real);
        }

        public android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance unwrap() {
            return real;
        }

        public static final int APPEARANCE_CREAMY = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_CREAMY;
        public static final int APPEARANCE_DRY = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_DRY;
        public static final int APPEARANCE_EGG_WHITE = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_EGG_WHITE;
        public static final int APPEARANCE_STICKY = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_STICKY;
        public static final int APPEARANCE_UNKNOWN = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_UNKNOWN;
        public static final int APPEARANCE_UNUSUAL = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_UNUSUAL;
        public static final int APPEARANCE_WATERY = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusAppearance.APPEARANCE_WATERY;

    }
    public static final class CervicalMucusSensation {
        private final android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation real;

        public CervicalMucusSensation(android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation wrap(android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation(real);
        }

        public android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation unwrap() {
            return real;
        }

        public static final int SENSATION_HEAVY = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation.SENSATION_HEAVY;
        public static final int SENSATION_LIGHT = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation.SENSATION_LIGHT;
        public static final int SENSATION_MEDIUM = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation.SENSATION_MEDIUM;
        public static final int SENSATION_UNKNOWN = android.health.connect.datatypes.CervicalMucusRecord.CervicalMucusSensation.SENSATION_UNKNOWN;

    }
}
