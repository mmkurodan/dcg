// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Metadata {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Metadata(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata wrap(android.health.connect.datatypes.Metadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.Metadata getReal() {
        return (android.health.connect.datatypes.Metadata) real;
    }

    public android.health.connect.datatypes.Metadata unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.Metadata) real).equals(arg0);
    }

    public java.lang.String getClientRecordId() {
        return ((android.health.connect.datatypes.Metadata) real).getClientRecordId();
    }

    public long getClientRecordVersion() {
        return ((android.health.connect.datatypes.Metadata) real).getClientRecordVersion();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin getDataOrigin() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.wrap(((android.health.connect.datatypes.Metadata) real).getDataOrigin());
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device getDevice() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.wrap(((android.health.connect.datatypes.Metadata) real).getDevice());
    }

    public java.lang.String getId() {
        return ((android.health.connect.datatypes.Metadata) real).getId();
    }

    public java.time.Instant getLastModifiedTime() {
        return ((android.health.connect.datatypes.Metadata) real).getLastModifiedTime();
    }

    public int getRecordingMethod() {
        return ((android.health.connect.datatypes.Metadata) real).getRecordingMethod();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.Metadata) real).hashCode();
    }

    public static final int RECORDING_METHOD_ACTIVELY_RECORDED = android.health.connect.datatypes.Metadata.RECORDING_METHOD_ACTIVELY_RECORDED;
    public static final int RECORDING_METHOD_AUTOMATICALLY_RECORDED = android.health.connect.datatypes.Metadata.RECORDING_METHOD_AUTOMATICALLY_RECORDED;
    public static final int RECORDING_METHOD_MANUAL_ENTRY = android.health.connect.datatypes.Metadata.RECORDING_METHOD_MANUAL_ENTRY;
    public static final int RECORDING_METHOD_UNKNOWN = android.health.connect.datatypes.Metadata.RECORDING_METHOD_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder wrap(android.health.connect.datatypes.Metadata.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.Metadata.Builder getReal() {
            return (android.health.connect.datatypes.Metadata.Builder) real;
        }

        public android.health.connect.datatypes.Metadata.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.datatypes.Metadata.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.wrap(((android.health.connect.datatypes.Metadata.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setClientRecordId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setClientRecordId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setClientRecordVersion(long arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setClientRecordVersion(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setDataOrigin(com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setDataOrigin(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setDevice(com.micklab.dcg.wrapper.android.health.connect.datatypes.Device arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setDevice(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setLastModifiedTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setLastModifiedTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setRecordingMethod(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(((android.health.connect.datatypes.Metadata.Builder) real).setRecordingMethod(arg0));
        }

    }
}
