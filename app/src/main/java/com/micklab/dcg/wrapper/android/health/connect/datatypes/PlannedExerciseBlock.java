// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PlannedExerciseBlock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlannedExerciseBlock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock wrap(android.health.connect.datatypes.PlannedExerciseBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.PlannedExerciseBlock getReal() {
        return (android.health.connect.datatypes.PlannedExerciseBlock) real;
    }

    public android.health.connect.datatypes.PlannedExerciseBlock unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.PlannedExerciseBlock) real).equals(arg0);
    }

    public java.lang.CharSequence getDescription() {
        return ((android.health.connect.datatypes.PlannedExerciseBlock) real).getDescription();
    }

    public int getRepetitions() {
        return ((android.health.connect.datatypes.PlannedExerciseBlock) real).getRepetitions();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.PlannedExerciseBlock) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder wrap(android.health.connect.datatypes.PlannedExerciseBlock.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.PlannedExerciseBlock.Builder getReal() {
            return (android.health.connect.datatypes.PlannedExerciseBlock.Builder) real;
        }

        public android.health.connect.datatypes.PlannedExerciseBlock.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.health.connect.datatypes.PlannedExerciseBlock.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder addStep(com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseStep arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseBlock.Builder) real).addStep(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.wrap(((android.health.connect.datatypes.PlannedExerciseBlock.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder clearSteps() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseBlock.Builder) real).clearSteps());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseBlock.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder setRepetitions(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PlannedExerciseBlock.Builder.wrap(((android.health.connect.datatypes.PlannedExerciseBlock.Builder) real).setRepetitions(arg0));
        }

    }
}
