// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RequestLogRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RequestLogRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord wrap(android.adservices.ondevicepersonalization.RequestLogRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.RequestLogRecord getReal() {
        return (android.adservices.ondevicepersonalization.RequestLogRecord) real;
    }

    public android.adservices.ondevicepersonalization.RequestLogRecord unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.RequestLogRecord) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.RequestLogRecord) real).equals(arg0);
    }

    public java.time.Instant getTime() {
        return ((android.adservices.ondevicepersonalization.RequestLogRecord) real).getTime();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.RequestLogRecord) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.RequestLogRecord) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder wrap(android.adservices.ondevicepersonalization.RequestLogRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.RequestLogRecord.Builder getReal() {
            return (android.adservices.ondevicepersonalization.RequestLogRecord.Builder) real;
        }

        public android.adservices.ondevicepersonalization.RequestLogRecord.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RequestLogRecord.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder addRow(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder.wrap(((android.adservices.ondevicepersonalization.RequestLogRecord.Builder) real).addRow(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(((android.adservices.ondevicepersonalization.RequestLogRecord.Builder) real).build());
        }

    }
}
