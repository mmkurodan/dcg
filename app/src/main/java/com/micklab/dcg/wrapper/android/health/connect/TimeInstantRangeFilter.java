// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class TimeInstantRangeFilter {
    private final android.health.connect.TimeInstantRangeFilter real;

    public TimeInstantRangeFilter(android.health.connect.TimeInstantRangeFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter wrap(android.health.connect.TimeInstantRangeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter(real);
    }

    public android.health.connect.TimeInstantRangeFilter unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return real.getEndTime();
    }

    public java.time.Instant getStartTime() {
        return real.getStartTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBounded() {
        return real.isBounded();
    }

    public static final class Builder {
        private final android.health.connect.TimeInstantRangeFilter.Builder real;

        public Builder(android.health.connect.TimeInstantRangeFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder wrap(android.health.connect.TimeInstantRangeFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder(real);
        }

        public android.health.connect.TimeInstantRangeFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.health.connect.TimeInstantRangeFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter build() {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder setEndTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder.wrap(real.setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder setStartTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder.wrap(real.setStartTime(arg0));
        }

    }
}
