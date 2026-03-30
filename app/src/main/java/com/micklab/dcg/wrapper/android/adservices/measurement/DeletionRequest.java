// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.measurement;

public final class DeletionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeletionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest wrap(android.adservices.measurement.DeletionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.measurement.DeletionRequest getReal() {
        return (android.adservices.measurement.DeletionRequest) real;
    }

    public android.adservices.measurement.DeletionRequest unwrap() {
        return getReal();
    }

    public int getDeletionMode() {
        return ((android.adservices.measurement.DeletionRequest) real).getDeletionMode();
    }

    public java.time.Instant getEnd() {
        return ((android.adservices.measurement.DeletionRequest) real).getEnd();
    }

    public int getMatchBehavior() {
        return ((android.adservices.measurement.DeletionRequest) real).getMatchBehavior();
    }

    public java.time.Instant getStart() {
        return ((android.adservices.measurement.DeletionRequest) real).getStart();
    }

    public static final int DELETION_MODE_ALL = android.adservices.measurement.DeletionRequest.DELETION_MODE_ALL;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = android.adservices.measurement.DeletionRequest.DELETION_MODE_EXCLUDE_INTERNAL_DATA;
    public static final int MATCH_BEHAVIOR_DELETE = android.adservices.measurement.DeletionRequest.MATCH_BEHAVIOR_DELETE;
    public static final int MATCH_BEHAVIOR_PRESERVE = android.adservices.measurement.DeletionRequest.MATCH_BEHAVIOR_PRESERVE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder wrap(android.adservices.measurement.DeletionRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.measurement.DeletionRequest.Builder getReal() {
            return (android.adservices.measurement.DeletionRequest.Builder) real;
        }

        public android.adservices.measurement.DeletionRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.measurement.DeletionRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.wrap(((android.adservices.measurement.DeletionRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setDeletionMode(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(((android.adservices.measurement.DeletionRequest.Builder) real).setDeletionMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setEnd(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(((android.adservices.measurement.DeletionRequest.Builder) real).setEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setMatchBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(((android.adservices.measurement.DeletionRequest.Builder) real).setMatchBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder setStart(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.measurement.DeletionRequest.Builder.wrap(((android.adservices.measurement.DeletionRequest.Builder) real).setStart(arg0));
        }

    }
}
