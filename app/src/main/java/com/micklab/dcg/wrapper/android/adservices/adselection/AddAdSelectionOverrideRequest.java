// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AddAdSelectionOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AddAdSelectionOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionOverrideRequest wrap(android.adservices.adselection.AddAdSelectionOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AddAdSelectionOverrideRequest getReal() {
        return (android.adservices.adselection.AddAdSelectionOverrideRequest) real;
    }

    public android.adservices.adselection.AddAdSelectionOverrideRequest unwrap() {
        return getReal();
    }

    public AddAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2) {
        this(new android.adservices.adselection.AddAdSelectionOverrideRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public AddAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2, com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic arg3) {
        this(new android.adservices.adselection.AddAdSelectionOverrideRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(((android.adservices.adselection.AddAdSelectionOverrideRequest) real).getAdSelectionConfig());
    }

    public java.lang.String getDecisionLogicJs() {
        return ((android.adservices.adselection.AddAdSelectionOverrideRequest) real).getDecisionLogicJs();
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic getPerBuyerDecisionLogic() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic.wrap(((android.adservices.adselection.AddAdSelectionOverrideRequest) real).getPerBuyerDecisionLogic());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getTrustedScoringSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.adselection.AddAdSelectionOverrideRequest) real).getTrustedScoringSignals());
    }

}
