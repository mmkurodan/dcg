// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventLogRecord {
    private final android.adservices.ondevicepersonalization.EventLogRecord real;

    public EventLogRecord(android.adservices.ondevicepersonalization.EventLogRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord wrap(android.adservices.ondevicepersonalization.EventLogRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord(real);
    }

    public android.adservices.ondevicepersonalization.EventLogRecord unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getData() {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getData());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(real.getRequestLogRecord());
    }

    public int getRowIndex() {
        return real.getRowIndex();
    }

    public java.time.Instant getTime() {
        return real.getTime();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.ondevicepersonalization.EventLogRecord.Builder real;

        public Builder(android.adservices.ondevicepersonalization.EventLogRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder wrap(android.adservices.ondevicepersonalization.EventLogRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder(real);
        }

        public android.adservices.ondevicepersonalization.EventLogRecord.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.EventLogRecord.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setData(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(real.setData(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(real.setRequestLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setRowIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(real.setRowIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.Builder.wrap(real.setType(arg0));
        }

    }
}
