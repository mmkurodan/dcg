// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseLap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExerciseLap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap wrap(android.health.connect.datatypes.ExerciseLap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ExerciseLap getReal() {
        return (android.health.connect.datatypes.ExerciseLap) real;
    }

    public android.health.connect.datatypes.ExerciseLap unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ExerciseLap) real).equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return ((android.health.connect.datatypes.ExerciseLap) real).getEndTime();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getLength() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.ExerciseLap) real).getLength());
    }

    public java.time.Instant getStartTime() {
        return ((android.health.connect.datatypes.ExerciseLap) real).getStartTime();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ExerciseLap) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder wrap(android.health.connect.datatypes.ExerciseLap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ExerciseLap.Builder getReal() {
            return (android.health.connect.datatypes.ExerciseLap.Builder) real;
        }

        public android.health.connect.datatypes.ExerciseLap.Builder unwrap() {
            return getReal();
        }

        public Builder(java.time.Instant arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.ExerciseLap.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.wrap(((android.health.connect.datatypes.ExerciseLap.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder setLength(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseLap.Builder.wrap(((android.health.connect.datatypes.ExerciseLap.Builder) real).setLength(arg0 == null ? null : arg0.getReal()));
        }

    }
}
