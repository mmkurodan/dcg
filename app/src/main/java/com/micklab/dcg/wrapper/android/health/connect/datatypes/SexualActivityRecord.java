// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SexualActivityRecord {
    private final android.health.connect.datatypes.SexualActivityRecord real;

    public SexualActivityRecord(android.health.connect.datatypes.SexualActivityRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord wrap(android.health.connect.datatypes.SexualActivityRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord(real);
    }

    public android.health.connect.datatypes.SexualActivityRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getProtectionUsed() {
        return real.getProtectionUsed();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.SexualActivityRecord.Builder real;

        public Builder(android.health.connect.datatypes.SexualActivityRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder wrap(android.health.connect.datatypes.SexualActivityRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder(real);
        }

        public android.health.connect.datatypes.SexualActivityRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.SexualActivityRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class SexualActivityProtectionUsed {
        private final android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed real;

        public SexualActivityProtectionUsed(android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed wrap(android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed(real);
        }

        public android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed unwrap() {
            return real;
        }

        public static final int PROTECTION_USED_PROTECTED = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_PROTECTED;
        public static final int PROTECTION_USED_UNKNOWN = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_UNKNOWN;
        public static final int PROTECTION_USED_UNPROTECTED = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_UNPROTECTED;

    }
}
