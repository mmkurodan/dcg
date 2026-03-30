// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsRequestUsingFilters {
    private final android.health.connect.ReadRecordsRequestUsingFilters real;

    public ReadRecordsRequestUsingFilters(android.health.connect.ReadRecordsRequestUsingFilters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingFilters wrap(android.health.connect.ReadRecordsRequestUsingFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingFilters(real);
    }

    public android.health.connect.ReadRecordsRequestUsingFilters unwrap() {
        return real;
    }

    public int getPageSize() {
        return real.getPageSize();
    }

    public long getPageToken() {
        return real.getPageToken();
    }

    public com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter getTimeRangeFilter() {
        return com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter.wrap(real.getTimeRangeFilter());
    }

    public boolean isAscending() {
        return real.isAscending();
    }

    public static final class Builder {
        private final android.health.connect.ReadRecordsRequestUsingFilters.Builder real;

        public Builder(android.health.connect.ReadRecordsRequestUsingFilters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingFilters.Builder wrap(android.health.connect.ReadRecordsRequestUsingFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingFilters.Builder(real);
        }

        public android.health.connect.ReadRecordsRequestUsingFilters.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.Class arg0) {
            this(new android.health.connect.ReadRecordsRequestUsingFilters.Builder(arg0));
        }

    }
}
