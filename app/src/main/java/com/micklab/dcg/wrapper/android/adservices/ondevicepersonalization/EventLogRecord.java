// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventLogRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventLogRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord wrap(android.adservices.ondevicepersonalization.EventLogRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.EventLogRecord getReal() {
        return (android.adservices.ondevicepersonalization.EventLogRecord) real;
    }

    public android.adservices.ondevicepersonalization.EventLogRecord unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getData() {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.adservices.ondevicepersonalization.EventLogRecord) real).getData());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(((android.adservices.ondevicepersonalization.EventLogRecord) real).getRequestLogRecord());
    }

    public int getRowIndex() {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).getRowIndex();
    }

    public java.time.Instant getTime() {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).getTime();
    }

    public int getType() {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).getType();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.EventLogRecord) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.EventLogRecord) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder wrap(android.adservices.ondevicepersonalization.EventLogRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.EventLogRecord.Builder getReal() {
            return (android.adservices.ondevicepersonalization.EventLogRecord.Builder) real;
        }

        public android.adservices.ondevicepersonalization.EventLogRecord.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.EventLogRecord.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.wrap(((android.adservices.ondevicepersonalization.EventLogRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setData(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(((android.adservices.ondevicepersonalization.EventLogRecord.Builder) real).setData(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(((android.adservices.ondevicepersonalization.EventLogRecord.Builder) real).setRequestLogRecord(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setRowIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(((android.adservices.ondevicepersonalization.EventLogRecord.Builder) real).setRowIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(((android.adservices.ondevicepersonalization.EventLogRecord.Builder) real).setType(arg0));
        }

    }
}
