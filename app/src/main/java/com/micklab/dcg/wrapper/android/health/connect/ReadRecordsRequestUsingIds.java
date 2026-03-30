// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsRequestUsingIds {
    private final android.health.connect.ReadRecordsRequestUsingIds real;

    public ReadRecordsRequestUsingIds(android.health.connect.ReadRecordsRequestUsingIds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds wrap(android.health.connect.ReadRecordsRequestUsingIds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds(real);
    }

    public android.health.connect.ReadRecordsRequestUsingIds unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.health.connect.ReadRecordsRequestUsingIds.Builder real;

        public Builder(android.health.connect.ReadRecordsRequestUsingIds.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds.Builder wrap(android.health.connect.ReadRecordsRequestUsingIds.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds.Builder(real);
        }

        public android.health.connect.ReadRecordsRequestUsingIds.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.Class arg0) {
            this(new android.health.connect.ReadRecordsRequestUsingIds.Builder(arg0));
        }

    }
}
