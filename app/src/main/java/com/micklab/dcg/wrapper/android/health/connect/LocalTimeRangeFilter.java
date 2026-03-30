// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class LocalTimeRangeFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalTimeRangeFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter wrap(android.health.connect.LocalTimeRangeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.LocalTimeRangeFilter getReal() {
        return (android.health.connect.LocalTimeRangeFilter) real;
    }

    public android.health.connect.LocalTimeRangeFilter unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.LocalTimeRangeFilter) real).equals(arg0);
    }

    public java.time.LocalDateTime getEndTime() {
        return ((android.health.connect.LocalTimeRangeFilter) real).getEndTime();
    }

    public java.time.LocalDateTime getStartTime() {
        return ((android.health.connect.LocalTimeRangeFilter) real).getStartTime();
    }

    public int hashCode() {
        return ((android.health.connect.LocalTimeRangeFilter) real).hashCode();
    }

    public boolean isBounded() {
        return ((android.health.connect.LocalTimeRangeFilter) real).isBounded();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder wrap(android.health.connect.LocalTimeRangeFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.LocalTimeRangeFilter.Builder getReal() {
            return (android.health.connect.LocalTimeRangeFilter.Builder) real;
        }

        public android.health.connect.LocalTimeRangeFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.LocalTimeRangeFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter build() {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.wrap(((android.health.connect.LocalTimeRangeFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder setEndTime(java.time.LocalDateTime arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder.wrap(((android.health.connect.LocalTimeRangeFilter.Builder) real).setEndTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder setStartTime(java.time.LocalDateTime arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.LocalTimeRangeFilter.Builder.wrap(((android.health.connect.LocalTimeRangeFilter.Builder) real).setStartTime(arg0));
        }

    }
}
