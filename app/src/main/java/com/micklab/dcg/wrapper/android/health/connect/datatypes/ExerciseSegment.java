// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ExerciseSegment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExerciseSegment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment wrap(android.health.connect.datatypes.ExerciseSegment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ExerciseSegment getReal() {
        return (android.health.connect.datatypes.ExerciseSegment) real;
    }

    public android.health.connect.datatypes.ExerciseSegment unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ExerciseSegment) real).equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return ((android.health.connect.datatypes.ExerciseSegment) real).getEndTime();
    }

    public int getRepetitionsCount() {
        return ((android.health.connect.datatypes.ExerciseSegment) real).getRepetitionsCount();
    }

    public int getSegmentType() {
        return ((android.health.connect.datatypes.ExerciseSegment) real).getSegmentType();
    }

    public java.time.Instant getStartTime() {
        return ((android.health.connect.datatypes.ExerciseSegment) real).getStartTime();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ExerciseSegment) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder wrap(android.health.connect.datatypes.ExerciseSegment.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ExerciseSegment.Builder getReal() {
            return (android.health.connect.datatypes.ExerciseSegment.Builder) real;
        }

        public android.health.connect.datatypes.ExerciseSegment.Builder unwrap() {
            return getReal();
        }

        public Builder(java.time.Instant arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.ExerciseSegment.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.wrap(((android.health.connect.datatypes.ExerciseSegment.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder setRepetitionsCount(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ExerciseSegment.Builder.wrap(((android.health.connect.datatypes.ExerciseSegment.Builder) real).setRepetitionsCount(arg0));
        }

    }
}
