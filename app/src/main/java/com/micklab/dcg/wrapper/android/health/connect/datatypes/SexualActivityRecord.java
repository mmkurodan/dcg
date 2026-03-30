// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SexualActivityRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SexualActivityRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord wrap(android.health.connect.datatypes.SexualActivityRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.SexualActivityRecord getReal() {
        return (android.health.connect.datatypes.SexualActivityRecord) real;
    }

    public android.health.connect.datatypes.SexualActivityRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.SexualActivityRecord) real).equals(arg0);
    }

    public int getProtectionUsed() {
        return ((android.health.connect.datatypes.SexualActivityRecord) real).getProtectionUsed();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.SexualActivityRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder wrap(android.health.connect.datatypes.SexualActivityRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SexualActivityRecord.Builder getReal() {
            return (android.health.connect.datatypes.SexualActivityRecord.Builder) real;
        }

        public android.health.connect.datatypes.SexualActivityRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.SexualActivityRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.wrap(((android.health.connect.datatypes.SexualActivityRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder.wrap(((android.health.connect.datatypes.SexualActivityRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.Builder.wrap(((android.health.connect.datatypes.SexualActivityRecord.Builder) real).setZoneOffset(arg0));
        }

    }
    public static final class SexualActivityProtectionUsed {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SexualActivityProtectionUsed(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed wrap(android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed getReal() {
            return (android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed) real;
        }

        public android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed unwrap() {
            return getReal();
        }

        public static final int PROTECTION_USED_PROTECTED = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_PROTECTED;
        public static final int PROTECTION_USED_UNKNOWN = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_UNKNOWN;
        public static final int PROTECTION_USED_UNPROTECTED = android.health.connect.datatypes.SexualActivityRecord.SexualActivityProtectionUsed.PROTECTION_USED_UNPROTECTED;

    }
}
