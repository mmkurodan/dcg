// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class TimeInstantRangeFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeInstantRangeFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter wrap(android.health.connect.TimeInstantRangeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.TimeInstantRangeFilter getReal() {
        return (android.health.connect.TimeInstantRangeFilter) real;
    }

    public android.health.connect.TimeInstantRangeFilter unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.TimeInstantRangeFilter) real).equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return ((android.health.connect.TimeInstantRangeFilter) real).getEndTime();
    }

    public java.time.Instant getStartTime() {
        return ((android.health.connect.TimeInstantRangeFilter) real).getStartTime();
    }

    public int hashCode() {
        return ((android.health.connect.TimeInstantRangeFilter) real).hashCode();
    }

    public boolean isBounded() {
        return ((android.health.connect.TimeInstantRangeFilter) real).isBounded();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder wrap(android.health.connect.TimeInstantRangeFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.TimeInstantRangeFilter.Builder getReal() {
            return (android.health.connect.TimeInstantRangeFilter.Builder) real;
        }

        public android.health.connect.TimeInstantRangeFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.TimeInstantRangeFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter build() {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.wrap(((android.health.connect.TimeInstantRangeFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder setEndTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder.wrap(((android.health.connect.TimeInstantRangeFilter.Builder) real).setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder setStartTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.TimeInstantRangeFilter.Builder.wrap(((android.health.connect.TimeInstantRangeFilter.Builder) real).setStartTime(arg0));
        }

    }
}
