// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class FederatedComputeScheduler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FederatedComputeScheduler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler wrap(android.adservices.ondevicepersonalization.FederatedComputeScheduler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.FederatedComputeScheduler getReal() {
        return (android.adservices.ondevicepersonalization.FederatedComputeScheduler) real;
    }

    public android.adservices.ondevicepersonalization.FederatedComputeScheduler unwrap() {
        return getReal();
    }

    public void cancel(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput arg0) {
        ((android.adservices.ondevicepersonalization.FederatedComputeScheduler) real).cancel(arg0 == null ? null : arg0.getReal());
    }

    public void schedule(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params arg0, com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput arg1) {
        ((android.adservices.ondevicepersonalization.FederatedComputeScheduler) real).schedule(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Params {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Params(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params wrap(android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params getReal() {
            return (android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params) real;
        }

        public android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params unwrap() {
            return getReal();
        }

        public Params(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval arg0) {
            this(new android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval getTrainingInterval() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingInterval.wrap(((android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params) real).getTrainingInterval());
        }

    }
}
