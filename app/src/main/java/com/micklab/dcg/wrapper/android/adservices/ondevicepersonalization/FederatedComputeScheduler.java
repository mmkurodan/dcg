// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class FederatedComputeScheduler {
    private final android.adservices.ondevicepersonalization.FederatedComputeScheduler real;

    public FederatedComputeScheduler(android.adservices.ondevicepersonalization.FederatedComputeScheduler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler wrap(android.adservices.ondevicepersonalization.FederatedComputeScheduler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler(real);
    }

    public android.adservices.ondevicepersonalization.FederatedComputeScheduler unwrap() {
        return real;
    }

    public void cancel(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput arg0) {
        real.cancel(arg0 == null ? null : arg0.unwrap());
    }

    public void schedule(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params arg0, com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput arg1) {
        real.schedule(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Params {
        private final android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params real;

        public Params(android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params wrap(android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params(real);
        }

        public android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params unwrap() {
            return real;
        }

        public Params(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval arg0) {
            this(new android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval getTrainingInterval() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.wrap(real.getTrainingInterval());
        }

    }
}
