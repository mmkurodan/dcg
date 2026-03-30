// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RequestLogRecord {
    private final android.adservices.ondevicepersonalization.RequestLogRecord real;

    public RequestLogRecord(android.adservices.ondevicepersonalization.RequestLogRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord wrap(android.adservices.ondevicepersonalization.RequestLogRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord(real);
    }

    public android.adservices.ondevicepersonalization.RequestLogRecord unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getTime() {
        return real.getTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.ondevicepersonalization.RequestLogRecord.Builder real;

        public Builder(android.adservices.ondevicepersonalization.RequestLogRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder wrap(android.adservices.ondevicepersonalization.RequestLogRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder(real);
        }

        public android.adservices.ondevicepersonalization.RequestLogRecord.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RequestLogRecord.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder addRow(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.Builder.wrap(real.addRow(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(real.build());
        }

    }
}
