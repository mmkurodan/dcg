// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingInterval {
    private final android.adservices.ondevicepersonalization.TrainingInterval real;

    public TrainingInterval(android.adservices.ondevicepersonalization.TrainingInterval real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval wrap(android.adservices.ondevicepersonalization.TrainingInterval real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval(real);
    }

    public android.adservices.ondevicepersonalization.TrainingInterval unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Duration getMinimumInterval() {
        return real.getMinimumInterval();
    }

    public int getSchedulingMode() {
        return real.getSchedulingMode();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final int SCHEDULING_MODE_ONE_TIME = android.adservices.ondevicepersonalization.TrainingInterval.SCHEDULING_MODE_ONE_TIME;
    public static final int SCHEDULING_MODE_RECURRENT = android.adservices.ondevicepersonalization.TrainingInterval.SCHEDULING_MODE_RECURRENT;

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.TrainingInterval.Builder real;

        public Builder(android.adservices.ondevicepersonalization.TrainingInterval.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder wrap(android.adservices.ondevicepersonalization.TrainingInterval.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder(real);
        }

        public android.adservices.ondevicepersonalization.TrainingInterval.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingInterval.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder setMinimumInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder.wrap(real.setMinimumInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder setSchedulingMode(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.Builder.wrap(real.setSchedulingMode(arg0));
        }

    }
}
