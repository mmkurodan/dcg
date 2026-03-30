// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class LocalTimeRangeFilter {
    private final android.health.connect.LocalTimeRangeFilter real;

    public LocalTimeRangeFilter(android.health.connect.LocalTimeRangeFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter wrap(android.health.connect.LocalTimeRangeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter(real);
    }

    public android.health.connect.LocalTimeRangeFilter unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.LocalDateTime getEndTime() {
        return real.getEndTime();
    }

    public java.time.LocalDateTime getStartTime() {
        return real.getStartTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBounded() {
        return real.isBounded();
    }

    public static final class Builder {
        private final android.health.connect.LocalTimeRangeFilter.Builder real;

        public Builder(android.health.connect.LocalTimeRangeFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder wrap(android.health.connect.LocalTimeRangeFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder(real);
        }

        public android.health.connect.LocalTimeRangeFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.health.connect.LocalTimeRangeFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter build() {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder setEndTime(java.time.LocalDateTime arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder.wrap(real.setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder setStartTime(java.time.LocalDateTime arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder.wrap(real.setStartTime(arg0));
        }

    }
}
