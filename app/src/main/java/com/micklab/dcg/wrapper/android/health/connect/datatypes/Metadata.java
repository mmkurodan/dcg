// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Metadata {
    private final android.health.connect.datatypes.Metadata real;

    public Metadata(android.health.connect.datatypes.Metadata real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata wrap(android.health.connect.datatypes.Metadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata(real);
    }

    public android.health.connect.datatypes.Metadata unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getClientRecordId() {
        return real.getClientRecordId();
    }

    public long getClientRecordVersion() {
        return real.getClientRecordVersion();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin getDataOrigin() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin.wrap(real.getDataOrigin());
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device getDevice() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.wrap(real.getDevice());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.time.Instant getLastModifiedTime() {
        return real.getLastModifiedTime();
    }

    public int getRecordingMethod() {
        return real.getRecordingMethod();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final int RECORDING_METHOD_ACTIVELY_RECORDED = android.health.connect.datatypes.Metadata.RECORDING_METHOD_ACTIVELY_RECORDED;
    public static final int RECORDING_METHOD_AUTOMATICALLY_RECORDED = android.health.connect.datatypes.Metadata.RECORDING_METHOD_AUTOMATICALLY_RECORDED;
    public static final int RECORDING_METHOD_MANUAL_ENTRY = android.health.connect.datatypes.Metadata.RECORDING_METHOD_MANUAL_ENTRY;
    public static final int RECORDING_METHOD_UNKNOWN = android.health.connect.datatypes.Metadata.RECORDING_METHOD_UNKNOWN;

    public static final class Builder {
        private final android.health.connect.datatypes.Metadata.Builder real;

        public Builder(android.health.connect.datatypes.Metadata.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder wrap(android.health.connect.datatypes.Metadata.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder(real);
        }

        public android.health.connect.datatypes.Metadata.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.health.connect.datatypes.Metadata.Builder());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setClientRecordId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setClientRecordId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setClientRecordVersion(long arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setClientRecordVersion(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setDataOrigin(com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setDataOrigin(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setDevice(com.micklab.dcg.wrapper.android.health.connect.datatypes.Device arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setDevice(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setLastModifiedTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setLastModifiedTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder setRecordingMethod(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.Builder.wrap(real.setRecordingMethod(arg0));
        }

    }
}
