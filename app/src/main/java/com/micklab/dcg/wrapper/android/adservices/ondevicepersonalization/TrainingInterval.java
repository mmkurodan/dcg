// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingInterval {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrainingInterval(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval wrap(android.adservices.ondevicepersonalization.TrainingInterval real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.TrainingInterval getReal() {
        return (android.adservices.ondevicepersonalization.TrainingInterval) real;
    }

    public android.adservices.ondevicepersonalization.TrainingInterval unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.TrainingInterval) real).equals(arg0);
    }

    public java.time.Duration getMinimumInterval() {
        return ((android.adservices.ondevicepersonalization.TrainingInterval) real).getMinimumInterval();
    }

    public int getSchedulingMode() {
        return ((android.adservices.ondevicepersonalization.TrainingInterval) real).getSchedulingMode();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.TrainingInterval) real).hashCode();
    }

    public static final int SCHEDULING_MODE_ONE_TIME = android.adservices.ondevicepersonalization.TrainingInterval.SCHEDULING_MODE_ONE_TIME;
    public static final int SCHEDULING_MODE_RECURRENT = android.adservices.ondevicepersonalization.TrainingInterval.SCHEDULING_MODE_RECURRENT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder wrap(android.adservices.ondevicepersonalization.TrainingInterval.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.TrainingInterval.Builder getReal() {
            return (android.adservices.ondevicepersonalization.TrainingInterval.Builder) real;
        }

        public android.adservices.ondevicepersonalization.TrainingInterval.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingInterval.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.wrap(((android.adservices.ondevicepersonalization.TrainingInterval.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder setMinimumInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder.wrap(((android.adservices.ondevicepersonalization.TrainingInterval.Builder) real).setMinimumInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder setSchedulingMode(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder.wrap(((android.adservices.ondevicepersonalization.TrainingInterval.Builder) real).setSchedulingMode(arg0));
        }

    }
}
