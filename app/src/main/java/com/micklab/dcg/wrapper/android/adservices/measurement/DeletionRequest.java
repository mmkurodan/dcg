// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class DeletionRequest {
    private final android.adservices.measurement.DeletionRequest real;

    public DeletionRequest(android.adservices.measurement.DeletionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest wrap(android.adservices.measurement.DeletionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest(real);
    }

    public android.adservices.measurement.DeletionRequest unwrap() {
        return real;
    }

    public int getDeletionMode() {
        return real.getDeletionMode();
    }

    public java.time.Instant getEnd() {
        return real.getEnd();
    }

    public int getMatchBehavior() {
        return real.getMatchBehavior();
    }

    public java.time.Instant getStart() {
        return real.getStart();
    }

    public static final int DELETION_MODE_ALL = android.adservices.measurement.DeletionRequest.DELETION_MODE_ALL;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = android.adservices.measurement.DeletionRequest.DELETION_MODE_EXCLUDE_INTERNAL_DATA;
    public static final int MATCH_BEHAVIOR_DELETE = android.adservices.measurement.DeletionRequest.MATCH_BEHAVIOR_DELETE;
    public static final int MATCH_BEHAVIOR_PRESERVE = android.adservices.measurement.DeletionRequest.MATCH_BEHAVIOR_PRESERVE;

    public static final class Builder {
        private final android.adservices.measurement.DeletionRequest.Builder real;

        public Builder(android.adservices.measurement.DeletionRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder wrap(android.adservices.measurement.DeletionRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder(real);
        }

        public android.adservices.measurement.DeletionRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.measurement.DeletionRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setDeletionMode(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(real.setDeletionMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setEnd(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(real.setEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setMatchBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(real.setMatchBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setStart(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(real.setStart(arg0));
        }

    }
}
