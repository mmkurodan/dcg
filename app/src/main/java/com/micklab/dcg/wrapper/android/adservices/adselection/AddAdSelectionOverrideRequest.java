// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AddAdSelectionOverrideRequest {
    private final android.adservices.adselection.AddAdSelectionOverrideRequest real;

    public AddAdSelectionOverrideRequest(android.adservices.adselection.AddAdSelectionOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionOverrideRequest wrap(android.adservices.adselection.AddAdSelectionOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionOverrideRequest(real);
    }

    public android.adservices.adselection.AddAdSelectionOverrideRequest unwrap() {
        return real;
    }

    public AddAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2) {
        this(new android.adservices.adselection.AddAdSelectionOverrideRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public AddAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2, com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic arg3) {
        this(new android.adservices.adselection.AddAdSelectionOverrideRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(real.getAdSelectionConfig());
    }

    public java.lang.String getDecisionLogicJs() {
        return real.getDecisionLogicJs();
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic getPerBuyerDecisionLogic() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerDecisionLogic.wrap(real.getPerBuyerDecisionLogic());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getTrustedScoringSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getTrustedScoringSignals());
    }

}
